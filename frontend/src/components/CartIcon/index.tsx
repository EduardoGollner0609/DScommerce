import { Link } from "react-router-dom";
import cartIcon from "../../assets/cart.svg";
import "./syles.css";

export default function CartIcon() {
  return (
    <Link to="/cart">
      <img src={cartIcon} alt="Carrinho de compras" />
      <div className="dsc-cart-count">2</div>
    </Link>
  );
}
