package edu.iss.laps.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.iss.laps.model.Calendar;
import edu.iss.laps.repository.CalendarRepository;

import java.util.Date;

@Service
public class CalendarServiceImpl implements CalendarService {
	
	@Resource
	private CalendarRepository calendarRepository;
	

	/* (non-Javadoc)
	 * @see edu.iss.cats.service.UserService#findAllUsers()
	 */
	@Override
	@Transactional
	public ArrayList<Date> findDates() {
		ArrayList<Date> dl = (ArrayList<Date>) calendarRepository.findDates();
		return dl;
	}
}
