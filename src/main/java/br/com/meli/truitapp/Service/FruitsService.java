package br.com.meli.truitapp.Service;

import br.com.meli.truitapp.Model.DTO.FruitsDto;
import br.com.meli.truitapp.Mapper.MapperService;
import br.com.meli.truitapp.Model.Fruits;
import br.com.meli.truitapp.Repository.FruitsRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FruitsService {

    @Autowired
    private FruitsRep fruitsRep;

    public FruitsService() {
    }

    public List<FruitsDto> findAll() {
        List<Fruits> fruits = this.fruitsRep.findAll();
        return fruits.stream().map(fruit -> MapperService.fruitstofruitsDto(fruit)).toList();
    }
}



