package dev.vivek.httppostmethodimpl.controller;

import dev.vivek.httppostmethodimpl.dev.vivek.bindings.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
public class UserRestController {
    @PostMapping(value = "/addUser")
    public String addUser(@RequestBody User user) {
        System.out.println(user);
        String msg = "User added successfully";
        return msg;
    }

    /*public ResponseEntity<> BaddUser(@RequestBody User user) {
        System.out.println(user);
        String msg = "User added successfully";
        ResponseEntity responseEntity = ResponseEntity.ok(msg);
        responseEntity.setStatusCode(200);
        responseEntity.setBody(user);
        return responseEntity;
    }*/
}
