package com.ahmedelnahas.automation.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Created by aelnahas on 11/5/2016.
 */
@XmlRootElement
public class FutureOutput {

    @XmlTransient
    private String status;

    public FutureOutput() {
        status = "on";
    }

    @XmlElement
    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }

}
