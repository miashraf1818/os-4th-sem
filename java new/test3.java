public class test3 
{
    public static void main(String[] args) 
    {
        // Label the outer loop
        loop1: for (int i = 1; i < 10; i++)
         {
            System.out.println("");
            // Check if i is greater than or equal to 4
            if (i >= 4)
                // Break out of the outer loop
                break;
            // The inner loop iterates from 1 to 10
            for (int j = 1; j <= 10; j++) 
            {
                // Print out a * character
                System.out.println("*");
                // Check if j is equal to i
                if (j == i)
                    // Skip to the next iteration of the outer loop
                    continue loop1;
            }
        }
        // Print out a message indicating that the outer loop was terminated by the break statement
        System.out.println("terminated by break");
    }
}
