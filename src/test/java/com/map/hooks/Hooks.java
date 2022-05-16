package com.map.hooks;

import com.maps.utils.DriverManager;
import com.maps.utils.VideoManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;

import java.io.IOException;

public class Hooks {

//    @Before
//    public void initialize() throws Exception {
//        new VideoManager().startRecording();
//    }
//
//    @After
//    public void quit(Scenario scenario) throws IOException {
//        if (scenario.isFailed()) {
//            byte[] screenshot = new DriverManager().getDriver().getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png", scenario.getName());
//        }
//
//        new VideoManager().stopRecording(scenario.getName());
//    }
}
