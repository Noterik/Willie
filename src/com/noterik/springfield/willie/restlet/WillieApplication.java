package com.noterik.springfield.willie.restlet;

import org.restlet.Application;

import org.restlet.Context;
import org.restlet.Restlet;

public class WillieApplication extends Application {	

    public WillieApplication() {
    	super();
    }
    
    public WillieApplication(Context parentContext) {
    	super(parentContext);
    }
    
    public void start(){
		try{
			super.start();
		}catch(Exception e){
			System.out.println("Error starting application");
			e.printStackTrace();
		}
	} 
    
    /**
	 * Called on shutdown
	 */
	public void stop() throws Exception {
		try {
			super.stop();
		} catch (Exception e) {
			System.out.println("willie: error stopping application");
			e.printStackTrace();
		}
	}

    @Override
    public Restlet createInboundRoot() {		
		return new WillieRestlet(super.getContext());
    }
}
