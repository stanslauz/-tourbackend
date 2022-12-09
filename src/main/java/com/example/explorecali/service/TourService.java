package com.example.explorecali.service;

import com.example.explorecali.domain.Tour;
import com.example.explorecali.domain.TourPackage;
import com.example.explorecali.repo.TourPackageRepository;
import com.example.explorecali.repo.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourService {
    @Autowired
    private TourRepository tourRepository;
    @Autowired
    private TourPackageRepository tourPackageRepository;

    public Tour create(Tour tour){

        tourPackageRepository
                .findByName(tour.getTourPackage().getName())
                .orElseThrow(() -> new RuntimeException("could not find tour " + tour.getTourPackage().getName()));

        return tourRepository.save(tour);
    }

    public long total() {
        return tourRepository.count();
    }


}
