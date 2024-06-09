import java.util.Scanner;
public class Inverted_star {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i=n ; i>=1 ; i--)//or  i from 1 to n and
        {
            for(int j=1 ; j<=i ; j++)//j from 1 to n-i-1
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
