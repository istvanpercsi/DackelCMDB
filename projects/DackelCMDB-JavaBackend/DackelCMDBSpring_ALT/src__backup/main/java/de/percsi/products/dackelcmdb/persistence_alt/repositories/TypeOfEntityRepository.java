package de.percsi.products.dackelcmdb.persistence_alt.repositories;

import de.percsi.products.dackelcmdb.persistence_alt.model.TypeOfEntityModelDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.Optional;

public interface TypeOfEntityRepository extends JpaRepository<TypeOfEntityModelDB, Long> {

    @Query("SELECT toe FROM TypeOfEntityModelDB toe WHERE toe.deleted=false ")
    Iterable<TypeOfEntityModelDB> findAllNotDeleted();

    Optional<TypeOfEntityModelDB> findFirstByIdAndSystemName(Long id, String systemName);

    Optional<TypeOfEntityModelDB> findFirstBySystemName(String systemName);

}
