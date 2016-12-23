package ru.restaurant.repository;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;
import ru.restaurant.entity.Pay;
import ru.restaurant.entity.Product;

@RepositoryRestResource(collectionResourceRel = "pay", path = "pay")
public interface PayRepository extends PagingAndSortingRepository<Pay, Long> {

    @Transactional
    void deleteByDescription(@Param("description") String description);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM pay", nativeQuery = true)
    void deleteAll();
}
