import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test
public class TestCalculate {
	
	public void emptyStringReturnsZero(){
		StringCalculator sc=new StringCalculator();
		assertEquals(sc.Add(""),0);
	}
 
}
