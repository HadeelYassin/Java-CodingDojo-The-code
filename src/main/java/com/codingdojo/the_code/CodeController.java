package com.codingdojo.the_code;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller


public class CodeController {
    @RequestMapping("/")
    public String index(){
        return "index.jsp";
    }
@RequestMapping("/checkcode")
    public String checkCode(@RequestParam(value="code") String code , RedirectAttributes redirectAttributes){
        if (code.equals("bushido")){
            return "redirect:/code";
        }
        else {
            redirectAttributes.addFlashAttribute("error", "You Must train harder!");
            return "redirect:/";
        }

}
@RequestMapping("/code")
public String showSecretPage(){
        return "index1.jsp";
}

}
