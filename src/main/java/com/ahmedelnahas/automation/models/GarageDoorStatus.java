package com.ahmedelnahas.automation.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by aelnahas on 11/5/2016.
 */
@XmlRootElement
public final class GarageDoorStatus {
    @XmlElement
    private String doorStatus;

    public GarageDoorStatus(){
        doorStatus = "Open";
    }

    public String getDoorStatus(){
        return doorStatus;
    }


}
