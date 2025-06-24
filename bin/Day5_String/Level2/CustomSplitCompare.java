import java.util.Scanner;

public class CustomSplitCompare {

    // Method to calculate the length of a string without using length()
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // End of string
        }
        return count;
    }

    // Method to split string into words using charAt()
    public static String[] customSplit(String str) {
        int length = getLength(str);
        int wordCount = 0;

        // Count words
        boolean inWord = false;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != ' ') {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
        int i = 0;
        while (i < length) {
            
            while (i < length && str.charAt(i) == ' ') i++;
            int start = i;

           
            while (i < length && str.charAt(i) != ' ') i++;
            int end = i;

            if (start < end) {
               
                String word = "";
                for (int j = start; j < end; j++) {
                    word += str.charAt(j);
                }
                words[index++] = word;
            }
        }

        return words;
    }

    
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        
        String[] customWords = customSplit(input);

        
        String[] builtinWords = input.trim().split("\\s+"); 

        
        boolean result = compareArrays(customWords, builtinWords);

        
        System.out.println("\nCustom split result:");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in split result:");
        for (String word : builtinWords) {
            System.out.println(word);
        }

        System.out.println("\nDo both methods produce the same result? " + result);
    }
}
