package id.web.hn.jvm.belajarspringbootweb.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping("")
    public String index(){
        return "Hello";
    }

    @GetMapping("/index.php")
    public int iniInteger(){
        return 1;
    }


}
