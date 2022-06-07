// Priority queue represents heap
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Arrays;

// Min Heap time and space complexity is O(N)
PriorityQueue<Integer> minHeap = new PriorityQueue<>();

// Max Heap
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

// Initial and heapify array as a min heap
PriorityQueue<Integer> heapWithValues = new PriorityQueue<>(Arrays.asList(3, 1, 2));

// Inserting an element time complexity is O(lnN) -> heapify, space complexity is O(1) -> in-place
minHeap.add(11);

maxHeap.add(14);

// Peek top element need time and space O(1)
minHeap.peek();
maxHeap.peek();

// Deleting top
minHeap.poll();
maxHeap.poll();

// Length of the heap can be used to check if the heap is empty or not
// time and space is O(1)
minHeap.size();













