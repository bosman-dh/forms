package net.dejw.forms.application.services;

import net.dejw.forms.application.ports.ContactFormRepository;
import net.dejw.forms.domain.ContactForm;
import org.springframework.stereotype.Service;

@Service
public class SubmitContactFormService {
    private final ContactFormRepository saver;

    public SubmitContactFormService(ContactFormRepository saver) {
        this.saver = saver;
    }

    public void submit(ContactForm form) {
        saver.save(form);
    }
}
