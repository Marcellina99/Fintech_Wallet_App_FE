package com.decagon.fintechpaymentapisqd11a.exceptions;

<<<<<<< HEAD
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserNotFoundException extends UsernameNotFoundException {
    public UserNotFoundException(String msg) {
        super(msg);
=======
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
>>>>>>> origin/develop
    }
}
