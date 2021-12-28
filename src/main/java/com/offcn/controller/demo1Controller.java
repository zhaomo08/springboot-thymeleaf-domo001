package com.offcn.controller;

import com.offcn.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.text.html.CSS;
import javax.swing.text.html.HTML;
import java.util.*;

/**
 * @author zjc
 * @create 2019--12--27--18:46
 */
@Controller
public class demo1Controller {

    @RequestMapping("/demo1")
    public String demo1(Model model){
        String message="hello thymeleaf!";
        model.addAttribute("message",message);

        return "demo1";
    }

    @RequestMapping("/demo2")
    public String demo2(Model model){
        User user = new User((long)1, "张三", 19);
        model.addAttribute("user",user);
        Map<String,String> map=new HashMap<>();
        map.put("id","100");
        map.put("name","zhaomo");
        map.put("sex","male");
        map.put("age","88");
        model.addAttribute("map",map);

        return "demo2";
    }

    @RequestMapping("/demo3")
    public String demo3(Model model){
        List<User> list = new ArrayList<>();
        User user1= new User((long)1, "张三", 19);
        User user2= new User((long)2, "李四", 20);
        User user3= new User((long)3, "王五", 21);
        User user4= new User((long)4, "赵默", 22);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        model.addAttribute("list",list);
        return "demo3";
    }
    @RequestMapping("/demo4")
    public String demo4(Model model){
        String name="张三";
        model.addAttribute("name",name);
        String pic="https://dss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=155168666,572245297&fm=26&gp=0.jpg";
        model.addAttribute("pic",pic);
        return "demo4";
    }

    @RequestMapping("/demo5")
    public String demo5(Model model) {

        model.addAttribute("flag", "true");

        model.addAttribute("menu", "manager");
        model.addAttribute("manager", "manager");

        return "demo5";
    }

    @RequestMapping("/demo6")
    public String demo6(Model model){

        model.addAttribute("now",new Date());

        double price=584515.126D;
        double price1=00000.126D;

        model.addAttribute("price",price);
        model.addAttribute("price1",price1);


        String str="Thymeleaf 是Web 和独立环境的现代服务器端Java 模板引擎，能够处理 HTML，XML，JavaScript，CSS 甚至纯文本。\r\n" +
        "Thymeleaf 的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设 计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\r\n" +
        "Thymeleaf 也从一开始就设计了Web 标准- 特别是HTML5 - 允许您创建完全 验证的模板，如果这是您需要的\r\n" ;
        model.addAttribute("strText", str);

        //定义字符串
        String str2="JAVA-offcn";
        model.addAttribute("str2", str2);

        return "demo6";
    }
}
