package com.task.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AchievementsService {
    @Autowired
    private AchievementsRepository achievementsRepository;

    public void addAchievement(){
        achievementsRepository.save(new Achievement("1","TESTTEST","testTestTest"));
    }

    public List<Achievement> getAllAchievements(){
        return achievementsRepository.findAll();
    }

    public Optional<Achievement> getAchievementById(String id){
        return achievementsRepository.findById(id);
    }
}
