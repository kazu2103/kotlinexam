package com.kazu.kotlinexam

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class InquiryController {
    @ResponseBody
    @GetMapping("inquiry")
    fun getAllInquiry(model: Model): String {
        println("called")
        val response: String = "{\"name\": \"name\", \"mail\": \"mail\", \"inquiry\": \"inquiry\", \"timestamp\": \"timestamp\"}"
        return response
    }

    @PostMapping("inquiry")
    fun createInquiry(model: Model): Boolean {
        return true
    }

}