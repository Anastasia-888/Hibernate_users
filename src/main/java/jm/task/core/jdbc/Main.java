package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    private static final UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        userService.createUsersTable();

        userService.saveUser("Ivan", "Ivanov", (byte) 20);
//
        System.out.println("User с именем – Ivan добавлен в базу данных");
//
        userService.saveUser("Petr", "Ivanov", (byte) 21);
        System.out.println("User с именем – Petr добавлен в базу данных");
//
        userService.saveUser("Roman", "Ivanov", (byte) 22);
        System.out.println("User с именем – Roman добавлен в базу данных");
//
        userService.saveUser("Egor", "Ivanov", (byte) 23);
        System.out.println("User с именем – Egor добавлен в базу данных");
//
        System.out.println(userService.getAllUsers());

        userService.removeUserById(1);

        userService.cleanUsersTable();
////
        userService.dropUsersTable();

    }
}
