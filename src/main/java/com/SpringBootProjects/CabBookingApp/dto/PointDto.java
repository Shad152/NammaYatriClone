package com.SpringBootProjects.CabBookingApp.dto;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PointDto {
    private double coordinates[];
    private String type="Point";
    public PointDto(double[] coordinates) {
        this.coordinates=coordinates;
    }
}
