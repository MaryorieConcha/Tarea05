package model;

public enum Marca {
    CHEVROLET("Chevrolet"),
    NISSAN("Nissan"),
    FERRARI("Ferrari"),
    SUSUKI("Suzuki"),
    TOYOTA("Toyota");

    private String marca;

    private Marca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
}
