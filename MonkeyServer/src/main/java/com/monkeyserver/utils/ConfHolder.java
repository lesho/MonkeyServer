package com.monkeyserver.utils;

import java.util.HashMap;

public class ConfHolder {

    private static ConfHolder instance = null;
    private HashMap configuration = new HashMap();

    private ConfHolder() {
        resetDefaultConfig();
    }

    public HashMap getConfiguration() {
        return configuration;
    }
    public void setConfiguration(HashMap cnf) {
        this.configuration = cnf;
    }

    public boolean getBoolean(String parameter) {
        try {
            return (Boolean) configuration.get(parameter);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Integer getInt(String parameter) {
        try {
            return (Integer) configuration.get(parameter);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
     }

    public String getString(String parameter) {
        try {
            return (String) configuration.get(parameter);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public void resetDefaultConfig() {
        configuration.put("rndTimeoutInt", 0);
        configuration.put("assignedOnlyHttpCode",true);
    }

    public static ConfHolder getInstance(){
        if (instance==null) {
            instance = new ConfHolder();
        }
        return instance;
    }
}