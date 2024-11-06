import "./styles.css";

type PropsButton = {
  text: string;
};
export default function ButtonPrimary({ text }: PropsButton) {
  return <div className="dsc-btn dsc-btn-blue">{text}</div>;
}
