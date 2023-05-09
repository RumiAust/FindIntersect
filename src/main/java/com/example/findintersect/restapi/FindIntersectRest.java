package com.example.findintersect.restapi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.findintersect.service.FindIntersectService;

@RestController
@RequestMapping("/api/v1")
public class FindIntersectRest {
    @Autowired
    FindIntersectService mFindIntersectService;
    @GetMapping("/hello")
    public String getData() {
        return "Hello World";
        //return attendanceService.getData(id);
    }
    @GetMapping("/findIntersection/{data}")
    public String getAttendanceData( @PathVariable(value = "data") String data) {
       return "Result: mFindIntersectService.getIntersection(data)";
        //return attendanceService.getData(id);
    }

}
