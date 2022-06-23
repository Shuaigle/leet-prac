# Quick find disjiont set
1. construct an array
2. value point to its parent
3. if (value == index) -> this is root
4. change the child node value to the root value
5. thus the find() root method is O(1)
6. construction need O(N)
7. union() need also O(N), since we need to change all the child node value to the **new** root value