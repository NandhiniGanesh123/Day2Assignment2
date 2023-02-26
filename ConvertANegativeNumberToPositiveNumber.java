package week1.day2;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=-40;
     
     if(num>0) {
    	 
    	 System.out.println("The given number is neither +ve :" + num);
    	
     }
     else if(num<0){
    	 System.out.println("The given number is -ve :" + num);
    	 num=num*-1;
    	 System.out.println("The conveted number is +ve :" + num);
	}

}

}