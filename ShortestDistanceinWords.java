package JavaProgrammesInterview;

import java.util.ArrayList;
import java.util.Arrays;

public class ShortestDistanceinWords {
    public static void main(String [] args){

    

    ArrayList<String> S= new ArrayList<>( Arrays.asList("snehal", "padma","sangli", "kolhapur", "satara"));

    int d1=-1 ,d2=-1;
    String word1="padma";
    String word2="satara";
    int ans= Integer.MAX_VALUE;
    //traverse through list

    for(int i=0; i<S.size(); i++)
    {
     if(word1.equals(S.get(i)))
     
        d1=i;
     
     if(word2.equals(S.get(i)))
     
        d2=i;
     
     if(d1!=-1 && d2!=-1)
     
        ans =Math.min(ans, Math.abs(d1-d2));
    }
      System.out.println(ans);
    

    }
}

