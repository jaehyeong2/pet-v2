package jjfactory.petclinic.business.domain.email;

import jjfactory.petclinic.business.domain.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static lombok.AccessLevel.PROTECTED;

@Getter
@NoArgsConstructor(access = PROTECTED)
@Entity
public class Email extends BaseTimeEntity {
    @Id
    @GeneratedValue
    @Column(name = "email_id")
    private Long id;

    private String email;

    private String title;

    private String message;
    private String authCode;
}
