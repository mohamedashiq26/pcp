import java.io.*;
import java.util.*;
public class Main 
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a=5;
        int b=7;
        int A=a-- - a--;
        int B=--a - a--;
        int C=b-- + a--;
        int D=--a - --b;
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
    }
}
