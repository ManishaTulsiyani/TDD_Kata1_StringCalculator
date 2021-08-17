import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test
public class TestCalculate {
	
    private StringCalculator sc;
	
	@BeforeTest
	public void init() {
		sc=new StringCalculator();
	}
	
	public void emptyStringReturnsZero(){
		assertEquals(sc.Add(""),0);
	}
	
	public void singleNumberReturnsValue() {
		assertEquals(sc.Add("1"),1);
	}
	
	public void twoNumbersCommaDelimitedReturnSum() {
		assertEquals(sc.Add("1,2"),3);
	}
	
	public void NumbersCommaDelimitedReturnSum() {
		assertEquals(sc.Add("1,2,3"),6);
		assertEquals(sc.Add("1,2,3,4,5"),15);
	}
 
}
