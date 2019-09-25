package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/base")
    public String base(){
        return "base";
    }

    @RequestMapping("/instructions")
    public String instruction(){return "instructions";}
    @RequestMapping("/like")
    public String like(){return "like";}
    @RequestMapping("/dislike")
    public String dislike(){return "dislike";}

}
