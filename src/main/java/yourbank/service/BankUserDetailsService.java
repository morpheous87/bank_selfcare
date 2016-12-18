package yourbank.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import yourbank.entity.User;
import yourbank.entity.repository.UserRepository;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Mario on 16.12.2016 г..
 */
@Service("bankUserDetailsService")
public class BankUserDetailsService implements UserDetailsService{

    private final UserRepository userRepository;

    public BankUserDetailsService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{
        User user = userRepository.findByEmail(email);

        if (user == null) {
            throw new UsernameNotFoundException("Invalid User");
        }
        else {
            Set<GrantedAuthority> grantedAuthorities = user.getRoles()
                    .stream()
                    .map(role -> new SimpleGrantedAuthority(role.getRole_name()))
                    .collect(Collectors.toSet());

                    return  new org
                            .springframework
                            .security
                            .core
                            .userdetails
                            .User(user.getEmail(),user.getPassword(),grantedAuthorities);
        }
    }
}
