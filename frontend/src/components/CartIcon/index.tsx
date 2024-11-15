import { useState } from "react";
import cartIcon from "../../assets/cart.svg";
import * as cartService from "../../services/cart-service";
import "./syles.css";

export default function CartIcon() {
  const [cart, setCart] = useState(cartService.getCart());

  return (
    <>
      <img src={cartIcon} alt="Carrinho de compras" />
      <div className="dsc-cart-count">{cart.items.length}</div>
    </>
  );
}
