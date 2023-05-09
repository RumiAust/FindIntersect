package com.example.findintersect.helper;

import com.example.findintersect.FindIntersectApplication;
import com.example.findintersect.model.FindIntersect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class FindIntersectHelper {

    public FindIntersect calculateIntersection(Integer[] listOne, Integer [] listTwo) {
        Integer makeHashSet[] = null, makeList[] = null;
        Instant start = Instant.now();
        if(listOne.length != listTwo.length){
            makeHashSet=listOne.length >= listTwo.length ? listOne : listTwo;
            makeList=listOne.length <= listTwo.length ? listOne : listTwo;
        }else{
            makeHashSet=listOne;
            makeList=listTwo;
        }
        List<Integer> iteratorList = Arrays.asList(makeList);
        HashSet<Integer> addToHashSet = new HashSet();

        for(int val: makeHashSet){
            addToHashSet.add(val);
        }

        List<Integer> result= addToHashSet.stream().filter(iteratorList::contains).collect(Collectors.toList());
        Instant finish = Instant.now();
        System.out.println(result);
        long timeElapsed = Duration.between(start, finish).toMillis();
        String timeInMillSec= Long.toString(timeElapsed);
        System.out.println("Time in Milliseconds: "+timeElapsed);
         /*   for(int val: iteratorList){
            if(addToHashSet.contains(val)){
                System.out.println(val);
            }
        }*/
        FindIntersect findIntersect = new FindIntersect(result,timeInMillSec);

        return findIntersect;
       // return attendanceRepository.getData(id);
    }
}
