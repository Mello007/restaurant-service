package ru.restaurant.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;
import ru.restaurant.entity.ClientCard;

@RepositoryRestResource(collectionResourceRel = "clientcard", path = "clientcard")
public interface ClientCardRepository extends PagingAndSortingRepository<ClientCard, Long> {

    @Transactional
    void deleteByName(@Param("name") String name);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM client_card", nativeQuery = true)
    void deleteAll();
}
