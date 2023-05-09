package restapi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.FindIntersectService;

@RestController
@RequestMapping("/api/v1")
public class FindIntersectRest {
    @Autowired
    FindIntersectService mFindIntersectService;

}
