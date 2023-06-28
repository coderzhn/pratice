import java.util.Scanner;

/**
 * @ProjectName: Algorithm_Study
 * @Package: PACKAGE_NAME
 * @ClassName: Area
 * @Author: 张浩楠
 * @Description: 计算平面可以最多被分成几份
 * @Date: 2022/11/5 12:25
 * @Version: 1.0
 */

public class Area
{
    public static long method(long n)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 2;
        return method(n-1)+n;
    }

    public static void main(String[] args)
    {
        for(int i = 0;i < 5;i++)
        {
            long n = new Scanner(System.in).nextLong();
            System.out.println(method(n*2));
        }
    }
}
