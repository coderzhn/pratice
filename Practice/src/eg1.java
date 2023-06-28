import java.util.Scanner;

/**
 * 用*打印出不同大小的》符号
 */
public class eg1
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = "";
        String str1 ="";
        for(int j = 0;j<n;j++)
        {
            System.out.print(str);
            for (int i = 0; i < n; i++)
            {
                System.out.print("*");
            }
            System.out.println();
            str = str.concat(" ");

        }
        int t = 2;
        for(int j = 0 ;j<n-1;j++)
        {
            str1 = str.substring(t++);
            System.out.print(str1);
                for (int i = 0; i < n; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
