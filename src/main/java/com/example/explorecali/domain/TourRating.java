package com.example.explorecali.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.util.Objects;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class TourRating {

    @EmbeddedId
    private TourRatingPk pk;

    @Column(nullable = false)
    private Integer score;

    @Column
    private String comment;

    @Override
    public String toString() {
        return "TourRating{" +
                "pk=" + pk +
                ", score=" + score +
                ", comment='" + comment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TourRating that = (TourRating) o;
        return Objects.equals(pk, that.pk) &&
                Objects.equals(score, that.score) &&
                Objects.equals(comment, that.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pk, score, comment);
    }

    public TourRatingPk getPk() {
        return pk;
    }

    public Integer getScore() {
        return score;
    }

    public String getComment() {
        return comment;
    }

    public void setPk(TourRatingPk pk) {
        this.pk = pk;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
