package jp.kobe_u.cs.daikibo.CMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ComicController {

    @Autowired
    ComicService ts;

    @GetMapping("/read")
    String showComicList(Model model) {

    }

    @GetMapping("/read")
    String showComicCheckPage(Model model) {

    }

    @PostMapping("/read")
    String buy(Long cid, Model model){

    }

    @PostMapping("/read")
    String cancel(Long cid, Model model) {

    }

    @PostMapping("/read")
    String comicRegister(@RequestParam String title, Model model) {

    }

}