package jjfactory.petclinic.business.domain.inquiry;

import jjfactory.petclinic.business.domain.BaseTimeEntity;
import jjfactory.petclinic.business.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static lombok.AccessLevel.PROTECTED;

@Getter
@NoArgsConstructor(access = PROTECTED)
@Entity
public class Inquiry extends BaseTimeEntity {
    @Id
    @GeneratedValue
    @Column(name = "inquiry_id")
    private Long id;

    @JoinColumn(name = "user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @Enumerated(EnumType.STRING)
    private InquiryStatus status;

    @Enumerated(EnumType.STRING)
    private InquiryType inquiryType;

    private String title;
    private String content;

    @Builder
    public Inquiry(User user, InquiryStatus status, InquiryType inquiryType, String title, String content) {
        this.user = user;
        this.status = status;
        this.inquiryType = inquiryType;
        this.title = title;
        this.content = content;
    }
}
