package jp.kobe_u.cs.daikibo.cms_poc.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.kobe_u.cs.daikibo.cms_poc.dto.UserResisterDto;
import jp.kobe_u.cs.daikibo.cms_poc.entity.User;
import jp.kobe_u.cs.daikibo.cms_poc.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository repo; // レポジトリ

    public User userRegister(UserResisterDto dto) {
        User user = dto.toEntity();
        return repo.save(user);
    }

    public List<User> showAllUser() {
        Iterable<User> found = repo.findAll();
        ArrayList<User> list = new ArrayList<>();
        found.forEach(list::add);
        return list;  
    }

    /**
     * ユーザを取得する (R)
     * @param email
     * @return
     */
    public User getMember(String email) {
        User u = repo.findByEmail(email);
        return u;
    }
}