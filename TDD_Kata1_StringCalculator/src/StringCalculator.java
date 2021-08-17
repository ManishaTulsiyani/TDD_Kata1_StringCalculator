
public class StringCalculator {
	
	private final String delimeter=",|\n";
	
	public int Add(String numbers) throws Exception {
		String[] nos=numbers.split(delimeter);
		
		if(isEmpty(numbers)) {
			return 0;
		}
		if(numbers.length()==1) {
			return stringToInt(numbers);
		}
		else {
			return  getSum(nos);
			
		}
	}
	
	private int getSum(String[] nos) throws Exception {
		findNegativeValues(nos);
		int sum=0;
		for(String current:nos) {
			sum+=stringToInt(current);
			}
	     return sum;
	}
	
	private void findNegativeValues(String[] nos) throws Exception {
		for(String current:nos) {
			if(stringToInt(current)<0) {
				throw new Exception("negatives not allowed");
			}
		}
	}
	
	private boolean isEmpty(String numbers) {
		return numbers.isEmpty();
	}
	
	private int stringToInt(String numbers) {
		return Integer.parseInt(numbers);
	}
}
