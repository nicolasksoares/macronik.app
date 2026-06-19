# Sprint 1 — Onboarding & Authentication

**Goal:** A user can register, complete the onboarding flow, and log in to the app. No dashboard or meal logging yet — just a working auth + profile creation end to end.

**Requirements covered:** FR-01 to FR-16, NFR-01 to NFR-04, NFR-06, NFR-09, NFR-14 to NFR-16

---

## Deliverables

### Mobile (React Native + Expo)

| Task | Requirement | Notes |
|---|---|---|
| Splash screen | FR-01 | Logo + welcome message |
| Login screen | FR-02, FR-04 | Email + password, error states |
| Forgot password screen | FR-03 | Trigger reset email via API |
| Onboarding step 1 — personal info | FR-07 | First name, last name, email |
| Onboarding step 2 — password | FR-08 | Password + confirm, visibility toggle |
| Onboarding step 3 — physical data | FR-09 | Height, weight, gender (dropdown) |
| Onboarding step 4 — activity level | FR-10 | 4 radio options |
| Onboarding step 5 — body goal | FR-11 | Deficit / Maintenance / Surplus |
| Onboarding step 6 — target weight | FR-12 | Numeric input with kg unit |
| Onboarding step 7 — metabolic profile | FR-13 | 6 checkboxes, multi-select |
| Back navigation between steps | FR-14 | Arrow button, preserve state |
| Step progress indicator | FR-15 | "x/7" counter |
| Preserve state on back navigation | FR-16 | Zustand store for onboarding state |
| Session persistence | FR-05 | Store JWT in SecureStore (Expo) |
| LGPD consent screen | NFR-06 | Before step 1, explicit checkbox |

### Backend (Java + Spring Boot)

| Task | Requirement | Notes |
|---|---|---|
| POST /auth/register | FR-06 to FR-13 | Create user + full profile in one transaction |
| POST /auth/login | FR-02 | Return JWT access token + refresh token |
| POST /auth/refresh | FR-05 | Silent token refresh |
| POST /auth/forgot-password | FR-03 | Send reset email |
| POST /auth/reset-password | FR-03 | Validate token + update password |
| Password hashing | NFR-02 | bcrypt cost factor 12 |
| JWT setup | NFR-04 | 24h expiration, refresh token |
| Input validation | NFR-14 | Height 50–250 cm, weight 10–300 kg |

### Database (PostgreSQL)

Tables to create in Sprint 1:
- `users` — id, first_name, last_name, email, password_hash, created_at
- `user_profiles` — user_id, height_cm, weight_kg, gender, activity_level, goal, target_weight_kg
- `metabolic_conditions` — id, name, slug, nutrients_to_monitor (JSONB)
- `user_conditions` — user_id, condition_id (join table)
- `password_reset_tokens` — user_id, token, expires_at

---

## Definition of Done

- [ ] User can complete all 7 onboarding steps on a real device (or Expo Go)
- [ ] User data is persisted in the PostgreSQL database after registration
- [ ] User can log in and receive a valid JWT
- [ ] JWT is stored securely on device and used in authenticated requests
- [ ] Back navigation works across all steps without data loss
- [ ] All numeric inputs reject out-of-range values
- [ ] LGPD consent is required before registration proceeds
- [ ] All API endpoints return appropriate error messages for invalid inputs

---

## Out of Scope for Sprint 1

- Dashboard / home screen
- Meal logging
- Weight tracking
- Profile editing after onboarding
