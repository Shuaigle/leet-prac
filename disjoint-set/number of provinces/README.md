# leetcode 547. Number of Provinces
1. we traverse all nodes in matrix, check if connect then union them through `union()`
2. if they have same root -> they are connected
3. count the union number
