package com.java.cis;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Locale;

@Controller
public class BMIController {

        /**
         * Simply selects the home view to render by returning its name.
         */
        @RequestMapping(value = "/", method = RequestMethod.GET)
        public String input(Locale locale, Model model) {
            System.out.println("Home Page Requested, locale = " + locale);
            return "input";
        }
        @RequestMapping(value = "/bmi", method = RequestMethod.POST)
        public String result(@RequestParam("height") double heightInInches,
                             @RequestParam("weight") double weightInPounds,
                             Model model) {
            double bmi = Math.round((weightInPounds / (heightInInches * heightInInches) * 703)*100)/100.0;
            model.addAttribute("bmi", bmi);
            return "result";
        }
    }


// Dispatcher Servlet
// View Resolver
// mvc
