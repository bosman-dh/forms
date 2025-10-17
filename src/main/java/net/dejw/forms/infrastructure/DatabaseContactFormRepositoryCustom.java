package net.dejw.forms.infrastructure;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import net.dejw.forms.application.ports.ContactFormRepositoryCustom;
import net.dejw.forms.domain.ContactForm;

import java.util.List;

public class DatabaseContactFormRepositoryCustom implements ContactFormRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ContactForm> findLongNameForms() {
        return entityManager.createQuery("SELECT c FROM ContactForm c WHERE LENGTH(c.name) > 10", ContactForm.class)
                .getResultList();


    }
}
