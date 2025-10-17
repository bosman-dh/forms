package net.dejw.forms.application.ports;

import net.dejw.forms.domain.ContactForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface ContactFormRepository extends JpaRepository<ContactForm, Long> {

    @Query("SELECT c FROM ContactForm c WHERE LENGTH(c.name) > 10")
    public List<ContactForm> findLongNameForms();
    }