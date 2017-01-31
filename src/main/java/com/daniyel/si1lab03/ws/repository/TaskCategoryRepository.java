package com.daniyel.si1lab03.ws.repository;

import com.daniyel.si1lab03.ws.model.TaskCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Daniyel on 31/01/2017.
 */
@Repository
public interface TaskCategoryRepository extends JpaRepository<TaskCategory, Long>{

}
