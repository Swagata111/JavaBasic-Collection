import java.util.Scanner;
public class GradesAverage 
{

    public static void main(String[] args)
	{
        
		int i;
		int sum=0;
         Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numStudents = input.nextInt();
        int[] grades= new int[numStudents];
		for(i=0;i<numStudents;i++)
		{
		System.out.println("Enter the grade for student "+i+1+" :");
		grades[i]=input.nextInt();
		if(grades[i]>100)
		{
		System.out.println("Invalid grade, try again...");
		i--;
		}
		}
		for(i=0;i<numStudents;i++)
		{
		 sum=sum+grades[i];
		}
		double avg=sum/numStudents;
		System.out.println("The average is: "+avg);
	}
}
		
		
        