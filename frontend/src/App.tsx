import { BrowserRouter, Route, Routes } from "react-router-dom";
import "./App.css";
import Catalog from "./routes/Catalog";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Catalog />}></Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
