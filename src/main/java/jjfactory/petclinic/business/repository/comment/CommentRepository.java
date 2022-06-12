package jjfactory.petclinic.business.repository.comment;

import jjfactory.petclinic.business.domain.comment.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
