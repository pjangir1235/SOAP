package com.accolite.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.accolite.person.Employee;

@WebService
public interface serviceInterface {
	@WebMethod	Employee getEmployee(@WebParam(name="id")int id);
	@WebMethod boolean addEmployee(@WebParam(name="id") int id,@WebParam(name="name") String name,@WebParam(name="email") String email);
	@WebMethod Employee updateEmployee(@WebParam(name="id") int id,@WebParam(name="name") String name,@WebParam(name="email") String email);
	@WebMethod Employee deleteEmployee(@WebParam(name="id") int id);

}
