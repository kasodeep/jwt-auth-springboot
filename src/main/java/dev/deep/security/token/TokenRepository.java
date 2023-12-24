package dev.deep.security.token;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TokenRepository extends JpaRepository<Token, Integer> {

    @Query(value = """
            SELECT t FROM Token t INNER JOIN User u\s
            on t.user.id = u.id\s
            WHERE u.id = :id AND (t.expired = false OR t.revoked = false)\s
            """)
    List<Token> findAllValidTokenByUser(Integer id);

    Optional<Token> findByToken(String token);
}
