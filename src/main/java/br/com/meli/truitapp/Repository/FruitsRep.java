package br.com.meli.truitapp.Repository;

import br.com.meli.truitapp.Model.Fruits;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FruitsRep extends JpaRepository<Fruits, UUID> {
}
