package demo;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {


    //to create bean we add @component
    //this is annotation based config

    public void checkOut(String status){
        System.out.println("Checkout method from shopping cart");
    }
}
