package net.dejw.forms.application.ports;

import net.dejw.forms.domain.ContactForm;

import java.util.List;

public interface ContactFormRepositoryCustomImplements {

    List<ContactForm> findLongNameForms();
}