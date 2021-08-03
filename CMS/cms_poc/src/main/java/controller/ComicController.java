package jp.kobe_u.cs.daikibo.CMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ComicController {

    @Autowired
    ComicService ts;

    @GetMapping("/read")
    String showComicList(Model model) {

    }

    @GetMapping("/read")
    String showGomicCheckPage(Model model) {

    }

    @PostMapping("/read")
    void buy(Long cid){

    }

    @PostMapping("/read")
    void cancel(Long cid) {

    }

    /* 分からん */
    void comicRegister() {

    }


}