package String_Program;

public class AllStringMethods
{
    public static void main(String[] args)
    {
        String str = "Hello World";
        String str2 = "hello world";
        String str3 = "   Java Programming   ";

        // length()
        // ➤ Returns total number of characters in the string
        System.out.println("1. Length: " + str.length());
        // OP: 11

        // 2️⃣ charAt()
        // ➤ Used to get a single character from a specific index
        System.out.println("2. Char at index 4: " + str.charAt(4));
        // OP: o

        // 3️⃣ substring()
        // ➤ Used to extract a portion (part) of the string
        System.out.println("3. Substring (0,5): " + str.substring(0, 5));
        // OP: Hello

        // 4️⃣ equals()
        // ➤ Compares two strings (case-sensitive)
        System.out.println("4. Equals: " + str.equals(str2));
        // OP: false

        // 5️⃣ equalsIgnoreCase()
        // ➤ Compares two strings ignoring case (A == a)
        System.out.println("5. Equals Ignore Case: " + str.equalsIgnoreCase(str2));
        // OP: true

        // 6️⃣ compareTo()
        // ➤ Lexicographically compares two strings
        System.out.println("6. Compare To: " + str.compareTo(str2));
        // OP: negative value (because 'H' < 'h')

        // 7️⃣ toUpperCase()
        // ➤ Converts all letters to uppercase
        System.out.println("7. Upper Case: " + str.toUpperCase());
        // OP: HELLO WORLD

        // 8️⃣ toLowerCase()
        // ➤ Converts all letters to lowercase
        System.out.println("8. Lower Case: " + str.toLowerCase());
        // OP: hello world

        // 9️⃣ trim()
        // ➤ Removes extra spaces from beginning and end
        System.out.println("9. Trim: [" + str3.trim() + "]");
        // OP: [Java Programming]

        // 🔟 startsWith()
        // ➤ Checks if string starts with given prefix
        System.out.println("10. Starts With 'He': " + str.startsWith("He"));
        // OP: true

        // 11️⃣ endsWith()
        // ➤ Checks if string ends with given suffix
        System.out.println("11. Ends With 'ld': " + str.endsWith("ld"));
        // OP: true

        // 12️⃣ contains()
        // ➤ Checks if a substring exists in the main string
        System.out.println("12. Contains 'lo': " + str.contains("lo"));
        // OP: true

        // 13️⃣ indexOf()
        // ➤ Returns index (position) of first occurrence of a character
        System.out.println("13. Index of 'o': " + str.indexOf('o'));
        // OP: 4

        // 14️⃣ lastIndexOf()
        // ➤ Returns index of last occurrence of a character
        System.out.println("14. Last Index of 'o': " + str.lastIndexOf('o'));
        // OP: 7

        // 15️⃣ replace()
        // ➤ Replaces one character with another
        System.out.println("15. Replace 'l' with 'x': " + str.replace('l', 'x'));
        // OP: Hexxo Worxd

        // 16️⃣ replaceAll()
        // ➤ Replaces all occurrences using regex or string pattern
        System.out.println("16. ReplaceAll 'o' -> 'O': " + str.replaceAll("o", "O"));
        // OP: HellO WOrld

        // 17️⃣ split()
        // ➤ Splits the string based on given delimiter into parts
        String[] parts = str.split(" ");
        System.out.println("17. Split by space:");
        for (String p : parts) System.out.println("   " + p);
        // OP:
        //   Hello
        //   World

        // 18️⃣ concat()
        // ➤ Joins (adds) two strings together
        System.out.println("18. Concat: " + str.concat(" Java"));
        // OP: Hello World Java

        // 19️⃣ isEmpty()
        // ➤ Checks if string has zero length
        System.out.println("19. Is Empty: " + str.isEmpty());
        // OP: false

        // 20️⃣ join()
        // ➤ Joins multiple strings with a separator
        System.out.println("20. Join: " + String.join("-", "A", "B", "C"));
        // OP: A-B-C

        // 21️⃣ valueOf()
        // ➤ Converts any data type (int, float, etc.) into String
        int num = 123;
        System.out.println("21. valueOf int: " + String.valueOf(num));
        // OP: "123"

        // 22️⃣ toCharArray()
        // ➤ Converts entire string into a character array
        char[] chArr = str.toCharArray();
        System.out.print("22. toCharArray: ");
        for (char c : chArr) System.out.print(c + " ");
        System.out.println();
        // OP: H e l l o   W o r l d

        // 23️⃣ matches()
        // ➤ Checks if string matches a regular expression
        System.out.println("23. matches '.*World': " + str.matches(".*World"));
        // OP: true

        // 24️⃣ intern()
        // ➤ Used for memory optimization — stores string in string pool
        String s1 = new String("Java");
        String s2 = s1.intern();
        System.out.println("24. Intern: " + (s1 == s2));
        // OP: false (different memory reference before interning)

        // 25️⃣ format()
        // ➤ Formats string with placeholders like %s, %d etc.
        String formatted = String.format("25. Name: %s, Age: %d", "Swapnil", 23);
        System.out.println(formatted);
        // OP: Name: Swapnil, Age: 23

        // 26️⃣ repeat()
        // ➤ Repeats the string given number of times
        System.out.println("26. Repeat: " + "Hi ".repeat(3));
        // OP: Hi Hi Hi

        // 27️⃣ strip()
        // ➤ Removes leading and trailing spaces (Unicode-aware)
        System.out.println("27. Strip: [" + str3.strip() + "]");
        // OP: [Java Programming]

        // 28️⃣ stripLeading()
        // ➤ Removes spaces from start only
        System.out.println("28. Strip Leading: [" + str3.stripLeading() + "]");
        // OP: [Java Programming   ]

        // 29️⃣ stripTrailing()
        // ➤ Removes spaces from end only
        System.out.println("29. Strip Trailing: [" + str3.stripTrailing() + "]");
        // OP: [   Java Programming]

        // 30️⃣ compareToIgnoreCase()
        // ➤ Compares strings lexicographically ignoring case
        System.out.println("30. Compare Ignore Case: " + str.compareToIgnoreCase(str2));
        // OP: 0

        // 31️⃣ subSequence()
        // ➤ Returns part of string as CharSequence
        System.out.println("31. SubSequence (0,5): " + str.subSequence(0, 5));
        // OP: Hello

        // 32️⃣ codePointAt()
        // ➤ Returns Unicode (int value) of character at given index
        System.out.println("32. codePointAt(1): " + str.codePointAt(1));
        // OP: 101 (for 'e')

        // 33️⃣ indent()
        // ➤ Adds spaces (indentation) to the beginning of each line
        System.out.println("33. Indent:\n" + str.indent(4));
        // OP: (adds 4 spaces before text)

        // 34️⃣ transform()
        // ➤ Applies a function/lambda to string and returns result
        String result = str.transform(s -> s.toUpperCase());
        System.out.println("34. Transform: " + result);
        // OP: HELLO WORLD

        // 35️⃣ lines()
        // ➤ Breaks string into lines (useful for multi-line text)
        String multi = "One\nTwo\nThree";
        System.out.println("35. Lines:");
        multi.lines().forEach(System.out::println);
        // OP:
        // One
        // Two
        // Three
    }
}
