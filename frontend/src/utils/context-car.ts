import { createContext } from "react";

export type ContextCartCountType = {
  contextCartCount: number;
  setContextCartCount: (contextCartCount: number) => void;
};

export const contextCartCount = createContext<ContextCartCountType>({
  contextCartCount: 0,
  setContextCartCount: () => {},
});
