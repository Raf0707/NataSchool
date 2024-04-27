package raf.console.nataschool.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api")
@Controller
class MainController {
    @GetMapping("/")
    fun console(): String {
        return "greeting"
    }

    private val hiMessage = "Hello! That's Online English School"

    @RequestMapping(value = ["/console"], method = [RequestMethod.GET])
    fun testConsole(): String {
        return hiMessage
    }
}