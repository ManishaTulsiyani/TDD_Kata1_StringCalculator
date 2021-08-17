
public class StringCalculator {
	public int Add(String numbers) {
		if(isEmpty(numbers)) {
			return 0;
		}
		return stringToInt(numbers);
	}
	
	private boolean isEmpty(String numbers) {
		return numbers.isEmpty();
	}
	
	private int stringToInt(String numbers) {
		return Integer.parseInt(numbers);
	}
}
