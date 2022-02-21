package by.bsuir.source.controllers;

import by.bsuir.source.model.LibEnglish;
import by.bsuir.source.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/second")
public class EngController {
    /* Переводчик с английского на русский */
    @Autowired
    private MyService serviceE;
    LibEnglish en;
    @GetMapping("/english")
    public String englishPage(){
        return "second/english";
    }
    @PostMapping("/answer")
    public String responseRussian(@RequestParam(value="word_english",required = false) String word_english,
                                  @RequestParam("id_english") int id_english,
                                  Model model) {
        model.addAttribute("tapEnglish", word_english);
        Map<Integer,String> newMap=new HashMap<>();
        newMap.put(id_english,word_english);
        for(Integer key: newMap.keySet()){
            String  str= newMap.get(key);
            if(key!=null){
                if(word_english.equals(str)){
                    model.addAttribute("answer", serviceE.getAllRus(key));
                }
            }
        }
        return "response/answer";
    }

}
