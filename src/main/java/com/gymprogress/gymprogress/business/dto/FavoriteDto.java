package com.gymprogress.gymprogress.business.dto;

import com.gymprogress.gymprogress.persistance.entity.FavoriteTargetType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FavoriteDto {

    private int favoriteId;
    private FavoriteTargetType favoriteTargetType;
    private int favoriteTargetId;
    private int userId;
    
}
