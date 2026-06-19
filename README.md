# Macronik

A precision nutrition monitoring mobile app focused on managing chronic health conditions through micro and macronutrient tracking.

Unlike conventional fitness apps, Macronik is designed for users dealing with specific metabolic needs and nutritional deficiencies — not just calorie counting.

---

## Tech Stack

| Layer | Technology |
|---|---|
| Mobile | React Native + Expo |
| Language | TypeScript |
| Navigation | Expo Router |
| State management | Zustand |
| Backend | Java + Spring Boot |
| Database | PostgreSQL |
| Nutrition data | USDA FoodData Central API |

---

## Health conditions addressed (MVP)

The MVP focuses on 6 metabolic conditions:

- Nutrient optimization (general wellness)
- Iron-deficiency anemia
- Childhood obesity
- Arterial hypertension
- Insulin resistance
- Renal insufficiency

---

## Project status

> Currently in planning and design phase. Development starting soon.

| Artifact | Status |
|---|---|
| Personas | Done |
| User Stories | Done |
| User Journey Map | Done |
| BPMN (user registration) | Done |
| Figma design | In progress |
| Repository setup | In progress |
| MVP development | Upcoming |

---

## Repository structure

```
macronik.app/
├── apps/
│   └── mobile/          # React Native + Expo (upcoming)
├── services/
│   └── api/             # Java + Spring Boot (upcoming)
├── docs/
│   ├── personas.pdf
│   ├── user-stories.pdf
│   ├── user-journey-map.pdf
│   └── bpmn-user-registration.pdf
├── .github/
│   ├── PULL_REQUEST_TEMPLATE.md
│   └── ISSUE_TEMPLATE/
└── README.md
```

## Architecture decisions

Key technical decisions are documented as ADRs in [`docs/adr/`](./docs/adr):

- [ADR-001 — Mobile framework: React Native + Expo](./docs/adr/ADR-001-mobile-framework.md)
- [ADR-002 — Backend framework: Java + Spring Boot](./docs/adr/ADR-002-backend-framework.md)
- [ADR-003 — Database: PostgreSQL](./docs/adr/ADR-003-database.md)

## Documentation

All planning artifacts are available in the [`docs/`](./docs) folder:

- [Personas](./docs/personas.pdf)
- [User Stories](./docs/user-stories.pdf)
- [User Journey Map](./docs/user-journey-map.pdf)
- [BPMN — User Registration](./docs/bpmn-user-registration.pdf)

---

## Author

**Nicolas Kiffer**  
Building this project to develop real-world mobile and backend skills targeting the international job market.
