package com.doppler.blog.Service;

import com.domingosuarez.boot.autoconfigure.jade4j.JadeHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@JadeHelper("App")
@Service
public class AppSetting {

    @Autowired
    private SettingService settingService;

    private String siteName = "Blog";
    private String siteSlogan = "An exciting place to discover";

    public static final String SITE_NAME = "site_name";
    public static final String SITE_SLOGAN = "site_slogan";
    public static final String PAGE_SIZE = "page_size";


//    public String getSiteName(){
//        return (String) settingService.get(SITE_NAME, siteName);
//    }
//
//    public void setSiteName(String siteName) {
//        this.siteName = siteName;
//        settingService.put(SITE_NAME, siteName);
//    }
//
//    public Integer getPageSize() {
//        return (Integer) settingService.get(PAGE_SIZE, pageSize);
//    }
//
//    public void setPageSize(Integer pageSize) {
//        this.pageSize = pageSize;
//        settingService.put(PAGE_SIZE, pageSize);
//    }
//
//    public String getSiteSlogan() {
//        return (String) settingService.get(SITE_SLOGAN, siteSlogan);
//    }
//
//    public void setSiteSlogan(String siteSlogan) {
//        this.siteSlogan = siteSlogan;
//        settingService.put(SITE_SLOGAN, siteSlogan);
//    }
}
