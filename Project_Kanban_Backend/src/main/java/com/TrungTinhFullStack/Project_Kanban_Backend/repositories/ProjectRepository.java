package com.TrungTinhFullStack.Project_Kanban_Backend.repositories;

import com.TrungTinhFullStack.Project_Kanban_Backend.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project,Long> {

    @Override
    Iterable<Project> findAllById(Iterable<Long> longs);
}
