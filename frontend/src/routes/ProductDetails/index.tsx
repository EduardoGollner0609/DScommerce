import ButtonInverse from "../../components/ButtonInverse";
import ButtonPrimary from "../../components/ButtonPrimary";
import HeaderClient from "../../components/HeaderClient";
import ProductDetailsCard from "../../components/ProductDetailsCard";
import { ProductDTO } from "../../models/Product";
import "./styles.css";

const product: ProductDTO = {
  id: 2,
  name: "SmartTv",
  description: "Esta TV é maravilhosa.",
  imgUrl:
    "https://i5.walmartimages.com/asr/2aa59abd-3809-4cf5-9ebf-66365c38cb2e.1b3c37d9a592da238fd30c2100356ad7.jpeg",
  price: 2500.99,
  categories: [
    {
      id: 2,
      name: "Eletronicos",
    },
    {
      id: 3,
      name: "Lindas",
    },
    {
      id: 5,
      name: "Fantasticas",
    },
  ],
};
export default function ProductDetails() {
  return (
    <>
      <HeaderClient />
      <section id="product-details-section" className="dsc-container">
        <ProductDetailsCard product={product} />
        <div className="dsc-btn-page-container">
          <ButtonPrimary text="Comprar" />
          <ButtonInverse text="Inicio" />
        </div>
      </section>
    </>
  );
}
