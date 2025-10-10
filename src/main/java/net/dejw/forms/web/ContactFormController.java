package net.dejw.forms.web;

import net.dejw.forms.application.services.SubmitContactFormService;
import net.dejw.forms.domain.ContactForm;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactFormController {

    private final SubmitContactFormService submitService;

    public ContactFormController(SubmitContactFormService submitService) {
        this.submitService = submitService;
    }

    @PostMapping
    public ResponseEntity<Void> submitForm(@RequestBody ContactForm form) {
        submitService.submit(form);
        return ResponseEntity.ok().build();
    }
}
