package com.example.tablayout

import java.io.Serializable

class Page(val name:String,val url:String):Serializable {
    companion object {
        val pages = mutableListOf(
            Page("Yandex","https://ya.ru"),
            Page("Google","https://.google.ru"),
            Page("Gismeteo","https://gismeteo.ru"),
            Page("RBC","https://rbc.ru"),
            Page("Rutube","https://rutube.ru/")
        )
    }
}