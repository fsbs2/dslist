package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GameMinDto {
    public GameMinDto(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;
}
