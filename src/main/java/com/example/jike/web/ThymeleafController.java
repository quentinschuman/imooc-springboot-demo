package com.example.jike.web;

import com.example.jike.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * ProjectName: jike
 * User: quent
 * Date: 2018/5/30
 * Time: 21:06
 */
@Controller
@RequestMapping("th")
public class ThymeleafController {

    @RequestMapping("/index")
    public String index(ModelMap map){
        map.addAttribute("name","thymeleaf");
        map.addAttribute("website","www.baidu.com");
        map.addAttribute("language","springboot");
        return "/freemarker/thymeleaf/index";//此处与视频中不一样 freemarker/thymeleaf/index
    }

    @RequestMapping("center")
    public String center(){
        return "/freemarker/thymeleaf/center";//此处与视频中不一样 freemarker/thymeleaf/center
    }

    @RequestMapping("test")
    public String test(ModelMap map){
        User user0 = new User();
        user0.setId(10001);
        user0.setUsername("admin");
        user0.setPassword("123456");
        map.addAttribute("user0",user0);

        User user1 = new User();
        user1.setId(9999);
        user1.setUsername("test");
        user1.setPassword("123456");
        map.addAttribute("user",user1);

        User user2 = new User();
        user1.setId(10000);
        user1.setUsername("imooc");
        user1.setPassword("123456");
        map.addAttribute("user",user2);

        List<User> userList = new ArrayList<>();
        userList.add(user0);
        userList.add(user1);
        userList.add(user2);
        map.addAttribute("userList",userList);

        return "/freemarker/thymeleaf/test";
    }

    @RequestMapping("postform")
    public String postForm(User user){
        System.out.println(user.getUsername());
        return "redirect:/th/test";
    }

}
