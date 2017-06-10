package edu.iss.laps.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.iss.laps.model.StaffLeaveAllocation;
import edu.iss.laps.model.StaffLeaveAllocationPK;

public interface StaffLeaveAllocationRepository extends JpaRepository<StaffLeaveAllocation, StaffLeaveAllocationPK>{
	
	@Query("SELECT sla.uid_usr FROM StaffLeaveAllocation sla")
	ArrayList<Integer> findUserIDs();
}