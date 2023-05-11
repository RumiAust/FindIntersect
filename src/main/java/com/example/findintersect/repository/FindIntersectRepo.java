package com.example.findintersect.repository;

import com.example.findintersect.helper.FindIntersectHelper;
import com.example.findintersect.model.FindIntersect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

@Repository
public class FindIntersectRepo {
    @Autowired
    FindIntersectHelper mHelper;
    public FindIntersect getIntersectionResult(String listOne, String listTwo, String hashKey) {

        int[] listA = IntStream.generate(() -> new Random().nextInt(100000)).limit(Integer.parseInt(listOne)).toArray();
        int[] listB = IntStream.generate(() -> new Random().nextInt(100000)).limit(Integer.parseInt(listTwo)).toArray();
        Integer[] arrayOne = Arrays.stream( listA ).boxed().toArray( Integer[]::new );
        Integer[] arrayTwo = Arrays.stream( listB ).boxed().toArray( Integer[]::new );
        FindIntersect res= mHelper.calculateIntersection(arrayOne,arrayTwo,hashKey);
        return res;
    }

}
