package com.example.explorecali.repo;

import com.example.explorecali.domain.Tour;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface TourRepository extends CrudRepository<Tour, Integer> {
    @Override
    Optional<Tour> findById(Integer integer);
}
