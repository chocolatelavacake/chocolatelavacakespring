package edu.iss.laps.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.iss.laps.model.Approval;
import edu.iss.laps.repository.ApprovalRepository;

@Service
public class ApprovalServiceImpl implements ApprovalService {
	
	@Resource
	private ApprovalRepository approvalRepository;
	

	/* (non-Javadoc)
	 * @see edu.iss.cats.service.UserService#findAllUsers()
	 */
	@Override
	@Transactional
	public ArrayList<Integer> findUserIDs() {
		ArrayList<Integer> uil = (ArrayList<Integer>) approvalRepository.findUserIDs();
		return uil;
	}
}
