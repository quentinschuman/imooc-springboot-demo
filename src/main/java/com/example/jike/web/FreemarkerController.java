package com.example.jike.web;

//import com.example.jike.domain.Resource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * ProjectName: jike
 * User: quent
 * Date: 2018/5/29
 * Time: 21:40
 */
//@Controller
//@RequestMapping("ftl")
//public class FreemarkerController {
//
//    @Autowired
//    private Resource resource;
//    @RequestMapping(value = "/index")
//    public String index(ModelMap map){
//        map.addAttribute("resource",resource);
//        return "freemarker/index";
//    }
//
//    @RequestMapping(value = "center")
//    public String center(){
//        return "freemarker/center/center";
//    }
//
//}
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.jike.domain.Resource;

@Controller
@RequestMapping("ftl")
public class FreemarkerController {

    @Autowired
    private Resource resource;

    @RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("resource", resource);
        return "/freemarker/index";
    }

    @RequestMapping("center")
    public String center() {
        return "/freemarker/center/center";
    }

}