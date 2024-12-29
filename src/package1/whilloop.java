package package1;

public class whilloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=131,rem,rev,s=0;
		rev=n;
		while(n>0) {
			rem=n%10;
			s=s*10+rem;
			n=n/10;
		}
		if(s==rev) {
          System.out.println("Reverse of the number is " +n +"is"+rev);//Reverse of the number is 
		}
	}

}
