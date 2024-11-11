import * as cartRepository from "../localstorage/cart-repository";
import { OrderDTO } from "../models/Order";

export function saveCart(cart: OrderDTO) {
  cartRepository.save(cart);
}

export function getCart(): OrderDTO {
  return cartRepository.get();
}
