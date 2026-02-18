# Technical Details

Frontend Framework
- React 18 using functional components and hooks

Routing
- React Router DOM is used for client-side routing

State Management
- Context API is used for:
- Authentication state
- Theme (Dark/Light mode)

Authentication Logic
- Login state is stored in AuthContext
- Protected routes redirect unauthenticated users to Login page

Styling
- CSS Flexbox and Grid
- CSS variables for theming
- Global styles applied using body class toggling

# Component Architecture

Component Hierarchy

App  
├── ThemeProvider  
│   ├── AuthProvider  
│   │   ├── Header  
│   │   │   └── ThemeToggle  
│   │   ├── Routes  
│   │   │   ├── Home  
│   │   │   ├── Services  
│   │   │   ├── Portfolio (Protected)  
│   │   │   ├── About  
│   │   │   ├── Contact  
│   │   │   └── Login  
│   │   └── Footer  

# Data Flow

- Theme state flows from ThemeContext to all components
- Authentication state flows from AuthContext to protected routes
- UI updates automatically based on context changes
