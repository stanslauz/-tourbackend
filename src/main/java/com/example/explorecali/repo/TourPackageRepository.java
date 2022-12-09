package com.example.explorecali.repo;

import com.example.explorecali.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TourPackageRepository extends CrudRepository<TourPackage, String> {

    Optional<TourPackage> findByName(String name);


}
