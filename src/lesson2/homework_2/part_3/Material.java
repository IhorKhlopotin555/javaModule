package lesson2.homework_2.part_3;

import lombok.*;


public class Material {
    private String material;

    public Material() {
    }

    public Material(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Material{" +
                "material='" + material + '\'' +
                '}';
    }
}
