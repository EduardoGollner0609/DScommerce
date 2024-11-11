import { OrderDTO } from "../models/Order";

export function save(cart: OrderDTO) {
  const str = JSON.stringify(cart);
  localStorage.setItem("com.eduardo.ecommerce/Cart", str);
}

export function get(): OrderDTO {
  const str =
    localStorage.getItem("com.eduardo.ecommerce/Cart") || '{"items"=[]}';
  return JSON.parse(str);
}
