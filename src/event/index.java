package event;
import java.util.Scanner; 
public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input number");
		int number,num;
		number =keyboard.nextInt();
		num= number%2;

		if (num ==0)
		System.out.println("�Ţ���");
		else
		System.out.println("�Ū���");
		}

	}

