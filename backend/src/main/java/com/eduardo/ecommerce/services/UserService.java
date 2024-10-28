package com.eduardo.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.eduardo.ecommerce.entities.Role;
import com.eduardo.ecommerce.entities.User;
import com.eduardo.ecommerce.projections.UserDetailsProjection;
import com.eduardo.ecommerce.repositories.UserRepository;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<UserDetailsProjection> result = repository.searchUserAndRolesByEmail(username);
		
		if (result.size() == 0) {
			throw new UsernameNotFoundException("");
		}

		User user = new User();
		user.setEmail(username);
		user.setEmail(result.get(0).getPassword());

		for (UserDetailsProjection projection : result) {
			user.addRole(new Role(projection.getRoleId(), projection.getAuthority()));
		}

		return user;
	}

}
