package edu.iss.laps.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.iss.laps.model.LeaveRecord;
import edu.iss.laps.model.LeaveRecordPK;

public interface LeaveRecordRepository extends JpaRepository<LeaveRecord, LeaveRecordPK>{
	
	@Query("SELECT lr.uid_lrd FROM LeaveRecord lr")
	ArrayList<Integer> findUserIDs();
}