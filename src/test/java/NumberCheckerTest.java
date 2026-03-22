import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberCheckerTest {

    @Test
    void checkEvenNumber() {
        boolean result = NumberChecker.isEven(4);
        assertTrue(result);
    }

    @Test
    void checkOddNumber() {
        boolean result = NumberChecker.isOdd(5);
        assertTrue(result);
    }
}
