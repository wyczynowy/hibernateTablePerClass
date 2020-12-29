package pl.dawidkozub.hibernateTablePerClass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TablePerClassDAOTest {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("VehiclesDB");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        Vehicle vehicle = new Vehicle();
        vehicle.setType("unknown");
        vehicle.setId(1);

        Car car = new Car();
        car.setType("standard car");
        car.setBrandName("Ford");
        car.setHorsePower(340);
        car.setId(2);

        Truck truck = new Truck();
        truck.setType("Heavy weight truck");
        truck.setBrandName("Volvo");
        truck.setWeight(100000);
        truck.setId(3);

        entityManager.persist(vehicle);
        entityManager.persist(car);
        entityManager.persist(truck);

        entityManager.getTransaction().commit();

        System.out.println("Number of records from table vehicles: " + entityManager.createQuery("from Vehicle").getResultList().size());

        entityManager.close();
        factory.close();
    }
}