import HeaderClient from "../../components/HeaderClient";
import "./styles.css";
import SearchBar from "../../components/SearchBar";
import ButtonNextPage from "../../components/ButtonNextPage";
import { ProductDTO } from "../../models/Product";
import CatalogCard from "../../components/CatalogCard";

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

export default function Catalog() {
  return (
    <>
      <HeaderClient />
      <main>
        <section id="catalog-section" className="dsc-container">
          <SearchBar />

          <div className="dsc-catalog-cards dsc-mb20 dsc-mt20">
            <CatalogCard product={product} />
            <CatalogCard product={product} />
            <CatalogCard product={product} />
            <CatalogCard product={product} />
            <CatalogCard product={product} />
            <CatalogCard product={product} />
            <CatalogCard product={product} />
            <CatalogCard product={product} />
            <CatalogCard product={product} />
            <CatalogCard product={product} />
            <CatalogCard product={product} />
            <CatalogCard product={product} />
          </div>

          <ButtonNextPage />
        </section>
      </main>
    </>
  );
}
