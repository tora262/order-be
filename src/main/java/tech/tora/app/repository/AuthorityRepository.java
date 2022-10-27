package tech.tora.app.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import tech.tora.app.domain.Authority;

/**
 * Spring Data MongoDB repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends ReactiveMongoRepository<Authority, String> {}
