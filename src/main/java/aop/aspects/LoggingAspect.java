package aop.aspects;
import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
//import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Objects;

//import java.lang.classfile.MethodSignature;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* aop/UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary(){}



//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){
//    }
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log#1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log#2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log#3");
//    }




    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("MethodSignature = " + methodSignature);
        System.out.println("getMethod = " + methodSignature.getMethod());
        System.out.println("getReturnType = " + methodSignature.getReturnType());
        System.out.println("getName = " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for(Object obj: arguments){
                if(obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println(STR."Информация о книге: название - \{myBook.getName()}, автор - \{myBook.getAuthor()}, год издания - \{myBook.getYearsOfPublication()}");

                }
                else if(obj instanceof String){
                    System.out.println(STR."книгу добавляет \{obj}");
                }
            }

        }
        System.out.println("beforeAddLoggingAdvice: логирование попытки добавить книгу/журнал");
        System.out.println("------------------------------");
    }


}
