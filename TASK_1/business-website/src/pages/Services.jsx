export default function Services() {
  const services = [
    {
      title: "Web Development",
      icon: "💻",
      description:
        "We build fast, responsive, and scalable web applications using modern frontend technologies."
    },
    {
      title: "UI / UX Design",
      icon: "🎨",
      description:
        "User-centered designs with clean layouts, accessibility standards, and intuitive experiences."
    },
    {
      title: "Performance Optimization",
      icon: "⚡",
      description:
        "Optimizing websites for speed, SEO, and Core Web Vitals to ensure high performance."
    },
    {
      title: "Accessibility Solutions",
      icon: "♿",
      description:
        "WCAG-compliant websites that are usable for everyone, including assistive technologies."
    },
    {
      title: "SEO Optimization",
      icon: "🔍",
      description:
        "Search-engine-friendly structure, metadata, and best practices to improve visibility."
    },
    {
      title: "Maintenance & Support",
      icon: "🛠️",
      description:
        "Continuous monitoring, updates, and support to keep your website secure and up to date."
    }
  ];

  return (
    <section className="page">
      <h1>Our Professional Services</h1>
      <p className="page-intro">
        We offer a wide range of digital services focused on quality, performance,
        and user experience.
      </p>

      <div className="services-grid">
        {services.map((service, index) => (
          <div key={index} className="service-card">
            <span className="service-icon">{service.icon}</span>
            <h3>{service.title}</h3>
            <p>{service.description}</p>
          </div>
        ))}
      </div>
    </section>
  );
}
