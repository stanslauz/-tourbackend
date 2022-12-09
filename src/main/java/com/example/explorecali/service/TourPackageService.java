package com.example.explorecali.service;


import com.example.explorecali.domain.TourPackage;
import com.example.explorecali.repo.TourPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourPackageService {
    @Autowired
    private TourPackageRepository tourPackageRepository;


    public TourPackage createTourPackage( String code, String name){
        return tourPackageRepository.findById(code).orElse(tourPackageRepository.save(new TourPackage(code, name)));
    }

    public Iterable<TourPackage> lookUp(){
        return  tourPackageRepository.findAll();
    }


    public long total(){
        return  tourPackageRepository.count();
    }
}
