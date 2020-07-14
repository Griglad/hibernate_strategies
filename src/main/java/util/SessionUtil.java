package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SessionUtil {

    private static SessionFactory factory;

    static {
        try {
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
            factory = configuration.buildSessionFactory();
        } catch (Throwable e) {
            e.printStackTrace();
        }


    }


    public static Session getSession() {

        return factory.openSession();
    }

}
