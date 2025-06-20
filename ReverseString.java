package JavaProgrammesInterview;

import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class ReverseString {
    public static void main(String [] args)
    {

    String originall= "snehal";
    
    String reversed = "";

        for (int i = originall.length() - 1; i >= 0; i--) {
            reversed += originall.charAt(i);
        }
        System.out.println("original String: " + originall);
        System.out.println("Reversed String: " + reversed);
    

     
        String original = "Hello, World!";
        StringBuilder sb = new StringBuilder(original);

        String reversedd = sb.reverse().toString();
        System.out.println("Reversed String: " + original);
        System.out.println("Reversed String: " + reversedd);
    
       String input = "Hello, Java 8!";
        
        // Reverse the string using Java 8 Streams
        String reverse = IntStream.range(0, input.length())
                                   .mapToObj(i -> input.charAt(input.length() - 1 - i))
                                   .map(String::valueOf)
                                   .collect(Collectors.joining());
        
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reverse);


   
}   
}
