package tine.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value="/hello")
public class SampleController {
    @RequestMapping("")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

}
