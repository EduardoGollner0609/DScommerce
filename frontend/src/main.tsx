import { createRoot } from "react-dom/client";
import "./index.css";
import App from "./App.tsx";
import React, { StrictMode } from "react";

window.React = React;
createRoot(document.getElementById("root")!).render(
  <StrictMode>
    <App />
  </StrictMode>
);
