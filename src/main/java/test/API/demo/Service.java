package test.API.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private static Repository repository;
    public static String saveLabel(ShipLabels labels){
        return  repository.toString();
    }
}

