public class missingelement
{  

public static void main(String[] args)
{  
  
int sum=0,sum1=0,i;
int arr[]={4,8,9,7,5,3,2,1,6};
for(i=0;i<9;i++)
sum=sum+arr[i];
for(i=1;i<=10;i++)
sum1=sum1+i;
System.out.println(sum1-sum);
}
    
}