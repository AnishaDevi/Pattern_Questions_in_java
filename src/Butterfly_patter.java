import java.util.Scanner;
public class Butterfly_patter {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        //upper part
        for(int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            for(int j=1 ; j<=(2*(n-i)) ; j++)
            {
                System.out.print(" ");
            }
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        //bottom part
        for(int i=n ; i>=1 ; i--)
        {
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            for(int j=1 ; j<=(2*(n-i)) ; j++)
            {
                System.out.print(" ");
            }
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
