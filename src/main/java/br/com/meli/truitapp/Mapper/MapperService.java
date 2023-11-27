package br.com.meli.truitapp.Mapper;

import br.com.meli.truitapp.Model.DTO.FruitsDto;
import br.com.meli.truitapp.Model.Fruits;

public class MapperService {

    public static FruitsDto fruitstofruitsDto(Fruits fruits) {
        return FruitsDto.builder()
                .name(fruits.getName())
                .quantity(fruits.getQuantity())
                .price(fruits.getPrice())
                .build();
    }
    /*private static Set<FruitsDto> mapFruitsDto(Set<Fruits> fruitsDto) {
            return fruitsDto.stream().map(fruits -> FruitsDto.builder()
                    .name(fruits.getName())
                    .price(fruits.getPrice())
                    .quantity(fruits.getQuantity())
                    .build()).collect(Collectors.toSet());
    }*/
}
