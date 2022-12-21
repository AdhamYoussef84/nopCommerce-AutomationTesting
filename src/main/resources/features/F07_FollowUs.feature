@smoke
  Feature: F07_FollowUs | User can open followUs links

  #Facebook
    Scenario: user opens facebook link
    Given user at home page
    When user click on facebook icon
    Then "https://www.facebook.com/nopCommerce" is opened in new window


  #Twitter
    Scenario: user opens twitter link
      Given user at home page
      When user click on twitter icon
      Then "https://twitter.com/nopCommerce" is opened in new tab

  #Rss
    Scenario: user opens rss link
      Given user at home page
      When user click on rss icon
      Then "https://demo.nopcommerce.com/new-online-store-is-open" is opened in new tab

  #Youtube
    Scenario: user opens youtube link
      Given user at home page
      When user click on youtube icon
      Then https://www.youtube.com/user/nopCommerce" is opened in new tab