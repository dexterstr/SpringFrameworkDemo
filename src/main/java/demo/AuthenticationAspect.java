package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    //Here we create point cuts and we can define in methods to be called.
    // for different packages we can set Authentication and Authorization and like we can set
    // this particular point cut for this particular package.

    //within is used to define to which type of class you want to execute for the available methods in it.
    // here we are mentioning package name i.e all the types in demo package will execute this Point cut.
    @Pointcut("within(demo..*)")
    public void authenticatingPointCut(){

    }

    @Pointcut("within(demo..*)")
    public void authorizationPointCut(){

    }

    //here we are calling the authenticate method before 2 pointcuts and this is the way to write the pattern
    @Before("authenticatingPointCut() && authorizationPointCut()")
    public void authenticate(){
        System.out.println("Authenticating the request");
    }

}
