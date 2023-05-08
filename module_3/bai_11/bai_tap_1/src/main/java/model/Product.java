package model;

public class Product {
    private int id;
    private String name;
    private int price;
    private String nhaSanXuat;
    private String moTa;


    public Product(int id, String name, int price, String nhaSanXuat, String moTa) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.nhaSanXuat = nhaSanXuat;
        this.moTa = moTa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
