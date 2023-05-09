package com.example.findintersect.repository;

import com.example.findintersect.helper.FindIntersectHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FindIntersectRepo {
    FindIntersectHelper mHelper;
    public String getIntersectionResult(String data) {
        mHelper.calculateIntersection(data);
        return "";

      //  return attendanceRepository.getData(id);
    }

}
