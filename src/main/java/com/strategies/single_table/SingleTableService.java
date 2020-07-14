package com.strategies.single_table;

import com.strategies.GeneralService;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;
import util.SessionUtil;

@Service
public class SingleTableService implements GeneralService {




    public void create() {
        try (Session session = SessionUtil.getSession()) {
            Vehicle veh = new Vehicle();
            veh.setName("Car");

            TwoWheeler bike = new TwoWheeler();
            bike.setName("Bike");
            bike.setSteeringHandle("Bike steering handle");

            FourWheeler car = new FourWheeler();
            car.setName("Mercedes-benz");
            car.setSteeringWheel("Benz steering wheel");

            Transaction txc = session.beginTransaction();
            session.save(veh);
            session.save(bike);
            session.save(car);
            txc.commit();

        }
    }
}






