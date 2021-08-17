
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
			return Integer.parseInt(nos[0])+Integer.parseInt(nos[1]);
			
		}
	}
	
	private boolean isEmpty(String numbers) {
		return numbers.isEmpty();
	}
	
	private int stringToInt(String numbers) {
		return Integer.parseInt(numbers);
	}
}
