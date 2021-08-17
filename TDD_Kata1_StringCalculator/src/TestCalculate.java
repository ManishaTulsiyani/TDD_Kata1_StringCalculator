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
 
}
