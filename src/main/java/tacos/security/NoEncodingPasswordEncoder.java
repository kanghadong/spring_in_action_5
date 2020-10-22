package tacos.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class NoEncodingPasswordEncoder implements PasswordEncoder {
    @Autowired
    public String encode(CharSequence rawPwd) {
        return rawPwd.toString();
    }

    @Autowired
    public boolean matches(CharSequence rawPwd, String encodedPwd) {
        return rawPwd.toString().equals(encodedPwd);
    }
}
