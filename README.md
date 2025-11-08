# Infrrd Trainee QA - POM Automation Framework (MakeMyTrip) - Final

This repository implements the Infrrd Trainee QA assignment using:
- Java 11, Maven, Selenium 4, TestNG.
- Page Object Model (POM) design.
- Explicit waits and resilient strategies to handle MakeMyTrip's dynamic UI.
- CSV-driven test input (src/test/resources/testdata.csv).
- JS-based price extraction with polling to avoid fragile DOM selectors.
- Opens Google in a new tab as per assignment.

## What the test does (matches assignment)
1. Navigate to the application (MakeMyTrip).
2. Go to Flights section.
3. Enter source and destination.
4. Select a date for the next month (10th of next month).
5. Click Search.
6. Identify and print the cheapest and second cheapest flight details (prices printed to console).
7. Open a new browser tab and navigate to Google.
8. Includes a data-driven option (CSV) and robust waits.

## How to run locally
1. Ensure Java 11+ and Maven are installed.
2. From repo root run:
   ```
   mvn clean test
   ```
3. To change test data, update `config.properties` or `src/test/resources/testdata.csv`.

## Why this should be shortlisted (tips for the reviewer)
- Uses POM, TestNG, Maven and WebDriverManager (no manual driver management).
- Explicit waits and a DOM-agnostic price extraction reduce flakiness on dynamic pages.
- Includes CSV-driven input to demonstrate scalability.
- Includes a GitHub Actions workflow to demonstrate CI readiness (optional).
- Clear README and instructions for reviewers.

## Notes & caveats
- MakeMyTrip is a single-page app and may update DOM/identifiers; minor xpath tweaks can be required over time.
- The script targets the desktop site; mobile/responsive layouts may differ.
- For production-grade reporting, integrate Allure or ExtentReports (I can add this if requested).

Good luck! If you'd like, I can:
- Push guidance text you can paste into your GitHub repo description to explain the assignment mapping.
- Produce a short one-page PDF summary for HR that highlights how the assignment requirements are met.
