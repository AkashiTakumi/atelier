package jp.kobe_u.cs.daikibo.cms_poc.controller;

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
    ComicService cs;

    /**
     * 漫画管理画面の表示
     * 
     * @param uid
     * @param model
     * @return
     */
    @GetMapping("/read")
    String showComicList(Long uid, Model model) {

    }

    /**
     * 新規登録漫画の確認画面表示
     * 
     * @param model
     * @return
     */
    @GetMapping("/read/check")
    String showComicCheckPage(Model model) {

    }

    /**
     * 巻数のインクリメント
     * @param cid
     * @param model
     * @return
     */
    @PostMapping("/read")
    String buy(Long cid, Model model){
        cs.buy(cid);
        return "redirect:/read";
    }

    /**
     * 巻数のデクリメント
     * @param cid
     * @param model
     * @return
     */
    @PostMapping("/read")
    String cancel(Long cid, Model model) {
        cs.cancel(cid);
        return "redirect:/read";
    }

    /**
     * 漫画の新規登録
     * @param title
     * @param model
     * @return
     */
    @PostMapping("/read")
    String comicRegister(@RequestParam String title, Model model) {
        Comic comic = new Comic();
        comic.setTitle(title);
        // cid
        cs.comicRegister(/* */);
        return "redirect:/read/check";
    }

}