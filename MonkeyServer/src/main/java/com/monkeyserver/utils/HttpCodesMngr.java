package com.monkeyserver.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;

public class HttpCodesMngr extends HttpCodes{


    public String getStatusMessage(int statusCode) {
        return statusList.get(statusCode);
    }

    public Integer getRandomCode() {
        ArrayList<Integer> statusCodes = new ArrayList<Integer>(statusList.keySet());
        return statusCodes.get( new Random().nextInt(statusList.size()) );
    }
}
