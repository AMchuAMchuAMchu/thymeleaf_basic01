package org.kirito.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description ==> TODO
 * BelongsProject ==> thymeleaf_basic01
 * BelongsPackage ==> org.kirito.web
 * Version ==> 1.0
 * CreateTime ==> 2022-11-12 16:12:06
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RequestMapping("/anime")
@RestController
public class BasicSyntax {

    @GetMapping("/insert")
    public String insert(Model model){
        model.addAttribute("name","桐谷和人");
        return "demo";
    }

}
