//package String_Program;
//
//public class WordOccurrenceCounter
//{
//    public static void main(String[] args)
//    {
//        String str = "hello world hello java world hello";
//    }
//    public static void countWordFrequency (String str)
//    {
//        char[] ch = str.toCharArray();
//   reverseString     int start = 0;
//        for (int i = 0; i < ch.length; i++)
//        {
//            if (i == ch.length || ch[i] ==' ')
//            {
//                String currentWord = extractWord(ch, start, i);
//                if (isProcessed(ch, start)) {
//                    start = i + 1;
//                    continue;
//                }
//                int count = countOccurrences(chars, currentWord);
//                System.out.println(currentWord + " : " + count);
//
//                start = i + 1;
//
//            }
//        }
//
//    }
//    // Create arrays to store words and their counts
//    String[] words = new String[wordCount];
//    int[] counts = new int[wordCount];
//    int uniqueWords = 0;
//
//    // Extract words from string
//    int start = 0;
//    int wordIndex = 0;
//
//        for (int i = 0; i <= chars.length; i++) {
//    if (i == chars.length || chars[i] == ' ') {
//        // Extract word manually
//        String word = "";
//        for (int j = start; j < i; j++) {
//            word += chars[j];
//        }
//        words[wordIndex] = word;
//        wordIndex++;
//
//        if (i < chars.length) {
//            start = i + 1;
//        }
//    }
//}
//
//    // Count frequency of each word
//        for (int i = 0; i < words.length; i++) {
//    if (words[i] == null) continue;
//
//    counts[i] = 1;
//
//    // Check if this word appears later
//    for (int j = i + 1; j < words.length; j++) {
//        if (words[j] != null && areEqual(words[i], words[j])) {
//            counts[i]++;
//            words[j] = null; // Mark as processed
//        }
//    }
//}
//
//    // Print results
//        System.out.println("Word Frequencies:");
//        System.out.println("-----------------");
//        for (int i = 0; i < words.length; i++) {
//    if (words[i] != null) {
//        System.out.println(words[i] + " : " + counts[i]);
//    }
//}
//}
//
//// Manual string comparison
//public static boolean areEqual(String s1, String s2) {
//    if (s1.length() != s2.length()) return false;
//
//    char[] chars1 = s1.toCharArray();
//    char[] chars2 = s2.toCharArray();
//
//    for (int i = 0; i < chars1.length; i++) {
//        if (chars1[i] != chars2[i]) {
//            return false;
//        }
//    }
//    return true;
//    }
//}
