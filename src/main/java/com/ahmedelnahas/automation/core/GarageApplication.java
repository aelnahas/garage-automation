package com.ahmedelnahas.automation.core;

import com.ahmedelnahas.automation.resources.Pi4jHomeService;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * The core application class. This will help initialize the application and run.
 *
 */
public class GarageApplication extends Application<AppConfigurations> {

    public static void main(String[] args) throws Exception {
        new GarageApplication().run(args);
    }


    @Override
    public String getName() {return "garage-automation";}

    /**
     * Initializes the application
     * @param bootstrap
     */
    @Override
    public void initialize(Bootstrap<AppConfigurations> bootstrap){

    }

    /**
     * runs the application
     * @param appConfigurations
     * @param environment
     * @throws Exception
     */
    public void run(AppConfigurations appConfigurations, Environment environment) throws Exception {
        final Pi4jHomeService garageResource = new Pi4jHomeService();

        environment.jersey().register(garageResource);
    }
}
