

# Routers in Computer Networks

**Source:** [Gate Smashers](https://youtu.be/JhBnOamc_8s?si=H4yxfbQ3hcXZgRNi)
**Topic:** Computer Networks (Layer 3 Devices)

---


## 1. Introduction
* **Definition:** A router is a device that connects **two or more different networks**.
* **Layer:** It operates at the **Network Layer (Layer 3)** of the OSI model.
* **Scope:** While Bridges and Switches connect segments within a LAN (using MAC addresses), Routers connect distinct networks (using **IP addresses**), enabling WAN and Internet communication.



## 2. Key Responsibilities

### A. Forwarding
* Moves packets from a source network to a destination network.
* Uses **IP Addresses** to identify the destination (e.g., accessing Google or Facebook involves crossing networks).

### B. Filtering
* Routers prevent local traffic from congesting external networks.
* **Example:** **ARP Requests** (used to find MAC addresses) are broadcasts meant for the local LAN. A router will **filter (block)** these from crossing over to another network.

### C. Routing
* The logic used to determine the path a packet should take.
* **Routing Table:** A database stored in the router that lists available routes and destinations.
* **Protocols:** Uses algorithms like **Distance Vector** or **Link State** (via protocols like RIP, OSPF) to update paths.

## 3. How It Works
* **Store and Forward:** The router receives a packet, **stores** it in memory, analyzes the destination IP, and then **forwards** it.
* **No Collisions:** Because of buffering in memory, collisions do not happen inside the router.

## 4. Addressing on Interfaces
* A router has multiple ports (interfaces), each connected to a different network.
* Each interface gets an IP address belonging to the **network it connects to**.
    * *Interface A* gets an IP from *Network A*.
    * *Interface B* gets an IP from *Network B*.

---

## Summary Table

| Feature | Details |
| :--- | :--- |
| **Device Type** | Layer 3 (Network Layer) |
| **Connects** | Different Networks (WAN/Internet) |
| **Addressing** | IP Address (Logical) & MAC Address (Physical) |
| **Traffic Control** | Filters local broadcasts (e.g., ARP) |
| **Switching Mode** | Store and Forward |