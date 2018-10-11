public class Zero
{
   public static void main(String args[])
    {
        int ar1[] = {1,5,0,10,20,40,80};
        int i,j,c=0;
        int na[]=new int[10];
        for(i=0;i<7;i++)
        {
            if(ar1[i]!=0)
            {
            
            na[c]=ar1[i];
            c++;
            }
        }
        System.out.println(c);
        
        for(j=c;j<7;j++)
        {
            na[j]=0;
        }
         for(i=0;i<7;i++)
        {
            System.out.print(na[i]+",");
        }
    }
    }