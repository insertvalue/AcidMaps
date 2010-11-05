package com.xoomcode.acidmaps.adapter;

import com.xoomcode.acidmaps.core.Configuration;

public class JCAdapter {
	
	private native void interpolateC(Configuration configuration, byte[] out);
	
	static {
		// The runtime system executes a class's static
		// initializer when it loads the class.
		System.loadLibrary("acid-maps-jni");
	}
	
	public void interpolate(Configuration configuration, byte[] out){
		interpolateC(configuration, out);
	}
}
