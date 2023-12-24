@REAL
Feature: Fuzul_RealEstate

  @smoke
  Scenario: TC001_Search_bar_testing
    Given User goes to "url"
    When User enter "Bahçeli müstakil ev" to ara button
    Then User verifies that results are appears

  @smoke
  Scenario: TC002_Minumum_Maximum_Price_Testing
    Given User goes to "url"
    When User enter "2000" to minumum field
    When User enter "10000" to maximum field
    Then User verifies that the price is between 2000 and 10000

  @smoke
  Scenario: TC003_Satilik_House_Testing
    Given User goes to "url"
    When User clicks "Satılık" button
    Then User verifies that houeses for "Satılık" are appear


  @smoke
  Scenario: TC004_Gunluk_House_Testing
    Given User goes to "url"
    When User clicks "Günlük" button
    Then User verifies that houeses for "Günlük" are appear

  @smoke
  Scenario Outline: TC05_Room_count_testing "<room_count>"
    Given User goes to "url"
    When User chooses "<room_count>"
    Then User verifies that results are correct "<room_count>"
    Examples:
      | room_count |
      | 1 + 1      |
      | 2 + 1      |
      | 3 + 1      |
      | 3 + 2      |
      | 4 + 2      |