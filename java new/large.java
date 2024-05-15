import java.util.Scanner;
public class large
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
        System.out.println("large is"+a);
        else
        System.out.println("large is"+b);
    }
}