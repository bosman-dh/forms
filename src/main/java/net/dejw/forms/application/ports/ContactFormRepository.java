package net.dejw.forms.application.ports;

import net.dejw.forms.domain.ContactForm;

public interface ContactFormRepository {
    void save(ContactForm form);
}