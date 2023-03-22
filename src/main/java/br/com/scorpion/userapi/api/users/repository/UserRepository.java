package br.com.scorpion.userapi.api.users.repository;

import br.com.scorpion.userapi.shared.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
