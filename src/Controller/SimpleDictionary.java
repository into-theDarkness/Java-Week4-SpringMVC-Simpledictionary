package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Model.Dictionary;

@Controller
public class SimpleDictionary {
    Dictionary dictionary = new Dictionary();
    @GetMapping("/hahaha")
    public String Display(){
        return "index1";
    }
    @GetMapping("/convert")
    public String Convert(@RequestParam String words, Model model){
        String result = dictionary.finByID(words);
        model.addAttribute("result" , result);
        return "index1";
    }
}
