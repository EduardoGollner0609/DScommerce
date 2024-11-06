import "./App.css";
import ButtonInverse from "./components/ButtonInverse";
import ButtonPrimary from "./components/ButtonPrimary";
import HeaderClient from "./components/HeaderClient";
import ProductDetailsCard from "./components/ProductDetailsCard";

function App() {
  return (
    <>
      <HeaderClient />
      <section id="product-details-section" className="dsc-container">
        <ProductDetailsCard />
        <div className="dsc-btn-page-container">
          <ButtonPrimary />
          <ButtonInverse />
        </div>
      </section>
    </>
  );
}

export default App;
