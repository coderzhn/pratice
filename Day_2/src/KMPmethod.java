/**
 * @ProjectName: Algorithm_Study
 * @Package: PACKAGE_NAME
 * @ClassName: KMPmethod
 * @Author: 张浩楠
 * @Description: KMP算法的具体实现
 * @Date: 2022/11/3 15:28
 * @Version: 1.0
 */
public class KMPmethod
{
     public static int Kmp(String str1, String str2, int[] next) {
        for(int i = 0, j = 0; i < str1.length(); i++) {
            while(j > 0 && str1.charAt(i) != str2.charAt(j)) {  //不匹配的情况下
                j = next[j -1];  //通过next数组回溯j
            }
            if(str1.charAt(i) == str2.charAt(j)) {  //匹配的情况下
                j++;
            }
            if(j == str2.length()) {   //匹配成功返回
                return i - j +1;
            }
        }
        return -1;  //匹配不成功返回-1
    }
    public static int[] CreatNext(String str)
    {
        int[] next = new int[str.length()];
        next[0] = 0;
        for(int i = 1,j = 0;i < str.length();i++)
        {
            while(j>0 && (str.charAt(i) != str.charAt(j)))
            {
                j = next[j-1];
            }
            if(str.charAt(i) == str.charAt(j))
            {
                j++;
            }
            next[i] = j;
        }
        return next;
    }

    public static void main(String[] args) {
        int[] next = CreatNext("abcabcd");

        for(int i:next)
        {
            System.out.print(i+" ");
        }
    }
}
