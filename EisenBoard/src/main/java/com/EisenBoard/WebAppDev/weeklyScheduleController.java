package com.EisenBoard.WebAppDev;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.EisenBoard.WebAppDev.dto.TaskDTO;
import com.EisenBoard.WebAppDev.repositories.TaskRepository;

@RestController
@RequestMapping("weekly-schedule")
public class weeklyScheduleController {
	
	@Autowired
	private TaskRepository repo;

	/*
	 * Endpoint for getting the tasks in a given week based on the week value
	 * @returns: all the tasks in the given week 
	 */
	@GetMapping("/{week}")
	public @ResponseBody List<TaskDTO> getWeeklyTasks(@PathVariable int week){
		return repo.findAllByWeek(week);
	}
}
