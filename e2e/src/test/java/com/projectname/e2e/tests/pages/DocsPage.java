package com.projectname.e2e.tests.pages;

import com.projectname.e2e.tests.pages.common.PageBase;
import com.projectname.e2e.tests.selectors.CustomBy;
import com.projectname.e2e.tests.utils.CheckIfElement;
import com.projectname.e2e.tests.webdriver.CustomWebDriver;
import org.openqa.selenium.By;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;


public class DocsPage extends PageBase{
    public DocsPage(CustomWebDriver driver, String url, String email, String password) {
        super(driver, url, email, password);
    }

    @Override
    public PageBase show() {
        return null;
    }

    @Override
    public boolean isDisplayed() {
        String currentTab = driver.getWindowHandle();
        for (String tab : driver.getWindowHandles()) {
            if (!tab.equals(currentTab)) {
                driver.switchTo().window(tab);
            }
        }

        return CheckIfElement.isDisplayed(CustomBy.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div/div/div[1]/div[2]/div"), driver);
    }
}
