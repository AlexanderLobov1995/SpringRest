package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.HumanService;

import java.io.IOException;

@RestController
public class HelloRestController {

    @Autowired
    private HumanService humanService;

    @Autowired
    private ObjectMapper mapper;

    @RequestMapping (value = "/getPeople", method = RequestMethod.GET)
    public ResponseEntity<String> getPeople () throws IOException {
        HttpHeaders responseHeaders = new HttpHeaders ();
        responseHeaders.add ("Content-Type", "application/json; charset=utf-8");
        responseHeaders.add ("Access-Control-Allow-Headers", "Content-Type");
        responseHeaders.add ("Access-Control-Allow-Methods", "GET");
        responseHeaders.add ("Access-Control-Allow-Origin", "http://localhost:8080");
        return new ResponseEntity<String> (mapper.writeValueAsString (humanService.getPeople ()), responseHeaders, HttpStatus.OK);
    }
}
