package ru.restaurant.repository;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;
import ru.restaurant.entity.Client;

@RepositoryRestResource(collectionResourceRel = "client", path = "client")
public interface ClientRepository extends PagingAndSortingRepository<Client, Long> {

    @Transactional
    void deleteByFio(@Param("fio") String fio);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM client", nativeQuery = true)
    void deleteAll();
}
