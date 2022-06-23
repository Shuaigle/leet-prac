# Quick union
1. find() is slow -> O(N), Union() is quick -> O(1)
2. quick union is such the same step with quick find
3. differences are when union(), quick union() only change the root node value to anothor, thus, the array's value point to the parent node, not the root node value, and result in the first situation