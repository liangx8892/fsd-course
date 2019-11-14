package com.fsd.sba.service;

import com.fsd.sba.entity.Course;
import com.fsd.sba.entity.CourseComment;
import com.fsd.sba.mapper.CourseMapper;
import com.fsd.sba.model.MentorFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseMapper mapper;

    public List<Course> getAvailableCoursesBySkill(MentorFilter filter) {
        return mapper.getAvailableCoursesBySkill(filter);
    }

    public List<CourseComment> getCourseCommentsForMentors(List<Long> mentorIds) {
        return mapper.getCourseCommentsForMentors(mentorIds);
    }
}
