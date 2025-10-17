package net.dejw.forms.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ContactForm {
    @Id
    private Long id;
    private String name;
    private String email;
    private String message;
}
