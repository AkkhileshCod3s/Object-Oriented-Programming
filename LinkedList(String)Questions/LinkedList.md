# LinkedList (String) — College Exam Pattern Coding Questions

# 1. Traverse and Print a LinkedList of Strings

Write a program to create a `LinkedList<String>` and print all its elements space separated.

### Input Format

The first line contains an integer `N`, denoting the number of strings.

The next `N` lines each contain a single string (no spaces).

### Output Format

Print all strings in the LinkedList, space separated, in their original order.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 20
```

### Sample Input 1

```text
4
apple
mango
kiwi
pear
```

### Sample Output 1

```text
apple mango kiwi pear
```

### Sample Input 2

```text
3
cat
dog
cow
```

### Sample Output 2

```text
cat dog cow
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String traverse(LinkedList<String> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        System.out.println(Result.traverse(list));
    }
}
```


# 2. Add Elements at the Beginning and End

Given a `LinkedList<String>`, add a given string `X` at the beginning using `addFirst` and a given string `Y` at the end using `addLast`.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

The next line contains `X`.

The next line contains `Y`.

### Output Format

Print the modified LinkedList, space separated.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 20
```

### Sample Input 1

```text
3
mango
kiwi
pear
apple
grape
```

### Sample Output 1

```text
apple mango kiwi pear grape
```

### Sample Input 2

```text
2
dog
cow
cat
lion
```

### Sample Output 2

```text
cat dog cow lion
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String addFirstLast(LinkedList<String> list, String X, String Y) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        String X = s.nextLine().trim();
        String Y = s.nextLine().trim();

        System.out.println(Result.addFirstLast(list, X, Y));
    }
}
```


# 3. Find the Longest String

Given a `LinkedList<String>`, find and print the string with the maximum length. If multiple strings share the maximum length, print the one that appears first.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

### Output Format

Print the longest string.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 100
```

### Sample Input 1

```text
4
cat
elephant
dog
crocodile
```

### Sample Output 1

```text
crocodile
```

### Sample Input 2

```text
3
hi
bye
ok
```

### Sample Output 2

```text
bye
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String longestString(LinkedList<String> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        System.out.println(Result.longestString(list));
    }
}
```


# 4. Find the Shortest String

Given a `LinkedList<String>`, find and print the string with the minimum length. If multiple strings share the minimum length, print the one that appears first.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

### Output Format

Print the shortest string.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 100
```

### Sample Input 1

```text
4
cat
elephant
dog
ox
```

### Sample Output 1

```text
ox
```

### Sample Input 2

```text
3
apple
kiwi
fig
```

### Sample Output 2

```text
fig
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String shortestString(LinkedList<String> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        System.out.println(Result.shortestString(list));
    }
}
```


# 5. Count Total Number of Characters

Given a `LinkedList<String>`, find the total number of characters across all strings combined.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

### Output Format

Print the total character count.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 100
```

### Sample Input 1

```text
3
cat
dog
fish
```

### Sample Output 1

```text
10
```

### Sample Input 2

```text
2
hello
world
```

### Sample Output 2

```text
10
```

### Predefined Code

```java
import java.util.*;

class Result {
    static int totalCharacters(LinkedList<String> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        System.out.println(Result.totalCharacters(list));
    }
}
```


# 6. Search a String in the LinkedList

Given a `LinkedList<String>` and a target string, determine whether the target is present.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

The next line contains the target string.

### Output Format

Print `true` if the target exists; otherwise print `false`.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 20
```

### Sample Input 1

```text
4
apple
mango
kiwi
pear
kiwi
```

### Sample Output 1

```text
true
```

### Sample Input 2

```text
3
cat
dog
cow
lion
```

### Sample Output 2

```text
false
```

### Predefined Code

```java
import java.util.*;

class Result {
    static boolean search(LinkedList<String> list, String target) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        String target = s.nextLine().trim();

        System.out.println(Result.search(list, target));
    }
}
```


# 7. Find the First Occurrence Index of a String

Given a `LinkedList<String>`, find the index of the first occurrence of a given string.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

The next line contains the target string.

### Output Format

Print the index of the first occurrence. If not present, print `-1`.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 20
```

### Sample Input 1

```text
6
red
blue
green
blue
red
blue
blue
```

### Sample Output 1

```text
1
```

### Sample Input 2

```text
3
a
b
c
z
```

### Sample Output 2

```text
-1
```

### Predefined Code

```java
import java.util.*;

class Result {
    static int firstOccurrence(LinkedList<String> list, String target) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        String target = s.nextLine().trim();

        System.out.println(Result.firstOccurrence(list, target));
    }
}
```


# 8. Find the Last Occurrence Index of a String

Given a `LinkedList<String>`, find the index of the last occurrence of a given string.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

The next line contains the target string.

### Output Format

Print the index of the last occurrence. If not present, print `-1`.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 20
```

### Sample Input 1

```text
6
red
blue
green
blue
red
blue
blue
```

### Sample Output 1

```text
5
```

### Sample Input 2

```text
3
a
b
c
z
```

### Sample Output 2

```text
-1
```

### Predefined Code

```java
import java.util.*;

class Result {
    static int lastOccurrence(LinkedList<String> list, String target) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        String target = s.nextLine().trim();

        System.out.println(Result.lastOccurrence(list, target));
    }
}
```


# 9. Count Occurrences of a Given String

Given a `LinkedList<String>`, count how many times a given string occurs.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

The next line contains the target string.

### Output Format

Print the number of occurrences of the target string.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 20
```

### Sample Input 1

```text
6
red
blue
green
blue
red
blue
blue
```

### Sample Output 1

```text
3
```

### Sample Input 2

```text
4
a
b
c
d
z
```

### Sample Output 2

```text
0
```

### Predefined Code

```java
import java.util.*;

class Result {
    static int countOccurrences(LinkedList<String> list, String target) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        String target = s.nextLine().trim();

        System.out.println(Result.countOccurrences(list, target));
    }
}
```


# 10. Remove the First Occurrence of a String

Given a `LinkedList<String>`, remove only the first occurrence of a given string.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

The next line contains the target string.

### Output Format

Print the modified LinkedList, space separated.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 20
```

### Sample Input 1

```text
5
red
blue
red
green
red
red
```

### Sample Output 1

```text
blue red green red
```

### Sample Input 2

```text
3
a
b
c
z
```

### Sample Output 2

```text
a b c
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String removeFirstOccurrence(LinkedList<String> list, String target) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        String target = s.nextLine().trim();

        System.out.println(Result.removeFirstOccurrence(list, target));
    }
}
```


# 11. Remove All Occurrences of a String

Given a `LinkedList<String>`, remove all occurrences of a given string.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

The next line contains the target string.

### Output Format

Print the modified LinkedList, space separated.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 20
```

### Sample Input 1

```text
5
red
blue
red
green
red
red
```

### Sample Output 1

```text
blue green
```

### Sample Input 2

```text
3
a
b
c
z
```

### Sample Output 2

```text
a b c
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String removeAllOccurrences(LinkedList<String> list, String target) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        String target = s.nextLine().trim();

        System.out.println(Result.removeAllOccurrences(list, target));
    }
}
```


# 12. Find Strings Starting with a Given Character

Given a `LinkedList<String>` and a character `C`, find all strings that start with `C`, preserving order.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

The next line contains the character `C`.

### Output Format

Print all matching strings, space separated. If none match, print nothing.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 20
```

### Sample Input 1

```text
5
apple
banana
avocado
cherry
apricot
a
```

### Sample Output 1

```text
apple avocado apricot
```

### Sample Input 2

```text
3
dog
cat
cow
z
```

### Sample Output 2

```text
```


### Predefined Code

```java
import java.util.*;

class Result {
    static String startsWithChar(LinkedList<String> list, char C) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        char C = s.nextLine().trim().charAt(0);

        System.out.println(Result.startsWithChar(list, C));
    }
}
```


# 13. Find Strings Ending with a Given Character

Given a `LinkedList<String>` and a character `C`, find all strings that end with `C`, preserving order.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

The next line contains the character `C`.

### Output Format

Print all matching strings, space separated. If none match, print nothing.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 20
```

### Sample Input 1

```text
5
cat
dog
bat
rat
cow
t
```

### Sample Output 1

```text
cat bat rat
```

### Sample Input 2

```text
3
sun
moon
star
z
```

### Sample Output 2

```text
```


### Predefined Code

```java
import java.util.*;

class Result {
    static String endsWithChar(LinkedList<String> list, char C) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        char C = s.nextLine().trim().charAt(0);

        System.out.println(Result.endsWithChar(list, C));
    }
}
```


# 14. Count Strings Containing a Given Substring

Given a `LinkedList<String>` and a substring, count how many strings contain that substring.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

The next line contains the substring.

### Output Format

Print the count of strings containing the given substring.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 50
```

### Sample Input 1

```text
5
programming
program
grammar
diagram
gram
gram
```

### Sample Output 1

```text
5
```

### Sample Input 2

```text
3
apple
mango
kiwi
xyz
```

### Sample Output 2

```text
0
```

### Predefined Code

```java
import java.util.*;

class Result {
    static int countContainingSubstring(LinkedList<String> list, String sub) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        String sub = s.nextLine().trim();

        System.out.println(Result.countContainingSubstring(list, sub));
    }
}
```


# 15. Convert All Strings to Uppercase

Given a `LinkedList<String>`, convert every string to uppercase.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

### Output Format

Print the modified LinkedList, space separated.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 20
```

### Sample Input 1

```text
3
apple
Mango
kiWi
```

### Sample Output 1

```text
APPLE MANGO KIWI
```

### Sample Input 2

```text
2
Hello
world
```

### Sample Output 2

```text
HELLO WORLD
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String toUpperAll(LinkedList<String> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        System.out.println(Result.toUpperAll(list));
    }
}
```


# 16. Convert All Strings to Lowercase

Given a `LinkedList<String>`, convert every string to lowercase.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

### Output Format

Print the modified LinkedList, space separated.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 20
```

### Sample Input 1

```text
3
APPLE
Mango
kiWi
```

### Sample Output 1

```text
apple mango kiwi
```

### Sample Input 2

```text
2
HELLO
World
```

### Sample Output 2

```text
hello world
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String toLowerAll(LinkedList<String> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        System.out.println(Result.toLowerAll(list));
    }
}
```


# 17. Reverse the LinkedList

Given a `LinkedList<String>`, reverse the order of the elements.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

### Output Format

Print the reversed LinkedList, space separated.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 20
```

### Sample Input 1

```text
4
apple
mango
kiwi
pear
```

### Sample Output 1

```text
pear kiwi mango apple
```

### Sample Input 2

```text
3
cat
dog
cow
```

### Sample Output 2

```text
cow dog cat
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String reverseList(LinkedList<String> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        System.out.println(Result.reverseList(list));
    }
}
```


# 18. Reverse Each String in the List

Given a `LinkedList<String>`, reverse each individual string while keeping the order of the list unchanged.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

### Output Format

Print the modified LinkedList, space separated.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 50
```

### Sample Input 1

```text
3
cat
hello
abc
```

### Sample Output 1

```text
tac olleh cba
```

### Sample Input 2

```text
2
sun
moon
```

### Sample Output 2

```text
nus noom
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String reverseEachString(LinkedList<String> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        System.out.println(Result.reverseEachString(list));
    }
}
```


# 19. Sort Strings in Ascending (Alphabetical) Order

Given a `LinkedList<String>`, sort it alphabetically in ascending order.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

### Output Format

Print the sorted LinkedList, space separated.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 20
```

### Sample Input 1

```text
4
banana
apple
cherry
date
```

### Sample Output 1

```text
apple banana cherry date
```

### Sample Input 2

```text
3
dog
cat
bird
```

### Sample Output 2

```text
bird cat dog
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String sortAscending(LinkedList<String> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        System.out.println(Result.sortAscending(list));
    }
}
```


# 20. Sort Strings in Descending (Reverse Alphabetical) Order

Given a `LinkedList<String>`, sort it alphabetically in descending order.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

### Output Format

Print the sorted LinkedList, space separated.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 20
```

### Sample Input 1

```text
4
banana
apple
cherry
date
```

### Sample Output 1

```text
date cherry banana apple
```

### Sample Input 2

```text
3
dog
cat
bird
```

### Sample Output 2

```text
dog cat bird
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String sortDescending(LinkedList<String> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        System.out.println(Result.sortDescending(list));
    }
}
```


# 21. Sort Strings by Length

Given a `LinkedList<String>`, sort it by string length in ascending order. If two strings have the same length, maintain their original relative order.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

### Output Format

Print the sorted LinkedList, space separated.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 50
```

### Sample Input 1

```text
4
banana
kiwi
fig
apple
```

### Sample Output 1

```text
fig kiwi apple banana
```

### Sample Input 2

```text
3
a
bb
ccc
```

### Sample Output 2

```text
a bb ccc
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String sortByLength(LinkedList<String> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        System.out.println(Result.sortByLength(list));
    }
}
```


# 22. Remove Duplicate Strings

Given a `LinkedList<String>`, remove duplicate strings while preserving the order of their first occurrence.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

### Output Format

Print the LinkedList after removing duplicates, space separated.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 20
```

### Sample Input 1

```text
6
apple
mango
apple
kiwi
mango
pear
```

### Sample Output 1

```text
apple mango kiwi pear
```

### Sample Input 2

```text
3
cat
dog
cow
```

### Sample Output 2

```text
cat dog cow
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String removeDuplicates(LinkedList<String> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        System.out.println(Result.removeDuplicates(list));
    }
}
```


# 23. Find Duplicate Strings

Given a `LinkedList<String>`, find all strings that occur more than once, printed in the order they first repeat, without duplicates in the output.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

### Output Format

Print all duplicate strings, space separated. If none, print nothing.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 20
```

### Sample Input 1

```text
6
apple
mango
apple
kiwi
mango
mango
```

### Sample Output 1

```text
apple mango
```

### Sample Input 2

```text
3
cat
dog
cow
```

### Sample Output 2

```text
```


### Predefined Code

```java
import java.util.*;

class Result {
    static String findDuplicates(LinkedList<String> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        System.out.println(Result.findDuplicates(list));
    }
}
```


# 24. Merge Two LinkedLists of Strings

Given two `LinkedList<String>` objects, merge them into a single LinkedList, with the first list's elements followed by the second list's elements.

### Input Format

The first line contains `N1`, the size of the first list.

The next `N1` lines contain the first list's strings.

The next line contains `N2`, the size of the second list.

The next `N2` lines contain the second list's strings.

### Output Format

Print the merged LinkedList, space separated.

### Constraints

```text
1 <= N1, N2 <= 10^5
1 <= length of each string <= 20
```

### Sample Input 1

```text
2
apple
mango
3
kiwi
pear
grape
```

### Sample Output 1

```text
apple mango kiwi pear grape
```

### Sample Input 2

```text
1
cat
1
dog
```

### Sample Output 2

```text
cat dog
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String merge(LinkedList<String> list1, LinkedList<String> list2) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N1 = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list1 = new LinkedList<>();
        for (int i = 0; i < N1; i++) {
            list1.add(s.nextLine().trim());
        }

        int N2 = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list2 = new LinkedList<>();
        for (int i = 0; i < N2; i++) {
            list2.add(s.nextLine().trim());
        }

        System.out.println(Result.merge(list1, list2));
    }
}
```


# 25. Find Common Strings Between Two LinkedLists

Given two `LinkedList<String>` objects, find the strings that are common to both, in the order they appear in the first list, without duplicates.

### Input Format

The first line contains `N1`.

The next `N1` lines contain the first list's strings.

The next line contains `N2`.

The next `N2` lines contain the second list's strings.

### Output Format

Print the common strings, space separated. If none, print nothing.

### Constraints

```text
1 <= N1, N2 <= 10^5
1 <= length of each string <= 20
```

### Sample Input 1

```text
4
apple
mango
kiwi
pear
3
mango
pear
grape
```

### Sample Output 1

```text
mango pear
```

### Sample Input 2

```text
2
cat
dog
2
cow
lion
```

### Sample Output 2

```text
```


### Predefined Code

```java
import java.util.*;

class Result {
    static String commonStrings(LinkedList<String> list1, LinkedList<String> list2) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N1 = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list1 = new LinkedList<>();
        for (int i = 0; i < N1; i++) {
            list1.add(s.nextLine().trim());
        }

        int N2 = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list2 = new LinkedList<>();
        for (int i = 0; i < N2; i++) {
            list2.add(s.nextLine().trim());
        }

        System.out.println(Result.commonStrings(list1, list2));
    }
}
```


# 26. Find Strings Present in the First List but Not the Second

Given two `LinkedList<String>` objects, find all strings that are present in the first list but not in the second, preserving order and without duplicates.

### Input Format

The first line contains `N1`.

The next `N1` lines contain the first list's strings.

The next line contains `N2`.

The next `N2` lines contain the second list's strings.

### Output Format

Print the resulting strings, space separated. If none, print nothing.

### Constraints

```text
1 <= N1, N2 <= 10^5
1 <= length of each string <= 20
```

### Sample Input 1

```text
4
apple
mango
kiwi
pear
2
mango
pear
```

### Sample Output 1

```text
apple kiwi
```

### Sample Input 2

```text
2
cat
dog
2
cat
dog
```

### Sample Output 2

```text
```


### Predefined Code

```java
import java.util.*;

class Result {
    static String difference(LinkedList<String> list1, LinkedList<String> list2) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N1 = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list1 = new LinkedList<>();
        for (int i = 0; i < N1; i++) {
            list1.add(s.nextLine().trim());
        }

        int N2 = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list2 = new LinkedList<>();
        for (int i = 0; i < N2; i++) {
            list2.add(s.nextLine().trim());
        }

        System.out.println(Result.difference(list1, list2));
    }
}
```


# 27. Count Total Vowels Across All Strings

Given a `LinkedList<String>`, count the total number of vowels (a, e, i, o, u — case insensitive) across all strings.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

### Output Format

Print the total vowel count.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 100
```

### Sample Input 1

```text
3
apple
sky
orange
```

### Sample Output 1

```text
6
```

### Sample Input 2

```text
2
Hello
World
```

### Sample Output 2

```text
3
```

### Predefined Code

```java
import java.util.*;

class Result {
    static int countVowels(LinkedList<String> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        System.out.println(Result.countVowels(list));
    }
}
```


# 28. Filter Palindromic Strings

Given a `LinkedList<String>`, create a new LinkedList containing only the strings that are palindromes, in their original order.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

### Output Format

Print all palindromic strings, space separated. If none, print nothing.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 50
```

### Sample Input 1

```text
5
madam
apple
level
mango
racecar
```

### Sample Output 1

```text
madam level racecar
```

### Sample Input 2

```text
3
cat
dog
cow
```

### Sample Output 2

```text
```


### Predefined Code

```java
import java.util.*;

class Result {
    static String filterPalindromes(LinkedList<String> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        System.out.println(Result.filterPalindromes(list));
    }
}
```


# 29. Check if the LinkedList Itself is a Palindrome

Given a `LinkedList<String>`, determine whether the sequence of strings reads the same forward and backward (i.e., the list itself is a palindrome).

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

### Output Format

Print `true` if the list is a palindrome; otherwise print `false`.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 20
```

### Sample Input 1

```text
5
cat
dog
bird
dog
cat
```

### Sample Output 1

```text
true
```

### Sample Input 2

```text
4
cat
dog
bird
fish
```

### Sample Output 2

```text
false
```

### Predefined Code

```java
import java.util.*;

class Result {
    static boolean isPalindromeList(LinkedList<String> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        System.out.println(Result.isPalindromeList(list));
    }
}
```


# 30. Find Anagram Pairs in the List

Given a `LinkedList<String>`, count the number of unordered pairs of strings that are anagrams of each other.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

### Output Format

Print the number of anagram pairs.

### Constraints

```text
1 <= N <= 10^4
1 <= length of each string <= 20
```

### Sample Input 1

```text
4
listen
silent
enlist
apple
```

### Sample Output 1

```text
3
```

### Sample Input 2

```text
3
cat
dog
cow
```

### Sample Output 2

```text
0
```

### Predefined Code

```java
import java.util.*;

class Result {
    static int countAnagramPairs(LinkedList<String> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        System.out.println(Result.countAnagramPairs(list));
    }
}
```


# 31. Find the Most Frequent String

Given a `LinkedList<String>`, find the string that occurs most frequently. If multiple strings share the maximum frequency, return the one whose first occurrence appears earliest.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

### Output Format

Print the most frequent string.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 20
```

### Sample Input 1

```text
7
red
blue
red
green
blue
red
yellow
```

### Sample Output 1

```text
red
```

### Sample Input 2

```text
4
cat
dog
cat
dog
```

### Sample Output 2

```text
cat
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String mostFrequentString(LinkedList<String> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        System.out.println(Result.mostFrequentString(list));
    }
}
```


# 32. Concatenate All Strings into One

Given a `LinkedList<String>`, concatenate all the strings together (no separators) into a single string.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

### Output Format

Print the concatenated string.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 100
```

### Sample Input 1

```text
3
hello
world
end
```

### Sample Output 1

```text
helloworldend
```

### Sample Input 2

```text
2
foo
bar
```

### Sample Output 2

```text
foobar
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String concatenateAll(LinkedList<String> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        System.out.println(Result.concatenateAll(list));
    }
}
```


# 33. Filter Strings with Length Greater Than a Given Value

Given a `LinkedList<String>` and an integer `K`, create a new LinkedList containing only the strings with length strictly greater than `K`, preserving order.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

The next line contains `K`.

### Output Format

Print the filtered strings, space separated. If none, print nothing.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 50
0 <= K <= 50
```

### Sample Input 1

```text
5
cat
elephant
dog
crocodile
ox
3
```

### Sample Output 1

```text
elephant crocodile
```

### Sample Input 2

```text
3
a
bb
ccc
10
```

### Sample Output 2

```text
```


### Predefined Code

```java
import java.util.*;

class Result {
    static String filterByLength(LinkedList<String> list, int K) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        int K = Integer.parseInt(s.nextLine().trim());

        System.out.println(Result.filterByLength(list, K));
    }
}
```


# 34. Remove Short Strings Using an Iterator

Given a `LinkedList<String>` and an integer `K`, use an `Iterator` to safely remove all strings whose length is strictly less than `K`.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

The next line contains `K`.

### Output Format

Print the modified LinkedList, space separated.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 50
0 <= K <= 50
```

### Sample Input 1

```text
5
cat
elephant
dog
crocodile
ox
4
```

### Sample Output 1

```text
elephant crocodile
```

### Sample Input 2

```text
3
apple
kiwi
fig
2
```

### Sample Output 2

```text
apple kiwi fig
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String removeShortStrings(LinkedList<String> list, int K) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        int K = Integer.parseInt(s.nextLine().trim());

        System.out.println(Result.removeShortStrings(list, K));
    }
}
```


# 35. Find the Second Longest Distinct String

Given a `LinkedList<String>`, find the string with the second largest distinct length. If it does not exist, print `"NONE"`.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

### Output Format

Print the string having the second largest distinct length, or `NONE`.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 100
```

### Sample Input 1

```text
4
cat
elephant
dog
crocodile
```

### Sample Output 1

```text
crocodile
```

### Sample Input 2

```text
3
cat
dog
cow
```

### Sample Output 2

```text
NONE
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String secondLongestDistinct(LinkedList<String> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        System.out.println(Result.secondLongestDistinct(list));
    }
}
```


# 36. Count Numeric Strings

Given a `LinkedList<String>`, count the strings that consist entirely of digits.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

### Output Format

Print the count of purely numeric strings.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 20
```

### Sample Input 1

```text
5
123
abc
456
a1b2
789
```

### Sample Output 1

```text
3
```

### Sample Input 2

```text
3
hello
world
foo
```

### Sample Output 2

```text
0
```

### Predefined Code

```java
import java.util.*;

class Result {
    static int countNumericStrings(LinkedList<String> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        System.out.println(Result.countNumericStrings(list));
    }
}
```


# 37. Find the String at a Given Index

Given a `LinkedList<String>` and an index, print the string stored at that index using `get()`. If the index is invalid, print `"INVALID"`.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

The next line contains the index.

### Output Format

Print the string at the specified index, or `INVALID`.

### Constraints

```text
1 <= N <= 10^5
0 <= index <= 10^6
```

### Sample Input 1

```text
5
apple
mango
kiwi
pear
grape
3
```

### Sample Output 1

```text
pear
```

### Sample Input 2

```text
3
cat
dog
cow
10
```

### Sample Output 2

```text
INVALID
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String getElement(LinkedList<String> list, int index) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        int index = Integer.parseInt(s.nextLine().trim());

        System.out.println(Result.getElement(list, index));
    }
}
```


# 38. Insert a String at a Specific Position

Given a `LinkedList<String>`, a string `X`, and a position `P`, insert `X` at position `P` (0-indexed) in the list.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

The next line contains `X`.

The next line contains `P`.

### Output Format

Print the modified LinkedList, space separated.

### Constraints

```text
1 <= N <= 10^5
0 <= P <= N
```

### Sample Input 1

```text
4
apple
mango
kiwi
pear
grape
2
```

### Sample Output 1

```text
apple mango grape kiwi pear
```

### Sample Input 2

```text
3
cat
dog
cow
lion
0
```

### Sample Output 2

```text
lion cat dog cow
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String insertAtPosition(LinkedList<String> list, String X, int P) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        String X = s.nextLine().trim();
        int P = Integer.parseInt(s.nextLine().trim());

        System.out.println(Result.insertAtPosition(list, X, P));
    }
}
```


# 39. Find Strings that are Substrings of a Given Word

Given a `LinkedList<String>` and a word `W`, find all strings in the list that occur as a substring inside `W`, preserving order.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

The next line contains the word `W`.

### Output Format

Print all matching strings, space separated. If none, print nothing.

### Constraints

```text
1 <= N <= 10^5
1 <= length of each string <= 20
1 <= length of W <= 1000
```

### Sample Input 1

```text
5
pro
gram
diagram
gramm
xyz
programming
```

### Sample Output 1

```text
pro gram
```

### Sample Input 2

```text
3
cat
dog
cow
elephant
```

### Sample Output 2

```text
```


### Predefined Code

```java
import java.util.*;

class Result {
    static String findSubstringsOfWord(LinkedList<String> list, String W) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        String W = s.nextLine().trim();

        System.out.println(Result.findSubstringsOfWord(list, W));
    }
}
```


# 40. Word Frequency Count from a Sentence

A sentence is split by spaces and each word is stored in a `LinkedList<String>`. For a given word, count how many times it appears in the sentence (case-insensitive).

### Input Format

The first line contains the sentence (space separated words).

The second line contains the target word.

### Output Format

Print the frequency count of the target word in the sentence.

### Constraints

```text
1 <= number of words <= 10^5
1 <= length of each word <= 20
```

### Sample Input 1

```text
the quick brown fox jumps over the lazy dog the fox runs
fox
```

### Sample Output 1

```text
2
```

### Sample Input 2

```text
Hello world hello World HELLO
hello
```

### Sample Output 2

```text
3
```

### Predefined Code

```java
import java.util.*;

class Result {
    static int wordFrequency(LinkedList<String> words, String target) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        String sentence = s.nextLine().trim();
        LinkedList<String> words = new LinkedList<>(Arrays.asList(sentence.split("\\s+")));

        String target = s.nextLine().trim();

        System.out.println(Result.wordFrequency(words, target));
    }
}
```
# 41. String Compression (Run-Length Encoding)

Given a string, compress it by replacing consecutive repeated characters with the character followed by its count. If a character occurs only once consecutively, print it without a count. Store each character of the string in a `LinkedList<Character>` before processing.

### Input Format

A single line containing the string.

### Output Format

Print the compressed string.

### Constraints

```text
1 <= length of string <= 10^5
string contains only lowercase letters
```

### Sample Input 1

```text
aaabbcdd
```

### Sample Output 1

```text
a3b2cd2
```

### Sample Input 2

```text
abcd
```

### Sample Output 2

```text
abcd
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String compress(LinkedList<Character> chars) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine().trim();
        LinkedList<Character> chars = new LinkedList<>();
        for (char c : str.toCharArray()) {
            chars.add(c);
        }

        System.out.println(Result.compress(chars));
    }
}
```


# 42. String Decompression (Decode Run-Length Encoded String)

Given a run-length encoded string (a letter optionally followed by a count, count omitted means 1), decode it back to the original string.

### Input Format

A single line containing the encoded string.

### Output Format

Print the decoded string.

### Constraints

```text
1 <= length of encoded string <= 10^5
counts are between 1 and 9
```

### Sample Input 1

```text
a3b2cd2
```

### Sample Output 1

```text
aaabbcdd
```

### Sample Input 2

```text
xyz
```

### Sample Output 2

```text
xyz
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String decompress(LinkedList<Character> chars) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine().trim();
        LinkedList<Character> chars = new LinkedList<>();
        for (char c : str.toCharArray()) {
            chars.add(c);
        }

        System.out.println(Result.decompress(chars));
    }
}
```


# 43. Remove Consecutive Duplicate Characters

Given a string, remove consecutive duplicate characters so that each character appears only once in a run.

### Input Format

A single line containing the string.

### Output Format

Print the string after removing consecutive duplicates.

### Constraints

```text
1 <= length of string <= 10^5
```

### Sample Input 1

```text
aaabbbccd
```

### Sample Output 1

```text
abcd
```

### Sample Input 2

```text
aabccba
```

### Sample Output 2

```text
abcba
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String removeConsecutiveDuplicates(LinkedList<Character> chars) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine().trim();
        LinkedList<Character> chars = new LinkedList<>();
        for (char c : str.toCharArray()) {
            chars.add(c);
        }

        System.out.println(Result.removeConsecutiveDuplicates(chars));
    }
}
```


# 44. Find the First Non-Repeating Character

Given a string, find the first character that does not repeat anywhere else in the string. If no such character exists, print `-1`.

### Input Format

A single line containing the string.

### Output Format

Print the first non-repeating character, or `-1` if none exists.

### Constraints

```text
1 <= length of string <= 10^5
```

### Sample Input 1

```text
swiss
```

### Sample Output 1

```text
w
```

### Sample Input 2

```text
aabbcc
```

### Sample Output 2

```text
-1
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String firstNonRepeating(LinkedList<Character> chars) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine().trim();
        LinkedList<Character> chars = new LinkedList<>();
        for (char c : str.toCharArray()) {
            chars.add(c);
        }

        System.out.println(Result.firstNonRepeating(chars));
    }
}
```


# 45. Check if Two Strings are Anagrams

Given two strings, store their characters in separate `LinkedList<Character>` objects and determine whether the two strings are anagrams of each other.

### Input Format

The first line contains the first string.

The second line contains the second string.

### Output Format

Print `true` if the strings are anagrams; otherwise print `false`.

### Constraints

```text
1 <= length of each string <= 10^5
```

### Sample Input 1

```text
listen
silent
```

### Sample Output 1

```text
true
```

### Sample Input 2

```text
hello
world
```

### Sample Output 2

```text
false
```

### Predefined Code

```java
import java.util.*;

class Result {
    static boolean areAnagrams(LinkedList<Character> chars1, LinkedList<Character> chars2) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        String str1 = s.nextLine().trim();
        String str2 = s.nextLine().trim();

        LinkedList<Character> chars1 = new LinkedList<>();
        for (char c : str1.toCharArray()) chars1.add(c);

        LinkedList<Character> chars2 = new LinkedList<>();
        for (char c : str2.toCharArray()) chars2.add(c);

        System.out.println(Result.areAnagrams(chars1, chars2));
    }
}
```


# 46. Group Anagrams Together

Given a `LinkedList<String>`, group the strings that are anagrams of each other. Print each group on its own line, in the order groups first appear; within a group, preserve the original order of strings.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

### Output Format

Print each anagram group on its own line, space separated.

### Constraints

```text
1 <= N <= 10^4
1 <= length of each string <= 20
```

### Sample Input 1

```text
6
eat
tea
tan
ate
nat
bat
```

### Sample Output 1

```text
eat tea ate
tan nat
bat
```

### Sample Input 2

```text
3
cat
dog
tac
```

### Sample Output 2

```text
cat tac
dog
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String groupAnagrams(LinkedList<String> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        System.out.println(Result.groupAnagrams(list));
    }
}
```


# 47. Check if a String is a Rotation of Another String

Given two strings, determine whether the second string is a rotation of the first string.

### Input Format

The first line contains the first string.

The second line contains the second string.

### Output Format

Print `true` if the second string is a rotation of the first; otherwise print `false`.

### Constraints

```text
1 <= length of each string <= 10^5
```

### Sample Input 1

```text
waterbottle
erbottlewat
```

### Sample Output 1

```text
true
```

### Sample Input 2

```text
hello
lohel
```

### Sample Output 2

```text
true
```

### Predefined Code

```java
import java.util.*;

class Result {
    static boolean isRotation(String str1, String str2) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        String str1 = s.nextLine().trim();
        String str2 = s.nextLine().trim();

        System.out.println(Result.isRotation(str1, str2));
    }
}
```


# 48. Reverse the Words of a Sentence (Using a LinkedList)

Given a sentence, split it into words and store them in a `LinkedList<String>`. Reverse the order of the words and print the resulting sentence.

### Input Format

A single line containing the sentence.

### Output Format

Print the sentence with word order reversed.

### Constraints

```text
1 <= number of words <= 10^4
1 <= length of each word <= 20
```

### Sample Input 1

```text
the sky is blue
```

### Sample Output 1

```text
blue is sky the
```

### Sample Input 2

```text
hello world
```

### Sample Output 2

```text
world hello
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String reverseWords(LinkedList<String> words) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        String sentence = s.nextLine().trim();
        LinkedList<String> words = new LinkedList<>(Arrays.asList(sentence.split("\\s+")));

        System.out.println(Result.reverseWords(words));
    }
}
```


# 49. Find the Longest Common Prefix

Given a `LinkedList<String>`, find the longest common prefix shared by all strings. If there is none, print an empty line.

### Input Format

The first line contains `N`.

The next `N` lines contain the strings.

### Output Format

Print the longest common prefix.

### Constraints

```text
1 <= N <= 10^4
1 <= length of each string <= 100
```

### Sample Input 1

```text
3
flower
flow
flight
```

### Sample Output 1

```text
fl
```

### Sample Input 2

```text
3
dog
cat
cow
```

### Sample Output 2

```text
```


### Predefined Code

```java
import java.util.*;

class Result {
    static String longestCommonPrefix(LinkedList<String> list) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextLine().trim());
        }

        System.out.println(Result.longestCommonPrefix(list));
    }
}
```


# 50. Check if a String Can Be Rearranged into a Palindrome

Given a string, determine whether its characters can be rearranged to form a palindrome.

### Input Format

A single line containing the string.

### Output Format

Print `true` if the string can be rearranged into a palindrome; otherwise print `false`.

### Constraints

```text
1 <= length of string <= 10^5
```

### Sample Input 1

```text
carrace
```

### Sample Output 1

```text
true
```

### Sample Input 2

```text
hello
```

### Sample Output 2

```text
false
```

### Predefined Code

```java
import java.util.*;

class Result {
    static boolean canFormPalindrome(LinkedList<Character> chars) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine().trim();
        LinkedList<Character> chars = new LinkedList<>();
        for (char c : str.toCharArray()) {
            chars.add(c);
        }

        System.out.println(Result.canFormPalindrome(chars));
    }
}
```


# 51. Count and Say Sequence

The count-and-say sequence starts with `"1"`. Each subsequent term is generated by reading off the digits of the previous term, counting consecutive identical digits (e.g., `"1"` → `"11"` → `"21"` → `"1211"` → `"111221"`). Given `N`, print the N-th term.

### Input Format

A single integer `N`.

### Output Format

Print the N-th term of the count-and-say sequence.

### Constraints

```text
1 <= N <= 30
```

### Sample Input 1

```text
4
```

### Sample Output 1

```text
1211
```

### Sample Input 2

```text
1
```

### Sample Output 2

```text
1
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String countAndSay(int N) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine().trim());

        System.out.println(Result.countAndSay(N));
    }
}
```


# 52. Toggle Case of Each Character

Given a string, toggle the case of every alphabetic character (uppercase becomes lowercase and vice versa). Non-alphabetic characters remain unchanged.

### Input Format

A single line containing the string.

### Output Format

Print the string with each character's case toggled.

### Constraints

```text
1 <= length of string <= 10^5
```

### Sample Input 1

```text
Hello World123
```

### Sample Output 1

```text
hELLO wORLD123
```

### Sample Input 2

```text
JAVA
```

### Sample Output 2

```text
java
```

### Predefined Code

```java
import java.util.*;

class Result {
    static String toggleCase(LinkedList<Character> chars) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        LinkedList<Character> chars = new LinkedList<>();
        for (char c : str.toCharArray()) {
            chars.add(c);
        }

        System.out.println(Result.toggleCase(chars));
    }
}
```


# 53. Check for Balanced Parentheses

Given a string containing only the characters `(`, `)`, `{`, `}`, `[`, `]`, store each character in a `LinkedList<Character>` and determine whether the parentheses are balanced (every opening bracket has a matching closing bracket in the correct order).

### Input Format

A single line containing the string.

### Output Format

Print `true` if balanced; otherwise print `false`.

### Constraints

```text
1 <= length of string <= 10^5
```

### Sample Input 1

```text
{[()]}
```

### Sample Output 1

```text
true
```

### Sample Input 2

```text
{[(])}
```

### Sample Output 2

```text
false
```

### Predefined Code

```java
import java.util.*;

class Result {
    static boolean isBalanced(LinkedList<Character> chars) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine().trim();
        LinkedList<Character> chars = new LinkedList<>();
        for (char c : str.toCharArray()) {
            chars.add(c);
        }

        System.out.println(Result.isBalanced(chars));
    }
}
```


# 54. Length of the Longest Substring Without Repeating Characters

Given a string, find the length of the longest substring that does not contain any repeating characters.

### Input Format

A single line containing the string.

### Output Format

Print the length of the longest substring without repeating characters.

### Constraints

```text
1 <= length of string <= 10^5
```

### Sample Input 1

```text
abcabcbb
```

### Sample Output 1

```text
3
```

### Sample Input 2

```text
bbbbb
```

### Sample Output 2

```text
1
```

### Predefined Code

```java
import java.util.*;

class Result {
    static int longestUniqueSubstring(LinkedList<Character> chars) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine().trim();
        LinkedList<Character> chars = new LinkedList<>();
        for (char c : str.toCharArray()) {
            chars.add(c);
        }

        System.out.println(Result.longestUniqueSubstring(chars));
    }
}
```


# Exam Pattern Coverage

The question set covers the major LinkedList (String-based) coding patterns that can be formed in this format:

- Creating and traversing a LinkedList
- addFirst / addLast operations
- Longest and shortest string
- Total character count
- Searching with `contains`
- First and last occurrence
- Counting occurrences
- Removing one/all occurrences
- Prefix/suffix character filtering
- Substring containment counting
- Case conversion (upper/lower)
- Reversing the list vs reversing each string
- Sorting alphabetically (ascending/descending) and by length
- Duplicate detection and removal
- Merging two LinkedLists
- Finding common elements and differences between two lists
- Vowel counting
- Palindromic string filtering
- List-level palindrome checking
- Anagram pair detection
- Frequency-based problems
- String concatenation
- Threshold-based length filtering
- Safe removal using an Iterator
- Second-largest distinct length string
- Numeric string detection
- Index-based access with `get()`
- Insertion at a specific position
- Substring-of-a-word matching
- Sentence/word frequency scenario questions
- Run-length encoding (string compression)
- Run-length decoding (string decompression)
- Removing consecutive duplicates
- First non-repeating character
- Anagram checking (two strings)
- Grouping anagrams (multiple strings)
- String rotation checking
- Reversing words of a sentence
- Longest common prefix
- Palindrome-rearrangement feasibility
- Count-and-say sequence generation
- Case toggling
- Balanced parentheses / bracket matching
- Longest substring without repeating characters (sliding window)