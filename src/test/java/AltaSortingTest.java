import StepObject.SortingTestStep;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

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

    }

