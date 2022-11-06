package sri;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=SC.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of number is :"+fact);
		
		// TODO Auto-generated method stub

	}


}
