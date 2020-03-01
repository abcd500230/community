package com.tedu.majiangpro.hello;
import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class t1 {
   @GetMapping("/hello")
     @ResponseBody
    public String t1(@RequestParam(name = "name",required=false, defaultValue="World") String name, Model model){
       //model.addAllAttribute();
       model.addAttribute("name",name);
         return "hello";
    }
}
