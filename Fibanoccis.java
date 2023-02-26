package week1.day2;

public class Fibanoccis {
	
	public static void main(String[] args) {
	int a=0;
	int b=1;
	int i;


		System.out.println(a+"\n"+b);
		
		for( i=1;i<=3;++i) {
			
			int sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);		
		}
		
	}
		
		
		
		
		

	}


