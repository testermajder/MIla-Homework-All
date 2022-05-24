package com.projectname.e2e.tests.pages;

import com.projectname.e2e.tests.pages.common.PageBase;
import com.projectname.e2e.tests.selectors.CustomBy;
import com.projectname.e2e.tests.utils.CheckIfElement;
import com.projectname.e2e.tests.webdriver.CustomWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NavigationBarPage extends PageBase {
    public NavigationBarPage(CustomWebDriver driver, String url, String email, String password) {
        super(driver, url, email, password);
    }

    @Override
    public PageBase show() {
        return null;
    }

    @Override
    public boolean isDisplayed() {
        return CheckIfElement.isDisplayed(CustomBy.id("PHPTRAVELS"), driver);
    }

    private WebElement getDemoBtn() {
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/a[1]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find demo button on Navigation bar page", e);
        }
    }

    public DemoPage openDemoPage() {
        getDemoBtn().click();
        return new DemoPage(driver, url, email, password);
    }

    private WebElement getFeaturesBtn() {
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/div[1]/span"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find features button on Navigation bar page", e);
        }
    }

    private WebElement getFlightsBtn() {
        getFeaturesBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/div[1]/div/a[3]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find flights button on Navigation bar page", e);
        }
    }

    public FlightsPage openFlightsPage() {
        getFlightsBtn().click();
        return new FlightsPage(driver, url, email, password);
    }

    //Mila

    private WebElement getPricingBtn() {
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/a[2]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Pricing button on Navigation bar page", e);
        }
    }

    public PricingPage openPricingPage() {
        getPricingBtn().click();
        return new PricingPage(driver, url, email, password);
    }

    private WebElement getMainFeaturesBtn() {
        getFeaturesBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/div[1]/div/a[1]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Main features button on Navigation bar page", e);
        }
    }

    public MainFeaturesPage openMainFeaturesPage() {
        getMainFeaturesBtn().click();
        return new MainFeaturesPage(driver, url, email, password);
    }

    private WebElement getHotelsModuleBtn() {
        getFeaturesBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/div[1]/div/a[2]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Hotels Module button on Navigation bar page", e);
        }
    }

    public HotelsModulePage openHotelsModulePage() {
        getHotelsModuleBtn().click();
        return new HotelsModulePage(driver, url, email, password);
    }
    private WebElement getToursModulePageBtn() {
        getFeaturesBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/div[1]/div/a[4]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Tours Module page button on Navigation bar page", e);
        }
    }

    public ToursModulePage openToursModulePage() {
        getToursModulePageBtn().click();
        return new ToursModulePage(driver, url, email, password);
    }
    private WebElement getCarsModulePageBtn() {
        getFeaturesBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/div[1]/div/a[5]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Cars Module page button on Navigation bar page", e);
        }
    }

    public CarsModulePage openCarsModulePage() {
        getCarsModulePageBtn().click();
        return new CarsModulePage(driver, url, email, password);
    }

    private WebElement getOffersModulePageBtn() {
        getFeaturesBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/div[1]/div/a[6]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Offers Module page button on Navigation bar page", e);
        }
    }

    public OffersModulePage openOffersModulePage() {
        getOffersModulePageBtn().click();
        return new OffersModulePage(driver, url, email, password);
    }

    private WebElement getBlogModulePageBtn() {
        getFeaturesBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/div[1]/div/a[7]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Blog Module page button on Navigation bar page", e);
        }
    }

    public BlogModulePage openBlogsModulePage() {
        getBlogModulePageBtn().click();
        return new BlogModulePage(driver, url, email, password);
    }

    private WebElement getNewsLetterModulePageBtn() {
        getFeaturesBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/div[1]/div/a[8]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Newsletter Module page button on Navigation bar page", e);
        }
    }

    public NewsLetterModulePage openNewsLetterModulePage() {
        getNewsLetterModulePageBtn().click();
        return new NewsLetterModulePage(driver, url, email, password);
    }

    private WebElement getCMSModulePageBtn() {
        getFeaturesBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/div[1]/div/a[9]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find CMS Module page button on Navigation bar page", e);
        }
    }

    public CMSModulePage openCMSModulePage() {
        getCMSModulePageBtn().click();
        return new CMSModulePage(driver, url, email, password);
    }

    private WebElement getProductBtn() {
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/div[2]/span"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Product button on Navigation bar page", e);
        }
    }

    public ProductPage openProductPage() {
        getProductBtn().click();
        return new ProductPage(driver, url, email, password);
    }

    private WebElement getIntegrationsPage() {
        getProductBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/div[2]/div/a[1]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Integrations page button on Navigation bar page", e);
        }
    }

    public IntegrationsPage openIntegrationsPage() {
        getIntegrationsPage().click();
        return new IntegrationsPage(driver, url, email, password);
    }

    private WebElement getProductServices() {
        getProductBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/div[2]/div/a[2]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Product services page button on Navigation bar page", e);
        }
    }

    public ProductServicesPage openProductServicesPage() {
        getProductServices().click();
        return new ProductServicesPage(driver, url, email, password);
    }

    private WebElement getCustomizations() {
        getProductBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/div[2]/div/a[3]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Customizations page button on Navigation bar page", e);
        }
    }

    public CustomizationsPage openCustomizationsPage() {
        getCustomizations().click();
        return new CustomizationsPage(driver, url, email, password);
    }

    private WebElement getAPIXMLIntegration() {
        getProductBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/div[2]/div/a[4]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find API XML Integration page button on Navigation bar page", e);
        }
    }

    public APIXMLIntegrationPage openAPIXMLIntegrationPage() {
        getAPIXMLIntegration().click();
        return new APIXMLIntegrationPage(driver, url, email, password);
    }

    private WebElement getSuppliersList() {
        getProductBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/div[2]/div/a[5]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Suppliers list page button on Navigation bar page", e);
        }
    }

    public SuppliersListPage openSuppliersList() {
        getSuppliersList().click();
        return new SuppliersListPage(driver, url, email, password);
    }

    private WebElement getProvidersPage() {
        getProductBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/div[2]/div/a[6]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Providers page button on Navigation bar page", e);
        }
    }

    public ProvidersPage openProvidersPage() {
        getProvidersPage().click();
        return new ProvidersPage(driver, url, email, password);
    }

    private WebElement getTechnologyPage() {
        getProductBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/div[2]/div/a[7]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Technology page button on Navigation bar page", e);
        }
    }

    public TechnologyPage openTechnologyPage() {
        getTechnologyPage().click();
        return new TechnologyPage(driver, url, email, password);
    }

    private WebElement getRequirementsPage() {
        getProductBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/div[2]/div/a[8]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Requirements page button on Navigation bar page", e);
        }
    }

    public RequirementsPage openRequirementsPage() {
        getRequirementsPage().click();
        return new RequirementsPage(driver, url, email, password);
    }

    private WebElement getChangelogPage() {
        getProductBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/div[2]/div/a[9]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Changelog page button on Navigation bar page", e);
        }
    }

    public ChangelogPage openChangelogPage() {
        getChangelogPage().click();
        return new ChangelogPage(driver, url, email, password);
    }

    private WebElement getMobilesAppPage() {
        getProductBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/div[2]/div/a[10]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Mobiles App page button on Navigation bar page", e);
        }
    }

    public MobilesAppPage openMobilesAppPage() {
        getMobilesAppPage().click();
        return new MobilesAppPage(driver, url, email, password);
    }


    private WebElement getDocsPage() {
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/a[3]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Docs page button on Navigation bar page", e);
        }
    }

    public DocsPage openDocsPage() {
        getDocsPage().click();
        return new DocsPage(driver, url, email, password);
    }

    private WebElement getLoginPage() {
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/a[4]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Login page button on Navigation bar page", e);
        }
    }

    public LoginPageTest openLoginPage() {
        getLoginPage().click();
        return new LoginPageTest(driver, url, email, password);
    }
}
