package by.bsuir.source.controllers;

import by.bsuir.source.model.LibRus;
import by.bsuir.source.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class RusController {
    /* Переводчик с русского на английский */
    @Autowired
    private MyService serviceR;
    @GetMapping("/russian")
    public String russianPage(){
        return "first/russian";
    }
    @PostMapping("/answer")
    public String responseEnglish(@RequestParam(value="word_russian",required = false) String word_russian,
                                  Model model,
                                  @RequestParam("id_russian") int id) {
        model.addAttribute("tapRussian", word_russian);
        model.addAttribute("answer", serviceR.getAllEng(id));
        return "response/answer";
    }

}
