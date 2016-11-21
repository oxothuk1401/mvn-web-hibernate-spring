package by.htp.library.utils;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Date;


/**
 * Created by oxothuk1401 on 18.11.2016.
 */
@Component
@Aspect
public class MyLogger {
    private static Logger log = Logger.getLogger(MyLogger.class);

    @Pointcut("execution(* *(..)) ")
    private void allMethods() {

    }

    @AfterReturning(pointcut = "allMethods() && @annotation(by.htp.library.utils.ShowResult)", returning = "obj")
    public void printLog(Object obj) {
        log.info(obj + "\nDATE: " + new Date().toString());
    }
}
