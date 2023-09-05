package com.tts.myawesomeproject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping("/")
    public String Home(){
        return "Hello World!<br>" +
                "<a href=\"./Cats\" class=\"button-link\">Go to CatPage</a><br>" +
                "<a href=\"./Form\" class=\"button-link\">Go to my Forms</a>";
    }
    @RequestMapping("/Cats")
    public String CatPage(){
        return "<a href=\"./Form\" class=\"button-link\">Go to my Forms</a><br>" +
                "<a href=\"..\" class=\"button-link\">Go to Hello World!</a><br>" +
                "<h1> Cat Page</h1>" +
                "<li>" +
                "<ul><img src=\"https://cdn.pixabay.com/photo/2016/03/28/12/35/cat-1285634_640.png\" alt=\"Cat picture 1\" /></ul>" +
                "<ul><img src=\"https://cdn.pixabay.com/photo/2018/02/21/05/17/cat-3169476_640.jpg\" alt=\"Cat picture 2\" /></ul>" +
                "<ul><img src=\"https://cdn.pixabay.com/photo/2018/07/13/10/20/kittens-3535404_640.jpg\" alt=\"Kitten picture\" /></ul>" +
                "</li>";
    }
    @RequestMapping("/Form")
    public String FormPage(){
        return "<a href=\"./Cats\" class=\"button-link\">Go to CatPage</a><br>" +
                "<a href=\"..\" class=\"button-link\">Go to Hello World!</a><br>" +
                "<form action=\"submit.php\" method=\"post\">\n" +
                "    <label for=\"name\">Name:</label>\n" +
                "    <input type=\"text\" id=\"name\" name=\"name\" required>\n" +
                "    <br><br>\n" +
                "\n" +
                "    <label for=\"email\">Email:</label>\n" +
                "    <input type=\"email\" id=\"email\" name=\"email\" required>\n" +
                "    <br><br>\n" +
                "\n" +
                "    <label for=\"message\">Message:</label>\n" +
                "    <textarea id=\"message\" name=\"message\" rows=\"4\" cols=\"50\" required></textarea>\n" +
                "    <br><br>\n" +
                "\n" +
                "    <input type=\"submit\" value=\"Submit\">\n" +
                "</form>";
    }
    //https://cdn.pixabay.com/photo/2016/03/28/12/35/cat-1285634_640.png
    //https://cdn.pixabay.com/photo/2018/02/21/05/17/cat-3169476_640.jpg
    //https://cdn.pixabay.com/photo/2018/07/13/10/20/kittens-3535404_640.jpg
}
