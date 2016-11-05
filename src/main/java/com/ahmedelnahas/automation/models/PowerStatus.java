package com.ahmedelnahas.automation.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by aelnahas on 11/5/2016.
 */
@XmlRootElement
public class PowerStatus {

    @XmlElement
    private String status;

    public PowerStatus() {
        status = "on";
    }

    public String getStatus() {
        return status;
    }
}
