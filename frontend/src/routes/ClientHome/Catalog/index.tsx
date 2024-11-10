import "./styles.css";
import SearchBar from "../../../components/SearchBar";
import ButtonNextPage from "../../../components/ButtonNextPage";
import CatalogCard from "../../../components/CatalogCard";
import * as ProductService from "../../../services/product-service";
import { ProductDTO } from "../../../models/Product";
import { useEffect, useState } from "react";
import axios from "axios";

export default function Catalog() {
  const [products, setProducts] = useState<ProductDTO[]>([]);

  useEffect(() => {
    axios.get("http://localhost:8080/products?size=12").then((response) => {
      setProducts(response.data.content);
    });
  }, []);

  return (
    <main>
      <section id="catalog-section" className="dsc-container">
        <SearchBar />
        <div className="dsc-catalog-cards dsc-mb20 dsc-mt20">
          {products.map((product) => (
            <CatalogCard key={product.id} product={product} />
          ))}
        </div>

        <ButtonNextPage />
      </section>
    </main>
  );
}
