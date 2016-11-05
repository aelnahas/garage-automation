package com.ahmedelnahas.automation.core;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * A class to load configuration from a template file
 */
public class AppConfigurations extends Configuration {


    @NotEmpty
    private String defaultName = "GarageAutmation";

    @JsonProperty
    public String getDefaultName() {
        return defaultName;
    }

    @JsonProperty
    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }
}
