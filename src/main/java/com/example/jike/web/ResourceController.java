package com.example.jike.web;

import com.example.jike.domain.JsonResult;
import com.example.jike.domain.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * ProjectName: jike
 * User: quent
 * Date: 2018/5/28
 * Time: 22:55
 */
@RestController
//@RequestMapping(value = "/")
public class ResourceController {

    @Autowired
    private Resource resource;
    @RequestMapping(value = "/getResource")
    public JsonResult getResource(){

        Resource bean = new Resource();
        BeanUtils.copyProperties(resource,bean);
        return JsonResult.ok(bean);
    }
}
