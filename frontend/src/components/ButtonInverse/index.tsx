import "./styles.css";

type PropsButton = {
  text: string;
};
export default function ButtonInverse({ text }: PropsButton) {
  return <div className="dsc-btn dsc-btn-white">{text}</div>;
}
