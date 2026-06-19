# Macronik — Product Requirements (MVP)

## Scope

The MVP focuses on the complete user registration flow and the core nutrition monitoring experience for **6 metabolic conditions**:

1. Nutrient Optimization (general wellness)
2. Iron-Deficiency Anemia
3. Childhood Obesity
4. Arterial Hypertension
5. Insulin Resistance
6. Renal Insufficiency

---

## Functional Requirements

### Authentication

| ID | Requirement | Priority |
|---|---|---|
| FR-01 | The app must display a splash screen with the Macronik logo and a welcome message on launch | High |
| FR-02 | The user must be able to log in using email and password | High |
| FR-03 | The user must be able to request a password reset via email | High |
| FR-04 | The system must reject login with invalid credentials and display an appropriate error message | High |
| FR-05 | The user must remain authenticated between sessions until they explicitly log out | Medium |

### Onboarding (Registration Flow)

| ID | Requirement | Priority |
|---|---|---|
| FR-06 | The user must be able to register through a 7-step onboarding flow | High |
| FR-07 | Step 1: Collect first name, last name, and email | High |
| FR-08 | Step 2: Allow the user to set and confirm a password | High |
| FR-09 | Step 3: Collect physical data — height (cm), current weight (kg), and gender | High |
| FR-10 | Step 4: Collect physical activity level (Sedentary / Light 1–2 days / Moderate 3–5 days / Active 6–7 days) | High |
| FR-11 | Step 5: Collect body composition goal (Deficit / Maintenance / Surplus) | High |
| FR-12 | Step 6: Collect target weight (kg) | High |
| FR-13 | Step 7: Allow the user to select one or more metabolic conditions from the 6 available options | High |
| FR-14 | The user must be able to navigate back to the previous step at any time during onboarding | High |
| FR-15 | The app must display a step progress indicator (e.g., "3/7") during onboarding | Medium |
| FR-16 | Data entered in previous steps must be preserved when the user navigates back | High |

### Home / Dashboard

| ID | Requirement | Priority |
|---|---|---|
| FR-17 | After onboarding, the user must see a home screen with a daily summary of nutritional indicators | High |
| FR-18 | The dashboard must display total calories consumed vs. daily caloric goal | High |
| FR-19 | The dashboard must display macronutrient progress: protein, carbohydrates, and fat (g consumed vs. goal) | High |
| FR-20 | The dashboard must display alerts for micronutrients critical to the user's selected metabolic condition(s) | High |
| FR-21 | The dashboard must show the most recently logged meal | Medium |
| FR-22 | The user must be able to navigate to meal logging, weight tracking, and settings from the home screen | High |

### Meal Logging

| ID | Requirement | Priority |
|---|---|---|
| FR-23 | The user must be able to log a meal by searching for a food item by name | High |
| FR-24 | Food search must use the USDA FoodData Central API as the data source | High |
| FR-25 | The user must be able to specify the quantity (grams or standard portions) of each food item | High |
| FR-26 | The system must automatically calculate calories, macros, and relevant micronutrients upon logging | High |
| FR-27 | The user must be able to view a list of all meals logged on a given day | High |
| FR-28 | The user must be able to delete a logged meal | Medium |
| FR-29 | The system must display which nutritional needs were met or missed based on the user's metabolic condition after each meal | High |

### Weight Tracking

| ID | Requirement | Priority |
|---|---|---|
| FR-30 | The user must be able to log their current weight (kg) at any time | High |
| FR-31 | The app must display a weight history with the progression toward the target weight set during onboarding | Medium |

### Profile & Settings

| ID | Requirement | Priority |
|---|---|---|
| FR-32 | The user must be able to update their body composition goal (Deficit / Maintenance / Surplus) | High |
| FR-33 | The user must be able to update their target weight | High |
| FR-34 | The user must be able to update their metabolic condition selection | Medium |
| FR-35 | The user must be able to log out | High |

---

## Non-Functional Requirements

### Security

| ID | Requirement |
|---|---|
| NFR-01 | Passwords must be at least 8 characters and contain at least one letter and one number |
| NFR-02 | Passwords must be stored using bcrypt hashing (minimum cost factor 12) |
| NFR-03 | All API communication must use HTTPS |
| NFR-04 | Authentication must use JWT tokens with a 24-hour expiration and silent refresh |
| NFR-05 | Health-related data must be stored encrypted at rest in the database |

### Privacy & Compliance

| ID | Requirement |
|---|---|
| NFR-06 | The app must obtain explicit user consent before collecting health data, in compliance with LGPD (Lei 13.709/2018) |
| NFR-07 | The app must provide a clear privacy policy accessible before and after registration |
| NFR-08 | Users must be able to request deletion of all their data |

### Performance

| ID | Requirement |
|---|---|
| NFR-09 | Screen transitions during onboarding must complete in under 300ms |
| NFR-10 | USDA FoodData API requests must have a 5-second timeout with a user-facing error fallback |
| NFR-11 | The daily nutritional summary on the dashboard must load in under 2 seconds |

### Usability & Accessibility

| ID | Requirement |
|---|---|
| NFR-12 | Text contrast must meet WCAG AA standard (minimum ratio 4.5:1 for body text) |
| NFR-13 | All interactive elements must have a touch target of at least 44×44pt |
| NFR-14 | Numeric input fields (weight, height) must validate physiologically plausible ranges: height 50–250 cm, weight 10–300 kg |

### Compatibility

| ID | Requirement |
|---|---|
| NFR-15 | The app must support Android 10 (API 29) and above |
| NFR-16 | The app must support iOS 15 and above |

### Scalability (design for future)

| ID | Requirement |
|---|---|
| NFR-17 | The backend architecture must support adding new metabolic conditions without structural changes to the database schema |
| NFR-18 | The nutritional recommendation engine must be decoupled from the API layer to allow independent updates |
| NFR-19 | The backend must be stateless to support horizontal scaling |

---

## Out of Scope (MVP)

The following features are acknowledged but **excluded from the MVP**:

- Social login (Google, Apple)
- Barcode scanning for food logging
- Integration with wearables (smartwatch, health apps)
- Meal planning / recipe suggestions
- Support for more than 6 metabolic conditions
- Push notifications
- Multi-language support
- Web version

---

## Metabolic Condition Reference

Each condition has a specific set of micronutrients the system will monitor. This drives the dashboard alerts (FR-20) and meal feedback (FR-29).

| Condition | Key nutrients to monitor |
|---|---|
| Nutrient Optimization | Vitamin D, B12, Magnesium, Zinc |
| Iron-Deficiency Anemia | Iron, Vitamin C (absorption), Folate |
| Childhood Obesity | Added sugars, saturated fat, fiber, calcium |
| Arterial Hypertension | Sodium, Potassium, Magnesium |
| Insulin Resistance | Glycemic load, fiber, refined carbohydrates |
| Renal Insufficiency | Phosphorus, Potassium, Sodium, Protein (g/kg) |
