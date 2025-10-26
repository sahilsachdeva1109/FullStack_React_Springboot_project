import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faHeart } from "@fortawesome/free-solid-svg-icons";
// import "./footer.css";
import styled from "styled-components";
import EasyButton from "../EasyButton";

const H1 = styled.h1`
  color: #5b21b6;
  text-align: center;
`;
export default function Footer() {
  return (
    <>
      {/* <H1>Demo of styled comp from footer</H1>
      <EasyButton $primary>Submit</EasyButton> */}
      {/* <h1> Demo of Global CSS scope from footer </h1> */}
      <footer className="footer">
        Built with
        <FontAwesomeIcon
          icon={faHeart}
          className="footer-icon"
          aria-hidden="true"></FontAwesomeIcon>
        by
        <a href="https://www.google.com/" target="_blank" rel="noreferrer">
          {" "}
          Sahil{" "}
        </a>
      </footer>
    </>
  );
}
