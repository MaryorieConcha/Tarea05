package model;

public enum Color {
    BLANCO("Blanco"),
    AZUL("Azul"),
    NEGRO("Negro"),
    PLATEADO("Plateado"),
    GRIS("Gris"),
    DORADO("Dorado"),
    VERDE("Verde");

    private String color;
    private Color(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
