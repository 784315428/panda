package com.panda;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/**
 * 启动程序
 * 
 * @author panda
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class,SecurityAutoConfiguration.class})
@MapperScan("com.panda.*.mapper")
public class PandaApplication
{
    public static void main(String[] args)
    {

            // System.setProperty("spring.devtools.restart.enabled", "false");
            SpringApplication.run(PandaApplication.class, args);
            System.out.println("(♥◠‿◠)ﾉﾞ  恭喜你   Panda启动成功   ♥◠‿◠)ﾞ  \n" +
                    "            欢迎使用熊猫系统       \n" +
                    "            看到你努力的样子       \n" +
                    "            小熊猫也很高兴呀       \n" +
                    " http://localhost/index \n" +

                    "--------------------------------------  ");

    }
}