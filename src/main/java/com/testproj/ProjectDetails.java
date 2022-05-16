package com.testproj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ProjectDetails {
	@Value("${app.domain}")
	    private String appDomain;
	
	@Value("${app.subdomain}")
    private String appSubdomain;
    @Value("${app.rootsubdomain:Default value}")        // This properties is not available so it will return default value
    private String rootsubdomain;
	public String getAppDomain() {
		return appDomain;
	}
	public void setAppDomain(String appDomain) {
		this.appDomain = appDomain;
	}
	public String getAppSubdomain() {
		return appSubdomain;
	}
	public void setAppSubdomain(String appSubdomain) {
		this.appSubdomain = appSubdomain;
	}
	public String getRootsubdomain() {
		return rootsubdomain;
	}
	public void setRootsubdomain(String rootsubdomain) {
		this.rootsubdomain = rootsubdomain;
	}
	  
	    /*public void printProperties(){
	        System.out.println("Domain: "+appDomain);          // It will return properties value from application.properties file, If key will not available than it will return null
	        System.out.println("Sub Domain: "+appSubdomain);
	        System.out.println("Root Domain: "+rootsubdomain);
	    }*/
    
}
