import java.io.*;
import java.util.*;
public class Main 
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a=13;
        int b=3;
        int A=a++;
        int B=++a;
        int C=++a;
        int D=b++;
        int E=b++ + ++a;
        int F=++a + b++ + a++;
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
    }
}
