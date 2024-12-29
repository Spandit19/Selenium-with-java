package package1;

public class Ifelse_ladder1 {

	public static void main(String[] args) {
		int a=112,b=256,c=189;
		
		if((a>b)&&(a>c)) {
			System.out.println("A is winner");
		}
		else if((b>a)&&(b>c)){
			System.out.println("B is winner");
		}
		else{
			System.out.println("C is winner");
		}
		
    
	}

}
