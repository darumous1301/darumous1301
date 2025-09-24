POINTERS TO REVIEW FOR QUIZ 1 (CHAPTER 1 & 2)

🔹 Terms & Basics
Database – organized collection of related data.
Data – stored representation of objects/events. (Structured = numbers, text; Unstructured = images, videos).
Information – processed data for decision-making.
Metadata – data about data (describes properties, types, constraints).

🔹 File Processing Problems
Program-Data Dependence – every program must define & manage its own data.
Data Redundancy – duplicate data wastes storage, causes inconsistency.
Limited Data Sharing – hard to integrate across apps.
Other Issues – lengthy development, excessive maintenance, poor security.

Database Approach
Central Repository – shared, standardized data.
DBMS – software to manage, store, retrieve data (like OS for hardware).
Advantages – independence, less redundancy, consistency, sharing, quality, better decision support.
Costs/Risks – training, hardware/software cost, complexity, conversion effort, conflicts.

🔹 Components of Database Environment
Data Models – diagrams of entities/relationships.
Repository – metadata storage.
DBMS – database software.
Database – actual data store.
Application Programs – software using DB.
User Interface – GUIs, menus, etc.
People – DB admins, developers, end-users.

Database Development Process
Enterprise Data Model – high-level view of org. data.

Approaches:
SDLC (Plan → Analysis → Logical Design → Physical Design → Implement → Maintain).
Prototyping – iterative, rapid model building.

🔹 Entities & Attributes (Chapter 2)
Entity – person, place, object, event, concept.
Entity Type – collection of similar entities.
Entity Instance – one occurrence.
Strong Entity – independent, has its own identifier.
Weak Entity – dependent on strong entity, no full identifier.

Attributes Types:
Required vs. Optional
Simple vs. Composite
Single-valued vs. Multi-valued
Stored vs. Derived
Identifier (Key) – uniquely identifies entity instance (simple or composite).

Good Practices
Business Rules – declarative, clear, precise, non-redundant, expressed in user’s language.
Good Names – meaningful, consistent, unique, readable, standard syntax.
Good Definitions – concise, agreed upon, supported by diagrams, refined iteratively.

🔹 Relationships
Types – Relationship Type (general connection), Relationship Instance (specific occurrence).
Attributes – can exist on relationships (e.g., DateHired).
Associative Entity – relationship turned into entity if it has attributes.

Degree of Relationship:
Unary – entity relates to itself.
Binary – two entities.
Ternary – three entities.

Cardinality:
1:1 – one-to-one.
1:M – one-to-many.
M:N – many-to-many.

Cardinality Constraints:
Minimum – optional (0) or mandatory (1+).
Maximum – maximum number allowed.

🔹 Evolution of DB Systems (Ch. 1 Recap)

File Systems → Hierarchical/Network → Relational → Object-Oriented → NoSQL → Cloud

Evolution of Database Systems (Simple Explanation)

File Processing (Before Databases)
Data stored in files (text, spreadsheets).
Problems: duplication, inconsistency, hard to maintain.

Hierarchical Databases (like a tree)
Data stored in parent → child structure.
Example: A company has a Department, each department has Employees.
Problem: Hard to change structure, very rigid.

Network Databases (like a web)
Data connected through multiple links.
More flexible than hierarchical.
Still complex to design and use.

Relational Databases (most common today)
Data stored in tables (rows & columns).
Easy to understand, use SQL for queries.
Examples: MySQL, Oracle, SQL Server.

Object-Oriented Databases
Stores complex data (like multimedia, objects in programs).
Example: Storing a “Student” object with both data + methods.

NoSQL Databases (for big data)
Handles unstructured data (social media posts, logs).
More flexible than tables.
Examples: MongoDB, Cassandra.

Cloud Databases (modern)
Databases stored & managed in the cloud.
Accessible anywhere, scalable.
Examples: Google BigQuery, AWS RDS.