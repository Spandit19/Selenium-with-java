package package1;

public class Class5 {

	public static void main(String[] args) {
		byte b;
		int i; 
		b = 10;
		i = b * b; // OK, no cast needed 
		b = 20;
		b = (byte) (b*b); // cast needed!! as cannot assign int to byte
		System.out.println("i and b: " + i + " " + b);

	}

}
