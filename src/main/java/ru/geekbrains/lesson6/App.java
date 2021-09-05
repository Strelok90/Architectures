package ru.geekbrains.lesson6;

import ru.geekbrains.lesson6.data_mapper.OrderIdentityMap;
import ru.geekbrains.lesson6.data_mapper.OrderMapper;
import ru.geekbrains.lesson6.model.Order;

import java.sql.Connection;
import java.sql.DriverManager;

public class App {

  public static void main(String[] args) throws Exception {
    OrderMapper orderMapper = new OrderMapper(getConnection());
    OrderIdentityMap orderIdentityMap = new OrderIdentityMap(orderMapper);
    Order order = orderIdentityMap.getOrder(1L);
  }

  public static Connection getConnection() throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    return DriverManager
        .getConnection("jdbc:mysql://localhost:3306/test01", "root", "admin123");
  }
}
