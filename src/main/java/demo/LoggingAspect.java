package demo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
//mention component as well as spring understands components and now it is in spring radar
public class LoggingAspect {
/// for all methods we cant add logging / Authentication & Authorization // Sanitize the data
    // SO we use concept called AOP to keep these details at one place and these concerns are called aspects

    //Here we are doing LOggin Aspect

    //how system will undertsand this is logging aspect ?
    // we must define point cuts(@Before) i.e  methods ... where to call and what to call
    //in execution you can define the methods in which you want to invoke logger method in prior to it.
    //this is the pattern for pointcut
    @Before("execution(* demo.ShoppingCart.checkOut(..))")
    public void beforeLogger(JoinPoint jp){
        //Joinpoint gives sttaic info on emthod
        //System.out.println(jp.getSignature());
        jp.getArgs()[0].toString();
        System.out.println("Before loggers");
    }

    // * is used for any return type + next one for any package+.* for any class
    // format * *.*.checkOut()  i.e any return-type any Package.any Class.MethodName()
    // the dots in method(..) mean that even if there are params, this method must execute
    // if there aren't any dots in it then this method
    @After("execution(* *.*.checkOut(..))")
    public void afterLogger(){
        System.out.println("After Logger");
    }


}
