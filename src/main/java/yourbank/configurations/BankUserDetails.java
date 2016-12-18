package yourbank.configurations;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.StringUtils;
import yourbank.entity.User;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Mario on 15.12.2016 г..
 */

public class BankUserDetails extends User implements UserDetails{

    private ArrayList<String> roles;
    private User user;

    // may be added more params than need it in super method
    public BankUserDetails(User user, ArrayList<String> roles) {
        super(user.getEmail(), user.getFullName(), user.getPassword(), user.getUserName(),
                user.getAddress(), user.getBalance(), user.getSalary());

        this.roles = roles;
        this.user = user;

    }

    public User getUser() {
        return this.user;
    }

    @Override
    public Collection<? extends GrantedAuthority>  getAuthorities() {
        String userRoles = StringUtils.collectionToCommaDelimitedString(this.roles);
        return AuthorityUtils.commaSeparatedStringToAuthorityList(userRoles);
    }

    @Override
    public String getUsername() {
        return super.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
