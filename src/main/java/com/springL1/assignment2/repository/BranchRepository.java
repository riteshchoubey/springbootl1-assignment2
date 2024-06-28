package com.springL1.assignment2.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springL1.assignment2.modal.Branch;

@Repository
public class BranchRepository {
	
	public List<Branch> findAll(){
		return Arrays.asList(
				new Branch(1,"abc","M G Road, Bangalore"),
				new Branch(2,"def","Indiranagar, Bangalore"),
				new Branch(3,"ghi","Basavanagudi, Bangalore"),
				new Branch(4,"jkl","Jayanagar, Bangalore"),
				new Branch(5,"mno","Koramanagla, Bangalore"),
				new Branch(6,"pqr","Rajaji Nagar, Bangalore"),
				new Branch(7,"stu","HSR Layout, Bangalore"),
				new Branch(8,"vwx","Frazer Town, Bangalore"),
				new Branch(9,"yza","Ulsoor, Bangalore"),
				new Branch(10,"bcd","Whitefield, Bangalore"));
		
	}

}
