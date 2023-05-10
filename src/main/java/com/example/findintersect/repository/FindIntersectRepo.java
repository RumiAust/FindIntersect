package com.example.findintersect.repository;

import com.example.findintersect.helper.FindIntersectHelper;
import com.example.findintersect.model.FindIntersect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Arrays;

@Repository
public class FindIntersectRepo {
    @Autowired
    FindIntersectHelper mHelper;
    public FindIntersect getIntersectionResult(String listOne, String listTwo, String hashKey) {

        int[] listA = Arrays.stream(listOne.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] listB = Arrays.stream(listTwo.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        Integer[] arrayOne = Arrays.stream( listA ).boxed().toArray( Integer[]::new );
        Integer[] arrayTwo = Arrays.stream( listB ).boxed().toArray( Integer[]::new );
       // Integer arrayOne[] = new Integer []{2, 3, 4, 5, 6,9,9,9,100};
        // Integer arrayTwo[] =  new Integer[]{4, 6, 7, 8, 9,11,13,19,100,3};
        FindIntersect res= mHelper.calculateIntersection(arrayOne,arrayTwo,hashKey);
        return res;

      //  return attendanceRepository.getData(id);
    }

}
