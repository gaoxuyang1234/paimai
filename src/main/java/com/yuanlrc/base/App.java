package com.yuanlrc.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.sound.midi.SoundbankResource;

/**
 * 项目入口启动文件
 *
 */
@SpringBootApplication
@EnableJpaAuditing
@ServletComponentScan
public class App 
{
    public static void main( String[] args)
    {
    	 SpringApplication.run(App.class, args);
    	 System.out.println("启动成功");
    }
}
