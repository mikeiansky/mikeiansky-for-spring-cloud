package io.github.mikeiansky.learn.security.utils;


import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.nio.file.Paths;

/**
 * @author mike ian
 * @date 2024/8/5
 * @desc
 **/
public class GeneratorApp {

    public static void main(String[] args) {
        System.out.println("mybatis admin generate start ... ");

        String url = "jdbc:mysql://172.16.2.232:3306/mikeiansky_course?useSSL=false&serverTimezone=UTC&allowMultiQueries=true&allowPublicKeyRetrieval=true";
        String username = "root";
        String password = "123456";

        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> builder
                        .author("ian")
                        .outputDir(Paths.get(System.getProperty("user.dir")) + "/mikeiansky-for-spring-security/src/main/java")
                        .commentDate("yyyy-MM-dd")
                )
                .packageConfig(builder -> builder
                        .parent("io.github.mikeiansky.learn.security")
                        .entity("model.entity")
                        .controller("controller")
                        .mapper("mapper")
                        .service("service")
                        .serviceImpl("service.impl")
                        .xml("mapper.xml")
                )
                .strategyConfig(builder -> builder
                        .entityBuilder()
                        .enableLombok()
                        .enableColumnConstant()
                        .enableFileOverride()
                )
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();

        System.out.println("mybatis admin generate complete ... ");
    }

}
