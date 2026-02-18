export default function About() {
  const team = [
    {
      name: "Alex Morgan",
      role: "Frontend Developer",
      description:
        "Specializes in building responsive, accessible, and high-performance web interfaces."
    },
    {
      name: "Sara Lee",
      role: "UI/UX Designer",
      description:
        "Designs intuitive user experiences with a strong focus on usability and aesthetics."
    },
    {
      name: "David Kumar",
      role: "SEO & Performance Analyst",
      description:
        "Optimizes websites for speed, search visibility, and Core Web Vitals."
    }
  ];

  return (
    <section className="page">
      <h1>About Our Company</h1>

      <p className="page-intro">
        We are a modern digital solutions company focused on building high-quality
        web experiences. Our goal is to combine technology, design, and performance
        to deliver impactful digital products.
      </p>

      <div className="about-section">
        <h2>Our Mission</h2>
        <p>
          Our mission is to create reliable, scalable, and user-friendly web
          solutions that help businesses grow in the digital world.
        </p>
      </div>

      <div className="about-section">
        <h2>Our Vision</h2>
        <p>
          We envision a web that is fast, accessible, and inclusive — where every
          user can interact with digital products effortlessly.
        </p>
      </div>

      <h2 className="team-heading">Meet Our Team</h2>

      <div className="team-grid">
        {team.map((member, index) => (
          <div key={index} className="team-card">
            <h3>{member.name}</h3>
            <span className="team-role">{member.role}</span>
            <p>{member.description}</p>
          </div>
        ))}
      </div>
    </section>
  );
}
