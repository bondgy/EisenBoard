package com.EisenBoard.WebAppDev.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.EisenBoard.WebAppDev.dto.TaskDTO;

public interface TaskRepository extends CrudRepository<TaskDTO, Long> {

	/*
	 * Finds all of the tasks in a given week based on their week value
	 * @returns: a list of tasks in the given week
	 */
	@Query(nativeQuery = true, value="SELECT * FROM Tasks WHERE Week = :week ;")
	public List<TaskDTO> findAllByWeek(@Param("week") int week);
}
