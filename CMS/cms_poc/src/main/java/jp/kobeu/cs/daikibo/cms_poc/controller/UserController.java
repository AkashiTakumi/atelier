

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
        return "user_list"
    }

    @GetMapping("/user/register")
    String userRegister(@ModelAttribute("userForm") UserForm form, Model model){
        User u = new User();
        // dto
    }


}