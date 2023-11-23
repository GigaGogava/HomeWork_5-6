package StepObject;

import PageObject.SortingTestObject;
import com.codeborne.selenide.ElementsCollection;

import static DataObject.SortingTestData.*;
import static com.codeborne.selenide.Selenide.*;

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
            if (i > secondFloatPrice) {
                System.out.println("Prices are not sorted correctly");
            }
        }

        return this;
    }
    public SortingTestStep fillMinPrice(){
        minPriceElement.setValue(minPrice);
        return this;
    }
    public SortingTestStep fillMaxPrice(){
        maxPriceElement.setValue(maxPrice);
        sleep(6000);
        return this;
    }

    public SortingTestStep testPriceRange() {

        ElementsCollection priceElements = $$(".ty-price-num");
        double maxPrice = Double.MIN_VALUE;
        double minPrice = Double.MAX_VALUE;

        for (int i = 0; i < priceElements.size(); i++) {

            String priceText = priceElements.get(i).getText();
            if (!priceText.isEmpty()) {
                double currentPrice = Double.parseDouble(priceElements.get(i).text());
                if (currentPrice > maxPrice) {
                    maxPrice = currentPrice;
                }

                if (currentPrice < minPrice) {
                    minPrice = currentPrice;
                }
                System.out.println("Highest Price: " + maxPrice);
                System.out.println("Lowest Price: " + minPrice);
            }
        }
        return this;

    }
        }



