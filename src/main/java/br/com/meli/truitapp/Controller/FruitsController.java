package br.com.meli.truitapp.Controller;

import br.com.meli.truitapp.DTO.FruitsDto;
import br.com.meli.truitapp.Service.FruitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("fruits")
public class FruitsController {

    @Autowired
    private FruitsService fruitsService;


    @GetMapping
    public ResponseEntity<List<FruitsDto>> findAll() {
        List<FruitsDto> list = fruitsService.findAll();
        return ResponseEntity.ok().body(list);
    }

}
