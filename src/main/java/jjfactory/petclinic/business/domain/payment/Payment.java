package jjfactory.petclinic.business.domain.payment;

import jjfactory.petclinic.business.domain.BaseTimeEntity;
import jjfactory.petclinic.business.domain.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static lombok.AccessLevel.PROTECTED;

@Getter
@NoArgsConstructor(access = PROTECTED)
@Entity
public class Payment extends BaseTimeEntity {
    @Id
    @Column(name = "payment_id")
    @GeneratedValue
    private Long id;

    @JoinColumn(name = "user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
}
