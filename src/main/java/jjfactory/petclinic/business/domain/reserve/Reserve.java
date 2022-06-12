package jjfactory.petclinic.business.domain.reserve;

import jjfactory.petclinic.business.domain.BaseTimeEntity;
import jjfactory.petclinic.business.domain.services.Service;
import jjfactory.petclinic.business.domain.user.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import javax.persistence.*;

import java.time.LocalDateTime;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.FetchType.LAZY;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Reserve extends BaseTimeEntity {

    @Column(name = "reserve_id")
    @Id @GeneratedValue
    private Long id;

    @JoinColumn(name = "user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "service_id")
    private Service service;

    @Comment("요청사항")
    private String request;

    @Enumerated(STRING)
    private ReserveType reserveType;

    @Column(name = "reserve_start_date")
    private LocalDateTime reserveStartDate;

    @Column(name = "reserve_end_date")
    private LocalDateTime reserveEndDate;
}
