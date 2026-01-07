import FeatureCard from "../components/FeatureCard";

export default function Home() {
  const features = [
    { icon: "📱", title: "Responsive Design" },
    { icon: "⚡", title: "Fast Performance" },
    { icon: "♿", title: "Accessibility" },
    { icon: "🔍", title: "SEO Ready" }
  ];

  return (
    <main className="page">
      <h1>Welcome to Our Business</h1>
      <div className="grid">
        {features.map((f, i) => (
          <FeatureCard key={i} {...f} />
        ))}
      </div>
    </main>
  );
}
