package com.in28minutes.learnspringframework.examples.c1;

import org.springframework.stereotype.Component;

@Component
public class SQLDbDataService implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{24, 6, 15};
    }
}
