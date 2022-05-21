package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        //we got context here and we retrieve particular beans using this

        ShoppingCart cart = context.getBean(ShoppingCart.class);
        cart.checkOut("CanCElled");

    }
}
