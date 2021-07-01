@loginFeature

  Feature: Login to DoD system https://www.dodsbirsttr.mil/submissions/login

    @loginScenario
    Scenario: Opening Browser and going to Homepage
      Given User open the Chrome Browser
      When User open DoD Submission Site
      And User navigates to Topic modules
      Then User successfully navigates to Topic page