package package1;

public class Forlooppattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 4; // Number of rows in the pattern

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
		}

	}

}
