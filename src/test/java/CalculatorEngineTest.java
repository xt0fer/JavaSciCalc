import com.zipcodewilmington.scientificcalculator.Calculator;
import org.junit.Assert;
import org.junit.Test;



public class CalculatorEngineTest {

    @Test
    public void testSum() {
        // Given
        Calculator calculator = new Calculator();
        // When
        int result;
        result = calculator.sum(2, 2);
        // Then
        if (result != 4) {   // if 2 + 2 != 4
            Assert.fail();
        }
    }
    @Test
    public void testSum1() {
        // Given
        Calculator calculator = new Calculator();
        // When
        int result;
        result = calculator.sum(1200, 500);
        // Then
        if (result != 1700) {   // if 1200 + 500 != 1700
            Assert.fail();
        }
    }
}

