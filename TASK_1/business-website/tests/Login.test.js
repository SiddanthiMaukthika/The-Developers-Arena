import { render, screen } from "@testing-library/react";
import Login from "../pages/Login";

test("renders login form fields", () => {
  render(<Login />);
  expect(screen.getByPlaceholderText(/email/i)).toBeInTheDocument();
  expect(screen.getByPlaceholderText(/password/i)).toBeInTheDocument();
});
