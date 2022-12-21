package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P08_FollowUs;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class D08_followUsStepDefinition {
    P08_FollowUs register = new P08_FollowUs();

    @Given("user navigate to homePage")
    public void homePage() {
         register.homePage().click();
    }

    @When("user click on facebook icon")
    public void facebookIcon() {
        register.facebookIcon().click();
    }

    @When("user click on twitter icon")
    public void twitterIcon() {
        register.twitterIcon().click();
    }

    @When("user click on rss icon")
    public void rssIcon() {
        register.rssIcon().click();
    }

    @When("user click on youtube icon")
    public void youtubeIcon() {
        register.youtubeIcon().click();
    }


    @Then("facebook tab is opened in new tab")
    public void facebookTab() {
        List<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        try {
            Thread.sleep(3000);
            Hooks.driver.switchTo().window(tabs.get(1));
        } catch (IndexOutOfBoundsException exp) {
            System.out.println("Only one tab exist with url :" + Hooks.driver.getCurrentUrl());
        } catch (InterruptedException exp) {
            exp.printStackTrace();
        }

        String actualFbResult = "https://www.facebook.com/nopCommerce";
        String expectedFbResult = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(expectedFbResult, actualFbResult);
    }


    @Then("twitter tab is opened in new tab")
    public void twitterTab() {
        List<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        try {
            Thread.sleep(3000);
            Hooks.driver.switchTo().window(tabs.get(1));
        } catch (IndexOutOfBoundsException exp) {
            System.out.println("Only one tab exist with url :" + Hooks.driver.getCurrentUrl());
        } catch (InterruptedException exp) {
            exp.printStackTrace();
        }

        String actualTwResult = "https://twitter.com/nopCommerce";
        String expectedTwResult = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(expectedTwResult, actualTwResult);
    }

    @Then("rss tab is opened in new tab")
    public void rssTab() {
        List<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        try {
            Thread.sleep(3000);
            Hooks.driver.switchTo().window(tabs.get(1));
        } catch (IndexOutOfBoundsException exp) {
            System.out.println("Only one tab exist with url :" + Hooks.driver.getCurrentUrl());
        } catch (InterruptedException exp) {
            exp.printStackTrace();
        }

        String actualRssResult = "https://demo.nopcommerce.com/new-online-store-is-open";
        String expectedRssResult = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(expectedRssResult, actualRssResult);
    }

    @Then("youtube tab is opened in new tab")
    public void youtubeTab() {
        List<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        try {
            Thread.sleep(3000);
            Hooks.driver.switchTo().window(tabs.get(1));
        } catch (IndexOutOfBoundsException exp) {
            System.out.println("Only one tab exist with url :" + Hooks.driver.getCurrentUrl());
        } catch (InterruptedException exp) {
            exp.printStackTrace();
        }

        String actualYtResult = "https://www.youtube.com/user/nopCommerce";
        String expectedYtResult = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(expectedYtResult, actualYtResult);
    }

     }