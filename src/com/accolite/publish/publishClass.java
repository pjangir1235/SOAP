package com.accolite.publish;

import javax.xml.ws.Endpoint;

import com.accolite.service.Service;

public class publishClass {
	public static void main(String[]args)
	{
		Endpoint.publish("http://localhost:8082/Soap/Employee", new Service());
	}
}
