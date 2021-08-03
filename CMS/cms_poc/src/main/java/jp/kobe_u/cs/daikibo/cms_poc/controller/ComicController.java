package jp.kobe_u.cs.daikibo.cms_poc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jp.kobe_u.cs.daikibo.cms_poc.dto.ComicDto;
import jp.kobe_u.cs.daikibo.cms_poc.entity.Comic;
import jp.kobe_u.cs.daikibo.cms_poc.service.ComicService;

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
    @GetMapping("/read/{uid}")
    public String showComicList(@PathVariable Long uid ,Model model) {
        List<Comic> list = cs.getComicList(uid);
        model.addAttribute("uid", uid);
        model.addAttribute("comicList", list);
        model.addAttribute("comicRegisterForm", new ComicRegisterForm());
        return "home";
    }

    /**
     * 巻数のインクリメント
     * @param cid
     * @param model
     * @return
     */
    @PostMapping("/buy/{uid}")
    public String buy(@RequestParam Long cid, @PathVariable Long uid, Model model){
        cs.buy(cid);
        return "redirect:/read/"+uid;
    }

    /**
     * 巻数のデクリメント
     * @param cid
     * @param model
     * @return
     */
    @PostMapping("/cancel/{uid}")
    public String cancel(@RequestParam Long cid, @PathVariable Long uid, Model model) {
        cs.cancel(cid);
        return "redirect:/read/"+uid;
    }

    /**
     * 漫画の新規登録
     * @param title
     * @param model
     * @return
     */
    @PostMapping("/createcomic/{uid}")
    public String comicRegister(@ModelAttribute ComicRegisterForm form, @PathVariable Long uid, Model model) {
        ComicDto dto = new ComicDto();
        dto.setTitle(form.getTitle());
        dto.setUid(form.getUid());
        cs.comicRegister(dto);
        return "redirect:/read/"+uid;
    }

    /**
     * 漫画の削除
     * @param cid
     * @param uid
     * @param model
     * @return
     */
    @PostMapping("/deletecomic/{uid}")
    public String deleteComic(@RequestParam Long cid, @PathVariable Long uid, Model model) {
        cs.deleteComic(cid);
        return "redirect:/read/"+uid;
    }

}