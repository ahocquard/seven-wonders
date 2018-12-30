Feature: Setup the game when the players start a new party

  @todo
  Scenario: A Wonders board and the face to be used during the party are randomly provided to each player
    Given several players
    And the 7 Wonders board of the game
    When the players want to start a new party
    Then each player has a Wonders board randomly picked
    And each player has the face of the board to use during the party which is randomly picked also

  @in_progress
  Scenario: 3 coins are provided to each player when players start a new party
    Given several players
    When the players start a new party
    Then each player has 3 coins

  @todo
  Scenario: There is one deck of card per age depending of the number of players
    Given a number of players between 3 and 7
    When the players start a new party
    Then there is one deck per age with only the used card based on the number of users
    And there is 7 cards per player per age

  @todo
  Scenario: The deck of the third age has 5 guilds randomly picked among the 10 guild cards when there are 3 players
    Given 3 players
    When the players start a new party
    Then there the deck of the third age has 5 guilds randomly picked

  @todo
  Scenario: The deck of the third age has 6 guilds randomly picked among the 10 guild cards when there are 3 players
    Given 4 players
    When the players start a new party
    Then there the deck of the third age has 6 guilds randomly picked

  @todo
  Scenario: The deck of the third age has 7 guilds randomly picked among the 10 guild cards when there are 3 players
    Given 5 players
    When the players start a new party
    Then there the deck of the third age has 7 guilds randomly picked

  @todo
  Scenario: The deck of the third age has 8 guilds randomly picked among the 10 guild cards when there are 3 players
    Given 6 players
    When the players start a new party
    Then there the deck of the third age has 8 guilds randomly picked

  @todo
  Scenario: The deck of the third age has 9 guilds randomly picked among the 10 guild cards when there are 3 players
    Given 7 players
    When the players start a new party
    Then there the deck of the third age has 9 guilds randomly picked

