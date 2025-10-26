import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faShoppingBasket, faTags } from "@fortawesome/free-solid-svg-icons";

// functional component
const Header = () => {
  return (
    <header className="header">
      <div className="container">
        <a href="/" className="link">
          <FontAwesomeIcon icon={faTags} className="fa-icon" />
          <span className="brand-title">Eaxy Stickers</span>
        </a>
        <nav className="easynav">
          <ul>
            <li>
              <a href="/" className="navLink">
                Home
              </a>
            </li>
            <li>
              <a href="/about" className="navLink">
                About
              </a>
            </li>
            <li>
              <a href="/contact" className="navLink">
                Contact
              </a>
            </li>
            <li>
              <a href="/login" className="navLink">
                Login
              </a>
            </li>
            <li>
              <a href="/cart" className="navLink">
                <FontAwesomeIcon icon={faShoppingBasket} />
                Cart
              </a>
            </li>
          </ul>
        </nav>
      </div>
    </header>
  );
};

// Js export function

// export function Header1() {
//   return (
//     <header className="header">
//       <div className="container">
//         <a href="/" className="link">
//           <FontAwesomeIcon icon={faTags} className="fa-icon" />
//           <span className="brand-title">Eaxy Stickers</span>
//         </a>
//         <nav className="nav">
//           <ul>
//             <li>
//               <a href="/" className="navLink">
//                 Home
//               </a>
//             </li>
//             <li>
//               <a href="/about" className="navLink">
//                 About
//               </a>
//             </li>
//             <li>
//               <a href="/contact" className="navLink">
//                 Contact
//               </a>
//             </li>
//             <li>
//               <a href="/login" className="navLink">
//                 Login
//               </a>
//             </li>
//             <li>
//               <a href="/cart" className="navLink">
//                 <FontAwesomeIcon icon={faShoppingBasket} />
//                 Cart
//               </a>
//             </li>
//           </ul>
//         </nav>
//       </div>
//     </header>
//   );
// }

export default Header;
