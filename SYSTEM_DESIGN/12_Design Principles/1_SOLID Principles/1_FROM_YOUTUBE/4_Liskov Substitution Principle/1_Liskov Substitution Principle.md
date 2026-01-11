
# Liskov Substitution Principle : ->  https://youtu.be/izSERVvdkSA?si=JfMZFaEaeQTFdKxK => yt_link




# Liskov Substitution Principle (LSP) – SOLID Principles

**Source:** Coding Decoded (Sanchit Dhingra, Adobe)  
**Topic:** Low-Level System Design (LLD)

---

# 1. Introduction

The video covers the **Liskov Substitution Principle (LSP)**, the **'L'** in SOLID principles.  
It is often considered the most complex but critical principle for designing robust systems using inheritance.

**Definition:** Subtypes must be substitutable for their base types.

**Simple Terms:** If class B is a child of class A, you should be able to replace A with B **without breaking the code** or changing the correctness of the program.

**Golden Rule:** A subclass should **extend the capability** of a parent class, not narrow it down.  
If a subclass cannot perform an action defined in the parent class, it violates LSP.

---

# 2. Technical Example: Employee Management System

The speaker demonstrates LSP using an Employee Management System with three types of employees: **Permanent, Temporary, and Contractual**.

## ❌ The Bad Design (Violating LSP)

A generic `IEmployee` interface is created with three methods:

- `getSalary()`  
- `calculateBonus()`  
- `getPerks()` (e.g., car allowance, medical)  

### Implementation

- **Permanent Employee:** Implements all three methods perfectly  
- **Temporary Employee:** Implements all three methods perfectly  
- **Contractual Employee:**  
  - `getSalary()`: Works fine  
  - `calculateBonus()`: Problem! Contractual employees are not eligible → throws `UnsupportedOperationException` or returns null  
  - `getPerks()`: Problem! They don't get perks → returns null  

### Consequence (In the Manager Class)

java
for (IEmployee emp : employeeList) {
    totalBonus += emp.calculateBonus(); // CRASHES for ContractualEmployee!
}





# To fix this crash, the developer adds a "band-aid" code:

if (!(emp instanceof ContractEmployee)) { // Checking class type manually
    totalBonus += emp.calculateBonus();
}


# Why this is bad:

- Violation: Manager class now needs to know the internal details of every subclass

- Maintenance Nightmare: Adding a "Freelancer" who also doesn't get a bonus requires modifying the Manager class again




# 3. How to Identify LSP Violations

- Look for these code smells:

- instanceof Checks → e.g., if (obj instanceof ClassName)

- UnsupportedOperationException → child class cannot do what parent promised

- Empty Methods → child class overrides a method but leaves it empty

- Returning null → method returns null because the feature doesn't apply to the subclass





# - 4. The Good Design (LSP Compliant)

Refactor the code by splitting interfaces (Interface Segregation).

# Step 1: Create Specific Interfaces

- Instead of one giant IEmployee interface, split based on capabilities:

- IEmployee (Base interface): Contains only getSalary() (common to everyone)

- IEmployeeSpecialAllowances (New interface): Contains calculateBonus() and getPerks()

# Step 2: Implement Correctly

- Contractual Employee: Only implements IEmployee. Never has to deal with bonus or perks

- Permanent/Temporary Employee: Implements both IEmployee and IEmployeeSpecialAllowances




# Step 3: Manager Class (No Checks Needed)

- Manager class has two separate lists:

- List<IEmployee> allEmployees → used for calculating salaries (works for everyone)

- List<IEmployeeSpecialAllowances> eligibleEmployees → used for bonuses (Contractual employees cannot be added)

// No if-checks needed!
for (IEmployeeSpecialAllowances emp : eligibleEmployees) {
    totalBonus += emp.calculateBonus();
}






## 5. Summary Table

| Feature         | Bad Design (Violating LSP)                               | Good Design (LSP Compliant)                          |
|-----------------|---------------------------------------------------------|-----------------------------------------------------|
| Interface       | One giant interface (`IEmployee`) with all methods     | Split interfaces (`IEmployee`, `IEmployeeSpecialAllowances`) |
| Subclass Logic  | Child class throws Exception or returns null for unsupported features | Child class only implements the interface it actually needs |
| Manager Code    | Riddled with `if (emp instanceof Contract)` checks     | Clean loops, no type checks needed                 |
| Error Timing    | Runtime Errors (Crashes)                                | Compile-time Errors (Safer)                        |
