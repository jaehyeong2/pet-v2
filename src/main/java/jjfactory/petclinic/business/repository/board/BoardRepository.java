package jjfactory.petclinic.business.repository.board;

import jjfactory.petclinic.business.domain.board.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board,Long> {
}
