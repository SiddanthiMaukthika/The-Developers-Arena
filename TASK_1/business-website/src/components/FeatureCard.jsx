export default function FeatureCard({ icon, title }) {
  return (
    <div className="card">
      <span>{icon}</span>
      <h3>{title}</h3>
      <p>High quality {title.toLowerCase()} solutions.</p>
    </div>
  );
}
