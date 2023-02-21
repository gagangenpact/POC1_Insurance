package com.genpact.insurance.controller;

import com.genpact.insurance.model.Nominee;
import com.genpact.insurance.service.NomineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/api")
public class NomineeController {
    @Autowired
    NomineeService nomineeService;

    @GetMapping("/nominees")
    public List<Nominee> displayNominees(@RequestParam String userId) {
        return nomineeService.displayNominees(userId);
    }

    @PostMapping(value = "/insertNominee")
    public ResponseEntity<Nominee> insertNominee(@RequestBody Nominee nominee) {
        nomineeService.insertNominee(nominee);
        return new ResponseEntity<Nominee>( nominee, HttpStatus.CREATED);
    }
}
