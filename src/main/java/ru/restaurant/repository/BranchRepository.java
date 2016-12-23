package ru.restaurant.repository;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;
import ru.restaurant.entity.Branch;
import ru.restaurant.entity.ClientCard;

@RepositoryRestResource(collectionResourceRel = "branch", path = "branch")
public interface BranchRepository  extends PagingAndSortingRepository<Branch, Long> {


    @Transactional
    void deleteByNumber(@Param("number") String number);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM branch", nativeQuery = true)
    void deleteAll();

}
