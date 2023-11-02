package dev.vivek.httppostmethodimpl.controller;

import dev.vivek.httppostmethodimpl.dev.vivek.bindings.PassengerRequest;
import dev.vivek.httppostmethodimpl.dev.vivek.bindings.TicketResponse;
import org.apache.coyote.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IrctcRestController {
    @PostMapping(value = "/bookTicket",
            consumes = {"application/json", "application/xml"},
            produces = {"application/json", "application/xml"})
    public ResponseEntity<TicketResponse> bookTicket(@RequestBody PassengerRequest request){
        // logic to book ticket
        TicketResponse response = new TicketResponse();
        response.setStatus("Confirmed");
        response.setPrice("Rs. 500");
        BeanUtils.copyProperties(request, response);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
