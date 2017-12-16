package com.example.pc.appjamproject.java.controller.beans

/**
 * Created by baehyeonbin on 2017. 12. 17..
 */

data class Result(val success : Boolean, val message : String)
data class ResultData(val result : Result)
data class SignGet(val result : Result, val user : User, val token : Token)