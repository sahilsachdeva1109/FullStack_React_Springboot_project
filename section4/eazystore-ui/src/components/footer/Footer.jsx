import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faHeart } from "@fortawesome/free-solid-svg-icons";
import "./footer.css";

export default function Footer() {
  return (
    <>
      <h1> Demo of Global CSS scope from footer </h1>
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
