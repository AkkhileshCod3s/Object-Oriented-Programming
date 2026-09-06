# JAVA ARRAYS CODING PRACTICE SET • 30 QUESTIONS

## Topics Covered
- 1D arrays
- 2D arrays / matrices
- Traversal and input
- Maximum and minimum
- Sum and average
- Counting elements
- Searching
- Linear search
- Reverse
- Copying arrays
- Frequency
- Duplicates
- Second largest / second smallest
- Sorting
- Array rotation
- Insertion and deletion
- Merging arrays
- Common elements
- Palindrome array
- Matrix traversal
- Row-wise and column-wise operations
- Main diagonal and secondary diagonal
- Matrix transpose
- Matrix addition
- Matrix multiplication
- Matrix symmetry
- Upper/lower triangular matrix
- Boundary elements
- Matrix rotation
- Spiral traversal
- Questions with predefined `main()`
- Questions where only the required method is predefined

---

# SECTION A — 1D ARRAYS
## Questions 1–15

---

## Q1. Find Maximum Element

**Difficulty:** EASY  
**Concept:** 1D array traversal, maximum element  
**Format:** PREDEFINED MAIN

### PROBLEM STATEMENT
Read N integers and find the maximum element in the array.

### CONSTRAINTS
- `1 <= N <= 10^5`
- Array elements are integers.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static int maxElement(int[] arr, int n) {
        // Write Your Code here
        return 0;
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        System.out.println(Result.maxElement(a, n));
    }
}
```

### SAMPLE INPUT
```text
7
20 30 93 71 18 82 66
```

### SAMPLE OUTPUT
```text
93
```

### EXPLANATION
Start with the first element as maximum and compare every remaining element.

**Expected Complexity:** Time: O(N), Space: O(1)

---

## Q2. Find Minimum Element

**Difficulty:** EASY  
**Concept:** 1D array traversal, minimum element  
**Format:** NON-PREDEFINED MAIN

### PROBLEM STATEMENT
Write a program that reads N integers and prints the minimum element.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static int minElement(int[] arr, int n) {
        // Write Your Code here
        return 0;
    }
}

class Main {
    public static void main(String[] args) {
        // Write input, array creation and method call here
    }
}
```

### SAMPLE INPUT
```text
5
35 45 67 33 67
```

### SAMPLE OUTPUT
```text
33
```

### EXPLANATION
Traverse the complete array while keeping track of the smallest value found.

**Expected Complexity:** Time: O(N), Space: O(1)

---

## Q3. Sum and Average of Array

**Difficulty:** EASY  
**Concept:** Traversal, sum, average  
**Format:** PREDEFINED MAIN

### PROBLEM STATEMENT
Find the sum and average of N integers. Print the average as a decimal value.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static double average(int[] arr, int n) {
        // Calculate sum and return average
        return 0;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Result.average(arr, n));
    }
}
```

### SAMPLE INPUT
```text
5
10 20 30 40 50
```

### SAMPLE OUTPUT
```text
30.0
```

### EXPLANATION
Add all elements and divide the sum by N. Use `double` to avoid integer division.

**Expected Complexity:** Time: O(N), Space: O(1)

---

## Q4. Count Even and Odd Elements

**Difficulty:** EASY  
**Concept:** Traversal, conditions  
**Format:** NON-PREDEFINED MAIN

### PROBLEM STATEMENT
Read an integer array and count how many elements are even and how many are odd.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static void countEvenOdd(int[] arr, int n) {
        // Count even and odd elements
    }
}

class Main {
    public static void main(String[] args) {
        // Write the input and method call here
    }
}
```

### SAMPLE INPUT
```text
6
10 15 20 21 32 45
```

### SAMPLE OUTPUT
```text
Even: 3
Odd: 3
```

### EXPLANATION
Use `arr[i] % 2` to determine whether each element is even or odd.

**Expected Complexity:** Time: O(N), Space: O(1)

---

## Q5. Linear Search

**Difficulty:** EASY  
**Concept:** Searching in 1D array  
**Format:** PREDEFINED MAIN

### PROBLEM STATEMENT
Read N integers and a target value. Print the index of the first occurrence of the target. Print `-1` if it is not present.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static int search(int[] arr, int n, int target) {
        // Perform linear search
        return -1;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println(Result.search(arr, n, target));
    }
}
```

### SAMPLE INPUT
```text
6
10 20 30 40 50 60
40
```

### SAMPLE OUTPUT
```text
3
```

### EXPLANATION
Check every element from left to right until the target is found.

**Expected Complexity:** Time: O(N), Space: O(1)

---

## Q6. Reverse an Array

**Difficulty:** EASY  
**Concept:** Two pointers, array reversal  
**Format:** NON-PREDEFINED MAIN

### PROBLEM STATEMENT
Read an array and print its elements in reverse order.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static void reverse(int[] arr, int n) {
        // Reverse the array
    }
}

class Main {
    public static void main(String[] args) {
        // Write input and method call here
    }
}
```

### SAMPLE INPUT
```text
5
10 20 30 40 50
```

### SAMPLE OUTPUT
```text
50 40 30 20 10
```

### EXPLANATION
Use two indices, one at the beginning and one at the end, and swap elements until they meet.

**Expected Complexity:** Time: O(N), Space: O(1)

---

## Q7. Second Largest Element

**Difficulty:** MEDIUM  
**Concept:** Traversal, largest and second largest  
**Format:** PREDEFINED MAIN

### PROBLEM STATEMENT
Find the second largest distinct element in an integer array. If there is no second distinct largest element, print `-1`.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static int secondLargest(int[] arr, int n) {
        // Find the second largest distinct element
        return -1;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Result.secondLargest(arr, n));
    }
}
```

### SAMPLE INPUT
```text
6
10 50 30 50 40 20
```

### SAMPLE OUTPUT
```text
40
```

### EXPLANATION
Maintain both the largest and second largest distinct values while traversing once.

**Expected Complexity:** Time: O(N), Space: O(1)

---

## Q8. Check Palindrome Array

**Difficulty:** MEDIUM  
**Concept:** Two-pointer comparison  
**Format:** NON-PREDEFINED MAIN

### PROBLEM STATEMENT
Determine whether an array reads the same from left to right and right to left.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static boolean isPalindrome(int[] arr, int n) {
        // Check whether the array is a palindrome
        return false;
    }
}

class Main {
    public static void main(String[] args) {
        // Write input and print the result
    }
}
```

### SAMPLE INPUT
```text
5
1 2 3 2 1
```

### SAMPLE OUTPUT
```text
Palindrome
```

### EXPLANATION
Compare the first and last elements, then move toward the center.

**Expected Complexity:** Time: O(N), Space: O(1)

---

## Q9. Frequency of Every Element

**Difficulty:** MEDIUM  
**Concept:** Nested loops, frequency counting  
**Format:** PREDEFINED MAIN

### PROBLEM STATEMENT
Print the frequency of every distinct element in the order of its first appearance.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static void printFrequency(int[] arr, int n) {
        // Print frequency of each distinct element
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Result.printFrequency(arr, n);
    }
}
```

### SAMPLE INPUT
```text
7
10 20 10 30 20 10 30
```

### SAMPLE OUTPUT
```text
10: 3
20: 2
30: 2
```

### EXPLANATION
For each unprocessed element, count how many times it appears. Avoid printing the same value twice.

**Expected Complexity:** Time: O(N²), Space: O(N)

---

## Q10. Remove Duplicate Elements

**Difficulty:** MEDIUM  
**Concept:** Duplicate detection, new array  
**Format:** NON-PREDEFINED MAIN

### PROBLEM STATEMENT
Create an array containing only the first occurrence of each element while preserving the original order.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static int[] removeDuplicates(int[] arr, int n) {
        // Create and return an array without duplicates
        return new int[0];
    }
}

class Main {
    public static void main(String[] args) {
        // Write input
        // Call removeDuplicates()
        // Print the returned array
    }
}
```

### SAMPLE INPUT
```text
7
10 20 10 30 20 40 10
```

### SAMPLE OUTPUT
```text
10 20 30 40
```

### EXPLANATION
Keep an element only when it has not already appeared earlier.

**Expected Complexity:** Time: O(N²), Space: O(N)

---

## Q11. Sort Array in Ascending Order

**Difficulty:** MEDIUM  
**Concept:** Sorting, nested loops  
**Format:** PREDEFINED MAIN

### PROBLEM STATEMENT
Sort the array in ascending order without using built-in sorting methods.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static void sort(int[] arr, int n) {
        // Sort arr in ascending order
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Result.sort(arr, n);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
```

### SAMPLE INPUT
```text
5
40 10 30 20 50
```

### SAMPLE OUTPUT
```text
10 20 30 40 50
```

### EXPLANATION
Implement a simple sorting algorithm such as bubble sort or selection sort.

**Expected Complexity:** Time: O(N²), Space: O(1)

---

## Q12. Left Rotate Array by One Position

**Difficulty:** MEDIUM  
**Concept:** Array shifting  
**Format:** NON-PREDEFINED MAIN

### PROBLEM STATEMENT
Rotate the array to the left by one position.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static void leftRotate(int[] arr, int n) {
        // Rotate the array left by one position
    }
}

class Main {
    public static void main(String[] args) {
        // Write input and method call
        // Print the array
    }
}
```

### SAMPLE INPUT
```text
5
10 20 30 40 50
```

### SAMPLE OUTPUT
```text
20 30 40 50 10
```

### EXPLANATION
Store the first element, shift every other element one position left, and place the stored value at the end.

**Expected Complexity:** Time: O(N), Space: O(1)

---

## Q13. Rotate Array by K Positions

**Difficulty:** HARD  
**Concept:** Array rotation, modulo  
**Format:** PREDEFINED MAIN

### PROBLEM STATEMENT
Rotate an array to the right by K positions.

### CONSTRAINTS
- `1 <= N <= 10^5`
- `0 <= K <= 10^9`

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static void rightRotate(int[] arr, int n, int k) {
        // Rotate arr right by k positions
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        Result.rightRotate(arr, n, k);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
```

### SAMPLE INPUT
```text
5
1 2 3 4 5
2
```

### SAMPLE OUTPUT
```text
4 5 1 2 3
```

### EXPLANATION
Reduce K using `k % n`. You may use the reversal technique or another in-place method.

**Expected Complexity:** Time: O(N), Space: O(1)

---

## Q14. Merge Two Arrays

**Difficulty:** MEDIUM  
**Concept:** Multiple arrays, copying  
**Format:** NON-PREDEFINED MAIN

### PROBLEM STATEMENT
Read two arrays and merge them into one array while preserving the order of elements.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static int[] merge(int[] a, int n, int[] b, int m) {
        // Create and return the merged array
        return new int[0];
    }
}

class Main {
    public static void main(String[] args) {
        // Write input
        // Create both arrays
        // Call merge()
        // Print the result
    }
}
```

### SAMPLE INPUT
```text
3
10 20 30
2
40 50
```

### SAMPLE OUTPUT
```text
10 20 30 40 50
```

### EXPLANATION
Create an array of size `n + m` and copy both arrays into it.

**Expected Complexity:** Time: O(N + M), Space: O(N + M)

---

## Q15. Common Elements of Two Arrays

**Difficulty:** HARD  
**Concept:** Nested loops, two arrays  
**Format:** PREDEFINED MAIN

### PROBLEM STATEMENT
Print the elements that occur in both arrays. Print each common value only once.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static void commonElements(
            int[] a, int n, int[] b, int m) {

        // Find and print common distinct elements
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        Result.commonElements(a, n, b, m);
    }
}
```

### SAMPLE INPUT
```text
5
10 20 30 40 50
4
30 40 60 70
```

### SAMPLE OUTPUT
```text
30 40
```

### EXPLANATION
Compare elements of both arrays and make sure duplicate common values are printed only once.

**Expected Complexity:** Time: O(N × M), Space: O(N)

---

# SECTION B — 2D ARRAYS / MATRICES
## Questions 16–30

---

## Q16. Matrix Input and Display

**Difficulty:** EASY  
**Concept:** 2D array traversal, nested loops  
**Format:** PREDEFINED MAIN

### PROBLEM STATEMENT
Read an R × C matrix and print it in matrix form.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static void display(int[][] matrix, int r, int c) {
        // Print the matrix
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        Result.display(matrix, r, c);
    }
}
```

### SAMPLE INPUT
```text
2 3
1 2 3
4 5 6
```

### SAMPLE OUTPUT
```text
1 2 3
4 5 6
```

### EXPLANATION
Use one loop for rows and one nested loop for columns.

**Expected Complexity:** Time: O(R × C), Space: O(R × C)

---

## Q17. Sum of All Matrix Elements

**Difficulty:** EASY  
**Concept:** 2D traversal, sum  
**Format:** NON-PREDEFINED MAIN

### PROBLEM STATEMENT
Find the sum of all elements in an R × C matrix.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static int sum(int[][] matrix, int r, int c) {
        // Calculate the sum
        return 0;
    }
}

class Main {
    public static void main(String[] args) {
        // Write input
        // Create matrix
        // Call sum()
        // Print result
    }
}
```

### SAMPLE INPUT
```text
2 3
1 2 3
4 5 6
```

### SAMPLE OUTPUT
```text
21
```

### EXPLANATION
Traverse every cell and add its value to a running total.

**Expected Complexity:** Time: O(R × C), Space: O(R × C)

---

## Q18. Row-Wise Sum

**Difficulty:** EASY  
**Concept:** Row traversal  
**Format:** PREDEFINED MAIN

### PROBLEM STATEMENT
Print the sum of every row of a matrix.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static void rowWiseSum(int[][] matrix, int r, int c) {
        // Calculate and print sum of each row
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        Result.rowWiseSum(matrix, r, c);
    }
}
```

### SAMPLE INPUT
```text
2 3
1 2 3
4 5 6
```

### SAMPLE OUTPUT
```text
Row 1: 6
Row 2: 15
```

### EXPLANATION
For each row, reset the sum to zero and traverse its columns.

**Expected Complexity:** Time: O(R × C), Space: O(1)

---

## Q19. Column-Wise Sum

**Difficulty:** EASY  
**Concept:** Column traversal  
**Format:** NON-PREDEFINED MAIN

### PROBLEM STATEMENT
Print the sum of every column of a matrix.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static void columnWiseSum(int[][] matrix, int r, int c) {
        // Calculate and print sum of each column
    }
}

class Main {
    public static void main(String[] args) {
        // Write input
        // Create matrix
        // Call columnWiseSum()
    }
}
```

### SAMPLE INPUT
```text
2 3
1 2 3
4 5 6
```

### SAMPLE OUTPUT
```text
Column 1: 5
Column 2: 7
Column 3: 9
```

### EXPLANATION
Fix the column and traverse all rows for that column.

**Expected Complexity:** Time: O(R × C), Space: O(R × C)

---

## Q20. Main and Secondary Diagonal Sum

**Difficulty:** MEDIUM  
**Concept:** Diagonals in square matrix  
**Format:** PREDEFINED MAIN

### PROBLEM STATEMENT
For a square matrix, find the sum of the main diagonal and secondary diagonal.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static void diagonalSums(int[][] matrix, int n) {
        // Calculate main diagonal sum
        // Calculate secondary diagonal sum
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        Result.diagonalSums(matrix, n);
    }
}
```

### SAMPLE INPUT
```text
3
1 2 3
4 5 6
7 8 9
```

### SAMPLE OUTPUT
```text
Main Diagonal: 15
Secondary Diagonal: 15
```

### EXPLANATION
Main diagonal uses `matrix[i][i]`. Secondary diagonal uses `matrix[i][n - 1 - i]`.

**Expected Complexity:** Time: O(N), Space: O(1)

---

## Q21. Transpose of Matrix

**Difficulty:** MEDIUM  
**Concept:** Matrix transpose  
**Format:** NON-PREDEFINED MAIN

### PROBLEM STATEMENT
Print the transpose of an R × C matrix.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static void transpose(int[][] matrix, int r, int c) {
        // Print transpose of the matrix
    }
}

class Main {
    public static void main(String[] args) {
        // Write input
        // Create matrix
        // Call transpose()
    }
}
```

### SAMPLE INPUT
```text
2 3
1 2 3
4 5 6
```

### SAMPLE OUTPUT
```text
1 4
2 5
3 6
```

### EXPLANATION
The transpose converts `matrix[i][j]` into position `matrix[j][i]`.

**Expected Complexity:** Time: O(R × C), Space: O(1) extra

---

## Q22. Matrix Addition

**Difficulty:** MEDIUM  
**Concept:** Two 2D arrays, matrix addition  
**Format:** PREDEFINED MAIN

### PROBLEM STATEMENT
Add two matrices of the same dimensions and print the resulting matrix.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static void addMatrices(
            int[][] a, int[][] b, int r, int c) {

        // Add corresponding elements and print result
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        Result.addMatrices(a, b, r, c);
    }
}
```

### SAMPLE INPUT
```text
2 2
1 2
3 4
5 6
7 8
```

### SAMPLE OUTPUT
```text
6 8
10 12
```

### EXPLANATION
Add corresponding positions: `result[i][j] = a[i][j] + b[i][j]`.

**Expected Complexity:** Time: O(R × C), Space: O(1) extra

---

## Q23. Matrix Multiplication

**Difficulty:** HARD  
**Concept:** 2D arrays, matrix multiplication, three loops  
**Format:** NON-PREDEFINED MAIN

### PROBLEM STATEMENT
Multiply matrix A of size R × C with matrix B of size C × K and print the resulting R × K matrix.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static int[][] multiply(
            int[][] a, int[][] b,
            int r, int c, int k) {

        // Create result matrix
        // Perform matrix multiplication
        return new int[0][0];
    }
}

class Main {
    public static void main(String[] args) {
        // Write input
        // Create both matrices
        // Call multiply()
        // Print the result
    }
}
```

### SAMPLE INPUT
```text
2 2 2
1 2
3 4
5 6
7 8
```

### SAMPLE OUTPUT
```text
19 22
43 50
```

### EXPLANATION
For each result cell, multiply the corresponding row of A with the corresponding column of B and add the products.

**Expected Complexity:** Time: O(R × C × K), Space: O(R × K)

---

## Q24. Check Symmetric Matrix

**Difficulty:** HARD  
**Concept:** Square matrix, transpose comparison  
**Format:** PREDEFINED MAIN

### PROBLEM STATEMENT
Determine whether a square matrix is symmetric. A matrix is symmetric when `matrix[i][j] == matrix[j][i]` for all valid positions.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static boolean isSymmetric(int[][] matrix, int n) {
        // Check whether matrix is symmetric
        return false;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        if (Result.isSymmetric(matrix, n)) {
            System.out.println("Symmetric");
        } else {
            System.out.println("Not Symmetric");
        }
    }
}
```

### SAMPLE INPUT
```text
3
1 2 3
2 4 5
3 5 6
```

### SAMPLE OUTPUT
```text
Symmetric
```

### EXPLANATION
Compare elements above the main diagonal with their corresponding elements below it.

**Expected Complexity:** Time: O(N²), Space: O(1)

---

## Q25. Check Upper Triangular Matrix

**Difficulty:** HARD  
**Concept:** Matrix conditions, triangular matrix  
**Format:** NON-PREDEFINED MAIN

### PROBLEM STATEMENT
Check whether a square matrix is upper triangular. All elements below the main diagonal must be zero.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static boolean isUpperTriangular(
            int[][] matrix, int n) {

        // Check all elements below the main diagonal
        return false;
    }
}

class Main {
    public static void main(String[] args) {
        // Write input
        // Create matrix
        // Call isUpperTriangular()
        // Print result
    }
}
```

### SAMPLE INPUT
```text
3
1 2 3
0 4 5
0 0 6
```

### SAMPLE OUTPUT
```text
Upper Triangular
```

### EXPLANATION
For every position where `i > j`, the value must be zero.

**Expected Complexity:** Time: O(N²), Space: O(N²)

---

## Q26. Boundary Elements of Matrix

**Difficulty:** HARD  
**Concept:** Matrix boundaries  
**Format:** PREDEFINED MAIN

### PROBLEM STATEMENT
Print all boundary elements of a matrix in clockwise order.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static void printBoundary(
            int[][] matrix, int r, int c) {

        // Print boundary elements clockwise
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        Result.printBoundary(matrix, r, c);
    }
}
```

### SAMPLE INPUT
```text
3 4
1 2 3 4
5 6 7 8
9 10 11 12
```

### SAMPLE OUTPUT
```text
1 2 3 4 8 12 11 10 9 5
```

### EXPLANATION
Print the top row, right column, bottom row in reverse, and left column in reverse without repeating corners.

**Expected Complexity:** Time: O(R + C), Space: O(1)

---

## Q27. Row with Maximum Sum

**Difficulty:** MEDIUM-HARD  
**Concept:** Row-wise traversal, maximum  
**Format:** NON-PREDEFINED MAIN

### PROBLEM STATEMENT
Find the row having the maximum sum. If multiple rows have the same sum, print the first such row.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static int maxSumRow(int[][] matrix, int r, int c) {
        // Find the index of the row with maximum sum
        return 0;
    }
}

class Main {
    public static void main(String[] args) {
        // Write input
        // Create matrix
        // Call maxSumRow()
        // Print row number and/or result as required
    }
}
```

### SAMPLE INPUT
```text
3 3
1 2 3
10 1 1
4 5 6
```

### SAMPLE OUTPUT
```text
Row 2
```

### EXPLANATION
Calculate each row's sum and keep the row with the greatest sum.

**Expected Complexity:** Time: O(R × C), Space: O(1)

---

## Q28. Rotate Square Matrix 90 Degrees Clockwise

**Difficulty:** HARD  
**Concept:** Matrix rotation, transpose, reverse  
**Format:** PREDEFINED MAIN

### PROBLEM STATEMENT
Rotate an N × N matrix by 90 degrees clockwise and print the result.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static void rotate90(int[][] matrix, int n) {
        // Rotate matrix 90 degrees clockwise
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        Result.rotate90(matrix, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

### SAMPLE INPUT
```text
3
1 2 3
4 5 6
7 8 9
```

### SAMPLE OUTPUT
```text
7 4 1
8 5 2
9 6 3
```

### EXPLANATION
A common in-place method is: transpose the matrix and then reverse every row.

**Expected Complexity:** Time: O(N²), Space: O(1)

---

## Q29. Spiral Traversal of Matrix

**Difficulty:** HARD  
**Concept:** Boundary traversal, four directions  
**Format:** NON-PREDEFINED MAIN

### PROBLEM STATEMENT
Print all elements of a matrix in spiral order, starting from the top-left corner.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static void spiral(int[][] matrix, int r, int c) {
        // Print matrix in spiral order
    }
}

class Main {
    public static void main(String[] args) {
        // Write input
        // Create matrix
        // Call spiral()
    }
}
```

### SAMPLE INPUT
```text
3 4
1 2 3 4
5 6 7 8
9 10 11 12
```

### SAMPLE OUTPUT
```text
1 2 3 4 8 12 11 10 9 5 6 7
```

### EXPLANATION
Maintain four boundaries: top, bottom, left, and right. Move around the current boundary and shrink it after each traversal.

**Expected Complexity:** Time: O(R × C), Space: O(1) extra

---

## Q30. Search an Element in a Matrix

**Difficulty:** HARD  
**Concept:** 2D array searching, nested loops  
**Format:** PREDEFINED MAIN

### PROBLEM STATEMENT
Read an R × C matrix and a target value. Find the first occurrence of the target in row-major order. Print its row and column. If it is absent, print `Not Found`.

### PREDEFINED CODE
```java
import java.util.*;

class Result {
    static void search(
            int[][] matrix, int r, int c, int target) {

        // Search the matrix
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int target = sc.nextInt();

        Result.search(matrix, r, c, target);
    }
}
```

### SAMPLE INPUT
```text
3 3
10 20 30
40 50 60
70 80 90
50
```

### SAMPLE OUTPUT
```text
Found at: 1 1
```

### EXPLANATION
Traverse row by row. The first matching cell gives the required position.

**Expected Complexity:** Time: O(R × C), Space: O(1)

---

# CONCEPT COVERAGE CHECKLIST

| Concept | Questions |
|---|---|
| 1D array input and traversal | 1–15 |
| 2D array input and traversal | 16–30 |
| Predefined `main()` | 1, 3, 5, 7, 9, 11, 13, 15, 16, 18, 20, 22, 24, 26, 28, 30 |
| Non-predefined `main()` | 2, 4, 6, 8, 10, 12, 14, 17, 19, 21, 23, 25, 27, 29 |
| Maximum | 1, 7, 27 |
| Minimum | 2 |
| Sum / average | 3, 17, 18, 19, 20, 27 |
| Counting | 4, 9 |
| Linear search | 5, 30 |
| Reverse | 6 |
| Palindrome | 8 |
| Frequency | 9 |
| Duplicates | 10, 15 |
| Sorting | 11 |
| Rotation | 12, 13, 28 |
| Merge arrays | 14 |
| Common elements | 15 |
| Matrix display | 16 |
| Row-wise operations | 18, 27 |
| Column-wise operations | 19 |
| Diagonals | 20 |
| Transpose | 21, 24, 28 |
| Matrix addition | 22 |
| Matrix multiplication | 23 |
| Symmetric matrix | 24 |
| Upper triangular matrix | 25 |
| Boundary traversal | 26 |
| Spiral traversal | 29 |
| Matrix searching | 30 |

# FINAL REVISION TARGET

After solving all 30 questions, you should be able to handle the major college-exam patterns for both 1D and 2D arrays:

1. Declare and initialize arrays.
2. Take array input using `Scanner`.
3. Traverse 1D arrays.
4. Traverse 2D arrays using nested loops.
5. Find maximum and minimum.
6. Calculate sum and average.
7. Count elements based on conditions.
8. Search for an element.
9. Reverse an array.
10. Check a palindrome array.
11. Count frequencies.
12. Remove duplicates.
13. Sort without built-in methods.
14. Rotate arrays.
15. Merge arrays.
16. Find common elements.
17. Calculate row and column sums.
18. Work with both diagonals.
19. Transpose matrices.
20. Add matrices.
21. Multiply matrices.
22. Check symmetric matrices.
23. Check triangular matrices.
24. Process boundary elements.
25. Rotate matrices.
26. Traverse matrices in spiral order.
27. Search inside 2D arrays.
28. Solve problems with a predefined `main()`.
29. Build the `main()` yourself when it is not provided.
30. Translate a problem statement into the correct array algorithm.
