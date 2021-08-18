import java.util.regex.Pattern;

public class StringCalculator {
	
	private int invoked=0;
	private final String delimeter=",|\n|;";
	String[] nos;
	
	public int Add(String numbers) throws Exception {
		
		invoked++;
		
		if(isEmpty(numbers)) {
			return 0;
		}
		if(numbers.length()==1) {
			return stringToInt(numbers);
		}
		  if(numbers.startsWith("//")){
	            String delimiter1 = "", delimiterstr = "";
	            int start_index = numbers.indexOf("//") + 2;
	            int end_index = numbers.indexOf("\n");
	            delimiter1 = numbers.substring(start_index,end_index);
	            delimiterstr = numbers.substring(end_index + 1);

	            if(delimiter1.startsWith("[") && delimiter1.endsWith("]")){
	                delimiter1 = numbers.substring(start_index + 1,end_index - 1);
	            }

	            nos = delimiterstr.split(Pattern.quote(delimiter1));
	            return  getSum(nos);
		  } 
		
		
		else {
			 nos=numbers.split(delimeter);
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
	        return invoked;
	    }
}
