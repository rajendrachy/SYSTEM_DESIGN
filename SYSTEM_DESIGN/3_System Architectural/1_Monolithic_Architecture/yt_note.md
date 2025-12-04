# # MonoLithic_Architecture : -> https://youtu.be/7IFJb-uLEaI?si=qdqaKQ4e4BWfO42g => yt_link



# Subject: Microservices vs. Monolithic Architecture
# Source: Apna College Topic: Backend System Design

# 1.Understanding Monolithic Architecture
- Before diving into microservices, it is important to understand the traditional approach known as Monolithic Architecture.


- What is it? In a monolithic application, the entire project is built as a single unit. All different functionalities—such as user authentication, payments, and product listings—are contained within one code base and one repository.

- Deployment: The application is deployed as a single large file. If you are using Java, the whole backend uses Java.

- Why use it? It is the standard way of building for startups and small teams because it is intuitive, easier to set up, and simpler to debug initially.




# The Problems with Monoliths: While simple to start, monoliths face significant issues as an application grows:

- Redeployment: Even a tiny change (like fixing a typo in the login screen) requires you to rebuild and redeploy the entire application.

- Scaling Limits: You cannot scale specific parts. If your "Payments" section gets heavy traffic, you have to scale the entire server, which wastes resources.

- Tight Dependency: If one feature requires a specific version of a library, all other features are forced to use it, often leading to conflicts.






# 2.Understanding Microservices Architecture

- Microservices were adopted by companies like Netflix and Amazon to solve the problems of the monolith.

- What is it? This architecture breaks the application down into small, independent pieces called "services." For example, an e-commerce app might be split into a "User Service," a "Cart Service," and a "Payment Service."

- Independence: Each service acts like a mini-application. It has its own database, its own code repository, and can be developed by a separate team.





# Key Advantages:

- Independent Deployment: You can update or fix the "Cart Service" without stopping the "Payment Service." This drastically reduces downtime.

- Flexible Scaling: If the "Product Listing" service is handling high traffic, you can add more servers just for that service, saving money and computing power.

- Technology Freedom: You are not locked into one language. You could write the Payment service in Java (for security), the Recommendation engine in Python (for AI/ML), and the Chat service in Node.js (for speed).






# 3.How Microservices Communicate

-Since the code is split across different services, they cannot simply call functions like in a monolith. They use two main methods to talk to each other:

- Synchronous (API Calls): Services send HTTP requests to each other's API endpoints (e.g., Service A asks Service B for data and waits for a response).

- Asynchronous (Message Brokers): This is often preferred for decoupling. Service A sends a message to a "broker" (like RabbitMQ or Kafka), which then delivers it to Service B. Service A doesn't need to wait for Service B to respond immediately.






# 4.Challenges & Conclusion

- Microservices are not a "silver bullet." They introduce complexity.

- Management Overhead: Instead of one app, you are now managing 10 or 50 small apps.

- Infrastructure Costs: You need more complex setups (like Kubernetes) and more servers to run all these independent containers.



# Summary: Startups should usually start with a Monolith for speed and simplicity. Large organizations eventually migrate to Microservices when they need to scale teams and traffic massively.









