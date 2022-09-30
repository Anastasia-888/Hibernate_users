package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.logging.Logger;


public class Main {
    private static final UserService userService = new UserServiceImpl();
    private static final Logger logger = Logger.getLogger(String.valueOf(Main.class));

    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        userService.createUsersTable();

        userService.saveUser("Ivan", "Ivanov", (byte) 20);
        logger.info("User с именем – Ivan добавлен в базу данных");

        userService.saveUser("Petr", "Ivanov", (byte) 21);
        logger.info("User с именем – Petr добавлен в базу данных");

        userService.saveUser("Roman", "Ivanov", (byte) 22);
        logger.info("User с именем – Roman добавлен в базу данных");

        userService.saveUser("Egor", "Ivanov", (byte) 23);
        logger.info("User с именем – Egor добавлен в базу данных");

        System.out.println(userService.getAllUsers());

        userService.cleanUsersTable();

        userService.dropUsersTable();

    }
}
