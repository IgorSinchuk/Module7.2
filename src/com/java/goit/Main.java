package com.java.goit;

import com.java.goit.controllers.DishController;
import com.java.goit.controllers.EmployeeController;
import com.java.goit.controllers.OrderController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private EmployeeController employeeController;
    private DishController dishController;
    private OrderController orderController;

    private boolean reInit;

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application-context.xml", "hibernate-context.xml");
        applicationContext.getBean(Main.class).start();
    }

    public void init() {
        if (reInit) {
            orderController.removeAllOrders();
            dishController.removeAllDishes();
            employeeController.removeAllEmployee();

            dishController.initDishes();
            employeeController.initEmployee();
            orderController.initOrders();


        }
    }

    private void start() {
        employeeController.printEmployeesToConsole(1L);
        employeeController.printEmployeesToConsole(2L);
    }

    public void setEmployeeController(EmployeeController employeeController) {
        this.employeeController = employeeController;
    }
    public void setDishController(DishController dishController) {
        this.dishController = dishController;
    }
    public void setOrderController(OrderController orderController) {
        this.orderController = orderController;
    }

    public void setReInit(boolean reInit) {
        this.reInit = reInit;
    }
}
