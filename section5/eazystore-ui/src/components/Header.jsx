import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faShoppingBasket, faTags } from "@fortawesome/free-solid-svg-icons";

// functional component
const Header = () => {
  const navLinkClas =
    "text-center text-lg font-primary font-semibold text-primary py-2";
  return (
    <header className="border-b border-gray-300 sticky top-0 z-20 bg-gray-100">
      <div className="flex items-center justify-between mx-auto max-w-[1152px] px-6 py-4">
        <a href="/" className={navLinkClas}>
          <FontAwesomeIcon icon={faTags} className="h-8 w-8" />
          <span className="brand-title">Eaxy Stickers</span>
        </a>
        <nav className="flex items-center py-2 z-10">
          <ul className="flex space-x-6">
            <li>
              <a href="/" className={navLinkClas}>
                Home
              </a>
            </li>
            <li>
              <a href="/about" className={navLinkClas}>
                About
              </a>
            </li>
            <li>
              <a href="/contact" className={navLinkClas}>
                Contact
              </a>
            </li>
            <li>
              <a href="/login" className={navLinkClas}>
                Login
              </a>
            </li>
            <li>
              <a href="/cart" className="text-primary py-2">
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
//               <a href="/" className="nav-link">
//                 Home
//               </a>
//             </li>
//             <li>
//               <a href="/about" className="nav-link">
//                 About
//               </a>
//             </li>
//             <li>
//               <a href="/contact" className="nav-link">
//                 Contact
//               </a>
//             </li>
//             <li>
//               <a href="/login" className="nav-link">
//                 Login
//               </a>
//             </li>
//             <li>
//               <a href="/cart" className="nav-link">
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
