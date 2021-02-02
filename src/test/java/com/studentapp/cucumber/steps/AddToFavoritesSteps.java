package com.studentapp.cucumber.steps;

import cucumber.api.java.After;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToFavoritesSteps {
    @Managed
    WebDriver driver;

    @When("^User enters an email: (.+)$")
    public void enterEmail(String email) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
    }

    @When("^User enters a password: (.+)$")
    public void enterPassword(String password) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
    }

    @When("^User clicks search field$")
    public void user_clicks_Search_line() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div/input['mixcloud_query']")).click();
    }

    @When("^User enters (.+) in the Search field$")
    public void userEntersArtistName(String artistName) throws Throwable {
        driver.findElement(By.xpath("//div/input['mixcloud_query']")).sendKeys(artistName);
        Thread.sleep(7000);
    }

    @When("Following to Martin Garrix page")
    public void userFollowingPageArtist() throws Throwable {
        driver.findElement(By.xpath("//img[@alt='Martin Garrix']")).click();
        Thread.sleep(4000);
    }

    @When("User add song Show")
    public void userAddSong() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/div/div/div[3]/div/div[3]/main/div[1]/div/div/div/div[1]/div[1]/div/div/div[3]/div/div[1]")).click();
        Thread.sleep(4000);
    }

    @When("User enter my Profile")
    public void userEnterProfile() throws Throwable {
        driver.findElement(By.xpath("//img[@alt='ManchukDasha']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/div[2]/div/div[3]/div[3]/div[2]/div/div/div[1]/a")).click();
        Thread.sleep(2000);

    }

    @When("User delete song Show")
    public void userDeleteSong() throws Throwable {
        WebElement favoriteSong = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/div[3]/div/div[3]/main/div[1]/div/div/div[1]/div/div/div/div[1]/span"));
        Assert.assertTrue(favoriteSong.isDisplayed());
        favoriteSong.click();
        Thread.sleep(2000);
    }
}
