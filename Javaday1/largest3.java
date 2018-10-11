import java.util.Scanner;
public class largest3
{
    public static void main(String[] args) 
    {
        int n, t;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
			for (int j = i + 1; j < n; j++) 
            {
                if (a[i] < a[j]) 
                {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.print("Largest 3 element:");
        for (int i = 0; i < 3; i++) 
        {
            System.out.print(a[i] + ",");
        }
    }
}