import "./App.css";
import HeaderClient from "./components/HeaderClient";
import ProductDetailsCard from "./components/ProductDetailsCard";

function App() {
  return (
    <>
      <HeaderClient />
      <section id="product-details-section" className="dsc-container">
        <ProductDetailsCard />
        <div className="dsc-btn-page-container">
          <div className="dsc-btn dsc-btn-blue">Comprar</div>
          <div className="dsc-btn dsc-btn-white">Início</div>
        </div>
      </section>
    </>
  );
}

export default App;
