package yourbank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import yourbank.entity.repository.TransactionRepository;
import yourbank.entity.repository.UserRepository;

/**
 * Created by Mario on 19.12.2016 г..
 */

@Controller
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;
    @Autowired
    private UserRepository userRepository;
}
