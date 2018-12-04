package com.wjk.test.java8;

public interface Defaulable {
	default String notRequired() { 
        return "Default implementation"; 
    }    
}
