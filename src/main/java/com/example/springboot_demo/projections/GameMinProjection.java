package com.example.springboot_demo.projections;

public interface GameMinProjection {
    // métodos GET para cada dado que a consulta retorna
    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
