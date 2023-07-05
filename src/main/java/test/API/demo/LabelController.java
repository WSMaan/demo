package test.API.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/label")
public class LabelController {
   
    @GetMapping("/id")
    public String  findLabel() {
        return "shipment created";
    }
 @PostMapping("/id")
    public String  findLabel(@RequestBody String args) {
        return "shipment created";
    }

}