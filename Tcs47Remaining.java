public class Tcs47Remaining {
}
/*
Here are Java solutions for each of the string manipulation problems you listed:

---

### **1️⃣ Check if a Given String is Palindrome**
```java
public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(rev);
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(isPalindrome(s) ? "Palindrome" : "Not a Palindrome");
    }
}
```

---

### **2️⃣ Count Vowels, Consonants, Spaces in String**
```java
public class VowelConsonantCount {
    public static void countChars(String str) {
        int vowels = 0, consonants = 0, spaces = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) vowels++;
            else if (Character.isLetter(c)) consonants++;
            else if (c == ' ') spaces++;
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants + ", Spaces: " + spaces);
    }

    public static void main(String[] args) {
        countChars("Hello World");
    }
}
```

---

### **3️⃣ Find the ASCII Value of a Character**
```java
public class AsciiValue {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println("ASCII value of " + c + " is " + (int)c);
    }
}
```

---

### **4️⃣ Remove All Vowels from the String**
```java
public class RemoveVowels {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.replaceAll("[AEIOUaeiou]", ""));
    }
}
```

---

### **5️⃣ Remove Spaces from a String**
```java
public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.replace(" ", ""));
    }
}
```

---

### **6️⃣ Remove Characters Except Alphabets**
```java
public class RemoveNonAlphabets {
    public static void main(String[] args) {
        String str = "H3llo W@rld!";
        System.out.println(str.replaceAll("[^a-zA-Z]", ""));
    }
}
```

---

### **7️⃣ Reverse a String**
```java
public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(new StringBuilder(str).reverse().toString());
    }
}
```

---

### **8️⃣ Remove Brackets from an Algebraic Expression**
```java
public class RemoveBrackets {
    public static void main(String[] args) {
        String expr = "(a+b)*c";
        System.out.println(expr.replaceAll("[()]", ""));
    }
}
```

---

### **9️⃣ Sum of the Numbers in a String**
```java
public class SumOfNumbers {
    public static void main(String[] args) {
        String str = "12abc34";
        int sum = 0;
        for (String num : str.split("\\D+")) {
            if (!num.isEmpty()) sum += Integer.parseInt(num);
        }
        System.out.println("Sum: " + sum);
    }
}
```

---

### **🔟 Capitalize First and Last Character of Each Word**
```java
public class CapitalizeFirstLast {
    public static String capitalize(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            int len = word.length();
            if (len > 1)
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1, len - 1))
                      .append(Character.toUpperCase(word.charAt(len - 1)))
                      .append(" ");
            else
                result.append(word.toUpperCase()).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(capitalize("hello world"));
    }
}
```

---

### **1️⃣1️⃣ Frequency of Characters in a String**
```java
import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "hello";
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        System.out.println(freqMap);
    }
}
```

---

### **1️⃣2️⃣ Find Non-Repeating Characters in a String**
```java
import java.util.*;

public class NonRepeatingChars {
    public static void main(String[] args) {
        String str = "swiss";
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        for (char c : countMap.keySet()) {
            if (countMap.get(c) == 1) {
                System.out.println("First non-repeating character: " + c);
                break;
            }
        }
    }
}
```

---

### **1️⃣3️⃣ Check if Two Strings are Anagrams**
```java
import java.util.Arrays;

public class AnagramCheck {
    public static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] arr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent") ? "Anagram" : "Not an Anagram");
    }
}
```

---

### **1️⃣4️⃣ Count Words in a Given String**
```java
public class WordCount {
    public static void main(String[] args) {
        String str = "Hello world, welcome to Java!";
        System.out.println("Word count: " + str.split("\\s+").length);
    }
}
```

---

### **1️⃣5️⃣ Reverse Words in a String**
```java
import java.util.*;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "Hello World";
        List<String> words = Arrays.asList(str.split(" "));
        Collections.reverse(words);
        System.out.println(String.join(" ", words));
    }
}
*/


/*
split("\\s+") → Splits by spaces/tabs/newlines.
split("\\D+") → Extracts numbers only.
split("\\W+") → Extracts words only.
replaceAll("[^a-zA-Z]", "") → Keeps only alphabets.
replaceAll("\\d", "") → Removes all digits.
 */
