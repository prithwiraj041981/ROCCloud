Feature: Login to ROC Application 
Background:
    Given User is on ROCLogin page on "https://dev.app.rentoncloud.com/"
  
    @ValidCredentialsLandlord
    Scenario: Login with valid Landlord credentials
    When User enters username as "<username>" and password as "<password>"
    Then User should be able to login sucessfully to landlord and new Homepage open
    
    Examples:
    | username   | password |
    | prithwirajroc@mailinator.com | Mylogin@123 |

  