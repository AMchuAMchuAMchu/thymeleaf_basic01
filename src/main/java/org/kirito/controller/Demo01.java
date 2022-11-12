package org.kirito.controller;

import org.junit.Test;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * Description ==> TODO
 * BelongsProject ==> thymeleaf_basic01
 * BelongsPackage ==> org.kirito.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-11-12 14:52:52
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class Demo01 {


    @Test
    public void testInsertSyntax(){

        Context context = new Context();
        context.setVariable("name","樱满集");
        String process = new TemplateEngine().process("<input type='text' th:value='${name}' />",context);
        System.out.println("process==>"+process);


    }

    @Test
    public void testInit() {

        String process = new TemplateEngine().process("<input type='text' th:value='罪恶王冠'/>", new Context());

        System.out.println("process==>"+process);

    }

}
