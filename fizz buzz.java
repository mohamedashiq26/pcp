import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
// get input from console
    int n =15;
	   
    for(int i=0; i<=n; i++){
        
        if( i%3 == 0 && i%5 == 0 ){
             System.out.println("FizzBuzz");
        }
        
        else if( i%3 == 0 ){
             System.out.println("Fizz");
        }
        
        else if( i%5  == 0 ){
             System.out.println("Buzz");
        }
        else {
            System.out.println(i);
        }
        
    }

	}
}
