package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FuzulUIStepdefinition {

    HomePage homePage = new HomePage();

    @Given("User goes to {string}")
    public void user_goes_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }


    @When("User enter {string} to ara button")
    public void userEnterToAraButton(String text) {
        homePage.searchBar.sendKeys(text);

    }


    @Then("User verifies that results are appears")
    public void userVerifiesThatResultsAreAppears() {
        int size = homePage.title.size();
        for (int i = 0; i < size; i++) {
            assertTrue(homePage.title.get(i).isDisplayed());
            assertTrue(homePage.title.get(i).getText().equalsIgnoreCase("bahçeli müstakil ev"));
        }

    }

    @When("User enter {string} to minumum field")
    public void userEnterToMinumumField(String min) {

        homePage.min.sendKeys(min);
    }

    @When("User enter {string} to maximum field")
    public void userEnterToMaximumField(String max) {
        homePage.max.sendKeys(max);

    }

    @Then("User verifies that the price is between {int} and {int}")
    public void userVerifiesThatThePriceIsBetweenAnd(int min, int max) {
        int size = homePage.price.size();
        List<Integer> prices = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            prices.add(Integer.valueOf(homePage.price.get(i).getText().split(" ")[2]));
        }

        for (Integer w : prices) {
            assertTrue(min < w && w < max);
        }

    }


    @When("User clicks {string} button")
    public void userClicksButton(String text) {
        switch (text) {
            case "Satılık":
                homePage.satilik.click();
                break;
            case "Kiralık":
                homePage.kiralik.click();
                break;
            case "Gunluk":
                homePage.gunluk.click();
                break;

        }


    }


    @Then("User verifies that houeses for {string} are appear")
    public void userVerifiesThatHouesesForAreAppear(String text) {
        switch (text) {
            case "Satılık":
                int size1 = homePage.satilikList.size();
                for (int i = 0; i < size1; i++) {
                    assertEquals(text, homePage.satilikList.get(i).getText().split(" ")[0]);
                }
                break;
            case "Kiralık":
                int size2 = homePage.kiralikList.size();
                for (int i = 0; i < size2; i++) {
                    assertEquals(text, homePage.kiralikList.get(i).getText().split(" ")[0]);
                }
                break;
            case "Günlük":
                int size3 = homePage.gunlukList.size();
                for (int i = 0; i < size3; i++) {
                    assertEquals(text, homePage.gunlukList.get(i).getText().split(" ")[0]);
                }
                break;

        }
    }


    @When("User chooses {string}")
    public void userChooses(String roomCount) {
        switch (roomCount) {
            case "1 + 1":
                homePage.birartibir.click();
                break;
            case "2 + 1":
                homePage.ikiartibir.click();
                break;
            case "3 + 1":
                homePage.ucartibir.click();
                break;
            case "3 + 2":
                homePage.ucartiiki.click();
                break;
            case "4 + 2":
                homePage.dortartiiki.click();
                break;
        }


    }


    @Then("User verifies that results are correct {string}")
    public void userVerifiesThatResultsAreCorrect(String roomCount) {
        switch (roomCount) {
            case "1 + 1":
                int size1 = homePage.birartibirList.size();
                for (int i = 0; i < size1; i++) {
                    String actual = homePage.birartibirList.get(i).getText().split(" ")[0] + " " +
                            homePage.birartibirList.get(i).getText().split(" ")[1] + " " +
                            homePage.birartibirList.get(i).getText().split(" ")[2];
                    assertEquals(roomCount, actual);

                }

                break;
            case "2 + 1":
                int size2 = homePage.ikiartibirList.size();
                for (int i = 0; i < size2; i++) {
                    String actual = homePage.ikiartibirList.get(i).getText().split(" ")[0] + " " +
                            homePage.ikiartibirList.get(i).getText().split(" ")[1] + " " +
                            homePage.ikiartibirList.get(i).getText().split(" ")[2];
                    assertEquals(roomCount, actual);

                }

                break;
            case "3 + 1":
                int size3 = homePage.ucartibirList.size();
                for (int i = 0; i < size3; i++) {
                    String actual = homePage.ucartibirList.get(i).getText().split(" ")[0] + " " +
                            homePage.ucartibirList.get(i).getText().split(" ")[1] + " " +
                            homePage.ucartibirList.get(i).getText().split(" ")[2];
                    assertEquals(roomCount, actual);

                }
                break;
            case "3 + 2":
                int size4 = homePage.ucartiikiList.size();
                for (int i = 0; i < size4; i++) {
                    String actual = homePage.ucartiikiList.get(i).getText().split(" ")[0] + " " +
                            homePage.ucartiikiList.get(i).getText().split(" ")[1] + " " +
                            homePage.ucartiikiList.get(i).getText().split(" ")[2];
                    assertEquals(roomCount, actual);

                }

                break;
            case "4 + 2":
                int size5 = homePage.dortartiikiList.size();
                for (int i = 0; i < size5; i++) {
                    String actual = homePage.dortartiikiList.get(i).getText().split(" ")[0] + " " +
                            homePage.dortartiikiList.get(i).getText().split(" ")[1] + " " +
                            homePage.dortartiikiList.get(i).getText().split(" ")[2];
                    assertEquals(roomCount, actual);

                }
                break;
        }
    }
}
