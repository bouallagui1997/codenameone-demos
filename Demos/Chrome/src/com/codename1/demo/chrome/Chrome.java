package com.codename1.demo.chrome;


import com.codename1.ui.Display;
import userclasses.StateMachine;

public class Chrome {
   
    public void init(Object context) {
    }

    public void start() {
        new StateMachine("/theme");        
    }

    public void stop() {
    }
    
    public void destroy() {
    }
}
