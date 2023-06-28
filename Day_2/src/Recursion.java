/**
 * @ProjectName: Algorithm_Study
 * @Package: PACKAGE_NAME
 * @ClassName: Recursion
 * @Author: 张浩楠
 * @Description: 递归实现查找最大值和排序
 * @Date: 2022/11/2 17:37
 * @Version: 1.0
 */
public class Recursion
{
    public static int getMax(int arr[])
    {
        return select(arr,0,arr.length-1);
    }
    public static int select(int [] arr,int l,int r)
    {
        if(l==r)
        {
            return arr[r];
        }
        int mid = l+((r-l)>>1);
        int lMax = select(arr,l,mid);
        int rMax = select(arr,mid+1,r);
        return Math.max(lMax,rMax);
    }
    public static void process(int [] arr,int l,int r)
    {
        if(r==l)
        {
            return;
        }
        int mid = l+((r-l)>>1);
        process(arr,l,mid);
        process(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    private static void merge(int[] arr, int l, int mid, int r)
    {
        int[] help = new int[r-l+1];
        int i = 0;
        int p1 = l;
        int p2 = mid+1;
        while(p1<=mid&&p2<=r)
        {
            help[i++] = arr[p1] <= arr[p2]?arr[p1++]:arr[p2++];
        }
        while (p1 <= mid)
        {
            help[i++] = arr[p1++];
        }
        while (p2 <= r)
        {
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++)
        {
                arr[l+i] = help[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{
                9,14,7,58,65,3,47,4,5,6,7,8,9,10
        };
        int mid = arr.length>>1;
        process(arr,0,arr.length-1);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
