# CS 360 Mobile Architect and Programming

## Inventory App

This repository contains my completed Inventory App from CS 360. The application was developed in Android Studio using Java and demonstrates mobile UI design, persistent data storage, user authentication, inventory management, and SMS notifications.

## Briefly summarize the requirements and goals of the app you developed. What user needs was this app designed to address?

The goal of my application was to create an inventory management system that could store and manage parts. Users needed to be able to create an account, log in, and view their inventory in one place. The finished application allows users to add, edit, and delete inventory items while keeping the information stored in a persistent database. It also includes optional SMS notifications when an item's quantity reaches zero.

## What screens and features were necessary to support user needs and produce a user-centered UI for the app? How did your UI designs keep users in mind? Why were your designs successful?

The application uses separate screens for logging in, creating an account, viewing inventory, adding or editing inventory items, and managing SMS notifications. I tried to keep the screens simple so the user could quickly understand what each one was for. Consistent buttons, headings, and navigation also made it easier to move through the application without needing instructions.

## How did you approach the process of coding your app? What techniques or strategies did you use? How could those techniques or strategies be applied in the future?

I approached the coding by breaking the application into smaller pieces instead of trying to make everything functional at once. I started with the database and account system, then worked on inventory operations and finally added SMS functionality. Building and testing one section at a time made problems easier to find, and I could use the same strategy on larger projects in the future.

## How did you test to ensure your code was functional? Why is this process important, and what did it reveal?

I tested the application throughout development using the Android Emulator. I tested valid and invalid logins, account creation, adding inventory, editing and deleting items, database persistence, navigation, and both allowing and denying SMS permission. Testing each path helped find problems that would not necessarily be obvious just from reading the code and confirmed that the application continued working when optional permissions were denied.

## Consider the full app design and development process from initial planning to finalization. Where did you have to innovate to overcome a challenge?

One challenge was taking the larger inventory system I originally designed and making sure the final application clearly demonstrated the required functionality. I simplified some parts of the design while keeping the main purpose of the inventory application intact. This allowed me to focus development on creating a reliable database, inventory interface, login system, and notification feature rather than adding unnecessary complexity.

## In what specific component of your mobile app were you particularly successful in demonstrating your knowledge, skills, and experience?

I think the inventory database was one of the strongest parts of the application. I used SQLite to persist both account and inventory information and implemented the ability to create, read, update, and delete inventory records. The inventory screen then displays that information in a grid and connects the database operations to the user interface, which brought together several of the skills I learned during the course.
