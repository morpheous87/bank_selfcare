package yourbank.controllers.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import yourbank.entity.User;
import yourbank.entity.repository.RoleRepository;
import yourbank.entity.repository.TransactionRepository;
import yourbank.entity.repository.UserRepository;

import java.util.List;

/**
 * Created by Mario on 19.12.2016 г..
 */

@Controller
@RequestMapping("/admin/users")
public class AdminUserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private TransactionRepository transactionRepository;

    public String listUsers(Model model){
        List<User> users = this.userRepository.findAll();

        model.addAttribute("users", users);
        model.addAttribute("view", "admin/user/list");
        return "base-layout";
    }
}
