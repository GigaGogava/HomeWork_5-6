package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SortingTestObject {
    public SelenideElement
        searchInput = $("#search_input"),
        clickSrchBtn = $(".ty-search-magnifier"),
        sortField = $("#sw_elm_sort_fields"),
        chooseLowToHigh = $(".sort-by-price-asc"),
        gridList = $(".grid-list"),
        productElement = $(".ty-column3"),
        firstPriceElement = $("#sec_discounted_price_30939"),

        secondPriceElement = $(".ty-price-num");


}

