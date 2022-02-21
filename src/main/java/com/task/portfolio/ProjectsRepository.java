
package com.task.portfolio;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectsRepository extends MongoRepository<Project, String> {
}
