package br.com.caelum.testeGranite.controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;

@Resource
public class HelloController {

	public void test() {
	}
	
	@Path("/http")
	public String testString() {
		return "funciona!";
	}

}
