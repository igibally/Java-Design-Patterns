package org.example.dependencyinversion;

public interface Formatter {
	
	public String format(Message message) throws FormatException;
	
}
