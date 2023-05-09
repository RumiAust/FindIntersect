package com.example.findintersect.helper;

import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class FindIntersectHelper {

    public String calculateIntersection(Integer[] listOne, Integer [] listTwo) {
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

        List<Integer> result1= addToHashSet.stream().filter(iteratorList::contains).collect(Collectors.toList());
        Instant finish = Instant.now();
        System.out.println(result1);
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println("Time in Milliseconds: "+timeElapsed);
         /*   for(int val: iteratorList){
            if(addToHashSet.contains(val)){
                System.out.println(val);
            }
        }*/
        return result1.toString();
       // return attendanceRepository.getData(id);
    }
}
