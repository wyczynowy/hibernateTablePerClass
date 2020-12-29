package pl.dawidkozub.hibernateTablePerClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CARS")
public class Car extends Vehicle {

    @Column(name = "BRAND_NAME")
    private String brandName;

    @Column(name = "HORSE_POWER")
    private long horsePower;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public long getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(long horsePower) {
        this.horsePower = horsePower;
    }
}
