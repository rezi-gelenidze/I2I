# Algorithms Repository

This repository is a collection of classic algorithms implemented in Java, showcasing different sorting and searching techniques. Each algorithm is implemented in a separate file for easy understanding and modularity.

## Sorting Algorithms

1. **Bubble Sort** (`BubbleSort.java`): An elementary sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.

2. **Insertion Sort** (`InsertionSort.java`): A simple sorting algorithm that builds the final sorted array one item at a time.

3. **Merge Sort** (`MergeSort.java`): An efficient, stable, comparison-based, divide and conquer sorting algorithm. Most implementations produce a stable sort.

4. **Selection Sort** (`SelectionSort.java`): An in-place comparison sorting algorithm. It divides the input list into two parts: a sorted sublist of items which is built up from left to right, and a sublist of the remaining unsorted items.

## Searching Algorithms

1. **Binary Search** (`BinarySearch.java`): An efficient algorithm for finding an item from a sorted list of items. It works by repeatedly dividing in half the portion of the list that could contain the item until you've narrowed down the possible locations to just one.

2. **Linear Search** (`LinearSearch.java`): A method for finding an element within a list. It sequentially checks each element of the list until a match is found or the whole list has been searched.

## Algorithms' Complexities

| Algorithm        | Big Omega Notation | Big O Notation     |
|------------------|--------------------|--------------------|
| Insertion Sort   | Ω(n)               | O(n^2)             |
| Selection Sort   | Ω(n^2)             | O(n^2)             |
| Bubble Sort      | Ω(n)               | O(n^2)             |
| Merge Sort       | Ω(n log n)         | O(n log n)         |
| Binary Search    | Ω(1)               | O(log n)           |
| Linear Search    | Ω(n)               | O(n)               |

## Usage

Each file contains a standalone implementation of an algorithm. To run a specific algorithm, simply compile and run the respective Java file.
