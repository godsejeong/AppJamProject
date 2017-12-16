package com.example.pc.appjamproject.java.controller.adapter

import android.graphics.drawable.Drawable

/**
 * Created by pc on 2017-12-17.
 */
class Data(proflie: String?,content: String?,time : String?) {
    var time : String? = null
    var content : String? = null
    var proflie : String? = null
    init {
        this.content = content
        this.proflie = proflie
        this.time = time
    }
}