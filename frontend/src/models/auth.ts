export type RoleEnum = "ROLE_ADMIN" | "ROLE_CLIENT";

export type CredentialsDTO = {
  username: string;
  password: string;
};

export type AccessTokenPayloadDTO = {
  exp: number;
  username: string;
  authorities: RoleEnum[];
};
