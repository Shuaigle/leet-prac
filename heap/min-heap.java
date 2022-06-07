public class MinHeap {
    // Heap was built by array with complete binary tree
    int[] minHeap;
    // The size that we need to initiate
    int heapSize;
    // Number of values that actually contains in our heap
    int realSize = 0;

    // Initiated our heap
    public MinHeap(int heapSize) {
	this.heapSize = heapSize;
	// We set our root node at position 1, not 0
	// Care!!!!!!!!!!!!!!!!!!!!!!!!!
	minHeap = new int[heapSize + 1];
	minHeap[0] = 0;
    }

    //Function to insert value into heap 
    public void add(int element) {
	realSize++;
	// Check if the size is too large
	if (realSize > heapSize) {
	    System.out.println("Added too many elements!");
	    realSize--;
	    return;
	}
	// Add the element to the first position which was null of our array
	minHeap[realSize] = element;
	int index = realSize;
	// Parent index of complete binary tree
	int parentIndex = index / 2;
	// heapify of this new element
	while (minHeap[index] < minHeap[parentIndex] && index > 1) {
	    int temp = minHeap[index];
	    minHeap[index] = minHeap[parentIndex];
	    minHeap[parentIndex] = temp;
	    index = parentIndex;
	    parentIndex = index / 2;
	}
    }

    // Get min value
    public int getMin() {
	return minHeap[1];
    }

    // Delete min value and heapify
    public int pop() {
	// Boundary
	if (realSize < 1) {
	    System.out.println("Don't have any element!");
	    // Return default largest value
	    return Integer.MAX_VALUE;
	} else {
	    // Cache it
	    int removeElement = minHeap[1];
	    // Put last element on top of heap
	    minHeap[1] = minHeap[realSize];
	    realSize--;
	    // Last element index
	    int index = 1;
	    // Start heapify
	    // Check if leaf node
	    while (index <= realSize / 2) {
		int left = index * 2;
		int right = (index * 2) + 1;
		if (minHeap[index] > minHeap[left] | minHeap[index] > minHeap[right]) {
		    int temp = minHeap[left];
		    minHeap[left] = minHeap[index];
		    minHeap[index] = temp;
		    index = left;
		} else {
		    break;
		}
	    }
	    return removeElement;
	}
    }
    
    // Return realSize
    public int size() {
	return realSize;
    }

    public String toString() {
	if (realSize == 0) {
	    return "No element!";
	} else {
	    StringBuilder sb = new StringBuilder();
	    sb.append('[');
	    for (int i = 1; i <= realSize; i++) {
		sb.append(minHeap[i]);
		sb.append(',');
	    }
	    sb.deleteChartAt(sb.length() - 1);
	    sb.length(']');
	    return sb.toString();
	}
    }

    public static void main(String[] args) {
        // Test case
        MinHeap minHeap = new MinHeap(3);
        minHeap.add(3);
        minHeap.add(1);
        minHeap.add(2);
        // [1,3,2]
        System.out.println(minHeap.toString());
        // 1
        System.out.println(minHeap.peek());
        // 1
        System.out.println(minHeap.pop());
        // [2, 3]
        System.out.println(minHeap.toString());
        minHeap.add(4);
        // Add too many elements
        minHeap.add(5);
        // [2,3,4]
        System.out.println(minHeap.toString());
    }
}
















