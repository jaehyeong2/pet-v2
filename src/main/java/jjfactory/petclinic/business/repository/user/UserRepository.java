package jjfactory.petclinic.business.repository.user;

import jjfactory.petclinic.business.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
