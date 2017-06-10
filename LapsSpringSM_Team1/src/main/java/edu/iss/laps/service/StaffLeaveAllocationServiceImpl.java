package edu.iss.laps.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.iss.laps.model.StaffLeaveAllocation;
import edu.iss.laps.repository.StaffLeaveAllocationRepository;

@Service
public class StaffLeaveAllocationServiceImpl implements StaffLeaveAllocationService {
	
	@Resource
	private StaffLeaveAllocationRepository staffLeaveAllocationRepository;
	

	/* (non-Javadoc)
	 * @see edu.iss.cats.service.UserService#findAllUsers()
	 */
	@Override
	@Transactional
	public ArrayList<Integer> findUserIDs() {
		ArrayList<Integer> uil = (ArrayList<Integer>) staffLeaveAllocationRepository.findUserIDs();
		return uil;
	}
}
