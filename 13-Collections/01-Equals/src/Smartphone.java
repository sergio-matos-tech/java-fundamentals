public class Smartphone {
    private String serialNumber;
    private String brand;
    private String model;


    public Smartphone(String serialNumber, String brand, String model) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    // Regras para construir o equals
    // 1-Reflexivo: para x, se x == true → x == true
    // 2-Simétrico: para x e y. Se x == y → y == x
    // 3-Transitivo: para x, y && z. Se x == y && x == z → y == z
    @Override
    public boolean equals(Object obj) {
        // se o objeto não existe
        if (obj == null) return false;
        // se os objetos forem iguais
        if (this == obj) return true;
        // se o objeto não pertence à classe analisada
        if (this.getClass() != obj.getClass()) return false;

        return serialNumber != null && serialNumber.equals(((Smartphone) obj).serialNumber);
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                "}\n";
    }
}
