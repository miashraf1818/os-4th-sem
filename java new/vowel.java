import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.nextLine();
        char a = input.charAt(0);
        switch (a) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(a + " is a vowel");
                break;
            default:
                System.out.println(a + " is not a vowel");
                break;
        }
    }
}