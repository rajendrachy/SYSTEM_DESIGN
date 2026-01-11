


# CAP Theorem and Trade-offs in Distributed Systems

Below are **10 exam-oriented MCQs** frequently asked in **Distributed Systems / GATE / University exams**.

---

## MCQ 1

According to the CAP Theorem, a distributed system can guarantee at most:

A. All three properties at once
B. Only Consistency and Availability
C. Only one property at a time
D. Any two of Consistency, Availability, and Partition Tolerance

**Answer:** D

---

## MCQ 2

What does **Consistency** mean in the CAP theorem?

A. Data is always stored in multiple locations
B. All nodes see the same data at the same time
C. The system is always available
D. Data is never lost

**Answer:** B

---

## MCQ 3

What does **Availability** guarantee in a distributed system?

A. Every request receives a response
B. Data is always consistent
C. Network failures never occur
D. Queries are always fast

**Answer:** A

---

## MCQ 4

What does **Partition Tolerance** refer to?

A. Ability to tolerate disk failure
B. Ability to tolerate node crashes
C. Ability to continue operation despite network partitions
D. Ability to replicate data

**Answer:** C

---

## MCQ 5

In the presence of a network partition, a distributed system must choose between:

A. Scalability and Security
B. Consistency and Availability
C. Reliability and Performance
D. Latency and Throughput

**Answer:** B

---

## MCQ 6

Which type of system prefers **Consistency over Availability** during partitions?

A. AP system
B. CA system
C. CP system
D. PA system

**Answer:** C

---

## MCQ 7

Which of the following is an example of an **AP system**?

A. Traditional relational databases
B. Distributed file systems requiring strict consistency
C. Systems that allow temporary inconsistencies
D. Single-node databases

**Answer:** C

---

## MCQ 8

Why is **Partition Tolerance** considered mandatory in distributed systems?

A. It improves performance
B. It reduces storage cost
C. Network failures are unavoidable
D. It ensures strong consistency

**Answer:** C

---

## MCQ 9

Which CAP combination is practically impossible in a real distributed system?

A. CP
B. AP
C. CA
D. PA

**Answer:** C

---

## MCQ 10

Which statement best describes the CAP theorem trade-off?

A. A system can dynamically switch between all three properties
B. A system can guarantee all three properties with enough resources
C. A system must sacrifice either consistency or availability during partitions
D. Partition tolerance can be ignored in practice

**Answer:** C

---

### 📌 Exam Tip

* **CAP is about trade-offs under network partition**.
* Most real-world systems are either **CP** or **AP**.
* **CA systems** work only when partitions are not possible.


