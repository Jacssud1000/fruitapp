package br.com.meli.truitapp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "fruits")
@Data
public class Fruits implements Serializable {

    @Id
    private UUID id;
    private String name;
    private int quantity;
    private float price;
    private LocalDateTime dateCreated;
    private LocalDateTime dateLastUpdated;
    private String owner;
    private String status;

}
