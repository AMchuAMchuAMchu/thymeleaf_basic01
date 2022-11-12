package org.kirito.controller;

import org.junit.Test;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

/**
 * Description ==> TODO
 * BelongsProject ==> thymeleaf_basic01
 * BelongsPackage ==> org.kirito.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-11-12 14:52:52
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class BasicSyntax {


    @Test
    public void testSuffixPrefix(){
        TemplateEngine te = new TemplateEngine();
        ClassLoaderTemplateResolver ctr = new ClassLoaderTemplateResolver();
        ctr.setPrefix("template/");
        ctr.setSuffix(".html");
        te.setTemplateResolver(ctr);
        Context context = new Context();
        context.setVariable("name","桐谷和人kirito");
        String demo = te.process("demo", context);
        System.out.println("demo==>"+demo);
    }

    @Test
    public void testResolveHTML(){

        TemplateEngine te = new TemplateEngine();

        Context context = new Context();

        context.setVariable("name","桐谷和人");
        //读取磁盘中的模板文件
        ClassLoaderTemplateResolver ctr = new ClassLoaderTemplateResolver();
        //设置引擎使用resolver
        te.setTemplateResolver(ctr);
        //处理模板
        String process = te.process("template/demo.html", context);

        System.out.println("process==>"+process);

    }

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
