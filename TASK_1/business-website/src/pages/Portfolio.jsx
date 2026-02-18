import { useState } from "react";

export default function Portfolio() {
  const projects = [
    {
      title: "Business Landing Page",
      category: "Web",
      description:
        "A responsive landing page built with modern CSS, focusing on performance and accessibility."
    },
    {
      title: "E-Commerce UI",
      category: "UI",
      description:
        "User-friendly shopping interface with product cards, filters, and clean layout design."
    },
    {
      title: "Portfolio Website",
      category: "Web",
      description:
        "Personal portfolio website showcasing projects using React and responsive layouts."
    },
    {
      title: "Dashboard Design",
      category: "UI",
      description:
        "Modern admin dashboard design with charts, cards, and reusable components."
    },
    {
      title: "SEO Optimization Project",
      category: "SEO",
      description:
        "Improved website SEO structure, metadata, and performance for better search visibility."
    }
  ];

  const [filter, setFilter] = useState("All");

  const filteredProjects =
    filter === "All"
      ? projects
      : projects.filter(project => project.category === filter);

  return (
    <section className="page">
      <h1>Our Portfolio</h1>
      <p className="page-intro">
        A selection of projects that demonstrate our expertise in frontend
        development, design, and optimization.
      </p>

      <div className="portfolio-filters">
        {["All", "Web", "UI", "SEO"].map(type => (
          <button
            key={type}
            className={filter === type ? "active" : ""}
            onClick={() => setFilter(type)}
          >
            {type}
          </button>
        ))}
      </div>

      <div className="portfolio-grid">
        {filteredProjects.map((project, index) => (
          <div key={index} className="portfolio-card">
            <h3>{project.title}</h3>
            <span className="portfolio-tag">{project.category}</span>
            <p>{project.description}</p>
          </div>
        ))}
      </div>
    </section>
  );
}
