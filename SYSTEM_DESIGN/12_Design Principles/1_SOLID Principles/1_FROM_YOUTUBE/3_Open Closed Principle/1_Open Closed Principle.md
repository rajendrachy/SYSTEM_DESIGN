
# Open Closed Principle : -> https://youtu.be/2oUaKT241GE?si=3uAE5QccheJQhIsi => yt_link




# Open Closed Principle (OCP) – SOLID Principles

Source: Coding Decoded (Sanchit Dhingra, Adobe)
Topic: Low-Level System Design (LLD)

1. Introduction

The Open Closed Principle (OCP) is the ‘O’ in SOLID principles. It helps create flexible, scalable, and maintainable software systems.

A class or module should be:
- Open for Extension – You can add new functionality.
- Closed for Modification – You should not modify existing, tested code.

This allows systems to evolve without breaking old functionality.

2. Real-Life Analogy: Apartment Blueprint

Scenario:
In an apartment building, certain elements are fixed:
- Structural walls
- Bathroom position
- Kitchen position
- Plumbing shafts

Bad Design (Violation of OCP):
If every buyer could place their bathroom or kitchen anywhere:
- Water pipes would zigzag across floors.
- One buyer's layout change could break plumbing for others.
- Maintenance becomes costly and complex.

This violates OCP because the core structure keeps getting modified.

Good Design (OCP Applied):
The builder provides a strict blueprint:
- Core structure → Closed for Modification
- Interiors (color, furniture, decor) → Open for Extension

Owners can customize interiors freely without affecting the building's structure.

3. Technical Example: Shape Statistics

Non-Compliant (Bad) Approach:
A FindShapeStats class calculates the area using multiple if-else conditions:

if (s is Circle) return 3.14 * r * r;
else if (s is Rectangle) return l * b;
else if (s is Square) return side * side;

Why This Violates OCP:
1. New shapes require modifying the same class.
2. Modifying working code risks regression bugs.
3. The class becomes a large God Class.

Compliant (Good) Approach – Using Interfaces:

Step 1: Create Shape Interface:
interface Shape {
    double getArea();
}

Step 2: Implement Individual Shape Classes:
class Circle implements Shape {
    public double getArea() { return 3.14 * r * r; }
}

class Rectangle implements Shape {
    public double getArea() { return l * b; }
}

class Square implements Shape {
    public double getArea() { return side * side; }
}

Step 3: Simplified Main Logic:
public double getArea(Shape s) {
    return s.getArea();
}

Adding a New Shape (Triangle):
class Triangle implements Shape {
    public double getArea() { return 0.5 * base * height; }
}

No changes to old code → OCP satisfied.

4. Benefits of OCP
1. No Regression Bugs – old code stays untouched.
2. Easy Scalability – add new shapes by making new classes only.
3. Cleaner Code – each shape handles its own logic.
4. High Maintainability – modular, organized structure.




5. Summary Table

Feature                        | Non-Compliant (Bad Design)                | Compliant (OCP Design)
------------------------------------------------------------------------------------------------------
Logic Location                 | Central class with if-else chains         | Each class defines its own logic
Adding New Features            | Modify existing code                      | Create a new class only
Risk                           | High (may break old code)                 | Low (old code untouched)
Principle                      | Closed for Extension, Open for Modification | Open for Extension, Closed for Modification
















# SOLID Principles – Low-Level System Design (LLD)

**Source:** Coding Decoded (Sanchit Dhingra, Adobe)

---

# 1. Single Responsibility Principle (SRP)

## Introduction

The **Single Responsibility Principle (SRP)** is the **‘S’** in SOLID.  
It states that **a class should have one, and only one, reason to change**.

### Real-Life Analogy: Pani Puri Vendor

A single vendor performs four roles:

- Chef: prepares food  
- Logistics Manager: procures raw materials  
- Order System: takes customer orders  
- Delivery: delivers food  

**Problems of a monolithic class:**

- Single point of failure  
- Scalability issues  
- Bug propagation  

### Technical Solution: Applying SRP

Split responsibilities into separate classes:

- **OrderPlacementModule:** Handles customer orders.  
- **FoodPreparationModule:** Handles cooking logic.  
- **LogisticsModule:** Handles procurement.  
- **DeliveryModule:** Handles delivery.  
- **ManagerClass:** Coordinates all modules.  

### Benefits

- Scalability: scale only the required module.  
- Resilience: isolated failures.  
- Maintainability: easier to debug and update code.  

### Summary Table

| Feature | Naive Approach (No SRP) | Experienced Approach (With SRP) |
|---------|-------------------------|--------------------------------|
| Structure | Single giant class | Multiple specialized classes |
| Responsibility | Multiple | Single (one job per class) |
| Failure Impact | Total system failure | Isolated failure |
| Scalability | Impossible / Very hard | Highly scalable |
| Analogy | One person doing 4 jobs | Team of 4 specialists |

---

# 2. Open Closed Principle (OCP)

## Introduction

OCP is the **‘O’** in SOLID:  
- **Open for Extension:** Add new functionality.  
- **Closed for Modification:** Existing tested code should not change.  

## Real-Life Analogy: Apartment Blueprint

- Fixed core: structural walls, kitchen, bathroom, plumbing shafts  
- Bad Design: Allowing buyers to move bathrooms breaks plumbing  
- Good Design: Core closed for modification, interiors open for extension  

## Technical Example: Shape Statistics

### ❌ Non-Compliant Approach

```java
if (s is Circle) return 3.14 * r * r;
else if (s is Rectangle) return l * b;
else if (s is Square) return side * side;



