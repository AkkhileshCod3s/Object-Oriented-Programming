# Java Collections --- Set (HashSet, LinkedHashSet, TreeSet)
### 25 College Exam Coding Questions


## Coverage Map

1.  `HashSet` --- basic add & automatic duplicate removal
2.  `LinkedHashSet` --- insertion-order preservation
3.  `TreeSet` --- natural sorting order
4.  `HashSet` --- unpredictable/hash-based order
5.  `TreeSet` with `Comparator` --- custom/descending order
6.  `TreeSet` with `Comparable` --- custom objects
7.  Set union using `addAll()`
8.  Set intersection using `retainAll()`
9.  Set difference using `removeAll()`
10. `contains()` membership check
11. `remove()` from a Set
12. Iterating a Set using `Iterator`
13. `size()` and `isEmpty()`
14. Removing duplicates from an array via `HashSet`
15. Removing duplicates from a `List` via `Set`
16. `TreeSet.first()` and `TreeSet.last()`
17. `TreeSet.higher()` and `TreeSet.lower()`
18. `TreeSet.ceiling()` and `TreeSet.floor()`
19. `TreeSet.headSet()` and `TreeSet.tailSet()`
20. `TreeSet.pollFirst()` and `TreeSet.pollLast()`
21. `HashSet` vs `LinkedHashSet` order comparison
22. `HashSet` of custom objects --- `equals()`/`hashCode()` override
23. `TreeSet` of Strings --- natural (lexicographic) ordering
24. `Set` to `List`/array conversion
25. Reading `n` elements via Scanner, removing duplicates, printing sorted

------------------------------------------------------------------------

## Question 1: HashSet --- Basic Add and Duplicate Removal

**Difficulty:** Easy\
**Concept:** `HashSet`, automatic duplicate elimination

### Problem Statement

Create a `HashSet<Integer>`. Add the given numbers to it (including
duplicates) and print the final size of the set to show duplicates were
automatically removed.

### Input Format

`n` followed by `n` integers (may contain duplicates)

### Constraints

1 ≤ n ≤ 100

### Output Format

Print the size of the set after all insertions.

### Sample Input

``` text
6
1 2 2 3 3 3
```

### Sample Output

``` text
Set size: 3
```

### Predefined Code

``` java
import java.util.HashSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int val = s.nextInt();
            // Add val to the set
            // Write your code here
        }

        System.out.println("Set size: " + set.size());
    }
}
```

------------------------------------------------------------------------

## Question 2: LinkedHashSet --- Preserving Insertion Order

**Difficulty:** Easy\
**Concept:** `LinkedHashSet` maintains the order elements were inserted

### Problem Statement

Insert `n` strings into a `LinkedHashSet<String>` (duplicates may
appear in the input) and print all elements in the order they were
**first inserted**.

### Input Format

`n` followed by `n` strings

### Constraints

1 ≤ n ≤ 100

### Output Format

Print each unique element on its own line, in insertion order.

### Sample Input

``` text
5
Banana
Apple
Banana
Cherry
Apple
```

### Sample Output

``` text
Banana
Apple
Cherry
```

### Predefined Code

``` java
import java.util.LinkedHashSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        LinkedHashSet<String> set = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String val = s.nextLine();
            // Add val to the set
            // Write your code here
        }

        // Print each element on its own line
        // Write your code here
    }
}
```

------------------------------------------------------------------------

## Question 3: TreeSet --- Natural Sorting Order

**Difficulty:** Easy\
**Concept:** `TreeSet` automatically sorts elements in ascending order

### Problem Statement

Insert `n` integers into a `TreeSet<Integer>` and print them. A
`TreeSet` should output the elements in ascending sorted order
regardless of insertion order.

### Input Format

`n` followed by `n` integers

### Constraints

1 ≤ n ≤ 100

### Output Format

Print all elements space-separated in ascending order.

### Sample Input

``` text
5
40 10 30 20 10
```

### Sample Output

``` text
10 20 30 40
```

### Predefined Code

``` java
import java.util.TreeSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            // Read and add each integer
            // Write your code here
        }

        for (int val : set) {
            System.out.print(val + " ");
        }
    }
}
```

------------------------------------------------------------------------

## Question 4: HashSet --- No Guaranteed Order (Conceptual + Coding)

**Difficulty:** Medium\
**Concept:** `HashSet` ordering is unpredictable; verifying via
`contains()` rather than position

### Problem Statement

Write a complete Java program (no skeleton provided) that reads `n`
integers into a `HashSet<Integer>`, then reads a value `x` and checks
whether `x` is present in the set using `contains()`. Print `"Found"`
or `"Not Found"` accordingly. **Do not** rely on any particular
iteration order in your solution.

### Input Format

`n`, then `n` integers, then a value `x` to search for

### Constraints

1 ≤ n ≤ 100

### Output Format

`Found` if `x` is present, else `Not Found`.

### Sample Input

``` text
4
5 10 15 20
15
```

### Sample Output

``` text
Found
```

*(No predefined code --- write the full program including imports, the
`Main` class, and `main()` method yourself.)*

------------------------------------------------------------------------

## Question 5: TreeSet with Comparator --- Descending Order

**Difficulty:** Medium\
**Concept:** `TreeSet` with a custom `Comparator` passed to the constructor

### Problem Statement

Create a `TreeSet<Integer>` that sorts elements in **descending**
order by passing a `Comparator` to its constructor. Insert `n`
integers and print them in descending order.

### Input Format

`n` followed by `n` integers

### Constraints

1 ≤ n ≤ 100

### Output Format

Print all elements space-separated in descending order.

### Sample Input

``` text
5
10 40 20 40 30
```

### Sample Output

``` text
40 30 20 10
```

### Predefined Code

``` java
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // Create a TreeSet with a Comparator for descending order
        // Write your code here
        TreeSet<Integer> set = null;

        for (int i = 0; i < n; i++) {
            set.add(s.nextInt());
        }

        for (int val : set) {
            System.out.print(val + " ");
        }
    }
}
```

------------------------------------------------------------------------

## Question 6: TreeSet of Custom Objects Using Comparable

**Difficulty:** Hard\
**Concept:** `Comparable<T>` interface, `compareTo()`, sorting custom
objects in a `TreeSet`

### Problem Statement

Create a class `Student` with fields `name` and `marks`, implementing
`Comparable<Student>` so that students are sorted in ascending order of
`marks`. Insert `n` students into a `TreeSet<Student>` and print them in
sorted order as `name-marks`.

### Input Format

`n`, followed by `n` pairs of (name, marks)

### Constraints

1 ≤ n ≤ 50, marks are unique positive integers

### Output Format

Print each student on its own line, sorted by ascending marks, as
`name-marks`.

### Sample Input

``` text
3
Aman 70
Riya 90
Kabir 60
```

### Sample Output

``` text
Kabir-60
Aman-70
Riya-90
```

### Predefined Code

``` java
import java.util.TreeSet;
import java.util.Scanner;

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        // Compare based on marks (ascending)
        // Write your code here
        return 0;
    }

    @Override
    public String toString() {
        return name + "-" + marks;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        TreeSet<Student> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String name = s.next();
            int marks = s.nextInt();
            s.nextLine();
            set.add(new Student(name, marks));
        }

        for (Student st : set) {
            System.out.println(st);
        }
    }
}
```

------------------------------------------------------------------------

## Question 7: Set Union Using `addAll()`

**Difficulty:** Medium\
**Concept:** Combining two sets into their union

### Problem Statement

Read two lists of integers into two separate `HashSet`s. Compute their
**union** using `addAll()` and print the resulting set's size and its
elements sorted in ascending order (use a `TreeSet` for final sorted
display).

### Input Format

`n1`, `n1` integers, `n2`, `n2` integers

### Constraints

1 ≤ n1, n2 ≤ 50

### Output Format

Print the union size, then the sorted union elements space-separated.

### Sample Input

``` text
3
1 2 3
3
3 4 5
```

### Sample Output

``` text
Union size: 5
1 2 3 4 5
```

### Predefined Code

``` java
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < n1; i++) set1.add(s.nextInt());

        int n2 = s.nextInt();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < n2; i++) set2.add(s.nextInt());

        // Perform union: add all elements of set2 into set1
        // Write your code here

        System.out.println("Union size: " + set1.size());
        TreeSet<Integer> sorted = new TreeSet<>(set1);
        for (int val : sorted) {
            System.out.print(val + " ");
        }
    }
}
```

------------------------------------------------------------------------

## Question 8: Set Intersection Using `retainAll()`

**Difficulty:** Medium\
**Concept:** Finding common elements between two sets

### Problem Statement

Read two lists of integers into two `HashSet`s. Compute their
**intersection** using `retainAll()` and print the sorted intersection
elements.

### Input Format

`n1`, `n1` integers, `n2`, `n2` integers

### Constraints

1 ≤ n1, n2 ≤ 50

### Output Format

Print the sorted common elements space-separated.

### Sample Input

``` text
4
1 2 3 4
3
3 4 5
```

### Sample Output

``` text
3 4
```

### Predefined Code

``` java
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < n1; i++) set1.add(s.nextInt());

        int n2 = s.nextInt();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < n2; i++) set2.add(s.nextInt());

        // Perform intersection: retain only common elements in set1
        // Write your code here

        TreeSet<Integer> sorted = new TreeSet<>(set1);
        for (int val : sorted) {
            System.out.print(val + " ");
        }
    }
}
```

------------------------------------------------------------------------

## Question 9: Set Difference Using `removeAll()`

**Difficulty:** Medium\
**Concept:** Elements present in one set but not another

### Problem Statement

Write a **complete program** (no skeleton) that reads two lists of
integers into two `HashSet`s and prints the elements present in the
**first** set but **not** in the second (i.e., `set1 - set2`), sorted in
ascending order.

### Input Format

`n1`, `n1` integers, `n2`, `n2` integers

### Constraints

1 ≤ n1, n2 ≤ 50

### Output Format

Print the sorted difference elements space-separated.

### Sample Input

``` text
4
1 2 3 4
2
3 4
```

### Sample Output

``` text
1 2
```

*(No predefined code --- write the full program yourself.)*

------------------------------------------------------------------------

## Question 10: `contains()` --- Membership Check

**Difficulty:** Easy\
**Concept:** Checking if an element exists in a Set

### Problem Statement

Read `n` strings into a `HashSet<String>`. Then read a query string and
print `"Yes"` if it exists in the set, else `"No"`.

### Input Format

`n`, `n` strings, then one query string

### Constraints

1 ≤ n ≤ 100

### Output Format

`Yes` or `No`

### Sample Input

``` text
3
apple
banana
mango
banana
```

### Sample Output

``` text
Yes
```

### Predefined Code

``` java
import java.util.HashSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(s.nextLine());
        }

        String query = s.nextLine();
        // Check membership and print Yes/No
        // Write your code here
    }
}
```

------------------------------------------------------------------------

## Question 11: `remove()` From a Set

**Difficulty:** Easy\
**Concept:** Removing a specific element and confirming removal

### Problem Statement

Insert `n` integers into a `HashSet`. Remove a given value `x` from the
set. Print `"Removed"` if the value existed and was removed, otherwise
print `"Not Found"`.

### Input Format

`n`, `n` integers, then value `x` to remove

### Constraints

1 ≤ n ≤ 100

### Output Format

`Removed` or `Not Found`

### Sample Input

``` text
4
5 10 15 20
15
```

### Sample Output

``` text
Removed
```

### Predefined Code

``` java
import java.util.HashSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) set.add(s.nextInt());

        int x = s.nextInt();
        // Remove x and print Removed/Not Found based on the boolean result
        // Write your code here
    }
}
```

------------------------------------------------------------------------

## Question 12: Iterating a Set Using `Iterator`

**Difficulty:** Medium\
**Concept:** `Iterator` interface, `hasNext()`/`next()`, safe removal
during iteration

### Problem Statement

Insert `n` integers into a `HashSet`. Using an **`Iterator`** (not a
for-each loop), remove all even numbers from the set while iterating,
then print the remaining elements.

### Input Format

`n` followed by `n` integers

### Constraints

1 ≤ n ≤ 100

### Output Format

Print remaining elements space-separated (any order, but numerically
sorted for grading -- use a `TreeSet` for final display).

### Sample Input

``` text
6
1 2 3 4 5 6
```

### Sample Output

``` text
1 3 5
```

### Predefined Code

``` java
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) set.add(s.nextInt());

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            int val = it.next();
            // If val is even, remove it using the iterator (it.remove())
            // Write your code here
        }

        TreeSet<Integer> sorted = new TreeSet<>(set);
        for (int val : sorted) {
            System.out.print(val + " ");
        }
    }
}
```

------------------------------------------------------------------------

## Question 13: `size()` and `isEmpty()`

**Difficulty:** Easy\
**Concept:** Basic Set query methods

### Problem Statement

Write a **complete program** (no skeleton) that reads `n` integers into
a `HashSet`, then prints the set's size, and separately prints whether
an **empty** `HashSet` (created but never populated) `isEmpty()`.

### Input Format

`n` followed by `n` integers

### Constraints

0 ≤ n ≤ 100

### Output Format

``` text
Size: <size>
Empty set isEmpty: true
```

### Sample Input

``` text
3
7 8 9
```

### Sample Output

``` text
Size: 3
Empty set isEmpty: true
```

*(No predefined code --- write the full program yourself.)*

------------------------------------------------------------------------

## Question 14: Removing Duplicates From an Array Using `HashSet`

**Difficulty:** Medium\
**Concept:** Practical application --- deduplicating an array via a Set

### Problem Statement

Read an integer array of size `n` (may contain duplicates). Convert it
into a `HashSet` to remove duplicates, then print the number of unique
elements and the unique elements themselves in ascending sorted order.

### Input Format

`n` followed by `n` integers

### Constraints

1 ≤ n ≤ 100

### Output Format

``` text
Unique count: <count>
<sorted unique elements space-separated>
```

### Sample Input

``` text
7
4 5 4 6 5 7 8
```

### Sample Output

``` text
Unique count: 5
4 5 6 7 8
```

### Predefined Code

``` java
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = s.nextInt();

        // Convert the array into a HashSet to remove duplicates
        // Write your code here
        HashSet<Integer> set = null;

        System.out.println("Unique count: " + set.size());
        TreeSet<Integer> sorted = new TreeSet<>(set);
        for (int val : sorted) {
            System.out.print(val + " ");
        }
    }
}
```

------------------------------------------------------------------------

## Question 15: Removing Duplicates From a `List` via `Set`

**Difficulty:** Medium\
**Concept:** Converting between `List` and `Set`

### Problem Statement

Read `n` strings into an `ArrayList<String>`. Remove duplicates by
converting the list into a `LinkedHashSet` (to preserve first-seen
order), then convert it back into a `List` and print all elements.

### Input Format

`n` followed by `n` strings

### Constraints

1 ≤ n ≤ 100

### Output Format

Print each unique string on its own line, in first-seen order.

### Sample Input

``` text
5
red
green
red
blue
green
```

### Sample Output

``` text
red
green
blue
```

### Predefined Code

``` java
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(s.nextLine());

        // Convert list to LinkedHashSet to remove duplicates while preserving order
        // Write your code here
        LinkedHashSet<String> set = null;

        List<String> result = new ArrayList<>(set);
        for (String str : result) {
            System.out.println(str);
        }
    }
}
```

------------------------------------------------------------------------

## Question 16: `TreeSet.first()` and `TreeSet.last()`

**Difficulty:** Easy\
**Concept:** Retrieving the smallest and largest elements

### Problem Statement

Insert `n` integers into a `TreeSet`. Print the smallest element using
`first()` and the largest using `last()`.

### Input Format

`n` followed by `n` integers

### Constraints

1 ≤ n ≤ 100

### Output Format

``` text
First: <smallest>
Last: <largest>
```

### Sample Input

``` text
5
30 10 50 20 40
```

### Sample Output

``` text
First: 10
Last: 50
```

### Predefined Code

``` java
import java.util.TreeSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) set.add(s.nextInt());

        // Print First and Last using first() and last()
        // Write your code here
    }
}
```

------------------------------------------------------------------------

## Question 17: `TreeSet.higher()` and `TreeSet.lower()`

**Difficulty:** Medium\
**Concept:** Strict "next greater" / "next smaller" queries

### Problem Statement

Insert `n` integers into a `TreeSet`. Given a value `x`, print the
smallest element **strictly greater** than `x` using `higher()`, and
the largest element **strictly smaller** than `x` using `lower()`. If
none exists, print `null`.

### Input Format

`n`, `n` integers, then value `x`

### Constraints

1 ≤ n ≤ 100

### Output Format

``` text
Higher: <value or null>
Lower: <value or null>
```

### Sample Input

``` text
5
10 20 30 40 50
30
```

### Sample Output

``` text
Higher: 40
Lower: 20
```

### Predefined Code

``` java
import java.util.TreeSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) set.add(s.nextInt());

        int x = s.nextInt();
        // Print Higher and Lower using higher(x) and lower(x)
        // Write your code here
    }
}
```

------------------------------------------------------------------------

## Question 18: `TreeSet.ceiling()` and `TreeSet.floor()`

**Difficulty:** Medium\
**Concept:** Inclusive "closest greater-or-equal" / "closest smaller-or-equal"

### Problem Statement

Write a **complete program** (no skeleton) that inserts `n` integers
into a `TreeSet`, then for a given value `x` prints the **ceiling**
(smallest element ≥ x) and the **floor** (largest element ≤ x). If a
value is not present in the set at all, print `null` for that side.

### Input Format

`n`, `n` integers, then value `x`

### Constraints

1 ≤ n ≤ 100

### Output Format

``` text
Ceiling: <value or null>
Floor: <value or null>
```

### Sample Input

``` text
5
10 20 30 40 50
25
```

### Sample Output

``` text
Ceiling: 30
Floor: 20
```

*(No predefined code --- write the full program yourself.)*

------------------------------------------------------------------------

## Question 19: `TreeSet.headSet()` and `TreeSet.tailSet()`

**Difficulty:** Medium\
**Concept:** Sub-set views --- elements before/from a given boundary

### Problem Statement

Insert `n` integers into a `TreeSet`. Given a value `x`, print all
elements **strictly less than** `x` using `headSet(x)`, then all
elements **greater than or equal to** `x` using `tailSet(x)`.

### Input Format

`n`, `n` integers, then value `x`

### Constraints

1 ≤ n ≤ 100

### Output Format

``` text
HeadSet: <elements space-separated>
TailSet: <elements space-separated>
```

### Sample Input

``` text
6
10 20 30 40 50 60
40
```

### Sample Output

``` text
HeadSet: 10 20 30
TailSet: 40 50 60
```

### Predefined Code

``` java
import java.util.TreeSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) set.add(s.nextInt());

        int x = s.nextInt();

        System.out.print("HeadSet: ");
        // Print elements from headSet(x)
        // Write your code here

        System.out.print("\nTailSet: ");
        // Print elements from tailSet(x)
        // Write your code here
    }
}
```

------------------------------------------------------------------------

## Question 20: `TreeSet.pollFirst()` and `TreeSet.pollLast()`

**Difficulty:** Medium\
**Concept:** Retrieving AND removing the smallest/largest element in one step

### Problem Statement

Insert `n` integers into a `TreeSet`. Call `pollFirst()` and print the
removed smallest value, then call `pollLast()` and print the removed
largest value. Finally print the remaining set.

### Input Format

`n` followed by `n` integers

### Constraints

3 ≤ n ≤ 100

### Output Format

``` text
Polled First: <value>
Polled Last: <value>
Remaining: <elements space-separated>
```

### Sample Input

``` text
5
30 10 50 20 40
```

### Sample Output

``` text
Polled First: 10
Polled Last: 50
Remaining: 20 30 40
```

### Predefined Code

``` java
import java.util.TreeSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) set.add(s.nextInt());

        // Use pollFirst() and pollLast(), storing and printing the results
        // Write your code here

        System.out.print("Remaining: ");
        for (int val : set) {
            System.out.print(val + " ");
        }
    }
}
```

------------------------------------------------------------------------

## Question 21: `HashSet` vs `LinkedHashSet` --- Order Comparison

**Difficulty:** Medium\
**Concept:** Contrasting the two implementations side by side

### Problem Statement

Write a **complete program** (no skeleton) that inserts the same `n`
integers into both a `HashSet` and a `LinkedHashSet`. Print the
elements of each set on separate lines to visibly compare their
iteration order (the `HashSet` order is hash-based/unspecified, while
`LinkedHashSet` preserves insertion order).

### Input Format

`n` followed by `n` integers

### Constraints

1 ≤ n ≤ 20

### Output Format

``` text
HashSet: <elements as iterated>
LinkedHashSet: <elements in insertion order>
```

### Sample Input

``` text
4
50 10 40 20
```

### Sample Output

``` text
HashSet: <implementation-dependent order>
LinkedHashSet: 50 10 40 20
```

*(No predefined code --- write the full program yourself. Note: your
`HashSet` output order may differ from any given "expected" order and
is graded only on containing the correct elements, while the
`LinkedHashSet` order must exactly match the insertion order.)*

------------------------------------------------------------------------

## Question 22: `HashSet` of Custom Objects --- `equals()`/`hashCode()`

**Difficulty:** Hard\
**Concept:** Why custom objects need `equals()` and `hashCode()` overridden
to work correctly with hash-based sets

### Problem Statement

Create a class `Point` with fields `x` and `y`. Override `equals()` and
`hashCode()` so that two `Point` objects with the same coordinates are
treated as duplicates. Insert several `Point` objects (including
coordinate duplicates) into a `HashSet<Point>` and print the resulting
set size.

### Input Format

`n`, followed by `n` pairs of (x, y)

### Constraints

1 ≤ n ≤ 50

### Output Format

Print the number of distinct points.

### Sample Input

``` text
4
1 2
3 4
1 2
5 6
```

### Sample Output

``` text
Distinct points: 3
```

### Predefined Code

``` java
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        // Compare x and y of this and the other Point
        // Write your code here
        return false;
    }

    @Override
    public int hashCode() {
        // Generate a consistent hash code based on x and y
        // Write your code here
        return 0;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        HashSet<Point> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            set.add(new Point(x, y));
        }

        System.out.println("Distinct points: " + set.size());
    }
}
```

------------------------------------------------------------------------

## Question 23: `TreeSet` of Strings --- Natural Lexicographic Ordering

**Difficulty:** Easy\
**Concept:** `TreeSet<String>` sorts using natural (dictionary) order

### Problem Statement

Insert `n` strings into a `TreeSet<String>` and print them in sorted
(lexicographic) order.

### Input Format

`n` followed by `n` strings

### Constraints

1 ≤ n ≤ 100

### Output Format

Print each string on its own line in sorted order.

### Sample Input

``` text
4
banana
apple
cherry
apple
```

### Sample Output

``` text
apple
banana
cherry
```

### Predefined Code

``` java
import java.util.TreeSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        TreeSet<String> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            // Add each string to the set
            // Write your code here
        }

        for (String str : set) {
            System.out.println(str);
        }
    }
}
```

------------------------------------------------------------------------

## Question 24: `Set` to `List`/Array Conversion

**Difficulty:** Medium\
**Concept:** `toArray()` and constructing a `List` from a `Set`

### Problem Statement

Write a **complete program** (no skeleton) that inserts `n` integers
into a `TreeSet`, converts the set into an `Integer[]` array using
`toArray()`, and prints the array elements space-separated.

### Input Format

`n` followed by `n` integers

### Constraints

1 ≤ n ≤ 100

### Output Format

Print the sorted array elements space-separated.

### Sample Input

``` text
4
30 10 20 10
```

### Sample Output

``` text
10 20 30
```

*(No predefined code --- write the full program yourself.)*

------------------------------------------------------------------------

## Question 25: Read `n` Elements, Remove Duplicates, Print Sorted

**Difficulty:** Medium\
**Concept:** End-to-end combination of `Scanner` input, a `Set` for
deduplication, and sorted output --- a common final/practical-exam style
question

### Problem Statement

Read `n` integers from the user (duplicates likely). Store them in an
appropriate `Set` implementation so that the final printed result is
both **duplicate-free** and in **ascending sorted order**, without
manually sorting an array yourself.

### Input Format

`n` followed by `n` integers

### Constraints

1 ≤ n ≤ 200

### Output Format

Print the unique elements in ascending order, space-separated, on one
line.

### Sample Input

``` text
8
5 3 9 3 5 1 9 7
```

### Sample Output

``` text
1 3 5 7 9
```

### Predefined Code

``` java
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // Declare a Set implementation that keeps elements unique AND sorted
        // Write your code here
        Set<Integer> set = null;

        for (int i = 0; i < n; i++) {
            set.add(s.nextInt());
        }

        for (int val : set) {
            System.out.print(val + " ");
        }
    }
}
```

------------------------------------------------------------------------

## Final Revision Checklist

After solving all 25, you should be comfortable with:

- [ ] `HashSet` --- basic insertion and automatic duplicate removal
- [ ] `LinkedHashSet` --- insertion-order preservation
- [ ] `TreeSet` --- natural ascending sort order
- [ ] Understanding that `HashSet` order is unspecified/hash-based
- [ ] `TreeSet` with a custom `Comparator` (e.g., descending order)
- [ ] `TreeSet` with custom objects via `Comparable`/`compareTo()`
- [ ] Set union (`addAll()`), intersection (`retainAll()`), difference
  (`removeAll()`)
- [ ] `contains()` and `remove()`
- [ ] Iterating with `Iterator`, including safe removal via `it.remove()`
- [ ] `size()` and `isEmpty()`
- [ ] Deduplicating arrays and `List`s using a `Set`
- [ ] `TreeSet` navigation methods: `first()`, `last()`, `higher()`,
  `lower()`, `ceiling()`, `floor()`, `headSet()`, `tailSet()`,
  `pollFirst()`, `pollLast()`
- [ ] Comparing `HashSet` vs `LinkedHashSet` output order directly
- [ ] Overriding `equals()`/`hashCode()` for custom objects used in a
  `HashSet`
- [ ] `TreeSet<String>` natural lexicographic ordering
- [ ] Converting a `Set` back to a `List`/array
- [ ] Full end-to-end "read → deduplicate → sort → print" programs
