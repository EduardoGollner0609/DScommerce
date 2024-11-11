import { OrderDTO } from "../models/Order";

export function save(cart: OrderDTO) {
  const str = JSON.stringify(cart);
  localStorage.setItem("com.eduardo.ecommerce/Cart", str);
}
