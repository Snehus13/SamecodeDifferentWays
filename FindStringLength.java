import java.util.ArrayList;

public class FindStringLength {
    
    public static void main (String [] args)
    {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Cherry");
        strings.add("Date");

        // Iterate through the ArrayList and print the length of each string
        for (String word : strings) {
            System.out.println("The length of \"" + word + "\" is: " + word.length());

            }
             // Find the longest string
        String longestString = "";
        for (String str : strings) {
            if (str.length() >= longestString.length()) {
                longestString = str;
            }
        }

        // Output the result
        System.out.println("The longest string is: " + longestString);
        System.out.println("Length of the longest string: " + longestString.length());
}
}



    


