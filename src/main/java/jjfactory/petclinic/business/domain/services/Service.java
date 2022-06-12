package jjfactory.petclinic.business.domain.services;

import jjfactory.petclinic.business.domain.BaseTimeEntity;
import jjfactory.petclinic.business.domain.user.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "services")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Service extends BaseTimeEntity {

    @Id @GeneratedValue
    @Column(name = "service_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    private ServicesType servicesType;

}
