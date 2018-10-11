import java.util.*;
import java.lang.*;
import java.io.*;
public class marks
{  
public static void main(String[] args)throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int marks[]=new int[8]; 
 int c=0;

System.out.print("Enter marks:");
for(int i=0;i<3;i++)
{
	marks[i]=Integer.parseInt(br.readLine());
}
 for(int i=0;i<3;i++)  
 if(marks[i]>86)
 {
  c=c+1;  
 }
System.out.println("The number of students:"+c);  

  
}
    
}