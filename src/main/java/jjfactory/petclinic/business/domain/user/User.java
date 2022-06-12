package jjfactory.petclinic.business.domain.user;

import jjfactory.petclinic.business.domain.Address;
import jjfactory.petclinic.business.domain.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

import static lombok.AccessLevel.PROTECTED;

@ToString(exclude = {"membership"})
@Getter
@NoArgsConstructor(access = PROTECTED)
@Entity
public class User extends BaseTimeEntity {

    @Id
    @Column(name = "user_id")
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    private String password;

    @Column(nullable = false)
    private String name;

    @Column
    private String picture;

    @Embedded
    private Address address;
}
