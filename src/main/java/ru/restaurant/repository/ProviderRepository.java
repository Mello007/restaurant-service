package ru.restaurant.repository;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;
import ru.restaurant.entity.Provider;

@RepositoryRestResource(collectionResourceRel = "provider", path = "provider")
public interface ProviderRepository extends PagingAndSortingRepository<Provider, Long> {

    @Transactional
    void deleteByDescription(@Param("description") String description);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM provider", nativeQuery = true)
    void deleteAll();
}
