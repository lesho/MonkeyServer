package com.monkeyserver.utils;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;

@XmlRootElement
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

    public void resetDefaultConfig() {
        configuration.put("rndTimeoutInt", 0);
    }

    public static ConfHolder getInstance(){
        if (instance==null) {
            instance = new ConfHolder();
        }
        return instance;
    }
}