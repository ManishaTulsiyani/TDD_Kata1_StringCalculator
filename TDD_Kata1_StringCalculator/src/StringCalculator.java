
public class StringCalculator {
	
	public int Add(String numbers) {
		String[] nos=numbers.split(",");
		
		if(isEmpty(numbers)) {
			return 0;
		}
		if(numbers.length()==1) {
			return stringToInt(numbers);
		}
		else {
			return  getSum(nos[0],nos[1]);
			
		}
	}
	
	private int getSum(String numA,String numB) {
		return Integer.parseInt(numA)+Integer.parseInt(numB);
	}
	
	private boolean isEmpty(String numbers) {
		return numbers.isEmpty();
	}
	
	private int stringToInt(String numbers) {
		return Integer.parseInt(numbers);
	}
}
