package org.kirito.web;

import org.kirito.entity.Manga;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.beans.MethodDescriptor;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;

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



    @PostMapping("/index")
    public String index(Model model) {
        model.addAttribute("welcome","Welcome to sword art online!!||欢迎来到刀剑的世界!!");
        System.out.println("=====");
        System.out.println("=====");
        System.out.println("=====");
        System.out.println("username:"+model.getAttribute("username"));
        System.out.println("password:"+model.getAttribute("password"));
        return "index";


    }

    @GetMapping("/attr")
    public String attr(Model model){
        model.addAttribute("username","绫小路清隆");
        model.addAttribute("password","131313");
        model.addAttribute("usernameN","username");
        model.addAttribute("passwordN","password");
        model.addAttribute("valueSubmit","轻井泽惠-提交");
        model.addAttribute("valueAction","/index");
        model.addAttribute("valueMethod","post");
        model.addAttribute("valueTypeU","text");
        model.addAttribute("valueTypeP","password");
        model.addAttribute("valueTypeS","submit");
        model.addAttribute("valueUsername","请客官输入用户名的说...");
        model.addAttribute("valuePassword","请客官输入密码的说...");
        return "attr";
    }


    @GetMapping("/sanmu")
    public String sanmu(Model model){
        model.addAttribute("age",17);
        model.addAttribute("time",2022);
        return "sanmu";
    }



    @GetMapping("/nullDemo")
    public String nullDemo(Model model){
        model.addAttribute("name01","");
        model.addAttribute("name02",null);
        return "nullDemo";
    }


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
