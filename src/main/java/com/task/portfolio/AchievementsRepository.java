package com.task.portfolio;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AchievementsRepository extends MongoRepository<Achievement,String> {
}
