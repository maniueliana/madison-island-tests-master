package org.fasttrackit.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "org.fasttrackit",
        features = "src/test/resouces/features/products-sorting.feature",
        plugin = {"html:target/cucumber-html-reports", "json:target/json-reports/productSorting.json"}
)
public class ProductSortingRunner {
}
