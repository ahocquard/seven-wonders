package cucumber

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(
    features = ["use_cases"],
    tags = ["@in_progress and not @todo"],
    glue = ["io.github.ahocquard.sevenwonders"]
)
class RunCukesTests
