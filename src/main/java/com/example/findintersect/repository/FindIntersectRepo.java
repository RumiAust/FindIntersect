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
        FindIntersect res= mHelper.calculateIntersection(arrayOne,arrayTwo,hashKey);
        return res;
    }

}
