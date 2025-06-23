package JavaProgrammesInterview;

public class Primenumber {
     public static void main(String [] args){

     //find the prime numbers for given range
    int num=25;
  
    for(int i=2 ;i<=num;i++)
        {
            
        if(i==1||i==0)
        {
        System.out.println("not prime ");
        }
        if(i%2==0){
        System.out.println("not prime "+i);
        }
        else
        {
        System.out.println(""+i);
        }
    }
} 
}
