package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!");
        return "hello";     //templates의 hello.html을 찾아서 연결
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hell-template";
    }

    @GetMapping("hello-string")
    @ResponseBody       // body에 직접 넣겠다는 의미
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name;         // "hello spring"
    }
}
