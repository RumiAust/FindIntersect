package com.example.findintersect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.findintersect.repository.FindIntersectRepo;

@Service
public class FindIntersectService {
    @Autowired
    FindIntersectRepo mFindIntersectRepo;

    public String getIntersection(String data) {
        return mFindIntersectRepo.getIntersectionResult(data);
        //return attendanceRepository.getData(id);
    }
}
