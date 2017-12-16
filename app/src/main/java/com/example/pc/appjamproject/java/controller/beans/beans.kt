package com.example.pc.appjamproject.java.controller.beans

/**
 * Created by baehyeonbin on 2017. 12. 17..
 */
data class Content(val date : String, val aurthor : String, val content : String)
data class ClassName(val name : String)
data class School(
        var scoolName : String,
        var classNames : List<ClassName>,
        var contents : List<Content>
)
data class Channel(
        var schoolName : String,
        var className : String,
        var contents : List<Content>
)

