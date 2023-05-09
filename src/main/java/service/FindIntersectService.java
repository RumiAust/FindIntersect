package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.FindIntersectRepo;

@Service
public class FindIntersectService {
    @Autowired
    FindIntersectRepo mFindIntersectRepo;
}
