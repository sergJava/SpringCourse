package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {
    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAspect(){
        System.out.println("beforeAddExceptionHandlingAspect: ловим/обрабатываем исключения при попытке добавить книгу/журнал");
        System.out.println("------------------------------");
    }
}
