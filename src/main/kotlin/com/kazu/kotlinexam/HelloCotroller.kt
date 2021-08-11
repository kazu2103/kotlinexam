package com.kazu.kotlinexam

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloCotroller {
    @GetMapping("/")
    fun index(model: Model): String{
        model.addAttribute("message", "Hello World")
        return "index"
    }
}