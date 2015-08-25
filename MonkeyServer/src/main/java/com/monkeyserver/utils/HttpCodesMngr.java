package com.monkeyserver.utils;

import java.util.ArrayList;
import java.util.Random;

public class HttpCodesMngr extends HttpCodes{

    ArrayList<Integer> statusCodes = new ArrayList<Integer>(statusList.keySet());

    public String getStatusMessage(int statusCode) {
        return statusList.get(statusCode);
    }

    public int getRandomCode() {

        return statusCodes.get( new Random().nextInt(statusList.size()));
    }

    public int getAssignedOnlyHttpCode(){
        while (true){
            int assignedCode = statusCodes.get(new Random().nextInt(statusList.size()));
            if (!"Unassigned".equals(statusList.get(assignedCode))) {
                return assignedCode;
            }
        }
    }
}
