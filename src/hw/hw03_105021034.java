package hw;
import java.util.Scanner;
public class hw03_105021034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		if(a%400 == 0)
		{
			System.out.println("此年閏年");
		}
		else if(a%100 == 0)
		{
			System.out.println("此年非閏年");
		}
		else if(a%4 == 0)
		{
			System.out.println("此年閏年");
		}
		else
		{
			System.out.println("此年非閏年");
		}
	}

}
