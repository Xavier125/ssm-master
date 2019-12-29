package com.dzw.dao.impl;

import com.dzw.dao.CarDao;
import com.dzw.pojo.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Repository
public class CarDaoimpl implements CarDao {

    @Override
    @Bean("car")
    public Car init() {

        Car car = Car.builder()
                .brand("audi")
                .color("black")
                .displacement("1.7L")
                .build();

        return car;
    }
}
