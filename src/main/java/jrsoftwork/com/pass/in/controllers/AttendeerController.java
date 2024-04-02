package jrsoftwork.com.pass.in.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attendeers")
public class AttendeerController {
    @GetMapping
    public ResponseEntity<String> getTeste(){
        return ResponseEntity.ok("success");
    }
}
