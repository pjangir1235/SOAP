package com.accolite.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.accolite.person.Employee;

@WebService(endpointInterface = "com.accolite.mini_au.services.CrudInterface")

public class Service implements serviceInterface {

	List<Employee> list;

	public Service() {
		list = new ArrayList<Employee>();
	}

	@Override
	public Employee deleteEmployee(@WebParam(name = "id") int id) {

		for (Employee p : list) {
			if (p.getId() == id) {
				list.remove(p);
				return p;
			}
		}
		return null;
	}

	@Override
	public boolean addEmployee(@WebParam(name = "id") int id, @WebParam(name = "name") String name,
			@WebParam(name = "email") String email) {

		list.add(new Employee(id, name, email));
		return true;
	}

	@Override
	public Employee updateEmployee(@WebParam(name = "id") int id, @WebParam(name = "name") String name,
			@WebParam(name = "email") String email) {
		for (Employee p : list) {
			if (p.getId() == id) {
				p.setName(name);
				p.setEmail(email);
				return p;
			}
		}
		return null;
	}

	@Override
	public Employee getEmployee(@WebParam(name = "id") int id) {
		for (Employee p : list) {
			if (p.getId() == id)
				return p;
		}
		return null;
	}

}
