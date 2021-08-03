package jp.kobe_u.cs.daikibo.cms_poc.service;
import java.util.List;
import jp.kobeu.cs.daikibo.cms_poc.entity.User;

@Service
public class UserService {
    @Autowired
    UserRepository repo; // レポジトリ

    public User userRegister(userRegisterDto dto) {
        user = dto.toEntity();
        return repo.save(user);
    }

    public List<User> showAllUser() {
        Iterable<User> found = repo.findAll();
        ArrayList<User> list = new ArrayList<>();
        found.forEach(list::add);
        return list;  
    }
}
