package com.example.explorecali.web;


import com.example.explorecali.domain.TourRating;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class RatingDto {

    @Min(0)
    @Max(5)
    private Integer score;

    @Size(max = 255)
    private String comment;

    @NotNull
    private Integer customerId;


    public RatingDto(TourRating tourRating) {
        this(tourRating.getScore(), tourRating.getComment(), tourRating.getPk().getCustomerId());
    }





}
