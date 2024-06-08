import java.util.Scanner;
public class Floyds_triangle {
    public static void main(String[] args)
    {
        int count=1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        for(int i=0 ; i<=n ; i++)
        {
            for(int j=0 ; j<=i ; j++)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }

    }
}
