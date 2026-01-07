import { render, screen } from "@testing-library/react";
import App from "../App";

test("renders business website without crashing", () => {
  render(<App />);
  const heading = screen.getByText(/welcome to our business/i);
  expect(heading).toBeInTheDocument();
});
