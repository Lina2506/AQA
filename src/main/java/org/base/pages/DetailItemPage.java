package org.base.pages;

import org.base.config.PageTools;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class DetailItemPage extends PageTools {
    private final String header = "//div[contains(@class, 'inventory_details_name')]";
    private final String description = "//div[contains(@class, 'inventory_details_desc') and @data-test='inventory-item-desc']";
    private final String price = "//div[contains(@class, 'inventory_details_price') and @data-test='inventory-item-price']";

    public Item getDetailedItem() {
        Item item = new Item();

        item.setName(getText("xpath", header));
        item.setDescription(getText("xpath", description));
        item.setPrice(getText("xpath", price));

        return item;

    }

}