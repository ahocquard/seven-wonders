package cucumber

import cucumber.api.Scenario
import cucumber.api.java8.En

class DummyDefinition: En {

    init {
        Before { scenario: Scenario ->
        }

        Given("^a new assertion$") {
        }

        And("^another assertion$") {
        }

        When("^I do an action$") {
        }

        Then("^this action is done$") {
        }
    }
}
