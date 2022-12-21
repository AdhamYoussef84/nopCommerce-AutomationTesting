@smoke
  Feature: F08_FollowUs | User can open followUs links

    Background: user at homePage
      Given user navigate to homePage

  #Facebook
    Scenario: user opens facebook link
    When user click on facebook icon
    Then facebook tab is opened in new tab

  #Twitter
    Scenario: user opens twitter link
      When user click on twitter icon
      Then twitter tab is opened in new tab

  #Rss
    Scenario: user opens rss link
      When user click on rss icon
      Then rss tab is opened in new tab

  #Youtube
    Scenario: user opens youtube link
      When user click on youtube icon
      Then youtube tab is opened in new tab
