import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 4},
            {2, 5, 6},
            {7, 8, 9}
        };
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] != a[j][i]) {
                    System.out.println("not Symmetric");
                    return;
                }
            }
        }
        
        System.out.println("Symmetric");
    }
}
