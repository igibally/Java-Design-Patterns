package org.example.dependencyinversion;

import java.io.IOException;

public class FormatException extends IOException {
	
	public FormatException(Exception cause) {
		super(cause);
	}
}
