📘 Project Documentation

Objective
To build a modern, responsive, and accessible business website using React.js following industry-standard frontend practices.

Architecture Overview

- React Router for navigation
- Context API for:
- Authentication
- Theme management
- Component-based architecture
- Global styling using CSS variables

Component Architecture

- Header
- Footer
- FeatureCard
- ThemeToggle
- LoginForm

Each component is reusable and isolated.

 Routing Strategy

- Public routes: Home, Services, About, Contact
- Protected route: Portfolio
- Redirect logic handled using `Navigate`

Accessibility Strategy

- Semantic tags
- ARIA labels
- Keyboard navigation
- Contrast-safe color palette

Performance Strategy

- Code splitting via routes
- Optimized assets
- Lighthouse audits performed



Code Structure

The project follows a clean and modular folder structure:

- `components/` – Reusable UI components (Header, Footer, ThemeToggle)
- `pages/` – Page-level components (Home, Services, Portfolio, About, Contact, Login)
- `context/` – Global state management (AuthContext, ThemeContext)
- `styles/` – Global and modular CSS files
- `utils/` – Helper functions and constants
- `tests/` – Unit test files
- `.github/workflows/` – CI/CD configuration

This structure improves scalability, readability, and maintainability.

Conclusion

This project demonstrates strong frontend fundamentals, clean React architecture, and real-world development practices.