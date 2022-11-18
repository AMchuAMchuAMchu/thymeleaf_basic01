package org.kirito.web;

import org.kirito.entity.Anime;
import org.kirito.entity.Manga;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;

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



    @GetMapping("/template01")
    public String template01(Model model){
        model.addAttribute("kayanoInfo","罪恶王冠");
        model.addAttribute("kayanoBool01",true);
        return "template02";
    }

    @GetMapping("/eachList")
    public String eachList(Model model){
        ArrayList<String> animeList = new ArrayList<>();
        animeList.add("那朵花");
        animeList.add("罪恶王冠");
        animeList.add("樱花庄的宠物女孩");
        animeList.add("刀剑神域Alicization");
        animeList.add("只要你说你爱我");
        model.addAttribute("animeList",animeList);
        return "eachList";
    }

    @GetMapping("/eachState")
    public String eachState(Model model){
        ArrayList<String> list = new ArrayList<>();
        list.add("kayano");
        list.add("hayami");
        list.add("haruka");
        model.addAttribute("list",list);
        return "eachState";
    }

    @GetMapping("/eachSelect")
    public String eachSelect(Model model){
        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("北京");
        cityList.add("东京");
        cityList.add("南京");
        cityList.add("西安");
        model.addAttribute("cityList",cityList);
        return "eachSelect";
    }

    @GetMapping("/eachMap")
    public String eachMap(Model model){
        HashMap<Integer, String> animesHash = new HashMap<>();
        animesHash.put(1001,"足立慎吾");
        animesHash.put(1002,"小野学");
        animesHash.put(1003,"伊藤智彦");
        animesHash.put(1004,"荒木哲郎");
        model.addAttribute("animesHash",animesHash);
        return "eachMap";
    }

    @GetMapping("/each")
    public String each(Model model){
        ArrayList<Anime> list = new ArrayList<>();
        list.add(new Anime("那朵花/未闻花名",2011));
        list.add(new Anime("四月是你的谎言",2014));
        list.add(new Anime("可塑性记忆",2015));
        list.add(new Anime("末日三问",2017));
        model.addAttribute("animes",list);
        return "each";
    }

    @GetMapping("/utext")
    public String utext(Model model){
        model.addAttribute("text01","嚯嚯,我来我<h1>king does 捏</h1>");
        model.addAttribute("text02","嚯嚯,我来我<h1>king does 捏</h1>");
        return "utext";
    }

    @GetMapping("/booleanH")
    public String booleanH(Model model){
        model.addAttribute("c1",true);
        model.addAttribute("c2",false);
        return "booleanH";
    }

    @PostMapping("/index")
    public String index(Model model,HttpServletRequest request) {
        model.addAttribute("welcome","Welcome to sword art online!!||欢迎来到刀剑的世界!!");
        System.out.println("=====");
        System.out.println("=====");
        System.out.println("=====");
        System.out.println("username:"+request.getParameter("username"));
        System.out.println("password:"+request.getParameter("password"));
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
