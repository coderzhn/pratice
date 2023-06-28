import java.util.Scanner;

/**
 * @ProjectName: Algorithm_Study
 * @Package: PACKAGE_NAME
 * @ClassName: Str
 * @Author: 张浩楠
 * @Description: 字符串操作
 * @Date: 2022/11/5 16:28
 * @Version: 1.0
 */
public class Str
{
    public static void main(String[] args)
    {
        int l,r,n,t;
        char a,b;
        String str,str1 = "";
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        t = in.nextInt();
        str = in.nextLine();
        char [] arr = str.toCharArray();
        for(int i = 0;i < t;i++)
        {
            l = in.nextInt();
            r = in.nextInt();
            a = (char) in.nextByte();
            b = (char) in.nextByte();
        }
        System.out.println(str1);
    }
}
