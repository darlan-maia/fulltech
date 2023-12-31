package com.capgemini.panteranegra.models;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SessionResponseDTO {
    private Long id;
    private String startingTime;
    private String endingTime;
    private String movieName;
    private String image;
    private List<ChairOutputDTO> chairs;
}
