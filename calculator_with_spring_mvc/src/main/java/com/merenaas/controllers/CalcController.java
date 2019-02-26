package com.merenaas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/calc")
public class CalcController {

    @RequestMapping(method = RequestMethod.GET)
    public String calc(@RequestParam String a, @RequestParam String b,  ModelMap model) {
        int res = Integer.parseInt(a) + Integer.parseInt(b);
        model.addAttribute("res", res);
        return "calc";
    }

}
