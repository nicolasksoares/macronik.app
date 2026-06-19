# ADR-002 — Backend Framework: Java + Spring Boot

**Status:** Accepted  
**Date:** 2026-06-19

## Context

Macronik requires a REST API backend to handle authentication, user profiles, nutritional data processing, and meal logging. Options evaluated:

- **Java + Spring Boot** — strongly typed, enterprise-grade, mature ecosystem
- **Node.js + TypeScript** — same language as the frontend, lightweight
- **Go (Golang)** — high performance, growing adoption
- **Supabase** — Backend-as-a-Service (BaaS), minimal setup

## Decision

We chose **Java with Spring Boot**.

## Rationale

1. **Enterprise market demand.** The international job market — particularly in healthtech, fintech, and large companies — has strong demand for Java/Spring Boot engineers. This stack directly targets the kind of companies Macronik's domain (health) would realistically serve.

2. **Strong typing and structure.** Java enforces a level of discipline (typed DTOs, service layers, dependency injection) that teaches backend architecture patterns applicable across languages. Learning Spring Boot teaches concepts, not just syntax.

3. **Ecosystem maturity.** Spring Security (authentication), Spring Data JPA (database), and Spring Boot Actuator (monitoring) cover all MVP backend needs without requiring third-party integrations for core functionality.

4. **Differentiation.** Most mobile portfolio projects use Node.js or a BaaS. A Java backend demonstrates a broader technical range and a willingness to work with enterprise tooling.

## Consequences

- **Positive:** High market value, strong architecture patterns enforced by the framework, rich security tooling.
- **Negative:** Higher setup complexity and more verbose code than Node.js. Slower to prototype.
- **Trade-off accepted:** Supabase was discarded because it abstracts away too much — the goal of this project is to learn backend development, not to skip it. Node.js was discarded to avoid keeping both frontend and backend in the same language, which would reduce the breadth of the learning experience.
