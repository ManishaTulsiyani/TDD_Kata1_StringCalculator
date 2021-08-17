
public class StringCalculator {
	
	private int invoked;
	private final String delimeter=",|\n";
	
	public StringCalculator () {
	    this.invoked = 0;

	}
	
	public int Add(String numbers) throws Exception {
		
		this.invoked++;
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
		return calculateValues(nos);
	}
	
	private int calculateValues(String[] nos) {
		int sum=0;
		for(String current:nos) {
			if(stringToInt(current)>1000) {
				continue;
			}
		    sum+=stringToInt(current);
		}
	    return sum;
	}
	
	private void findNegativeValues(String[] nos) throws Exception {
		for(String current:nos) {
			if(stringToInt(current)<0) {
				throw new Exception("negatives not allowed"+nos);
			}
		}
	}
	
	private boolean isEmpty(String numbers) {
		return numbers.isEmpty();
	}
	
	private int stringToInt(String numbers) {
		return Integer.parseInt(numbers);
	}
	
	  public int getCalledCount() {
	        return this.invoked;
	    }
}
