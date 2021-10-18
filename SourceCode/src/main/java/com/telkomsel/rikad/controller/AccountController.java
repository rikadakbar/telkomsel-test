package com.telkomsel.rikad.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.telkomsel.rikad.model.request.LoginRequest;

@RestController
@RequestMapping(path = "/account")
public class AccountController {
  
  @PostMapping(path = "/login", produces = "application/json")
  public ResponseEntity<Object> login(@RequestBody LoginRequest loginRequest){
    Boolean validUserName = "rikad".equals(loginRequest.getUsername());
    Boolean validPassword = "akbar".equals(loginRequest.getPassword()); 
    
    if (validUserName && validPassword) {
      Map<String, Object> returnValue = new HashMap<>();
      returnValue.put("token", "dflajdlfj498uadlfjadlgh9eh");
      return ResponseEntity.ok(returnValue);
    }
    
    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
  }
}
