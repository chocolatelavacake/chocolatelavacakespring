package edu.iss.laps.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.iss.laps.model.LeaveRecord;
import edu.iss.laps.repository.LeaveRecordRepository;

@Service
public class LeaveRecordServiceImpl implements LeaveRecordService {
	
	@Resource
	private LeaveRecordRepository leaveRecordRepository;
	

	/* (non-Javadoc)
	 * @see edu.iss.cats.service.UserService#findAllUsers()
	 */
	@Override
	@Transactional
	public ArrayList<Integer> findUserIDs() {
		ArrayList<Integer> uil = (ArrayList<Integer>) leaveRecordRepository.findUserIDs();
		return uil;
	}
}
