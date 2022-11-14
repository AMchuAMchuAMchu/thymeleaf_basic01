package org.kirito.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Description ==> TODO
 * BelongsProject ==> thymeleaf_basic01
 * BelongsPackage ==> org.kirito.config
 * Version ==> 1.0
 * CreateTime ==> 2022-11-14 15:16:20
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Configuration
public class MyWebConfig implements WebMvcConfigurer {

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocalResolver();
    }

}
