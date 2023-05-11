package com.example.findintersect.restapi;


import com.example.findintersect.model.FindIntersect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.findintersect.service.FindIntersectService;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false")
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
    }
    @GetMapping("/findIntersection")
    public ResponseEntity<FindIntersect> getAttendanceData(@RequestParam String param1, @RequestParam String param2,@RequestParam String param3) {
       return ResponseEntity.ok(mFindIntersectService.getIntersection(param1,param2,param3));

    }

}
