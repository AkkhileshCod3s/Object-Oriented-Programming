# ArrayList — College Exam Pattern Coding Questions

# 1. Find the Maximum Element in an ArrayList

Write a program to find the maximum element in an `ArrayList<Integer>`.

### Input Format

The first line of input contains an integer `N`, denoting the size of the ArrayList.

The second line contains `N` space separated integers.

### Output Format

For each test case, print the maximum element in the ArrayList.

### Constraints

```text
1 <= N <= 10^5
-10^9 <= arr[i] <= 10^9
```

### Sample Input 1

```text
7
20 30 93 71 18 82 66
```

### Sample Output 1

```text
93
```

### Sample Input 2

```text
5
33 45 67 33 67
```

### Sample Output 2

```text
67
```

### Predefined Code

```java
import java.util.*;

class Result {
    static int maxElement(ArrayList<Integer> list, int N) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        System.out.println(Result.maxElement(list, N));
    }
}
```


# 2. Find the Minimum Element in an ArrayList

Write a program to find the minimum element in an `ArrayList<Integer>`.

### Input Format

The first line contains an integer `N`, denoting the size of the ArrayList.

The second line contains `N` space separated integers.

### Output Format

Print the minimum element in the ArrayList.

### Constraints

```text
1 <= N <= 10^5
-10^9 <= list[i] <= 10^9
```

### Sample Input 1

```text
6
45 12 78 3 91 25
```

### Sample Output 1

```text
3
```

### Sample Input 2

```text
5
-2 -8 -1 -10 -4
```

### Sample Output 2

```text
-10
```

### Predefined Code

```java
import java.util.*;

class Result {
    static int minElement(ArrayList<Integer> list, int N) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        System.out.println(Result.minElement(list, N));
    }
}
```


# 3. Calculate the Sum of ArrayList Elements

Write a program to calculate the sum of all elements present in an `ArrayList<Integer>`.

### Input Format

The first line contains an integer `N`.

The second line contains `N` space separated integers.

### Output Format

Print the sum of all elements.

### Constraints

```text
1 <= N <= 10^5
-10^6 <= list[i] <= 10^6
```

### Sample Input 1

```text
5
10 20 30 40 50
```

### Sample Output 1

```text
150
```

### Sample Input 2

```text
4
-10 20 -5 15
```

### Sample Output 2

```text
20
```

### Predefined Code

```java
import java.util.*;

class Result {
    static long sumElements(ArrayList<Integer> list, int N) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        System.out.println(Result.sumElements(list, N));
    }
}
```


# 4. Calculate the Average of ArrayList Elements

Write a program to calculate the average of all elements in an `ArrayList<Integer>`.

### Input Format

The first line contains an integer `N`.

The second line contains `N` space separated integers.

### Output Format

Print the average of the elements as a decimal value.

### Constraints

```text
1 <= N <= 10^5
0 <= list[i] <= 100
```

### Sample Input 1

```text
5
10 20 30 40 50
```

### Sample Output 1

```text
30.0
```

### Sample Input 2

```text
4
25 50 75 100
```

### Sample Output 2

```text
62.5
```

### Predefined Code

```java
import java.util.*;

class Result {
    static double average(ArrayList<Integer> list, int N) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        System.out.println(Result.average(list, N));
    }
}
```


# 5. Count Even and Odd Elements

Given an `ArrayList<Integer>`, count the number of even and odd elements.

### Input Format

The first line contains an integer `N`.

The second line contains `N` space separated integers.

### Output Format

Print the count of even elements followed by the count of odd elements.

### Constraints

```text
1 <= N <= 10^5
-10^9 <= list[i] <= 10^9
```

### Sample Input 1

```text
6
10 21 32 43 54 65
```

### Sample Output 1

```text
3 3
```

### Sample Input 2

```text
5
2 4 6 8 10
```

### Sample Output 2

```text
5 0
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String countEvenOdd(ArrayList<Integer> list, int N) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        System.out.println(Result.countEvenOdd(list, N));
    }
}
```


# 6. Search an Element in an ArrayList

Given an `ArrayList<Integer>` and a target value, determine whether the target is present in the ArrayList.

### Input Format

The first line contains an integer `N`.

The second line contains `N` space separated integers.

The third line contains the target integer.

### Output Format

Print `true` if the target exists; otherwise print `false`.

### Constraints

```text
1 <= N <= 10^5
-10^9 <= list[i], target <= 10^9
```

### Sample Input 1

```text
5
10 20 30 40 50
30
```

### Sample Output 1

```text
true
```

### Sample Input 2

```text
5
10 20 30 40 50
99
```

### Sample Output 2

```text
false
```

### Predefined Code

```java
import java.util.*;

class Result {
    static boolean search(ArrayList<Integer> list, int target) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        int target = s.nextInt();

        System.out.println(Result.search(list, target));
    }
}
```


# 7. Find the First Occurrence of an Element

Given an `ArrayList<Integer>`, find the index of the first occurrence of a given element.

### Input Format

The first line contains `N`.

The second line contains `N` integers.

The third line contains the target value.

### Output Format

Print the index of the first occurrence. If the element is not present, print `-1`.

### Constraints

```text
1 <= N <= 10^5
-10^9 <= list[i], target <= 10^9
```

### Sample Input 1

```text
6
10 20 30 20 40 20
20
```

### Sample Output 1

```text
1
```

### Sample Input 2

```text
5
5 6 7 8 9
10
```

### Sample Output 2

```text
-1
```

### Predefined Code

```java
import java.util.*;

class Result {
    static int firstOccurrence(ArrayList<Integer> list, int target) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        int target = s.nextInt();

        System.out.println(Result.firstOccurrence(list, target));
    }
}
```


# 8. Find the Last Occurrence of an Element

Given an `ArrayList<Integer>`, find the index of the last occurrence of a given element.

### Input Format

The first line contains `N`.

The second line contains `N` integers.

The third line contains the target value.

### Output Format

Print the index of the last occurrence. If the element is not present, print `-1`.

### Constraints

```text
1 <= N <= 10^5
-10^9 <= list[i], target <= 10^9
```

### Sample Input 1

```text
6
10 20 30 20 40 20
20
```

### Sample Output 1

```text
5
```

### Sample Input 2

```text
5
1 2 3 4 5
9
```

### Sample Output 2

```text
-1
```

### Predefined Code

```java
import java.util.*;

class Result {
    static int lastOccurrence(ArrayList<Integer> list, int target) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        int target = s.nextInt();

        System.out.println(Result.lastOccurrence(list, target));
    }
}
```


# 9. Count Occurrences of an Element

Given an `ArrayList<Integer>` and a target value, count how many times the target occurs.

### Input Format

The first line contains `N`.

The second line contains `N` integers.

The third line contains the target value.

### Output Format

Print the number of occurrences of the target.

### Constraints

```text
1 <= N <= 10^5
-10^9 <= list[i], target <= 10^9
```

### Sample Input 1

```text
7
10 20 10 30 10 40 10
10
```

### Sample Output 1

```text
4
```

### Sample Input 2

```text
5
1 2 3 4 5
10
```

### Sample Output 2

```text
0
```

### Predefined Code

```java
import java.util.*;

class Result {
    static int countOccurrences(ArrayList<Integer> list, int target) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        int target = s.nextInt();

        System.out.println(Result.countOccurrences(list, target));
    }
}
```


# 10. Remove the First Occurrence of an Element

Given an `ArrayList<Integer>`, remove the first occurrence of a target value and print the resulting ArrayList.

### Input Format

The first line contains `N`.

The second line contains `N` integers.

The third line contains the target value.

### Output Format

Print the resulting ArrayList with elements separated by spaces. If the target is not present, print the original ArrayList.

### Constraints

```text
1 <= N <= 10^5
-10^9 <= list[i], target <= 10^9
```

### Sample Input 1

```text
6
10 20 30 20 40 50
20
```

### Sample Output 1

```text
10 30 20 40 50
```

### Sample Input 2

```text
5
1 2 3 4 5
9
```

### Sample Output 2

```text
1 2 3 4 5
```

### Predefined Code

```java
import java.util.*;

class Result {
    static ArrayList<Integer> removeFirst(
        ArrayList<Integer> list, int target) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        int target = s.nextInt();

        ArrayList<Integer> result = Result.removeFirst(list, target);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
```


# 11. Remove All Occurrences of an Element

Given an `ArrayList<Integer>`, remove all occurrences of a target value.

### Input Format

The first line contains `N`.

The second line contains `N` integers.

The third line contains the target value.

### Output Format

Print the ArrayList after removing all occurrences of the target.

### Constraints

```text
1 <= N <= 10^5
-10^9 <= list[i], target <= 10^9
```

### Sample Input 1

```text
7
10 20 10 30 10 40 10
10
```

### Sample Output 1

```text
20 30 40
```

### Sample Input 2

```text
5
1 2 3 4 5
9
```

### Sample Output 2

```text
1 2 3 4 5
```

### Predefined Code

```java
import java.util.*;

class Result {
    static ArrayList<Integer> removeAll(
        ArrayList<Integer> list, int target) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        int target = s.nextInt();

        ArrayList<Integer> result = Result.removeAll(list, target);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
```


# 12. Find Even Elements in an ArrayList

Given an `ArrayList<Integer>`, create a new ArrayList containing only the even elements in their original order.

The original ArrayList must not be modified.

### Input Format

The first line contains `N`.

The second line contains `N` integers.

### Output Format

Print the even elements in their original order.

### Constraints

```text
1 <= N <= 10^5
-10^9 <= list[i] <= 10^9
```

### Sample Input 1

```text
7
10 21 32 43 54 65 76
```

### Sample Output 1

```text
10 32 54 76
```

### Sample Input 2

```text
5
1 3 5 7 9
```

### Sample Output 2

```text
```


### Predefined Code

```java
import java.util.*;

class Result {
    static ArrayList<Integer> findEven(ArrayList<Integer> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        ArrayList<Integer> result = Result.findEven(list);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
```


# 13. Find Odd Elements in an ArrayList

Given an `ArrayList<Integer>`, create a new ArrayList containing only the odd elements in their original order.

The original ArrayList must not be modified.

### Input Format

The first line contains `N`.

The second line contains `N` integers.

### Output Format

Print the odd elements in their original order.

### Constraints

```text
1 <= N <= 10^5
-10^9 <= list[i] <= 10^9
```

### Sample Input 1

```text
7
10 21 32 43 54 65 76
```

### Sample Output 1

```text
21 43 65
```

### Sample Input 2

```text
4
2 4 6 8
```

### Sample Output 2

```text
```


### Predefined Code

```java
import java.util.*;

class Result {
    static ArrayList<Integer> findOdd(ArrayList<Integer> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        ArrayList<Integer> result = Result.findOdd(list);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
```


# 14. Remove Duplicate Elements

Given an `ArrayList<Integer>`, create a new ArrayList containing only the first occurrence of every element.

The order of the first occurrences must be preserved.

### Input Format

The first line contains `N`.

The second line contains `N` integers.

### Output Format

Print the ArrayList after removing duplicate values.

### Constraints

```text
1 <= N <= 10^4
-10^5 <= list[i] <= 10^5
```

### Sample Input 1

```text
7
10 20 10 30 20 40 10
```

### Sample Output 1

```text
10 20 30 40
```

### Sample Input 2

```text
6
5 5 5 5 5 5
```

### Sample Output 2

```text
5
```

### Predefined Code

```java
import java.util.*;

class Result {
    static ArrayList<Integer> removeDuplicates(
        ArrayList<Integer> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        ArrayList<Integer> result = Result.removeDuplicates(list);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
```


# 15. Check Whether an ArrayList Contains Duplicates

Given an `ArrayList<Integer>`, determine whether any element occurs more than once.

### Input Format

The first line contains `N`.

The second line contains `N` integers.

### Output Format

Print `true` if duplicate elements exist; otherwise print `false`.

### Constraints

```text
1 <= N <= 10^5
-10^9 <= list[i] <= 10^9
```

### Sample Input 1

```text
6
10 20 30 20 40 50
```

### Sample Output 1

```text
true
```

### Sample Input 2

```text
5
10 20 30 40 50
```

### Sample Output 2

```text
false
```

### Predefined Code

```java
import java.util.*;

class Result {
    static boolean hasDuplicates(ArrayList<Integer> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        System.out.println(Result.hasDuplicates(list));
    }
}
```


# 16. Reverse an ArrayList

Given an `ArrayList<Integer>`, reverse the order of its elements.

### Input Format

The first line contains `N`.

The second line contains `N` integers.

### Output Format

Print the elements in reverse order.

### Constraints

```text
1 <= N <= 10^5
-10^9 <= list[i] <= 10^9
```

### Sample Input 1

```text
5
10 20 30 40 50
```

### Sample Output 1

```text
50 40 30 20 10
```

### Sample Input 2

```text
4
1 2 3 4
```

### Sample Output 2

```text
4 3 2 1
```

### Predefined Code

```java
import java.util.*;

class Result {
    static ArrayList<Integer> reverseList(
        ArrayList<Integer> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        ArrayList<Integer> result = Result.reverseList(list);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
```


# 17. Sort an ArrayList in Ascending Order

Given an `ArrayList<Integer>`, sort all elements in ascending order.

### Input Format

The first line contains `N`.

The second line contains `N` integers.

### Output Format

Print the sorted elements in ascending order.

### Constraints

```text
1 <= N <= 10^5
-10^9 <= list[i] <= 10^9
```

### Sample Input 1

```text
6
50 10 40 20 60 30
```

### Sample Output 1

```text
10 20 30 40 50 60
```

### Sample Input 2

```text
5
5 4 3 2 1
```

### Sample Output 2

```text
1 2 3 4 5
```

### Predefined Code

```java
import java.util.*;

class Result {
    static ArrayList<Integer> sortAscending(
        ArrayList<Integer> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        ArrayList<Integer> result = Result.sortAscending(list);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
```


# 18. Sort an ArrayList in Descending Order

Given an `ArrayList<Integer>`, sort all elements in descending order.

### Input Format

The first line contains `N`.

The second line contains `N` integers.

### Output Format

Print the sorted elements in descending order.

### Constraints

```text
1 <= N <= 10^5
-10^9 <= list[i] <= 10^9
```

### Sample Input 1

```text
6
50 10 40 20 60 30
```

### Sample Output 1

```text
60 50 40 30 20 10
```

### Sample Input 2

```text
5
5 4 3 2 1
```

### Sample Output 2

```text
5 4 3 2 1
```

### Predefined Code

```java
import java.util.*;

class Result {
    static ArrayList<Integer> sortDescending(
        ArrayList<Integer> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        ArrayList<Integer> result = Result.sortDescending(list);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
```


# 19. Find Common Elements in Two ArrayLists

Given two `ArrayList<Integer>` objects, find the elements that are present in both lists.

The result must contain elements in the order in which they appear in the first list.

### Input Format

The first line contains `N`, followed by `N` integers.

The third line contains `M`, followed by `M` integers.

### Output Format

Print the common elements in their required order.

### Constraints

```text
1 <= N, M <= 10^4
-10^5 <= list[i] <= 10^5
```

### Sample Input 1

```text
5
10 20 30 40 50
4
20 40 60 80
```

### Sample Output 1

```text
20 40
```

### Sample Input 2

```text
4
1 2 3 4
3
5 6 7
```

### Sample Output 2

```text
```


### Predefined Code

```java
import java.util.*;

class Result {
    static ArrayList<Integer> commonElements(
        ArrayList<Integer> list1,
        ArrayList<Integer> list2) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list1.add(s.nextInt());
        }

        int M = s.nextInt();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            list2.add(s.nextInt());
        }

        ArrayList<Integer> result =
            Result.commonElements(list1, list2);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
```


# 20. Merge Two ArrayLists

Given two ArrayLists, merge them into a single ArrayList. All elements of the first list must appear before all elements of the second list.

### Input Format

The first line contains `N`, followed by `N` integers.

The third line contains `M`, followed by `M` integers.

### Output Format

Print the merged ArrayList.

### Constraints

```text
1 <= N, M <= 10^5
-10^9 <= list[i] <= 10^9
```

### Sample Input 1

```text
3
10 20 30
4
40 50 60 70
```

### Sample Output 1

```text
10 20 30 40 50 60 70
```

### Sample Input 2

```text
2
5 10
3
15 20 25
```

### Sample Output 2

```text
5 10 15 20 25
```

### Predefined Code

```java
import java.util.*;

class Result {
    static ArrayList<Integer> mergeLists(
        ArrayList<Integer> list1,
        ArrayList<Integer> list2) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list1.add(s.nextInt());
        }

        int M = s.nextInt();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            list2.add(s.nextInt());
        }

        ArrayList<Integer> result =
            Result.mergeLists(list1, list2);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
```


# 21. Find Elements Greater Than K

Given an `ArrayList<Integer>` and an integer `K`, create a new ArrayList containing all elements greater than `K`.

The original list must not be modified.

### Input Format

The first line contains `N`.

The second line contains `N` integers.

The third line contains `K`.

### Output Format

Print all elements greater than `K` in their original order.

### Constraints

```text
1 <= N <= 10^5
-10^9 <= list[i], K <= 10^9
```

### Sample Input 1

```text
6
10 50 20 80 30 90
40
```

### Sample Output 1

```text
50 80 90
```

### Sample Input 2

```text
5
10 20 30 40 50
100
```

### Sample Output 2

```text
```


### Predefined Code

```java
import java.util.*;

class Result {
    static ArrayList<Integer> greaterThan(
        ArrayList<Integer> list, int K) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        int K = s.nextInt();

        ArrayList<Integer> result =
            Result.greaterThan(list, K);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
```


# 22. Find the Sum of Even Elements

Given an `ArrayList<Integer>`, calculate the sum of all even elements.

### Input Format

The first line contains `N`.

The second line contains `N` integers.

### Output Format

Print the sum of all even elements.

### Constraints

```text
1 <= N <= 10^5
-10^6 <= list[i] <= 10^6
```

### Sample Input 1

```text
6
10 21 32 43 54 65
```

### Sample Output 1

```text
96
```

### Sample Input 2

```text
4
1 3 5 7
```

### Sample Output 2

```text
0
```

### Predefined Code

```java
import java.util.*;

class Result {
    static long sumEven(ArrayList<Integer> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        System.out.println(Result.sumEven(list));
    }
}
```


# 23. Find the Rising Elements in an ArrayList

A weather station stores hourly temperature readings in an `ArrayList<Integer>`. A reading is a **rise point** if it is greater than the reading immediately before it. The first reading is always ignored.

Create a new ArrayList containing the rising temperature readings in their original order. Do not modify the original list.

### Input Format

The first line contains `N`, denoting the number of temperature readings.

The second line contains `N` space separated integers.

### Output Format

Print all rising temperature readings in their original order.

### Constraints

```text
1 <= N <= 10^5
-100 <= temperature[i] <= 100
```

### Sample Input 1

```text
6
20 22 21 25 25 28
```

### Sample Output 1

```text
22 25 28
```

### Sample Input 2

```text
5
30 25 20 15 10
```

### Sample Output 2

```text
```


### Predefined Code

```java
import java.util.*;

class Result {
    static ArrayList<Integer> findRising(
        ArrayList<Integer> temperatures) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> temperatures = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            temperatures.add(s.nextInt());
        }

        ArrayList<Integer> result =
            Result.findRising(temperatures);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
```


# 24. Remove All Even Elements Using Iterator

Given an `ArrayList<Integer>`, remove all even numbers from the list.

The elements must be removed safely while traversing the ArrayList.

### Input Format

The first line contains `N`.

The second line contains `N` integers.

### Output Format

Print the ArrayList after removing all even elements.

### Constraints

```text
1 <= N <= 10^5
-10^9 <= list[i] <= 10^9
```

### Sample Input 1

```text
6
10 21 32 43 54 65
```

### Sample Output 1

```text
21 43 65
```

### Sample Input 2

```text
4
2 4 6 8
```

### Sample Output 2

```text
```


### Predefined Code

```java
import java.util.*;

class Result {
    static void removeEven(ArrayList<Integer> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        Result.removeEven(list);

        for (int value : list) {
            System.out.print(value + " ");
        }
    }
}
```


# 25. Find the Second Largest Distinct Element

Given an `ArrayList<Integer>`, find the second-largest distinct element.

If there is no second distinct element, print `-1`.

### Input Format

The first line contains `N`.

The second line contains `N` integers.

### Output Format

Print the second-largest distinct element. If it does not exist, print `-1`.

### Constraints

```text
1 <= N <= 10^5
-10^9 <= list[i] <= 10^9
```

### Sample Input 1

```text
6
10 50 30 50 40 20
```

### Sample Output 1

```text
40
```

### Sample Input 2

```text
5
10 10 10 10 10
```

### Sample Output 2

```text
-1
```

### Predefined Code

```java
import java.util.*;

class Result {
    static int secondLargest(ArrayList<Integer> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        System.out.println(Result.secondLargest(list));
    }
}
```


# 26. Check Whether an ArrayList is Palindromic

An ArrayList is called a palindrome if it reads the same from left to right and right to left. Determine whether the given ArrayList is a palindrome.

### Input Format

The first line contains `N`.

The second line contains `N` integers.

### Output Format

Print `true` if the ArrayList is a palindrome; otherwise print `false`.

### Constraints

```text
1 <= N <= 10^5
-10^9 <= list[i] <= 10^9
```

### Sample Input 1

```text
5
1 2 3 2 1
```

### Sample Output 1

```text
true
```

### Sample Input 2

```text
4
1 2 3 4
```

### Sample Output 2

```text
false
```

### Predefined Code

```java
import java.util.*;

class Result {
    static boolean isPalindrome(ArrayList<Integer> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        System.out.println(Result.isPalindrome(list));
    }
}
```


# 27. Count Elements Greater Than Average

Given an `ArrayList<Integer>`, calculate its average and count how many elements are strictly greater than the average.

### Input Format

The first line contains `N`.

The second line contains `N` integers.

### Output Format

Print the count of elements strictly greater than the average.

### Constraints

```text
1 <= N <= 10^5
0 <= list[i] <= 1000
```

### Sample Input 1

```text
5
10 20 30 40 50
```

### Sample Output 1

```text
2
```

### Sample Input 2

```text
4
10 10 10 10
```

### Sample Output 2

```text
0
```

### Predefined Code

```java
import java.util.*;

class Result {
    static int countAboveAverage(ArrayList<Integer> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        System.out.println(Result.countAboveAverage(list));
    }
}
```


# 28. Move All Zeros to the End

Given an `ArrayList<Integer>`, move all zero elements to the end while maintaining the relative order of all non-zero elements.

### Input Format

The first line contains `N`.

The second line contains `N` integers.

### Output Format

Print the modified ArrayList.

### Constraints

```text
1 <= N <= 10^5
-10^9 <= list[i] <= 10^9
```

### Sample Input 1

```text
5
0 1 0 3 12
```

### Sample Output 1

```text
1 3 12 0 0
```

### Sample Input 2

```text
6
1 2 3 4 5 6
```

### Sample Output 2

```text
1 2 3 4 5 6
```

### Predefined Code

```java
import java.util.*;

class Result {
    static void moveZerosToEnd(ArrayList<Integer> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        Result.moveZerosToEnd(list);

        for (int value : list) {
            System.out.print(value + " ");
        }
    }
}
```


# 29. Find the Element at a Given Index

Given an `ArrayList<Integer>` and an index, print the element stored at that index.

If the index is invalid, print `-1`.

### Input Format

The first line contains `N`.

The second line contains `N` integers.

The third line contains the index.

### Output Format

Print the element at the specified index, or `-1` if the index is invalid.

### Constraints

```text
1 <= N <= 10^5
0 <= index <= 10^6
-10^9 <= list[i] <= 10^9
```

### Sample Input 1

```text
5
10 20 30 40 50
3
```

### Sample Output 1

```text
40
```

### Sample Input 2

```text
5
10 20 30 40 50
8
```

### Sample Output 2

```text
-1
```

### Predefined Code

```java
import java.util.*;

class Result {
    static int getElement(
        ArrayList<Integer> list, int index) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        int index = s.nextInt();

        System.out.println(Result.getElement(list, index));
    }
}
```


# 30. Find the Maximum Frequency Element

Given an `ArrayList<Integer>`, find the element that occurs most frequently.

If multiple elements have the same maximum frequency, return the element whose first occurrence appears earliest in the ArrayList.

### Input Format

The first line contains `N`.

The second line contains `N` integers.

### Output Format

Print the element with the highest frequency.

### Constraints

```text
1 <= N <= 10^4
-10^5 <= list[i] <= 10^5
```

### Sample Input 1

```text
7
10 20 10 30 20 10 40
```

### Sample Output 1

```text
10
```

### Sample Input 2

```text
6
5 5 2 2 3 3
```

### Sample Output 2

```text
5
```

### Predefined Code

```java
import java.util.*;

class Result {
    static int mostFrequent(ArrayList<Integer> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        System.out.println(Result.mostFrequent(list));
    }
}
```


# 31. Find the Rising Temperature Count

A weather station stores hourly temperature readings in an `ArrayList<Integer>`. Count the number of readings that are greater than the immediately preceding reading.

The first reading is ignored.

### Input Format

The first line contains `N`.

The second line contains `N` temperature readings.

### Output Format

Print the number of rising readings.

### Constraints

```text
1 <= N <= 10^5
-100 <= temperature[i] <= 100
```

### Sample Input 1

```text
6
20 22 21 25 25 28
```

### Sample Output 1

```text
3
```

### Sample Input 2

```text
5
30 25 20 15 10
```

### Sample Output 2

```text
0
```

### Predefined Code

```java
import java.util.*;

class Result {
    static int countRising(
        ArrayList<Integer> temperatures) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> temperatures = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            temperatures.add(s.nextInt());
        }

        System.out.println(Result.countRising(temperatures));
    }
}
```


# 32. Filter Students by Passing Marks

A college stores student marks in an `ArrayList<Integer>`. A student passes if the mark is greater than or equal to `40`.

Create a new ArrayList containing only the passing marks in their original order.

### Input Format

The first line contains `N`.

The second line contains `N` marks.

### Output Format

Print all passing marks in their original order.

### Constraints

```text
1 <= N <= 10^5
0 <= marks[i] <= 100
```

### Sample Input 1

```text
6
35 45 78 20 40 90
```

### Sample Output 1

```text
45 78 40 90
```

### Sample Input 2

```text
4
10 20 30 39
```

### Sample Output 2

```text
```


### Predefined Code

```java
import java.util.*;

class Result {
    static ArrayList<Integer> passingMarks(
        ArrayList<Integer> marks) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> marks = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            marks.add(s.nextInt());
        }

        ArrayList<Integer> result =
            Result.passingMarks(marks);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
```


# Exam Pattern Coverage

The question set covers the major ArrayList coding patterns that can be formed in this format:

- Creating and traversing an ArrayList
- Finding maximum and minimum
- Sum and average
- Even/odd processing
- Searching with `contains`
- First and last occurrence
- Counting occurrences
- Removing one/all occurrences
- Filtering into a new ArrayList
- Duplicate detection and removal
- Reversing
- Sorting ascending/descending
- Merging two ArrayLists
- Finding common elements
- Threshold-based filtering
- Safe removal using an Iterator
- Second-largest distinct element
- Palindrome checking
- Average-based filtering
- Moving zeros
- Index-based access
- Frequency-based problems
- Weather/temperature scenario questions
- Student marks scenario questions
