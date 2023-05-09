package repository;

import helper.FindIntersectHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FindIntersectRepo {
    @Autowired
    FindIntersectHelper mHelper;

}
