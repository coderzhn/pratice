import java.util.Scanner;

/**
 * @ProjectName: Algorithm_Study
 * @Package: PACKAGE_NAME
 * @ClassName: LCM
 * @Author: 张浩楠
 * @Description: 求最小公倍数
 * @Date: 2022/11/5 13:13
 * @Version: 1.0
 */
public class LCM
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int l = in.nextInt();
        int res = 0;
        int temp = Math.max(l,Math.max(n,m));
        for(int i = temp;i>0;i++)
        {
            if(i%n==0&&i%m==0&&i%l==0)
            {
                res = i;
                break;
            }
        }
        System.out.println(res*3);
    }
}
