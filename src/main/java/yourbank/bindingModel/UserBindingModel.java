package yourbank.bindingModel;

import javax.validation.constraints.NotNull;

/**
 * Created by Mario on 18.12.2016 г..
 */

public class UserBindingModel {
    @NotNull
    private String email;
    @NotNull
    private String fullName;
    @NotNull
    private String password;
    @NotNull
    private String confirmPassowrd;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassowrd() {
        return confirmPassowrd;
    }

    public void setConfirmPassowrd(String confirmPassowrd) {
        this.confirmPassowrd = confirmPassowrd;
    }
}
