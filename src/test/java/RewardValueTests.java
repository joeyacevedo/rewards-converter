import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        double conversionRate = 0.0035;
        double resultCheck = 28571;

        var rewardValue = new RewardValue(cashValue);
        assertEquals(resultCheck, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        double conversionRate = 0.0035;
        double resultCheck = (milesValue * conversionRate);

        var rewardValue = new RewardValue(milesValue);
        assertEquals(resultCheck, rewardValue.getCashValue());
    }
}
