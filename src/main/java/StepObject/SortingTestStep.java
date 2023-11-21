package StepObject;

import PageObject.SortingTestObject;

import static DataObject.SortingTestData.productSearch;
import static com.codeborne.selenide.Selenide.$;
public class SortingTestStep extends SortingTestObject {

    public SortingTestStep writeProductInSearch() {
        searchInput.setValue(productSearch);
        return this;
    }

    public SortingTestStep clickSearchBtn() {
        clickSrchBtn.click();
        return this;
    }

    public SortingTestStep clickSortingField() {
        sortField.click();
        return this;
    }

    public SortingTestStep chooseLowToHigh() {
        chooseLowToHigh.click();
        return this;
    }

    public SortingTestStep checkSorting() {
        int count = $(".grid-list").$$(".ty-column3 ").size();
        System.out.println(count);
        String firstPrice = $(("#sec_discounted_price_30939"), 0).getText();
        float firstFloatPrice = Float.parseFloat(firstPrice);
        System.out.println(firstFloatPrice);
        for (int i = 1; i < count; i++) {
            String secondPrice = $(".ty-price-num", i).getText();
            float secondFloatPrice = Float.parseFloat(secondPrice);
            System.out.println(secondFloatPrice);
            firstPrice = secondPrice;
        }
        return this;
    }
}