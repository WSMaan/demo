package test.API.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/label")
public class LabelController {
//@Autowired
//private Repository repository;
    @GetMapping("/id")
    public String  findLabel() {
        return "shipment created";
    }
//    @GetMapping("/id/{shipmentId}")
//        public ShipLabels findLabels(@PathVariable ShipLabels labels){
//        return repository.save(labels);
//        }
 @PostMapping("/id")
    public String  createLabel(@RequestBody String args) {
        return "shipment created";
    }

}