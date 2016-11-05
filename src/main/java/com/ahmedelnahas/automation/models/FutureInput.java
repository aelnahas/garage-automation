package com.ahmedelnahas.automation.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by aelnahas on 11/5/2016.
 */
@XmlRootElement
public class FutureInput {

    @XmlElement
    private String status;

    public FutureInput() {
        status = "future";
    }


    public String getStatus() {
        return status;
    }
}
