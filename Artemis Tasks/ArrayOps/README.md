# Trivial Array Operations

This project contains simple array operations implemented in Java. The goal of this assignment is to perform various operations on arrays without using Java API functions.

## Functions

### `print(int[] arr)`

Outputs the array onto the console with the elements separated by a comma and a space, enclosed in curly braces. Example:

```java
print(new int[] {1, 2, 3, 4, 5});
```

Output:

```
{1, 2, 3, 4, 5}
```

### `minUndMax(int[] arr)`

Prints the minimum and maximum of the array `arr` to the console. Example:

```java
minUndMax(new int[] {1, 10, 25, -13, 1000});
```

Output:

```
Minimum = -13, Maximum = 1000
```

### `invert(int[] arr)`

Returns a fresh array that contains the elements of the array `arr` in reverse order. Example:

```java
invert(new int[] {0, 1, 2, 3});
```

Output:

```
{3, 2, 1, 0}
```

### `cut(int[] arr, int len)`

Returns a fresh array that provides space for exactly `len` elements and contains the elements of `arr` in the same order as many as possible. If the returned array is larger than the argument array, the extra positions receive the value 0. Example:

```java
cut(new int[] {1, 2, 3}, 2);
```

Output:

```
{1, 2}
```

```java
cut(new int[] {1, 2, 3}, 5);
```

Output:

```
{1, 2, 3, 0, 0}
```

### `linearize(int[][] arr)`

Returns a fresh one-dimensional array that contains the elements of the 2-dimensional argument array `arr`. The rows of the array `arr` are concatenated successively according to their indices. Rows need not be of equal length. Example:

```java
linearize(new int[][] {{1, 3}, {25}, {7, 4, 6, 9}});
```

Output:

```
{1, 3, 25, 7, 4, 6, 9}
```

## How to Use

You can use these functions by including the `Arrays` class in your Java project. Simply call the functions with the appropriate arguments to perform the desired array operations.

```java
int[] arr = new int[] {1, 2, 3, 4, 5};
Arrays.print(arr);
```
