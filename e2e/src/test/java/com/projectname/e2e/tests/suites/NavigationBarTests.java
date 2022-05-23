package com.projectname.e2e.tests.suites;

import com.projectname.e2e.tests.environment.ConfigSetup;
import com.projectname.e2e.tests.pages.*;
import com.projectname.e2e.tests.suites.common.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.projectname.api.client.utils.Allure.logStep;

public class NavigationBarTests extends TestBase {

    @Test
    public void verifyDemoButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        DemoPage demoPage = navigationBarPage.openDemoPage();

        Assert.assertTrue(demoPage.isDisplayed());
    }

    @Test
    public void verifyFlightsButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        FlightsPage flightsPage = navigationBarPage.openFlightsPage();

        Assert.assertTrue(flightsPage.isDisplayed());
    }

    @Test
    public void verifyPricingButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        PricingPage pricingPage = navigationBarPage.openPricingPage();

        Assert.assertTrue(pricingPage.isDisplayed());
    }

    @Test
    public void verifyMainFeaturesButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        MainFeaturesPage mainFeaturesPage = navigationBarPage.openMainFeaturesPage();

        Assert.assertTrue(mainFeaturesPage.isDisplayed());
    }

    @Test
    public void verifyHotelsModuleButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        HotelsModulePage hotelsModulePage = navigationBarPage.openHotelsModulePage();

        Assert.assertTrue(hotelsModulePage.isDisplayed());
    }

    @Test
    public void verifyToursModuleButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        ToursModulePage toursModulePage = navigationBarPage.openToursModulePage();

        Assert.assertTrue(toursModulePage.isDisplayed());
    }

    @Test
    public void verifyCarsModuleButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        CarsModulePage carsModulePage = navigationBarPage.openCarsModulePage();

        Assert.assertTrue(carsModulePage.isDisplayed());
    }

    @Test
    public void verifyOffersModuleButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        OffersModulePage offersModulePage = navigationBarPage.openOffersModulePage();

        Assert.assertTrue(offersModulePage.isDisplayed());
    }

    @Test
    public void verifyBlogModuleButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        BlogModulePage blogModulePage = navigationBarPage.openBlogsModulePage();

        Assert.assertTrue(blogModulePage.isDisplayed());
    }

    @Test
    public void verifyNewsLetterModuleButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        NewsLetterModulePage newsLetterModulePage = navigationBarPage.openNewsLetterModulePage();

        Assert.assertTrue(newsLetterModulePage.isDisplayed());
    }

    @Test
    public void verifyCMSButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        CMSModulePage CMSModulePage = navigationBarPage.openCMSModulePage();

        Assert.assertTrue(CMSModulePage.isDisplayed());
    }

    @Test
    public void verifyProductButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        ProductPage productPage = navigationBarPage.openProductPage();

        Assert.assertTrue(productPage.isDisplayed());
    }

    @Test
    public void verifyIntegrationsButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        IntegrationsPage integrationsPage = navigationBarPage.openIntegrationsPage();

        Assert.assertTrue(integrationsPage.isDisplayed());
    }

    @Test
    public void verifyProductServicesButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        ProductServicesPage productServicesPage = navigationBarPage.openProductServicesPage();

        Assert.assertTrue(productServicesPage.isDisplayed());
    }

    @Test
    public void verifyCustomizationsButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        CustomizationsPage customizationsPage = navigationBarPage.openCustomizationsPage();

        Assert.assertTrue(customizationsPage.isDisplayed());
    }

    @Test
    public void verifyAPIXMLIntegrationButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        APIXMLIntegrationPage apixmlIntegrationPage = navigationBarPage.openAPIXMLIntegrationPage();

        Assert.assertTrue(apixmlIntegrationPage.isDisplayed());
    }

    @Test
    public void verifySuppliersListButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        SuppliersListPage suppliersListPage = navigationBarPage.openSuppliersList();

        Assert.assertTrue(suppliersListPage.isDisplayed());
    }

    @Test
    public void verifyProviderButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        ProvidersPage providersPage = navigationBarPage.openProvidersPage();

        Assert.assertTrue(providersPage.isDisplayed());
    }

    @Test
    public void verifyTechnologyPageIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        TechnologyPage technologyPage = navigationBarPage.openTechnologyPage();

        Assert.assertTrue(technologyPage.isDisplayed());
    }

    @Test
    public void verifyRequirementsPageIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        RequirementsPage requirementsPage = navigationBarPage.openRequirementsPage();

        Assert.assertTrue(requirementsPage.isDisplayed());
    }

    @Test
    public void verifyChangelogPageIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        ChangelogPage changelogPage = navigationBarPage.openChangelogPage();

        Assert.assertTrue(changelogPage.isDisplayed());
    }

    @Test
    public void verifyMobilesAppPageIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        MobilesAppPage mobilesAppPage = navigationBarPage.openMobilesAppPage();

        Assert.assertTrue(mobilesAppPage.isDisplayed());
    }

    @Test
    public void verifyDocsPageIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        DocsPage docsPage = navigationBarPage.openDocsPage();

        Assert.assertTrue(docsPage.isDisplayed());
    }
    @Test
    public void verifyLoginPageIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        LoginPageTest loginPage = navigationBarPage.openLoginPage();

        Assert.assertTrue(loginPage.isDisplayed());
    }
}
