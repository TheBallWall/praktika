package com.task.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/achievements")
public class AchievementsController {

    @Autowired
    private AchievementsService achievementsService;

    @RequestMapping("/addTest")
    public void addTest() {
        achievementsService.addAchievement();
    }

    @RequestMapping("/all")
    @ResponseBody
    public List<Achievement> getAchievements() {
        System.out.println(achievementsService.getAllAchievements());
        return achievementsService.getAllAchievements();
    }

    @RequestMapping("/{id}")
    public String getAchievement(@PathVariable String id) {
        System.out.println(achievementsService.getAchievementById(id));
        return achievementsService.getAchievementById(id).toString();
    }
}
