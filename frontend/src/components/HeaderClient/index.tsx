import "./syles.css";
import cartImg from "../../assets/cart.svg";
import { Link } from "react-router-dom";
export default function HeaderClient() {
  return (
    <header className="dsc-header-client">
      <nav className="dsc-container">
        <Link to="/">
          <h1>DSCommerce</h1>
        </Link>

        <div className="dsc-navbar-right">
          <div className="dsc-menu-items-container">
            <div className="dsc-menu-item">
              <img src={cartImg} alt="Carrinho de compras" />
            </div>
          </div>
          <a href="#">Entrar</a>
        </div>
      </nav>
    </header>
  );
}
