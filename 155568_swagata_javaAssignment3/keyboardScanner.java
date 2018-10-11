import java.util.Scanner;

public class keyboardScanner {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = input.nextInt();
		System.out.println("Enter a floating point number:");
        double f = input.nextDouble();
		System.out.println("Enter your name:");
        String Name = input.nextLine();
		double total=num+f;
		System.out.println("Hi! "+Name+", the sum of "+num+" and "+f+" is "+total);
		