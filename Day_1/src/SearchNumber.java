public class SearchNumber
{
    public static void main(String[] args)
    {
        int [] a = new int[]
                {1,2,2,3,5,5,5,5} ;
        int eor1 = 0;
        int eor2 = 0;
        int type ;
        for(int i = 0;i < a.length;i++)
        {
            eor1 ^=a[i];
        }
        type = eor1&((~eor1)+1);
        for(int j = 0;j < a.length;j++)
        {
            if((type&a[j])==0)
            {
                eor2^=a[j];
            }
        }
        System.out.println(eor2+"  "+(eor1^eor2));
    }
}
