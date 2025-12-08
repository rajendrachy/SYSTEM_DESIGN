

# Introduction to Computer Networks & OSI Model

**Source:** [Gate Smashers](https://youtu.be/4D55Cmj2t-A?si=BxVsFu_O1o3GVz_9)  
**Topic:** Computer Networks (Basics)

---

## 1. Computer Network Definition
* **Definition:** A collection of devices connected to share data.
* **Key Elements:** Sender, Receiver, Message, Medium, and **Protocols**.

## 2. Why Protocols?
* **Problem:** Connection $\neq$ Communication. Two devices can be connected but might not understand each other's data format (Language Barrier Analogy).
* **Solution:** **Protocols** are sets of rules/instructions running on both ends to ensure the data is understood.

## 3. Types of Communication
* **Inter-Process Communication (IPC):** Communication between processes on the **same machine**. Handled by the **OS (Kernel)**.
* **Network Communication:** Communication between **physically separated machines** (Client in India $\leftrightarrow$ Server in USA). The network provides an abstraction so data feels local.

## 4. Network Functionalities

### A. Mandatory (Essential)
1.  **Error Control:** Checking if data was corrupted (noise/hacking) during transit.
2.  **Flow Control:** Managing data speed so the receiver's memory isn't overwhelmed.
3.  **Multiplexing/Demultiplexing:** Directing data to the correct application (Process) on the computer.

### B. Optional (Application Specific)
1.  **Cryptography:** Encryption for security (e.g., Banking). Not used everywhere to avoid unnecessary complexity/delay.
2.  **Checkpoints:** Allows resuming interrupted downloads (e.g., large files). Not needed for small data packets (e.g., chat messages).

## 5. The OSI Model
* **Purpose:** To organize and standardize the 70+ network functionalities into a manageable structure.
* **Structure:** It divides functions into **7 Layers**:
    1.  **Physical Layer**
    2.  **Data Link Layer**
    3.  **Network Layer**
    4.  **Transport Layer**
    5.  **Session Layer**
    6.  **Presentation Layer**
    7.  **Application Layer**


    