# ADR-003 — Database: PostgreSQL

**Status:** Accepted  
**Date:** 2026-06-19

## Context

The application stores structured relational data: users, metabolic conditions, meals, food items, weight entries, and nutritional goals. Options evaluated:

- **PostgreSQL** — relational, open-source, strongly consistent
- **MySQL** — relational, widely used
- **MongoDB** — document-based, flexible schema

## Decision

We chose **PostgreSQL**.

## Rationale

1. **Relational data model fits the domain.** User profiles, metabolic conditions, meals, and food items are naturally relational — they have clear foreign keys and referential integrity requirements. A document database would add complexity without benefit here.

2. **JSONB support for flexibility.** PostgreSQL's JSONB column type allows storing semi-structured data (e.g., nutrient values per food item from the USDA API) without sacrificing the benefits of a relational schema. This satisfies NFR-17 (adding new metabolic conditions without schema changes).

3. **Spring Data JPA integration.** PostgreSQL has first-class support with Hibernate/JPA, which is the standard ORM in the Spring Boot ecosystem.

4. **Industry standard.** PostgreSQL is the most widely adopted open-source relational database in the international market and is supported by every major cloud provider (AWS RDS, Google Cloud SQL, Railway, Supabase).

## Consequences

- **Positive:** Strong consistency, referential integrity, excellent Spring Boot integration, scalable.
- **Negative:** Requires schema migrations (managed via Flyway or Liquibase) as the data model evolves.
- **Trade-off accepted:** MongoDB was discarded because the flexible schema benefit does not outweigh the loss of relational integrity for this domain's data model.
