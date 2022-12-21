package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P08_FollowUs {

   public WebElement homePage() {
       WebElement homePage = Hooks.driver.findElement(By.xpath("//div[@class='header-logo']/a"));
       return homePage;
   }

    public WebElement facebookIcon() {
        WebElement facebookIcon = Hooks.driver.findElement(By.cssSelector("li.facebook"));
        return facebookIcon;
    }

    public WebElement twitterIcon() {
        WebElement twitterIcon = Hooks.driver.findElement(By.cssSelector("li.twitter"));
        return twitterIcon;
    }

    public WebElement rssIcon() {
        WebElement rssIcon = Hooks.driver.findElement(By.cssSelector("li.rss"));
        return rssIcon;
    }

    public WebElement youtubeIcon() {
        WebElement youtubeIcon = Hooks.driver.findElement(By.cssSelector("li.youtube"));
        return youtubeIcon;
    }
    }
