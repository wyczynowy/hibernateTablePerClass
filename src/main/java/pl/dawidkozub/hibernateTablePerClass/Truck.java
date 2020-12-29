package pl.dawidkozub.hibernateTablePerClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TRUCKS")
public class Truck extends Vehicle {

    @Column(name = "BRAND_NAME")
    private String brandName;

    @Column(name = "WEIGHT")
    private long weight;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }
}
