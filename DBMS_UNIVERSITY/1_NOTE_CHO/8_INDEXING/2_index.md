

# Indexing: Tabular vs Columnar Data (MCQs)

Below are **10 multiple-choice questions (MCQs)** based on **indexing in tabular (row-based) and columnar data storage** systems.

---

## MCQ 1

Which storage model stores data **row by row**?

A. Columnar storage
B. Vector storage
C. Tabular (row-based) storage
D. Distributed storage

**Answer:** C

---

## MCQ 2

In which storage model is indexing typically built on **entire rows**?

A. Columnar storage
B. Tabular storage
C. Graph storage
D. Key-value storage

**Answer:** B

---

## MCQ 3

Which type of indexing is more effective in **columnar databases**?

A. Row-based indexing
B. Bitmap indexing
C. Sequential indexing
D. Pointer indexing

**Answer:** B

---

## MCQ 4

Columnar storage is most efficient for which type of queries?

A. OLTP transactions
B. Insert-heavy workloads
C. Analytical queries (OLAP)
D. Real-time updates

**Answer:** C

---

## MCQ 5

Why is indexing often less critical in columnar databases?

A. Columnar databases do not support indexing
B. Data is stored in compressed form by columns
C. Indexing slows down column scans
D. Columnar databases use hashing only

**Answer:** B

---

## MCQ 6

Which indexing method is commonly used in **row-based databases** like MySQL or PostgreSQL?

A. Bitmap index
B. Inverted index
C. B-tree index
D. Column index

**Answer:** C

---

## MCQ 7

In tabular storage, indexing improves performance mainly for:

A. Full table scans
B. Insert operations
C. Selective queries with WHERE clauses
D. Data compression

**Answer:** C

---

## MCQ 8

Which statement best compares indexing in tabular and columnar databases?

A. Both rely equally on B-tree indexes
B. Tabular databases benefit more from traditional indexes
C. Columnar databases cannot use indexes
D. Indexing is unnecessary in all databases

**Answer:** B

---

## MCQ 9

Bitmap indexing is especially suitable for columnar databases because:

A. Columns have high cardinality
B. Rows are stored contiguously
C. Columns often have low cardinality
D. Updates are frequent

**Answer:** C

---

## MCQ 10

Which of the following is a key disadvantage of indexing in tabular storage?

A. Increased read performance
B. Faster query execution
C. Additional storage overhead
D. Improved compression

**Answer:** C

---

### 📌 Summary

* **Tabular (row-based) databases** rely heavily on traditional indexes (e.g., B-trees).
* **Columnar databases** often use bitmap or zone-map indexes and benefit from column-level compression.
* Indexing strategies differ based on workload type (OLTP vs OLAP).
