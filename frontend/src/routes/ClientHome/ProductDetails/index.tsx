import { Link, useParams } from "react-router-dom";
import ButtonInverse from "../../../components/ButtonInverse";
import ButtonPrimary from "../../../components/ButtonPrimary";
import ProductDetailsCard from "../../../components/ProductDetailsCard";
import * as productService from "../../../services/product-service";
import "./styles.css";
import { useEffect, useState } from "react";
import { ProductDTO } from "../../../models/Product";
import axios from "axios";

export default function ProductDetails() {


  return (
    <main>
      <section id="product-details-section" className="dsc-container">
        {product && <ProductDetailsCard product={product} />}

        <div className="dsc-btn-page-container">
          <ButtonPrimary text="Comprar" />
          <Link to="/">
            <ButtonInverse text="Inicio" />
          </Link>
        </div>
      </section>
    </main>
  );
}
