package com.codewithjindu.emailservicesetup.service;

import com.codewithjindu.emailservicesetup.models.User;
import org.springframework.mail.MailException;

public interface EmailSenderService {
    public void emailService(User user) throws MailException;
}
