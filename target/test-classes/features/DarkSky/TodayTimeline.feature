Feature: Temp Summery


  Scenario: Verify the temp values on timeLine is same as its detail section
     Given I am on darksky landing page
      When I scroll on Today timeline
       And I click on a plusButton to expend the bar
      Then I verify the temp values on timeLine is same as detail section