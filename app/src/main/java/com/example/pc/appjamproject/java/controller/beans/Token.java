package com.example.pc.appjamproject.java.controller.beans;

import com.orm.SugarRecord;

/**
 * Created by baehyeonbin on 2017. 12. 17..
 */

public class Token extends SugarRecord {
    private String token;

    public Token() {}
    public Token(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
