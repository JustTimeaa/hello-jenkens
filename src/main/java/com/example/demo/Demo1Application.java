package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;

import java.net.InetAddress;
import java.net.UnknownHostException;


@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) throws UnknownHostException {
        ConfigurableApplicationContext application = SpringApplication.run(Demo1Application.class, args);

        Environment env = application.getEnvironment();
        String ip = InetAddress.getLocalHost().getHostAddress();
        String port = env.getProperty("server.port");
        String path = env.getProperty("server.servlet.context-path");
        if (StringUtils.isEmpty(path)) {
            path = "";
        }
        System.out.println("\n----------------------------------------------------------\n\t" +
                "项目启动启动成功! Access URLs:\n\t" +
                "Local访问网址: \thttp://localhost:" + port + path + "\n\t" +
                "  接口文档地址: \thttp://" + ip + ":" + port + path +"/swagger-ui.html"+ "\n\t" +
                "----------------------------------------------------------");
    }

}
