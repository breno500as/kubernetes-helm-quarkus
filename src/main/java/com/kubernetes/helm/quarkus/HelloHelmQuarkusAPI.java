package com.kubernetes.helm.quarkus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class HelloHelmQuarkusAPI {

	@GET
	public String get(){
		return "Hello Helm Quarkus";
	}
}
