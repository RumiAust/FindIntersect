package com.example.findintersect.repository;

import com.example.findintersect.helper.FindIntersectHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FindIntersectRepo {
    @Autowired
    FindIntersectHelper mHelper;
    public String getIntersectionResult(String data) {
        System.out.println("data is : "+data);
        Integer arrayOne[] = new Integer []{2, 3, 4, 5, 6,9,9,9,100};
        Integer arrayTwo[] =  new Integer[]{4, 6, 7, 8, 9,11,13,19,100,3};
       String res= mHelper.calculateIntersection(arrayOne,arrayTwo);
        return res;

      //  return attendanceRepository.getData(id);
    }

}
