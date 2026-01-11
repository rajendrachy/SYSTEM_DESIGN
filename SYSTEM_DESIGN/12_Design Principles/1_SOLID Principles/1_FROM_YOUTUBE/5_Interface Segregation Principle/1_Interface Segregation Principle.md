

# Interface Segregation Principle : -> https://youtu.be/HrvcbD-UO5o?si=oLuGexLxEhj-znjX => yt_link



# Interface Segregation Principle (ISP) – SOLID Principles

Source: Coding Decoded (Sanchit Dhingra, Adobe)  
Topic: Low-Level System Design (LLD)

# 1. Introduction

The video explains the Interface Segregation Principle (ISP), the 'I' in SOLID principles.

- Definition: A class should never be forced to implement an interface that it does not use.
- Simple Terms: Do not create "Fat Interfaces" (interfaces with too many methods). Instead, break them down into smaller, specific interfaces.
- Goal: Clients should only know about the methods that are relevant to them.

# 2. The Problem: "Fat" Interfaces

- Scenario: A developer creates a generic interface IMenu for all restaurants.
- Bad Design (Fat Interface):
  - interface IMenu { getVegItems(); getNonVegItems(); }

- Implementation Issues:
  - "Welcome to Punjab" (Mixed Restaurant): Serves both Veg and Non-Veg food. Implements IMenu → works fine.
  - "Taste of India" (Pure Veg Restaurant): Implements IMenu
    - getVegItems(): Returns list of Veg items
    - getNonVegItems(): Problem! Must return null or throw exception

- Why this violates ISP:
  - TasteOfIndia class is forced to implement getNonVegItems() even though it doesn't need it.
  - Adding a new method (e.g., getVeganItems()) requires updating every single restaurant class, even the ones that don't serve vegan food.

# 3. Solution 1: Redesign (Breaking the Interface)

- Step 1: Create Specific Interfaces
  - IVegMenu: Contains only getVegItems()
  - INonVegMenu: Contains only getNonVegItems()

- Step 2: Implement Specifically
  - "Welcome to Punjab": Implements both IVegMenu and INonVegMenu
  - "Taste of India": Implements only IVegMenu

- Result: Pure veg restaurants no longer deal with non-veg methods → cleaner, ISP-compliant code.

# 4. Solution 2: Adapter Pattern (For Legacy Code)

- Concept: Create a "Wrapper/Adapter" class that sits between the client and the original class to filter out unwanted methods.
- Implementation:
  - Create a Target Interface: IVegMenu (small interface the client actually needs)
  - Create an Adapter Class: VegMenuAdapter
    - Implements IVegMenu
    - Holds a reference to the original big class (CombinedMenu or IMenu)
    - Delegates calls: getVegItems() calls the original object's method; getNonVegItems() is not exposed
- Benefit:
  - Achieves Interface Segregation for clients without modifying the original messy code.
  - Clients only see relevant methods → ISP is satisfied.



# 5. Summary Table

| Feature       | Violation (Fat Interface)                  | Good Design (ISP Compliant)                       |
|---------------|-------------------------------------------|--------------------------------------------------|
| Interface     | One big IMenu with all possible methods   | Small interfaces: IVegMenu, INonVegMenu         |
| Class Logic   | Classes implement unnecessary methods and return null | Classes only implement what they need           |
| Maintenance   | Changing the interface breaks all classes | Changing one interface only affects relevant classes |
| Legacy Fix    | Hard to refactor                           | Use Adapter Pattern to hide unwanted methods    |





