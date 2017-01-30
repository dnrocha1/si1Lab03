package com.daniyel.si1lab03.ws.repository;

import com.daniyel.si1lab03.ws.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Daniyel on 30/01/2017.
 */

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
