package com.ahmedelnahas.automation.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by aelnahas on 11/5/2016.
 */
@XmlRootElement
public class GarageDoorControl {

    @XmlTransient
    private String controlState;
    private final Lock lock;

    public GarageDoorControl() {
        controlState = "enabled";
        lock = new ReentrantLock();
    }

    @XmlElement
    public String getControlState() {
        return controlState;
    }

    public void setControlState(String controlState) {
        this.controlState = controlState;
    }
}
