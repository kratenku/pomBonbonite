package runners;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(
        key = GLUE_PROPERTY_NAME,
        value = "stepDefinitions,co.com.bon.bonite.helper"
)
@ConfigurationParameter(
        key = FILTER_TAGS_PROPERTY_NAME,
        value = "@1_loginModificar"
)

@ConfigurationParameter(
        key = PLUGIN_PROPERTY_NAME,
        value = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
)
public class runnerLogin {
}