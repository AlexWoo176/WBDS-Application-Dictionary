package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping("/home")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/dictionary")
    public String translate(@RequestParam String englishWord, Model model) {
        Map<String, String> list = new HashMap<>();
        list.put("Hello", "Xin Chao");
        list.put("Cat", "Con Meo");
        list.put("Love", "Tinh Yeu");
        list.put("How are you?", "Ban Co Khoe Khong");

        String vietnamWord = list.get(englishWord);

        if (vietnamWord == null) {
            vietnamWord = "Not Found";
        }

        model.addAttribute("englishWord", englishWord);
        model.addAttribute("vietnamWord", vietnamWord);

        return "translate";
    }
}
