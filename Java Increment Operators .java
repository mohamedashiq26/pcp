import java.io.*;
import java.util.*;
public class Main 
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a=2;
        int A=a++ + ++a + ++a;
        int B=++a + ++a + a++;
        System.out.println(A);
        System.out.println(B);
    }
}
