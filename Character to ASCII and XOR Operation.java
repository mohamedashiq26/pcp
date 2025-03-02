import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        int n = (int) c;
        int m = n ^ 2;

        System.out.println("Character: " + c);
        System.out.println("ASCII Value: " + n);
        System.out.println("XOR with 2: " + m);
    }
}
