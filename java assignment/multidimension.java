public class multidimension
{  
public static void main(String args[]){  
  
int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
int num=4;
int f=0;
  
for(int i=0;i<3;i++){  
 for(int j=0;j<3;j++){
     if(arr[i][j]==num)
     {
         f=1;
          break;
     }
 }  
}  
  if(f==1)
  System.out.println("Number is present");
  else
  System.out.println("Number not present");
}}  