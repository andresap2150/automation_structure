# new feature
# Tags: optional

Feature: Login in netflix

  Scenario Outline: Enter credentials to view results
    Given I am in the login page
    When I set the "<username>" and "<password>"
    Then i should see the "<expected>"
   Examples:
    |username               | password|expected                                                                                          |
    |andresap               |admin123 |No podemos encontrar una cuenta con esta dirección de email. Reinténtalo o crea una cuenta nueva. |
    |andresap2150           |admin123 |No podemos encontrar una cuenta con esta dirección de email. Reinténtalo o crea una cuenta nueva. |
    |andresap2150@gmail.com |admin123 |No podemos encontrar una cuenta con esta dirección de email. Reinténtalo o crea una cuenta nueva. |