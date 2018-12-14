package fracCalc;
import java.util.*;
import java.util.Scanner; 
public class fracCalc 
{
	public static void main (String [] args)
	{
		boolean x = true;
		while ( x = true)
		{
			//create a scanner: reads input and places it into method produceAnswer
			Scanner keyboard = new Scanner (System.in);
			//System.out.println("key: for a mixed fraction: have a number, underscore, number, /, number, ex: 1_2/3");
			//System.out.println("key: multiplying uses x, dividing uses /, adding uses +, subtracting uses -");
			System.out.println();
			System.out.println("Type in your first fraction, then what your are doing to the fractions, then the next fraction.");
			String input = keyboard.nextLine();
			produceAnswer(input);
			//first thing to do: simplify the fraction and always turn it into an improper or proper fraction, no mixed numbers
			if (input.equals("quit"))
			{
				x = false;
				
			}
		}
		System.out.println("done");
		
		//if the program sees _ anywhere, send it to mixed fractions
		
		
	}
	
	public static void produceAnswer (String input)
	{
		
		//turns input into three diff strings
			// first: fraction
			//second: operand (+-/*)
			//third: the last part of the fraction
		//returns second operand example: 1 2/3 + 4 5/6 would return 4 5/6
		
		//only uses the part of the string after the first space
		int firstSpace = input.indexOf(" ");
		int afterSpace = firstSpace+2;
		String afterFirstSpace = input.substring(firstSpace, afterSpace);
		int beforeSpace = firstSpace;
		
		//when it finds any of these: +/*-
		//if(afterFirstSpace.equals (" +") || afterFirstSpace.equals (" -") || afterFirstSpace.equals (" /") || afterFirstSpace.equals (" +"))
		//{
			String secondFraction = input.substring(afterSpace);
			//System.out.print(secondFraction);
			String firstFraction = input.substring(0, beforeSpace);
		//}
		//first it will look for a -
		//then look for a _ for mixed numbers
		//then it will see the /
		//look for a second _
		
		//proper/improper and positive
		
			//where the / is
			int divisor = firstFraction.indexOf("/");
			String firstNumber = firstFraction.substring(0, divisor);
			String secondNumber = firstFraction.substring(divisor+1);
			//first number in first fraction
			int properNumerator = Integer.parseInt(firstNumber);
			//second number in first fraction
			int properDenominator = Integer.parseInt(secondNumber);
			//improper fraction5/2
		
			int divisor2 = secondFraction.indexOf("/");
			String firstNumber2 = secondFraction.substring(0, divisor);
			String secondNumber2 = secondFraction.substring(divisor+1);
			//first number in first fraction
			int properNumerator2 = Integer.parseInt(firstNumber2);
			//second number in first fraction
			int properDenominator2 = Integer.parseInt(secondNumber2);
			//improper fraction5/2
			
			
		//if it is a negative do if the first string part is a negative it will end up being different
			
		/*
		//scans for _ and if it find it it will go to mixed fractions method
				for (int i = 0; i <= firstFraction.length()-1; i++)
				{
					if (firstFraction.substring(i, i+1).equals( "_"))
					{
						mixedFraction(firstFraction, secondFraction, finalMf);
					}
				}
				for (int i = 0; i <= secondFraction.length()-1; i++)
				{
					if (secondFraction.substring(i, i+1).equals( "_"))
					{
						mixedFraction(firstFraction, secondFraction, finalMf);
					}
				}
		*/
	}
	
	public static void mixedFraction(String firstFraction, String secondFraction)
	{
		//scans for a _ and turns it into an improper fraction
				String finalMf;
				
					int mixedFraction = firstFraction.indexOf("_");
						//finds where the _ is and then takes the number before that
						//and multiplies that to the last number and adds the second number 
						//so first find the 3 diff numbers
					String numberBeforeMixedNumber = firstFraction.substring(0, mixedFraction);
					int wholeNumberFromMF = Integer.parseInt(numberBeforeMixedNumber);
					
					String fracAfterMixedNumber = firstFraction.substring(mixedFraction+1);
						//get first numerator in the fraction
						//turn it into an integer
						//get the denominator from the fraction
						//turn it in to an integer
					int divisor = fracAfterMixedNumber.indexOf("/");
					String numeratorFromMf = firstFraction.substring(0, divisor);
					String denominatorFromMf = firstFraction.substring(divisor+1);
					int intNumeratorFromMf = Integer.parseInt(numeratorFromMf);
					int intDenominatorFromMf = Integer.parseInt(denominatorFromMf);
						
						//multiply the whole number to the denominator and then add the numerator
						//turn back into a string and put that over the denominator again
					int	numeratorMixedToImproper = wholeNumberFromMF * intDenominatorFromMf + intNumeratorFromMf;
					String mfNumerator = Integer.toString(numeratorMixedToImproper); 
					String mfDenominator = Integer.toString(intDenominatorFromMf); 
					
					finalMf = mfNumerator+"/"+mfDenominator;
					
				System.out.print(finalMf);
				//System.out.print(fracAfterMixedNumber);
				
				//now is the same as an improper fraction
	}
}

		