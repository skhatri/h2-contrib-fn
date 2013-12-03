package com.github.skhatri.h2contrib;

import java.util.UUID;

public class Function {
    public static final String newId() {
        return UUID.randomUUID().toString();
    }
	
	public static final Long scopeIdentity() {
		return System.currentTimeMillis();
	}
}
