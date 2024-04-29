package raf.console.nataschool.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
@Controller
class ArticleController {
    @GetMapping("/articles")
    fun consoleArticles(): String {
        return "Articles"
    }
}