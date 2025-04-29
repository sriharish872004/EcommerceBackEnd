package com.sri.SpringEcommerce.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;
import java.util.Date;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private BigInteger price;
    private String category;
    private Date releaseDate;
    private boolean productAvailable;
    private int stockQuantity;
    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;


    public Product(int id) {
        this.id = id;
    }


}
