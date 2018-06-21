package com.bmofang.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

/**********************************************
 *
 //Copyright© 2014 冷云能源科技有限公司.版权所有
 *
 *文件名  ：  springboot.java
 *文件描述：  this the first springBoot demo
 *修改日期：  2018-06-19 11:10.
 *文件作者：  Arike.Y 
 *
 **********************************************/

@Controller
public class HelloController {
    
    /**
     * 测试Controller
     */
    
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("now", DateFormat.getInstance().format(new Date()));
        /*return name+age;*/
        return "hello";
    }
    
}
