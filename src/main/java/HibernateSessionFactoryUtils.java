import org.hibernate.*;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import java.util.function.Consumer;

public class HibernateSessionFactoryUtils {
    private static SessionFactory sessionFactory;

    private HibernateSessionFactoryUtils() {}

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try{
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(Employee.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory();
            }catch (Exception e){
                System.out.println("Exception!" + e);
            }
        }
        return sessionFactory;
    }

    public static void withEntityManager(Consumer<EntityManager> function) {
        try (Session session = getSessionFactory().openSession()) {
            session.beginTransaction();
            function.accept(session);
            session.getTransaction().commit();
        }
    }
}