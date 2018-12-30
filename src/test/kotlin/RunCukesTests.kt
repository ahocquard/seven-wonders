package cucumber

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(
    features = ["use_cases"],
    tags = ["@in_progress and not @todo"]
)
class RunCukesTests
