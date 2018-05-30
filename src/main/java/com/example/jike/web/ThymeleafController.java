package com.example.jike.web;

import com.example.jike.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
