package net.dejw.forms.infrastructure;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import net.dejw.forms.application.ports.ContactFormRepositoryCustomImplements;
import net.dejw.forms.domain.ContactForm;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DatabaseContactFormRepositoryCustomImplements2 {

    @PersistenceContext
    private EntityManager entityManager;

    public List<ContactForm> findLongNameForms() {
        return entityManager.createQuery("SELECT c FROM ContactForm c WHERE LENGTH(c.name) > 10", ContactForm.class)
                .getResultList();
    }
}
