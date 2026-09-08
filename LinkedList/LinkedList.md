# Java Collections Exam Practice — 40 Fixed-Main Questions

## Pattern
- `import java.util.*;` is already given.
- `class Main` is already given.
- `main()` is already given.
- **Do NOT modify `main()` unless the question explicitly says otherwise.**
- Write your solution only inside the given function(s).
- Difficulty increases from Q1 → Q40.
- The last questions are intentionally nasty, multi-function, exam-style challenges.

## Coverage
`ArrayList<Integer>`, `ArrayList<String>`, `LinkedList<Integer>`, `LinkedList<String>`,
`LinkedList<int[]>`, `LinkedList<String[]>`, traversal, add/get/set/remove,
searching, duplicates, frequency, filtering, sorting, reversing, merging,
subList, Iterator, ListIterator, nested data, arrays inside LinkedList,
String processing, multiple functions, and mixed collection logic.

---

# PART A — EASY FOUNDATION

## Q1. Remove All Even Numbers
Remove every even integer while preserving the order of odd integers.

```java
import java.util.*;

public class Main {

    static void removeEven(ArrayList<Integer> list) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        removeEven(list);
        System.out.println(list);
    }
}
```

Input
```text
7
10 15 22 31 40 55 60
```
Output
```text
[15, 31, 55]
```

---

## Q2. Convert Names to Uppercase
Convert every string in the ArrayList to uppercase using `set()`.

```java
import java.util.*;

public class Main {

    static void convert(ArrayList<String> list) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.next());

        convert(list);
        System.out.println(list);
    }
}
```

Input
```text
4
aman riya karan neha
```
Output
```text
[AMAN, RIYA, KARAN, NEHA]
```

---

## Q3. Insert Before a Value
Insert the given value immediately before the first occurrence of the target. If target is absent, add the value at the end.

```java
import java.util.*;

public class Main {

    static void insertBefore(ArrayList<Integer> list, int target, int value) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        int target = sc.nextInt();
        int value = sc.nextInt();

        insertBefore(list, target, value);
        System.out.println(list);
    }
}
```

Input
```text
5
10 20 30 40 50
30 99
```
Output
```text
[10, 20, 99, 30, 40, 50]
```

---

## Q4. Remove Every Occurrence of a String
Remove all occurrences of the target string.

```java
import java.util.*;

public class Main {

    static void removeAll(ArrayList<String> list, String target) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.next());

        removeAll(list, sc.next());
        System.out.println(list);
    }
}
```

Input
```text
7
red blue red green red yellow red
red
```
Output
```text
[blue, green, yellow]
```

---

## Q5. First and Last Occurrence
Print the first and last index of the target. Print `-1 -1` if absent.

```java
import java.util.*;

public class Main {

    static void positions(ArrayList<Integer> list, int target) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        positions(list, sc.nextInt());
    }
}
```

Input
```text
8
5 8 2 8 9 8 1 4
8
```
Output
```text
1 5
```

---

## Q6. Remove by Index
Remove the element at the supplied index. If index is invalid, print `Invalid`.

```java
import java.util.*;

public class Main {

    static void removeAt(ArrayList<String> list, int index) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.next());

        removeAt(list, sc.nextInt());
        System.out.println(list);
    }
}
```

Input
```text
5
A B C D E
2
```
Output
```text
[A, B, D, E]
```

---

## Q7. Move Last to First
Move the last element to index `0`. Do not use `Collections.rotate()`.

```java
import java.util.*;

public class Main {

    static void moveLast(ArrayList<Integer> list) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        moveLast(list);
        System.out.println(list);
    }
}
```

Input
```text
5
10 20 30 40 50
```
Output
```text
[50, 10, 20, 30, 40]
```

---

## Q8. Count Strings Starting With a Character
Count strings whose first character equals the supplied character, ignoring case.

```java
import java.util.*;

public class Main {

    static int countStarting(ArrayList<String> list, char ch) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.next());

        char ch = sc.next().charAt(0);
        System.out.println(countStarting(list, ch));
    }
}
```

Input
```text
6
Apple ant Ball axe Air cat
a
```
Output
```text
3
```

---

# PART B — EASY → MEDIUM

## Q9. Remove Duplicate Strings
Keep only the first occurrence of every string.

```java
import java.util.*;

public class Main {

    static void unique(ArrayList<String> list) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.next());

        unique(list);
        System.out.println(list);
    }
}
```

Input
```text
8
cat dog cat bird dog cat fish bird
```
Output
```text
[cat, dog, bird, fish]
```

---

## Q10. Second Largest Distinct
Return the second-largest distinct integer, or `-1` if it does not exist.

```java
import java.util.*;

public class Main {

    static int secondLargest(ArrayList<Integer> list) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        System.out.println(secondLargest(list));
    }
}
```

Input
```text
8
20 50 10 50 40 30 40 50
```
Output
```text
40
```

---

## Q11. Frequency of Target
Count how many times a target occurs.

```java
import java.util.*;

public class Main {

    static int frequency(ArrayList<Integer> list, int target) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        System.out.println(frequency(list, sc.nextInt()));
    }
}
```

Input
```text
7
4 8 4 2 4 9 4
4
```
Output
```text
4
```

---

## Q12. Remove Numbers Outside Range
Keep only integers between `low` and `high`, inclusive.

```java
import java.util.*;

public class Main {

    static void filter(ArrayList<Integer> list, int low, int high) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        int low = sc.nextInt();
        int high = sc.nextInt();

        filter(list, low, high);
        System.out.println(list);
    }
}
```

Input
```text
8
2 10 15 4 22 7 30 9
5 20
```
Output
```text
[10, 15, 7, 9]
```

---

## Q13. Reverse Without Collections.reverse
Reverse an ArrayList manually.

```java
import java.util.*;

public class Main {

    static void reverse(ArrayList<Integer> list) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        reverse(list);
        System.out.println(list);
    }
}
```

Input
```text
5
1 2 3 4 5
```
Output
```text
[5, 4, 3, 2, 1]
```

---

## Q14. Merge Two Lists Without Duplicates
Return all values from A followed by values from B, but no value may appear twice.

```java
import java.util.*;

public class Main {

    static ArrayList<Integer> mergeUnique(ArrayList<Integer> a,
                                          ArrayList<Integer> b) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++)
            a.add(sc.nextInt());

        int m = sc.nextInt();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < m; i++)
            b.add(sc.nextInt());

        System.out.println(mergeUnique(a, b));
    }
}
```

Input
```text
5
1 2 3 2 4
5
3 5 4 6 5
```
Output
```text
[1, 2, 3, 4, 5, 6]
```

---

## Q15. Common Elements
Return distinct elements appearing in both lists, in the order in which they first appear in the first list.

```java
import java.util.*;

public class Main {

    static ArrayList<Integer> common(ArrayList<Integer> a,
                                     ArrayList<Integer> b) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++)
            a.add(sc.nextInt());

        int m = sc.nextInt();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < m; i++)
            b.add(sc.nextInt());

        System.out.println(common(a, b));
    }
}
```

Input
```text
7
10 20 30 20 40 50 60
5
30 40 40 70 20
```
Output
```text
[20, 30, 40]
```

---

## Q16. Sort Strings by Length
Sort strings by increasing length. Equal-length strings must retain their original order.

```java
import java.util.*;

public class Main {

    static void sortByLength(ArrayList<String> list) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.next());

        sortByLength(list);
        System.out.println(list);
    }
}
```

Input
```text
6
java cat cpp programming python a
```
Output
```text
[a, cat, cpp, java, python, programming]
```

---

# PART C — LINKEDLIST CORE

## Q17. LinkedList Add First/Last
Add two values at the beginning and two values at the end.

```java
import java.util.*;

public class Main {

    static void modify(LinkedList<String> list,
                       String first1, String first2,
                       String last1, String last2) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.next());

        String f1 = sc.next();
        String f2 = sc.next();
        String l1 = sc.next();
        String l2 = sc.next();

        modify(list, f1, f2, l1, l2);
        System.out.println(list);
    }
}
```

Input
```text
3
B C D
A X Y Z
```
Output
```text
[X, A, B, C, D, Y, Z]
```

---

## Q18. LinkedList Queue Operations
Perform the operations in the exact order:
`addLast(10), addLast(20), addLast(30), removeFirst(), addLast(x), removeFirst()`.

```java
import java.util.*;

public class Main {

    static void process(LinkedList<Integer> list, int x) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        process(list, x);

        System.out.println(list);
    }
}
```

Input
```text
40
```
Output
```text
[30, 40]
```

---

## Q19. LinkedList Stack Operations
Perform:
`addFirst(10), addFirst(20), addFirst(30), removeFirst(), addFirst(x)`.

```java
import java.util.*;

public class Main {

    static void process(LinkedList<Integer> list, int x) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        process(list, x);

        System.out.println(list);
    }
}
```

Input
```text
40
```
Output
```text
[40, 20, 10]
```

---

## Q20. LinkedList Remove All Target
Remove every occurrence of the target from a `LinkedList<String>`.

```java
import java.util.*;

public class Main {

    static void removeTarget(LinkedList<String> list, String target) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.next());

        removeTarget(list, sc.next());
        System.out.println(list);
    }
}
```

Input
```text
6
A B A C A D
A
```
Output
```text
[B, C, D]
```

---

## Q21. LinkedList Insert After Every Target
Insert `x` immediately after every occurrence of target.

```java
import java.util.*;

public class Main {

    static void insertAfter(LinkedList<Integer> list,
                            int target, int x) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        int target = sc.nextInt();
        int x = sc.nextInt();

        insertAfter(list, target, x);
        System.out.println(list);
    }
}
```

Input
```text
6
1 2 1 3 1 4
1 9
```
Output
```text
[1, 9, 2, 1, 9, 3, 1, 9, 4]
```

---

## Q22. LinkedList Reverse Using ListIterator
Reverse the list using a `ListIterator` or an equivalent iterator-based approach. Do not use `Collections.reverse()`.

```java
import java.util.*;

public class Main {

    static void reverse(LinkedList<String> list) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.next());

        reverse(list);
        System.out.println(list);
    }
}
```

Input
```text
5
A B C D E
```
Output
```text
[E, D, C, B, A]
```

---

## Q23. Iterator Delete Multiples of 3
You **must use `Iterator<Integer>`**. Remove every multiple of 3.

```java
import java.util.*;

public class Main {

    static void removeMultiples(LinkedList<Integer> list) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        removeMultiples(list);
        System.out.println(list);
    }
}
```

Input
```text
8
3 5 6 8 9 10 12 13
```
Output
```text
[5, 8, 10, 13]
```

---

## Q24. LinkedList First/Last Search
Print first index, last index and count of a target.

```java
import java.util.*;

public class Main {

    static void search(LinkedList<String> list, String target) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.next());

        search(list, sc.next());
    }
}
```

Input
```text
7
A B C B D B E
B
```
Output
```text
1 5 3
```

---

# PART D — ARRAYS INSIDE LINKEDLIST

## Q25. LinkedList<int[]> — Row Sum
Each node contains an integer array. Print the sum of each array.

```java
import java.util.*;

public class Main {

    static void rowSums(LinkedList<int[]> list) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        LinkedList<int[]> list = new LinkedList<>();

        for (int i = 0; i < rows; i++) {
            int[] arr = new int[cols];

            for (int j = 0; j < cols; j++)
                arr[j] = sc.nextInt();

            list.add(arr);
        }

        rowSums(list);
    }
}
```

Input
```text
3 3
10 20 30
5 5 5
7 8 9
```
Output
```text
60
15
24
```

---

## Q26. LinkedList<int[]> — Maximum in Every Array
Print the maximum value from every stored array.

```java
import java.util.*;

public class Main {

    static void rowMaximums(LinkedList<int[]> list) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        LinkedList<int[]> list = new LinkedList<>();

        for (int i = 0; i < rows; i++) {
            int[] arr = new int[cols];

            for (int j = 0; j < cols; j++)
                arr[j] = sc.nextInt();

            list.add(arr);
        }

        rowMaximums(list);
    }
}
```

Input
```text
3 4
2 9 4 1
10 3 8 7
6 5 12 2
```
Output
```text
9
10
12
```

---

## Q27. LinkedList<int[]> — Remove Arrays With Negative Values
Remove an entire array if it contains at least one negative number.

```java
import java.util.*;

public class Main {

    static void removeNegativeRows(LinkedList<int[]> list) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        LinkedList<int[]> list = new LinkedList<>();

        for (int i = 0; i < rows; i++) {
            int[] arr = new int[cols];

            for (int j = 0; j < cols; j++)
                arr[j] = sc.nextInt();

            list.add(arr);
        }

        removeNegativeRows(list);

        for (int[] arr : list)
            System.out.println(Arrays.toString(arr));
    }
}
```

Input
```text
4 3
1 2 3
4 -5 6
7 8 9
-1 2 3
```
Output
```text
[1, 2, 3]
[7, 8, 9]
```

---

## Q28. LinkedList<String[]> — Find Students
Each array is `{name, course, city}`. Print names of students whose course equals the supplied course.

```java
import java.util.*;

public class Main {

    static void findByCourse(LinkedList<String[]> list, String course) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedList<String[]> list = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String[] s = new String[3];
            s[0] = sc.next();
            s[1] = sc.next();
            s[2] = sc.next();
            list.add(s);
        }

        findByCourse(list, sc.next());
    }
}
```

Input
```text
4
Aman CSE Delhi
Riya ECE Mumbai
Karan CSE Chandigarh
Neha IT Delhi
CSE
```
Output
```text
Aman
Karan
```

---

## Q29. LinkedList<String[]> — Remove by City
Remove every student whose city equals the supplied city.

```java
import java.util.*;

public class Main {

    static void removeCity(LinkedList<String[]> list, String city) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedList<String[]> list = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String[] s = new String[3];
            s[0] = sc.next();
            s[1] = sc.next();
            s[2] = sc.next();
            list.add(s);
        }

        removeCity(list, sc.next());

        for (String[] s : list)
            System.out.println(Arrays.toString(s));
    }
}
```

Input
```text
4
Aman CSE Delhi
Riya ECE Mumbai
Karan CSE Delhi
Neha IT Chandigarh
Delhi
```
Output
```text
[Riya, ECE, Mumbai]
[Neha, IT, Chandigarh]
```

---

## Q30. LinkedList<int[]> — Row With Maximum Sum
Return the array having the largest sum. If tied, return the first array.

```java
import java.util.*;

public class Main {

    static int[] maxSumRow(LinkedList<int[]> list) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        LinkedList<int[]> list = new LinkedList<>();

        for (int i = 0; i < rows; i++) {
            int[] arr = new int[cols];

            for (int j = 0; j < cols; j++)
                arr[j] = sc.nextInt();

            list.add(arr);
        }

        System.out.println(Arrays.toString(maxSumRow(list)));
    }
}
```

Input
```text
3 3
10 20 10
50 1 2
20 20 20
```
Output
```text
[50, 1, 2]
```

---

# PART E — HARD MIXED COLLECTIONS

## Q31. Two Functions — Clean and Analyze
Function 1 removes duplicates from a `LinkedList<String>` while preserving first appearance.
Function 2 prints the longest string after cleaning. If tied, first one wins.

```java
import java.util.*;

public class Main {

    static void removeDuplicates(LinkedList<String> list) {
        // WRITE CODE HERE
    }

    static String longest(LinkedList<String> list) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < n; i++)
            list.add(sc.next());

        removeDuplicates(list);
        System.out.println(list);
        System.out.println(longest(list));
    }
}
```

Input
```text
7
cat programming java cat python java programming
```
Output
```text
[cat, programming, java, python]
programming
```

---

## Q32. ArrayList<Integer> — Stable Partition
Move all negative values to the beginning and non-negative values to the end, while preserving the relative order inside both groups.

```java
import java.util.*;

public class Main {

    static void partition(ArrayList<Integer> list) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        partition(list);
        System.out.println(list);
    }
}
```

Input
```text
8
5 -2 8 -7 3 -1 4 0
```
Output
```text
[-2, -7, -1, 5, 8, 3, 4, 0]
```

---

## Q33. ArrayList<String> — Group by First Character
Rearrange strings so that strings beginning with the same first character are together. Groups must appear in the order of first appearance of their starting character. Inside each group, preserve original order.

```java
import java.util.*;

public class Main {

    static void group(ArrayList<String> list) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.next());

        group(list);
        System.out.println(list);
    }
}
```

Input
```text
8
apple bat ant ball cat axe car dog
```
Output
```text
[apple, ant, axe, bat, ball, cat, car, dog]
```

---

## Q34. LinkedList<int[]> — Remove Dominated Rows
For every pair of rows, if every element of row A is greater than or equal to the corresponding element of row B, and at least one is strictly greater, then A dominates B. Remove every dominated row. Assume all rows have equal length.

```java
import java.util.*;

public class Main {

    static void removeDominated(LinkedList<int[]> list) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        LinkedList<int[]> list = new LinkedList<>();

        for (int i = 0; i < rows; i++) {
            int[] arr = new int[cols];

            for (int j = 0; j < cols; j++)
                arr[j] = sc.nextInt();

            list.add(arr);
        }

        removeDominated(list);

        for (int[] arr : list)
            System.out.println(Arrays.toString(arr));
    }
}
```

Input
```text
4 2
5 5
3 4
6 2
2 2
```
Output
```text
[5, 5]
[6, 2]
```

---

## Q35. Student Records — Multiple Functions
Each `String[]` is `{name, course, city}`.

Implement:
1. `removeCourse()` — remove all students of a course.
2. `findCity()` — return names from a city.
3. `countCourse()` — count students of a course.

```java
import java.util.*;

public class Main {

    static void removeCourse(LinkedList<String[]> list, String course) {
        // WRITE CODE HERE
    }

    static ArrayList<String> findCity(LinkedList<String[]> list, String city) {
        // WRITE CODE HERE
    }

    static int countCourse(LinkedList<String[]> list, String course) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedList<String[]> list = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String[] s = new String[3];
            s[0] = sc.next();
            s[1] = sc.next();
            s[2] = sc.next();
            list.add(s);
        }

        String removeCourse = sc.next();
        String city = sc.next();
        String countCourse = sc.next();

        removeCourse(list, removeCourse);

        System.out.println(findCity(list, city));
        System.out.println(countCourse(list, countCourse));
    }
}
```

Input
```text
5
Aman CSE Delhi
Riya ECE Mumbai
Karan CSE Chandigarh
Neha IT Delhi
Raj ECE Delhi
CSE
Delhi
ECE
```

Output
```text
[Aman?]
1
```

**Correction:** After removing CSE, Delhi contains Aman? No — Aman was CSE and is removed. Therefore the correct output is:
```text
[Neha, Raj]
2
```

---

# PART F — VERY HARD

## Q36. Frequency Ranking
Given an `ArrayList<Integer>`, create a new list containing each distinct number exactly once, sorted by:
1. decreasing frequency;
2. if frequency is equal, increasing numerical value.

```java
import java.util.*;

public class Main {

    static ArrayList<Integer> frequencyRank(ArrayList<Integer> list) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        System.out.println(frequencyRank(list));
    }
}
```

Input
```text
10
4 2 4 3 2 4 3 5 2 5
```

Output
```text
[2, 4, 3, 5]
```

---

## Q37. Merge Two LinkedLists Alternately
Merge two LinkedLists alternately. When one list ends, append the remaining elements of the other list.

```java
import java.util.*;

public class Main {

    static LinkedList<String> alternate(LinkedList<String> a,
                                        LinkedList<String> b) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedList<String> a = new LinkedList<>();
        for (int i = 0; i < n; i++)
            a.add(sc.next());

        int m = sc.nextInt();
        LinkedList<String> b = new LinkedList<>();
        for (int i = 0; i < m; i++)
            b.add(sc.next());

        System.out.println(alternate(a, b));
    }
}
```

Input
```text
4
A B C D
6
1 2 3 4 5 6
```
Output
```text
[A, 1, B, 2, C, 3, D, 4, 5, 6]
```

---

## Q38. LinkedList<int[]> — Column Winner
Every array is a row of marks. For each column, find the index of the row containing the maximum value. If tied, choose the first row.

```java
import java.util.*;

public class Main {

    static void columnWinners(LinkedList<int[]> rows) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cols = sc.nextInt();

        LinkedList<int[]> rows = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int[] a = new int[cols];

            for (int j = 0; j < cols; j++)
                a[j] = sc.nextInt();

            rows.add(a);
        }

        columnWinners(rows);
    }
}
```

Input
```text
3 4
10 90 30 40
80 20 70 40
50 60 70 100
```

Output
```text
1 0 1 2
```

---

# PART G — EXTREME / UNFAIR EXAM LEVEL ☠️

## Q39. Multi-Function Student Ranking
Each `Student` has `name`, `marks`, and `course`.

Implement:

1. `removeBelow()` — remove students below a minimum mark.
2. `courseTopper()` — return the highest-mark student of a given course.
3. `sortStudents()` — sort by marks descending; equal marks by name ascending.
4. `average()` — return integer average.
5. `courseCount()` — count students belonging to a course.

The main is completely fixed.

```java
import java.util.*;

class Student {
    String name;
    int marks;
    String course;

    Student(String name, int marks, String course) {
        this.name = name;
        this.marks = marks;
        this.course = course;
    }

    public String toString() {
        return name + " " + marks + " " + course;
    }
}

public class Main {

    static void removeBelow(ArrayList<Student> list, int minMarks) {
        // WRITE CODE HERE
    }

    static Student courseTopper(ArrayList<Student> list, String course) {
        // WRITE CODE HERE
    }

    static void sortStudents(ArrayList<Student> list) {
        // WRITE CODE HERE
    }

    static int average(ArrayList<Student> list) {
        // WRITE CODE HERE
    }

    static int courseCount(ArrayList<Student> list, String course) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Student> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
            list.add(new Student(sc.next(), sc.nextInt(), sc.next()));

        int minMarks = sc.nextInt();
        String topperCourse = sc.next();
        String countCourse = sc.next();

        removeBelow(list, minMarks);

        Student top = courseTopper(list, topperCourse);

        sortStudents(list);

        System.out.println(list);
        System.out.println(top == null ? "None" : top);
        System.out.println(average(list));
        System.out.println(courseCount(list, countCourse));
    }
}
```

Input
```text
6
Aman 78 CSE
Riya 92 ECE
Karan 85 CSE
Neha 88 IT
Raj 60 CSE
Simran 92 CSE
70
CSE
CSE
```

Output
```text
[Riya 92 ECE, Simran 92 CSE, Neha 88 IT, Karan 85 CSE, Aman 78 CSE]
Simran 92 CSE
87
3
```

---

## Q40. FINAL BOSS — Collection Transformation Pipeline ☠️☠️☠️

You receive a `LinkedList<String[]>`.

Every record has:
- `[0]` = name
- `[1]` = department
- `[2]` = city
- `[3]` = score

Implement ALL FIVE functions:

### `removeDuplicateNames()`
If the same name occurs multiple times, keep only the **first** record.

### `removeLowScores()`
Remove records whose score is below the supplied minimum.

### `departmentAverage()`
Return the integer average score of a department. Return `-1` if no record exists.

### `topTwo()`
Return an `ArrayList<String>` containing the names of the top two students by score.
If scores tie, the student appearing earlier in the LinkedList comes first.
If fewer than two records remain, return all available names.

### `finalOrder()`
Sort the remaining records:
1. score descending
2. department alphabetically
3. name alphabetically

Then print the complete records.

**Important:** The main must not be changed.

```java
import java.util.*;

public class Main {

    static void removeDuplicateNames(LinkedList<String[]> list) {
        // WRITE CODE HERE
    }

    static void removeLowScores(LinkedList<String[]> list, int minScore) {
        // WRITE CODE HERE
    }

    static int departmentAverage(LinkedList<String[]> list,
                                 String department) {
        // WRITE CODE HERE
    }

    static ArrayList<String> topTwo(LinkedList<String[]> list) {
        // WRITE CODE HERE
    }

    static void finalOrder(LinkedList<String[]> list) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedList<String[]> list = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String[] record = new String[4];

            record[0] = sc.next();
            record[1] = sc.next();
            record[2] = sc.next();
            record[3] = sc.next();

            list.add(record);
        }

        int minScore = sc.nextInt();
        String department = sc.next();

        removeDuplicateNames(list);
        removeLowScores(list, minScore);

        System.out.println("Average: " +
                           departmentAverage(list, department));

        System.out.println("Top Two: " + topTwo(list));

        finalOrder(list);

        for (String[] r : list)
            System.out.println(Arrays.toString(r));
    }
}
```

Input
```text
8
Aman CSE Delhi 78
Riya ECE Mumbai 92
Karan CSE Chandigarh 85
Aman IT Delhi 95
Neha IT Delhi 88
Raj CSE Delhi 65
Simran CSE Delhi 92
Varun ECE Mumbai 75
70
CSE
```

Output
```text
Average: 85
Top Two: [Riya, Simran]
[Aman, IT, Delhi, 95]
[Riya, ECE, Mumbai, 92]
[Simran, CSE, Delhi, 92]
[Neha, IT, Delhi, 88]
[Karan, CSE, Chandigarh, 85]
[Varun, ECE, Mumbai, 75]
```

---

# SOLUTIONS — SIMPLEST EXAM-FRIENDLY APPROACHES

## Q1
```java
for (int i = list.size() - 1; i >= 0; i--) {
    if (list.get(i) % 2 == 0)
        list.remove(i);
}
```

## Q2
```java
for (int i = 0; i < list.size(); i++)
    list.set(i, list.get(i).toUpperCase());
```

## Q3
```java
int index = list.indexOf(target);

if (index == -1)
    list.add(value);
else
    list.add(index, value);
```

## Q4
```java
while (list.contains(target))
    list.remove(target);
```

## Q5
```java
System.out.println(list.indexOf(target) + " " +
                   list.lastIndexOf(target));
```

## Q6
```java
if (index < 0 || index >= list.size())
    System.out.println("Invalid");
else
    list.remove(index);
```

## Q7
```java
int x = list.remove(list.size() - 1);
list.add(0, x);
```

## Q8
```java
int count = 0;

for (String s : list) {
    if (!s.isEmpty() &&
        Character.toLowerCase(s.charAt(0)) ==
        Character.toLowerCase(ch))
        count++;
}

return count;
```

## Q9
```java
ArrayList<String> seen = new ArrayList<>();

for (int i = list.size() - 1; i >= 0; i--) {
    if (seen.contains(list.get(i)))
        list.remove(i);
    else
        seen.add(list.get(i));
}
Collections.reverse(seen);
list.clear();
list.addAll(seen);
```

**Simpler alternative:**
```java
ArrayList<String> result = new ArrayList<>();

for (String s : list)
    if (!result.contains(s))
        result.add(s);

list.clear();
list.addAll(result);
```

## Q10
```java
int largest = Integer.MIN_VALUE;
int second = Integer.MIN_VALUE;

for (int x : list) {
    if (x > largest) {
        second = largest;
        largest = x;
    } else if (x > second && x != largest) {
        second = x;
    }
}

return second == Integer.MIN_VALUE ? -1 : second;
```

## Q11
```java
int count = 0;

for (int x : list)
    if (x == target)
        count++;

return count;
```

## Q12
```java
for (int i = list.size() - 1; i >= 0; i--) {
    int x = list.get(i);

    if (x < low || x > high)
        list.remove(i);
}
```

## Q13
```java
int i = 0;
int j = list.size() - 1;

while (i < j) {
    int temp = list.get(i);
    list.set(i, list.get(j));
    list.set(j, temp);
    i++;
    j--;
}
```

## Q14
```java
ArrayList<Integer> result = new ArrayList<>();

for (int x : a)
    if (!result.contains(x))
        result.add(x);

for (int x : b)
    if (!result.contains(x))
        result.add(x);

return result;
```

## Q15
```java
ArrayList<Integer> result = new ArrayList<>();

for (int x : a) {
    if (b.contains(x) && !result.contains(x))
        result.add(x);
}

return result;
```

## Q16
```java
list.sort((a, b) -> a.length() - b.length());
```

## Q17
```java
list.addFirst(first1);
list.addFirst(first2);

list.addLast(last1);
list.addLast(last2);
```

## Q18
```java
list.addLast(10);
list.addLast(20);
list.addLast(30);

list.removeFirst();

list.addLast(x);

list.removeFirst();
```

## Q19
```java
list.addFirst(10);
list.addFirst(20);
list.addFirst(30);

list.removeFirst();

list.addFirst(x);
```

## Q20
```java
Iterator<String> it = list.iterator();

while (it.hasNext()) {
    if (it.next().equals(target))
        it.remove();
}
```

## Q21
```java
for (int i = 0; i < list.size(); i++) {

    if (list.get(i) == target) {
        list.add(i + 1, x);
        i++;
    }
}
```

## Q22
```java
LinkedList<String> result = new LinkedList<>();

ListIterator<String> it = list.listIterator(list.size());

while (it.hasPrevious())
    result.add(it.previous());

list.clear();
list.addAll(result);
```

## Q23
```java
Iterator<Integer> it = list.iterator();

while (it.hasNext()) {
    if (it.next() % 3 == 0)
        it.remove();
}
```

## Q24
```java
int first = -1;
int last = -1;
int count = 0;

for (int i = 0; i < list.size(); i++) {

    if (list.get(i).equals(target)) {

        if (first == -1)
            first = i;

        last = i;
        count++;
    }
}

System.out.println(first + " " + last + " " + count);
```

## Q25
```java
for (int[] arr : list) {

    int sum = 0;

    for (int x : arr)
        sum += x;

    System.out.println(sum);
}
```

## Q26
```java
for (int[] arr : list) {

    int max = arr[0];

    for (int x : arr)
        if (x > max)
            max = x;

    System.out.println(max);
}
```

## Q27
```java
Iterator<int[]> it = list.iterator();

while (it.hasNext()) {

    int[] arr = it.next();
    boolean negative = false;

    for (int x : arr) {
        if (x < 0) {
            negative = true;
            break;
        }
    }

    if (negative)
        it.remove();
}
```

## Q28
```java
for (String[] s : list) {
    if (s[1].equals(course))
        System.out.println(s[0]);
}
```

## Q29
```java
Iterator<String[]> it = list.iterator();

while (it.hasNext()) {
    String[] s = it.next();

    if (s[2].equals(city))
        it.remove();
}
```

## Q30
```java
int[] best = list.getFirst();
int bestSum = 0;

for (int x : best)
    bestSum += x;

for (int[] arr : list) {

    int sum = 0;

    for (int x : arr)
        sum += x;

    if (sum > bestSum) {
        bestSum = sum;
        best = arr;
    }
}

return best;
```

## Q31
```java
ArrayList<String> seen = new ArrayList<>();

for (int i = list.size() - 1; i >= 0; i--) {

    if (seen.contains(list.get(i)))
        list.remove(i);
    else
        seen.add(list.get(i));
}

Collections.reverse(seen);
list.clear();
list.addAll(seen);
```

Then:
```java
String best = list.getFirst();

for (String s : list) {
    if (s.length() > best.length())
        best = s;
}

return best;
```

## Q32
```java
ArrayList<Integer> negative = new ArrayList<>();
ArrayList<Integer> nonNegative = new ArrayList<>();

for (int x : list) {
    if (x < 0)
        negative.add(x);
    else
        nonNegative.add(x);
}

list.clear();
list.addAll(negative);
list.addAll(nonNegative);
```

## Q33
```java
ArrayList<String> result = new ArrayList<>();
ArrayList<Character> used = new ArrayList<>();

for (String s : list) {

    char ch = s.charAt(0);

    if (!used.contains(ch)) {

        for (String x : list) {
            if (x.charAt(0) == ch)
                result.add(x);
        }

        used.add(ch);
    }
}

list.clear();
list.addAll(result);
```

## Q34
```java
for (int i = list.size() - 1; i >= 0; i--) {

    int[] a = list.get(i);
    boolean dominated = false;

    for (int j = 0; j < list.size(); j++) {

        if (i == j)
            continue;

        int[] b = list.get(j);

        boolean allGreaterOrEqual = true;
        boolean oneGreater = false;

        for (int k = 0; k < a.length; k++) {

            if (b[k] < a[k]) {
                allGreaterOrEqual = false;
                break;
            }

            if (b[k] > a[k])
                oneGreater = true;
        }

        if (allGreaterOrEqual && oneGreater) {
            dominated = true;
            break;
        }
    }

    if (dominated)
        list.remove(i);
}
```

## Q35

### `removeCourse`
```java
Iterator<String[]> it = list.iterator();

while (it.hasNext()) {
    if (it.next()[1].equals(course))
        it.remove();
}
```

### `findCity`
```java
ArrayList<String> result = new ArrayList<>();

for (String[] s : list)
    if (s[2].equals(city))
        result.add(s[0]);

return result;
```

### `countCourse`
```java
int count = 0;

for (String[] s : list)
    if (s[1].equals(course))
        count++;

return count;
```

## Q36
```java
ArrayList<Integer> unique = new ArrayList<>();

for (int x : list)
    if (!unique.contains(x))
        unique.add(x);

unique.sort((a, b) -> {

    int fa = 0;
    int fb = 0;

    for (int x : list) {
        if (x == a) fa++;
        if (x == b) fb++;
    }

    if (fa != fb)
        return fb - fa;

    return a - b;
});

return unique;
```

## Q37
```java
LinkedList<String> result = new LinkedList<>();

int i = 0;
int j = 0;

while (i < a.size() || j < b.size()) {

    if (i < a.size())
        result.add(a.get(i++));

    if (j < b.size())
        result.add(b.get(j++));
}

return result;
```

## Q38
```java
for (int col = 0; col < rows.getFirst().length; col++) {

    int bestRow = 0;

    for (int row = 1; row < rows.size(); row++) {

        if (rows.get(row)[col] > rows.get(bestRow)[col])
            bestRow = row;
    }

    System.out.print(bestRow + " ");
}
```

## Q39

### `removeBelow`
```java
for (int i = list.size() - 1; i >= 0; i--) {
    if (list.get(i).marks < minMarks)
        list.remove(i);
}
```

### `courseTopper`
```java
Student best = null;

for (Student s : list) {

    if (s.course.equals(course)) {

        if (best == null || s.marks > best.marks)
            best = s;
    }
}

return best;
```

### `sortStudents`
```java
list.sort((a, b) -> {

    if (a.marks != b.marks)
        return b.marks - a.marks;

    return a.name.compareTo(b.name);
});
```

### `average`
```java
if (list.isEmpty())
    return 0;

int sum = 0;

for (Student s : list)
    sum += s.marks;

return sum / list.size();
```

### `courseCount`
```java
int count = 0;

for (Student s : list)
    if (s.course.equals(course))
        count++;

return count;
```

# Q40 — Final Boss Solution

### `removeDuplicateNames`
```java
ArrayList<String> seen = new ArrayList<>();

Iterator<String[]> it = list.iterator();

while (it.hasNext()) {

    String[] r = it.next();

    if (seen.contains(r[0]))
        it.remove();
    else
        seen.add(r[0]);
}
```

### `removeLowScores`
```java
Iterator<String[]> it = list.iterator();

while (it.hasNext()) {

    String[] r = it.next();

    if (Integer.parseInt(r[3]) < minScore)
        it.remove();
}
```

### `departmentAverage`
```java
int sum = 0;
int count = 0;

for (String[] r : list) {

    if (r[1].equals(department)) {
        sum += Integer.parseInt(r[3]);
        count++;
    }
}

if (count == 0)
    return -1;

return sum / count;
```

### `topTwo`
```java
ArrayList<String> result = new ArrayList<>();

String best1 = null;
String best2 = null;

int score1 = Integer.MIN_VALUE;
int score2 = Integer.MIN_VALUE;

for (String[] r : list) {

    int score = Integer.parseInt(r[3]);

    if (score > score1) {

        score2 = score1;
        best2 = best1;

        score1 = score;
        best1 = r[0];

    } else if (score > score2) {

        score2 = score;
        best2 = r[0];
    }
}

if (best1 != null)
    result.add(best1);

if (best2 != null)
    result.add(best2);

return result;
```

### `finalOrder`
```java
list.sort((a, b) -> {

    int scoreA = Integer.parseInt(a[3]);
    int scoreB = Integer.parseInt(b[3]);

    if (scoreA != scoreB)
        return scoreB - scoreA;

    int dept = a[1].compareTo(b[1]);

    if (dept != 0)
        return dept;

    return a[0].compareTo(b[0]);
});
```

---

# FINAL REVISION CHECKLIST

Before the exam, make sure you can write these **without looking at solutions**:

### ArrayList
- `add(x)`
- `add(index, x)`
- `get(index)`
- `set(index, x)`
- `remove(index)`
- `remove(Integer.valueOf(x))`
- `contains(x)`
- `indexOf(x)`
- `lastIndexOf(x)`
- `size()`
- `isEmpty()`
- `clear()`
- `addAll()`
- sorting
- custom sorting
- duplicate removal
- frequency
- filtering
- reversing

### LinkedList
- `addFirst()`
- `addLast()`
- `getFirst()`
- `getLast()`
- `removeFirst()`
- `removeLast()`
- normal `add/get/set/remove`
- queue logic
- stack logic
- iterator removal
- ListIterator
- sorting

### Arrays inside LinkedList
- `LinkedList<int[]>`
- `LinkedList<String[]>`
- nested loops
- row sum
- row maximum
- row filtering
- searching fields using `s[0]`, `s[1]`, etc.
- parsing numbers stored as strings

### Exam traps
- Removing while traversing → use reverse index or Iterator
- `remove(2)` on `ArrayList<Integer>` means **index 2**
- To remove integer value 2: `remove(Integer.valueOf(2))`
- String comparison → `.equals()`, not `==`
- First/last occurrence → `indexOf()` / `lastIndexOf()`
- `size()` for collections, `.length` for arrays
- `get(i)` for ArrayList/LinkedList
- arrays use `arr[i]`
- preserve order when question says stable/first appearance
- always handle empty list if the question allows it

## Suggested Practice Rule

Do **Q1–15 without solutions** first.

Then do **Q16–30 under a timer**.

For **Q31–35**, don't look at the solution until you have a working attempt.

For **Q36–40**, treat them like actual exam boss questions: write the functions from scratch, test edge cases, and only then compare with the solution.

If you can solve Q36–40 comfortably, normal ArrayList/LinkedList exam questions should feel much easier.
