package com.example.findintersect.service;

import com.example.findintersect.model.FindIntersect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.findintersect.repository.FindIntersectRepo;

@Service
public class FindIntersectService {
    @Autowired
    FindIntersectRepo mFindIntersectRepo;

    public FindIntersect getIntersection(String data) {
        return mFindIntersectRepo.getIntersectionResult(data);
        //return attendanceRepository.getData(id);
    }
}
