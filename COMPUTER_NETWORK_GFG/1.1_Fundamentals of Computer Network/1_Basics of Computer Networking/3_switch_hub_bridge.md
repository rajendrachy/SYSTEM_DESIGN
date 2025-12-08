
# Network Switch - Networking Devices

**Source:** [Gate Smashers](https://youtu.be/vdtqEPKYB5M?si=SULigRb60pqCIO2E)
**Topic:** Computer Networks (Layer 2 Devices)

---

## 1. Introduction
* **Definition:** A Switch is a networking hardware that connects devices on a computer network by using packet switching to receive and forward data to the destination device.
* **AKA:** It is technically referred to as a **"Multiport Bridge"**. While a bridge usually connects just two LAN segments, a switch has many ports to connect many devices.
* **OSI Layer:** Operates at **Layer 2 (Data Link Layer)** using **MAC Addresses**.

## 2. Connectivity & Architecture
* **Usage:** Commonly found in offices and labs. Devices (PCs, Printers) connect to the Switch, and the Switch connects to the Router for internet access.
* **Port Density:** Switches come with various port configurations like 8, 24, 48, or 52 ports.

## 3. Key Advantages

### A. Full Duplex Communication
* Links in a switch are **Full Duplex**, meaning data can flow in both directions simultaneously.
* **Benefit:** This practically eliminates collisions on the link.

### B. Dedicated Communication (Zero Collisions)
* When **Device A** talks to **Device B**, the switch establishes a logical connection just for them.
* Simultaneously, **Device C** can talk to **Device D** without interfering with A and B.
* **Collision Domain:** Each port on a switch is its own separate collision domain.

### C. Traffic Management (Intelligent Forwarding)
* unlike a **Hub** (which blindly broadcasts data to all ports), a Switch filters traffic.
* It uses a **MAC Address Table** to identify where the destination device is located.
* Data is sent **only** to the destination port (Unicast), saving bandwidth and increasing security.

## 4. Layer 3 Switches
* While standard switches are Layer 2, modern "Smart Switches" can handle IP routing, pushing them into **Layer 3 (Network Layer)** functionality, typically handled by routers.

---

## Summary Comparison

| Feature | Switch | Hub |
| :--- | :--- | :--- |
| **Intelligence** | Smart (Uses MAC Table) | Dumb (Broadcasts everything) |
| **Bandwidth** | Dedicated per port | Shared across all ports |
| **Transmission** | Unicast (One-to-One) | Broadcast (One-to-All) |
| **Security** | Higher (Data goes only to destination) | Low (Data goes to everyone) |






