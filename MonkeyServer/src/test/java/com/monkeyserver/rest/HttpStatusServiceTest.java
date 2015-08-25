package com.monkeyserver.rest;

import com.monkeyserver.utils.HttpCodesMngr;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(BlockJUnit4ClassRunner.class)
public class HttpStatusServiceTest {

    @Test
    public void assignedOnlyHttpCode(){
        HttpCodesMngr httpCodes = new HttpCodesMngr();
        for (int i = 0; i < httpCodes.getStatusList().size(); i++) {
            int assignedOnlyHttpCode = httpCodes.getAssignedOnlyHttpCode();
            assertNotEquals("Unassigned",httpCodes.getStatusMessage(assignedOnlyHttpCode));
        }
    }
}