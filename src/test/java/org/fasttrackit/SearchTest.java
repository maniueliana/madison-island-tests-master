package org.fasttrackit;

import org.fasttrackit.pageobjects.Header;
import org.fasttrackit.pageobjects.ProductsGrid;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SearchTest extends TestBase {

    @Test
    public void searchByOneKeywordTest() {
        Header header =
                PageFactory.initElements(driver, Header.class);

        String keyword = "vase";
        header.search(keyword);

        String searchFieldValue = header.getSearchField().getAttribute("value");
        assertThat("Searched keyword not preserved in search field",
                searchFieldValue, is(keyword));

        ProductsGrid productsGrid =
                PageFactory.initElements(driver, ProductsGrid.class);

        for (WebElement container : productsGrid.getProductNameContainers()) {
            String productName = container.getText();

            System.out.println(productName);
            assertThat("Some of the product names do not contain the searched keyword",
                    productName, containsString(keyword.toUpperCase()));
        }
    }
}
