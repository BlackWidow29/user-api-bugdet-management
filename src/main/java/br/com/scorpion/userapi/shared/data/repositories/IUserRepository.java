package br.com.scorpion.userapi.shared.data.repositories;

import br.com.scorpion.userapi.shared.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
}
