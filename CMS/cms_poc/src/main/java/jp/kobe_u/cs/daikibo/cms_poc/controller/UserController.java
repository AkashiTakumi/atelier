package jp.kobe_u.cs.daikibo.cms_poc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import jp.kobe_u.cs.daikibo.cms_poc.dto.UserResisterDto;
import jp.kobe_u.cs.daikibo.cms_poc.entity.User;
import jp.kobe_u.cs.daikibo.cms_poc.service.UserService;

@Controller
public class UserController {
    @Autowired
    UserService us;

    @GetMapping("/user")
    String showAllUser(Model model) {
        List<User> list = us.showAllUser();
        model.addAttribute("userList",list);
        model.addAttribute("userForm", new UserForm());
        // 仮テンプレ名
        return "user_list";
    }

    @GetMapping("/user/register")
    String userRegister(@ModelAttribute("userForm") UserForm form, Model model){
        // dto
        UserResisterDto udto = new UserResisterDto();
        udto.setUsername(form.username);
        udto.setEmail(form.email);
        us.userRegister(udto);
        return "redirect:/user";
    }


}