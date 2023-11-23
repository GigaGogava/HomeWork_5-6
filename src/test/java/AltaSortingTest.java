import StepObject.SortingTestStep;
import Utils.ChromeRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static java.lang.Double.MAX_VALUE;
import static java.lang.Double.MIN_VALUE;

public class AltaSortingTest extends ChromeRunner {
    SortingTestStep sortingTestStep = new SortingTestStep();

    @Test
        public void SortingTest(){
        sortingTestStep
                .writeProductInSearch()
                .clickSearchBtn()
                .clickSortingField()
                .chooseLowToHigh()
                .checkSorting();
        sleep(3333);
    }
    @Test
    public void testPriceRange(){
        sortingTestStep
                .writeProductInSearch()
                .clickSearchBtn()
                .clickSortingField()
                .chooseLowToHigh()
                .fillMinPrice()
                .fillMaxPrice()
                .testPriceRange();
        Assert.assertTrue(MIN_VALUE < 200.0, "Min price is less than 200");
        Assert.assertTrue(MAX_VALUE > 600.0, "Max Price is exceeding 600");
    }

    }

