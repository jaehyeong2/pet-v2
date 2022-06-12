package jjfactory.petclinic.business.domain.inquiry;

import jjfactory.petclinic.business.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static lombok.AccessLevel.PROTECTED;

@Getter
@NoArgsConstructor(access = PROTECTED)
@Entity
public class Answer extends BaseTimeEntity {
    @Id
    @GeneratedValue
    @Column(name = "answer_id")
    private Long id;

    @JoinColumn(name = "inquiry_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Inquiry inquiry;

    private String content;

    @Builder
    public Answer(Inquiry inquiry, String content) {
        this.inquiry = inquiry;
        this.content = content;
    }
}
