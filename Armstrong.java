package week1day2;

public class Armstrong {

	public static void main(String[] args) {
		int input = 153;
		int output,remainder,calculated=0;
		output=input;
		
		while(input>0)
		{ 
			remainder = input%10;
			calculated = calculated + (remainder*remainder*remainder);
			input = input/10;
		}
		if(output==calculated)
		{
         System.out.println(output+" is a Armstrong number.");
	}else
	{
		System.out.println("is not a Armstrong number.");
	}

}

}