import java.util.*;

public class max2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m[] = new int[5]; // Corrected array initialization
        System.out.println("Enter numbers:");
        
        for (int i = 0; i < 5; i++) { // Corrected loop syntax
            m[i] = sc.nextInt();
        }

        int max = m[0];
        for (int i = 1; i < 5; i++) { // Start from index 1 as max is already set to m[0]
            if (m[i] > max) {
                max = m[i];
            }
        }

        System.out.println("Maximum value: " + max); // Print the max value outside the loop
    }
}
