

# Dependency Inversion Principle : -> https://youtu.be/a5Ln6y_wo5U?si=a-SeqG7Gzk-XceD6 => yt_link



# Dependency Inversion Principle (DIP) – SOLID Principles

**Source:** Coding Decoded (Sanchit Dhingra, Adobe)  
**Topic:** Low-Level System Design (LLD)

---

## 1. Introduction

- The video explains the **Dependency Inversion Principle (DIP)**, the **'D'** in SOLID principles.
- **Definition:** High-level modules should not depend on low-level modules. Both should depend on abstractions (interfaces).
- **Goal:** To decouple software modules so that changes in one module (e.g., changing a database or API provider) do not break or require changes in other modules.

---



## 2. Real-Life Analogy: Network Provider (Jio vs. Airtel)

- **Scenario:** Imagine a company "Coding Decoded" has offices in Delhi, Mumbai, and Bangalore. They need to make phone calls.
- **Initial Setup:** The company signs a contract with Jio.
- **Bad Design (Violation of DIP):**
  - The company's offices (High-Level Modules) directly create and use Jio objects (Low-Level Modules) to make calls.
  java
Jio network = new Jio();
network.makeCall();






# The Problem:

- A year later, Jio doubles its prices. The company wants to switch to Airtel.

- The developer has to manually change the code in every office class from new Jio() to new Airtel().

- This is tight coupling. The high-level business logic depends on the specific vendor (Jio).




# 3. Technical Solution: Using Interfaces (Abstraction)

# Step 1: Create an Interface

- Define a common contract Network that both Jio and Airtel must follow.

interface Network {
    void makeCall(int stdCode, int number);
}


# Step 2: Implement the Interface

- Both providers implement this interface:

class Jio implements Network { ... }
class Airtel implements Network { ... }


# Step 3: Invert the Dependency

- The high-level class (Coding Decoded) now depends on the Interface, not the specific class.

// CodingDecoded.java
public static void main(String[] args) {
    // We can easily switch providers here without changing the logic below
    Network network = new Airtel(); // or new Jio();

    // The business logic doesn't care which provider it is
    network.makeCall(011, 123456);
}




# Result:

- To switch from Jio to Airtel, you only change the specific object instantiation.

- The core business logic (network.makeCall()) remains untouched.

# 4. Generic Template for DIP

- Violated Version (Bad):

Class A (High-Level) directly creates new ClassB().


# Problem: If Class B changes, Class A breaks. Unit testing is hard because you can't mock Class B easily.

- Compliant Version (Good):

Interface I: Defines the methods.

Class B: Implements Interface I.

Class A: Uses Interface I.

- Benefit: Class A is now independent of Class B. It only cares about the Interface.




# 5. Summary Table
| Feature      | Violation (Tight Coupling)                         | Good Design (DIP Compliant)                |
|-------------|---------------------------------------------------|-------------------------------------------|
| Dependency  | High-level class depends on Concrete Class (Jio) | High-level class depends on Interface (Network) |
| Flexibility | Hard to change. Switching requires rewriting code in multiple places | Easy to change. Just swap the object instantiation |
| Testing     | Difficult to unit test (hard to mock concrete classes) | Easy to unit test (can mock the interface) |
| Maintenance | High maintenance cost                             | Cle





