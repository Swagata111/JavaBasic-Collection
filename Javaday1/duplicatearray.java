public class duplicatearray
{
   public static void main(String args[])
    {
        int ar1[] = {1,5,0,10,5,40,10,80,60};
        int i,j,k=5;
        for(i=0;i<7;i++)
        {
            for(j=i+1;j<7;j++)
            {
                if ((ar1[i]==ar1[j]) && ((i-j)<=k))
                System.out.println("Yes,the number is:"+ar1[i]);
            }
        }
    }
}