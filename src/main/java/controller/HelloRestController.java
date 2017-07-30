package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import service.HumanService;

import java.io.IOException;

@RestController
public class HelloRestController {

    @Autowired
    private HumanService humanService;

    @Autowired
    private ObjectMapper mapper;

    @RequestMapping(value = "/getPeople", method = RequestMethod.GET)
    @ResponseBody
    public String getPeople() throws IOException {
        return mapper.writeValueAsString(humanService.getPeople());
    }
}
