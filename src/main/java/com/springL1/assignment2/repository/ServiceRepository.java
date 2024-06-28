package com.springL1.assignment2.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.springL1.assignment2.modal.Service;

@Repository
public class ServiceRepository {
	
	public List<Service> findAll(){
		
		return Arrays.asList(
				new Service(1,"abc","Banking"),
				new Service(2,"def","Currency Exchange"),
				new Service(3,"ghi","Saving Account"),
				new Service(4,"jkl","Current Account"),
				new Service(5,"mno","Checking Account"),
				new Service(6,"pqr","Investment Banking"),
				new Service(7,"stu","Cheque Payment"),
				new Service(8,"vwx","Credit cards"),
				new Service(9,"yza","Personal Lons"),
				new Service(10,"bcd","wire transfers"));
		
	}

}
