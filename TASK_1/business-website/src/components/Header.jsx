import { Link } from "react-router-dom";
import { useAuth } from "../context/AuthContext";
import ThemeToggle from "./ThemeToggle";

export default function Header() {
  const { isAuthenticated } = useAuth();

  return (
    <header className="header">
      <nav className="navbar">
        <h2 className="logo">Business</h2>

        <ul className="nav-links">
          <li><Link to="/">Home</Link></li>
          <li><Link to="/services">Services</Link></li>
          <li><Link to="/portfolio">Portfolio</Link></li>
          <li><Link to="/about">About</Link></li>
          <li><Link to="/contact">Contact</Link></li>
        </ul>

        {/* 🔥 Right-side actions */}
        <div className="header-actions">
          {!isAuthenticated && (
            <Link to="/login" className="login-btn">
              Login
            </Link>
          )}

          <ThemeToggle />
        </div>
      </nav>
    </header>
  );
}
