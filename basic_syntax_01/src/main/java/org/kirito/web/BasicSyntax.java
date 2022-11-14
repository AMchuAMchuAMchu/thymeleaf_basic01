package org.kirito.web;

import org.kirito.entity.Manga;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Description ==> TODO
 * BelongsProject ==> thymeleaf_basic01
 * BelongsPackage ==> org.kirito.web
 * Version ==> 1.0
 * CreateTime ==> 2022-11-12 16:12:06
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RequestMapping("/")
@Controller
public class BasicSyntax {



    @GetMapping("/bool")
    public String bool(Model model){
        model.addAttribute("age",17);
        model.addAttribute("married",true);
        return "bool";
    }


    @GetMapping("/i18N")
    public String login(Model model){
        return "login";
    }


    @GetMapping
    public String index(Model model){
        model.addAttribute("welcome","Welcome to sword art online!!||欢迎来到刀剑的世界!!");
        return "index";
    }



    @GetMapping("/link01")
    public String link01(Model model){
        model.addAttribute("character01","Alice");
        return "link01";
    }



    @GetMapping("/object01")
    public String object01(Model model){
        Manga manga = new Manga();
        manga.setName("罪恶王冠");
        manga.setTime(2011);
        manga.setCharacter01("楪祈");
        model.addAttribute("manga",manga);
        return "object01";
    }


    @GetMapping("variable01")
    public String variable01(Model model){
        model.addAttribute("name","黄金神威");
        model.addAttribute("time","2018");
        return "variable01";
    }

    @GetMapping("/insert")
    public String insert(Model model, HttpServletRequest httpServletRequest){
        String name = httpServletRequest.getParameter("name");
        model.addAttribute("name","桐谷和人");
        model.addAttribute("name",name);
        return "demo";
    }

}
