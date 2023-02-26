package week1.day2;

public class CheckIfTheNumberIsPositiveOrNegative {

	public static void main(String[] args) {

		int num = -1;

		if (num > 0) {
			System.out.println("The given number is positive :" + num);
		}

		else if (num == 0) {

			System.out.println("The given number is neither +ve or -v :" + num);
		}
		
		else {
			System.out.println("The given number is negative :" + num);
		}

	}

}
