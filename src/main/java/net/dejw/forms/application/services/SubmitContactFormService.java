package net.dejw.forms.application.services;

import net.dejw.forms.application.ports.ContactFormRepository;
import net.dejw.forms.domain.ContactForm;
import org.springframework.stereotype.Service;

@Service
public class SubmitContactFormService {
    private final ContactFormRepository contactFormRepository;

    public SubmitContactFormService(ContactFormRepository saver) {
        this.contactFormRepository = saver;
    }

    public void submit(ContactForm form) {
        contactFormRepository.save(form);
    }
}
