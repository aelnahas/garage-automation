package com.ahmedelnahas.automation.resources;

import com.ahmedelnahas.automation.models.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/pi4jhomeservice")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public class Pi4jHomeService {
    private GarageDoorStatus garageStatus;
    private GarageDoorControl garageDoorControl;
    private PowerStatus powerStatus;
    private FutureInput futureInput;
    private FutureOutput futureOutput;

    public Pi4jHomeService() {
        garageStatus = new GarageDoorStatus();
        garageDoorControl = new GarageDoorControl();
        powerStatus = new PowerStatus();
        futureInput = new FutureInput();
        futureOutput = new FutureOutput();
    }

    @GET
    @Path("/futureinput")
    public FutureInput getFutureInSts() {
        return futureInput;
    }

    @GET
    @Path("/garagedoorstatus")
    public GarageDoorStatus getGarageDoorSts() {
        return garageStatus;
    }


    //Get Status of Pi's power.
    @GET
    @Path("/powerstatus")
    public PowerStatus getPiPower()
    {
        return powerStatus;
    }

    //Get status of garagedoor relay output
    @GET
    @Path("/garagedoorcontrol")
    public GarageDoorControl getGarageControlSts()
    {
        return garageDoorControl;
    }

    // Change state of the door controller
    @PUT
    @Path("/garagedoorcontrol")
    public GarageDoorControl setGarageDoorState(@QueryParam("state") String state) {
        garageDoorControl.setControlState(state);
        return garageDoorControl;
    }

    }
