import java.util.Scanner;
public class Character_pattern_half_pyramid {
    public static void main(String[] args)
    {
        char ch = 'A';
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n  = sc.nextInt();

        for(int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }


    }
}
