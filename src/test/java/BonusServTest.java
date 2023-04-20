import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BonusServTest {
    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusServClass service = new BonusServClass();


        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusServClass service = new BonusServClass();
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForNotRegisteredAndUnderLimit() {
        BonusServClass service = new BonusServClass();


        long amount = 1000;
        boolean registered = false;
        long expected = 10;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForNotRegisteredAndOverLimit() {
        BonusServClass service = new BonusServClass();
        long amount = 1_000_000;
        boolean registered = false;
        long expected = 500;
        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }
}
