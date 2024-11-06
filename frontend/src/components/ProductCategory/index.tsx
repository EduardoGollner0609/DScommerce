import "./syles.css";

type PropsCategory = {
  name: string;
};

export default function ProductCategory({ name }: PropsCategory) {
  return <div className="dsc-category">{ name }</div>;
}
