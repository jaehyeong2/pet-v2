package jjfactory.petclinic.business.domain.board;

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
public class Board extends BaseTimeEntity {

    @Id
    @Column(name = "board_id")
    @GeneratedValue
    private Long id;

    @JoinColumn(name = "user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    private String title;
    @Lob
    private String content;

    private int viewCount;

    @Builder
    public Board(User user, String title, String content, int viewCount) {
        this.user = user;
        this.title = title;
        this.content = content;
        this.viewCount = viewCount;
    }
}
