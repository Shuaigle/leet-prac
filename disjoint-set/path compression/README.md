# path compression

1. optimize the `find()`
2. break the path and *reconnect* the node directly to the ***root node***
3. when next time we `find()`, the cost is smaller
4. this method also limit the tree height to ***O(lnN)***
5. the `find()` and `union()` are O(lnN)
6. use recursion method to implement