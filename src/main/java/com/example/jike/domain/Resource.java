package com.example.jike.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by IntelliJ IDEA.
 * ProjectName: jike
 * User: quent
 * Date: 2018/5/28
 * Time: 22:59
 */
@Configuration
@ConfigurationProperties(prefix="com.example.jike.opensource")
@PropertySource(value="classpath:resource.properties")
public class Resource {
    private String name;
    private String website;
    private String language;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
}
