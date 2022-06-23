# Union by rank
1. in previous (quick find/ quick union) we randomly union two set, this may lead unlimit disjoint set tree height
2. Union by rank can merge the shorter tree to the larger(taller)
3. `find()` cost O(lnN), `union()` cost O(lnN), because the tree height is limited to ***lnN*** 
4. like a ***binary heap***