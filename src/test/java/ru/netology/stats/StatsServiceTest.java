package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void shouldCalculateTotal(){
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.getTotal(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAverage(){
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.getAverageMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculatePeakMonth(){
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.getSalesPeak(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMinMonth(){
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.getMinSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateBelowAverage(){
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.getBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAboveAverage(){
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.getAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
