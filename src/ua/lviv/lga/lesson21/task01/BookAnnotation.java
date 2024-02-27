package ua.lviv.lga.lesson21.task01;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface BookAnnotation {
    String param() default "Annotation";

}
