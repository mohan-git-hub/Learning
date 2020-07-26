package com.home.dependencies;

import java.util.Properties;

public class SystemPropsClass {
	String systemsettings;
	Properties props;
	public SystemPropsClass() {
		this.systemsettings = System.getProperty("user.home");
		
		System.out.println(System.getenv("OS"));
		System.out.println(System.getenv("TEMP"));
		System.out.println(System.getenv("JAVA_HOME"));
	}
	
	public static void main(String[] args) {
		
		SystemPropsClass SPC = new SystemPropsClass();
		System.out.println(SPC.systemsettings);
	}
	
}
