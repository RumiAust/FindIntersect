package com.example.findintersect.restapi;


import com.example.findintersect.model.FindIntersect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    public FindIntersectRest(FindIntersectService mFindIntersectService) {
        this.mFindIntersectService = mFindIntersectService;
    }

    @GetMapping("/hello")
    public String getData() {
        return "Hello World";
        //return attendanceService.getData(id);
    }
    @GetMapping("/findIntersection/{data}")
    public ResponseEntity<FindIntersect> getAttendanceData(@PathVariable(value = "data") String data) {
       return ResponseEntity.ok(mFindIntersectService.getIntersection(data));

    }

}
