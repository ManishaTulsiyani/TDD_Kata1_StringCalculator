
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
			return  getSum(nos);
			
		}
	}
	
	private int getSum(String[] nos) {
		int sum=0;
		for(int current=0;current<nos.length;current++) {
			sum+=Integer.parseInt(nos[current]);
			}
	     return sum;
	}
	
	private boolean isEmpty(String numbers) {
		return numbers.isEmpty();
	}
	
	private int stringToInt(String numbers) {
		return Integer.parseInt(numbers);
	}
}
