import com.example.resourciumoptima.model.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        //Calling the persistance unit default to generate db with Entities

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //adding to employee table
        Employee employee = new Employee();
        employee.setNom("hamid");
        employee.setAdresseEmail("hamid@email.com");
        employee.setPrénom("hassaniyat berchid");
        employee.setPoste("Drogri");
        employee.setMotDePasse("password");
        employee.setNomUtilisateur("HamidCs");

        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }
}
