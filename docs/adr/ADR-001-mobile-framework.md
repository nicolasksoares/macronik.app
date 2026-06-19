# ADR-001 — Mobile Framework: React Native + Expo

**Status:** Accepted  
**Date:** 2026-06-19

## Context

Macronik is a cross-platform mobile app targeting both Android and iOS. The main options evaluated were:

- **React Native + Expo** — JavaScript/TypeScript, cross-platform, Meta-backed
- **Flutter** — Dart, cross-platform, Google-backed
- **Native (Swift + Kotlin)** — two separate codebases, one per platform

The project is a solo portfolio build targeting the international job market at junior/mid level.

## Decision

We chose **React Native with Expo**.

## Rationale

1. **TypeScript reuse.** React Native uses TypeScript — the same language used in React (web), Node.js, and Next.js. Every hour learning the language pays off across mobile, web, and backend contexts simultaneously.

2. **Job market demand.** React Native consistently has more open positions than Flutter in international remote job boards (LinkedIn, Indeed, Glassdoor). For a portfolio targeting the international market, this directly affects employability.

3. **Expo removes setup friction.** Expo abstracts away Xcode and Android Studio configuration, allowing focus on product code rather than build tooling — critical for a solo project with a learning objective.

4. **Large ecosystem.** Libraries for navigation (Expo Router), state management, animations, and device APIs are mature and well-documented.

## Consequences

- **Positive:** Single codebase for Android and iOS. TypeScript knowledge transfers to other stacks. Faster iteration with Expo Go.
- **Negative:** Performance ceiling below native for heavy graphics or hardware-intensive features (not relevant for Macronik MVP).
- **Trade-off accepted:** Flutter was a legitimate alternative with better rendering performance, but its language (Dart) does not transfer to other ecosystems, reducing the learning ROI for this project's goals.
