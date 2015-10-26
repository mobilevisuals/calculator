import java.util.Scanner;

public class CalScanner2 {

	public static void main(String[] arguments) {

		int result = 0;
		boolean presentResult = true;

		Scanner scanner = new Scanner(System.in);

		String text = scanner.next();
		String text2 = scanner.next();
		String text3 = scanner.next();
		String mathSymbol = text2;

		
		
		int leftOperand = Integer.parseInt(text), 
				rightOperand = Integer.parseInt(text3);

		if (mathSymbol.equals("+"))
			result = leftOperand + rightOperand;

		else if (mathSymbol.equals("-"))
			result = leftOperand - rightOperand;
		else if (mathSymbol.equals("%"))
			result = leftOperand % rightOperand;

		else if (mathSymbol.equals("/"))
			result = leftOperand / rightOperand;
		else {
			System.out.println("Wrong operator, no calculation has been made!! ");
			presentResult = false;
			System.currentTimeMillis();
			System.nanoTime();
		}

		if (presentResult)
			System.out.println("Result: " + result);
	
		scanner.close();

	}

}
