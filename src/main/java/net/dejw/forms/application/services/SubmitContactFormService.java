package net.dejw.forms.application.services;

import net.dejw.forms.application.ports.ContactFormRepositoryAutoImplements;
import net.dejw.forms.domain.ContactForm;
import org.springframework.stereotype.Service;

@Service
public class SubmitContactFormService {
    private final ContactFormRepositoryAutoImplements contactFormRepository;

    public SubmitContactFormService(ContactFormRepositoryAutoImplements contactFormRepository) {
        this.contactFormRepository = contactFormRepository;
    }

    public void submit(ContactForm form) {
        contactFormRepository.save(form);
    }
}
