package org.kirito.entity;

import lombok.Data;

/**
 * Description ==> TODO
 * BelongsProject ==> thymeleaf_basic01
 * BelongsPackage ==> org.kirito.entity
 * Version ==> 1.0
 * CreateTime ==> 2022-11-16 17:48:15
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Data
public class Anime {

    private String name;

    private Integer time;

    public Anime() {
    }

    public Anime(String name, Integer time) {
        this.name = name;
        this.time = time;
    }
}
