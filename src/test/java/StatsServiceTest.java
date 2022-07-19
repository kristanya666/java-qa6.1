import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService.StatsService;


public class StatsServiceTest {

    @Test
    public void findSumOfSales() {
        StatsService service = new StatsService();

        long[] sales = {8_000, 15_000, 13_000, -5000, 17_000, 20_000, 19_239, 20_258, 7_966, 14_586, 14_000, 18_550};
        long expectedSum = 162599;
        long actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void findMidOfSales() {
        StatsService service = new StatsService();

        long[] sales = {8_000, 15_000, 13_000, 5_000, 17_000, 20_000, 19_239, 20_258, 7_966, 14_586, 14_001, 18_550};
        double expected = 14383.333333333334;
        double actual = service.midSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findAmountHighMidSales() {
        StatsService service = new StatsService();

        long[] sales = {8_110, 15_000, 13_080, 5_000, 17_000, 20_000, 19_240, 20_262, 7_968, 14_580, 14_001, 18_559};
        int expectedAmount = 7;
        int actualAmount = service.amountOfMonthsMidSalesHigher(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void findAmountLowMidSales() {
        StatsService service = new StatsService();

        long[] sales = {8_110, 15_000, 13_080, 5_000, 17_000, 20_000, 19_240, 20_262, 7_968, 14_580, 14_001, 18_559};
        int expectedAmount = 5;
        int actualAmount = service.amountOfMonthsMidSalesLower(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }


    @Test
    public void findMonthOfMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8_110, 15_000, 13_080, 5_000, 17_000, 20_000, 19_240, 20_262, 7_968, 14_580, 14_001, 18_559};
        int expectedMonth = 4;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void findMonthOfMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8_110, 15_000, 13_080, 5_000, 17_000, 20_000, 19_240, 20_262, 7_968, 14_580, 14_001, 18_559};
        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}
