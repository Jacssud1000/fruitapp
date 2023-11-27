package br.com.meli.truitapp.DTO;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.security.cert.CertPathBuilder;

@Data
@Builder
public class FruitsDto implements Serializable {

        private String name;
        private int quantity;
        private float price;
}
