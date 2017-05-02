package com.noterik.springfield.willie.restlet;

import org.restlet.Context;
import org.restlet.routing.Router;

public class WillieRestlet extends Router {	
	public WillieRestlet(Context cx) {
		super(cx);
		
		// logging resource
		this.attach("/logging",LoggingResource.class);
		
		// default resource
		this.attach("/",WillieResource.class);
	}
}
