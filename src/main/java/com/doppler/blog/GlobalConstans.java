package com.doppler.blog;

/**
 * Created by doppler on 2016/5/30.
 */
public enum GlobalConstans {
    INSERTPOST("Insert a post : "),
    DELETEPOST("Delete a post : "),
    UPDATEPOST("Update a post : "),
    UPDATEPWD("User updated password at :"),
    UPDATESETTINGS("App info updated at :");

    private final String value;
    private GlobalConstans(String value){
        this.value = value;
    }
    public String value(){
        return this.value;
    };
}
