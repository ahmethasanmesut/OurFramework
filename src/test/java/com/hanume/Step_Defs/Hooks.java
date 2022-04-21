package com.hanume.Step_Defs;

import com.hanume.Utilities.Driver;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
