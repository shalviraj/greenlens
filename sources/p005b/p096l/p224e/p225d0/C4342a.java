package p005b.p096l.p224e.p225d0;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: b.l.e.d0.a */
public @interface C4342a {
    boolean nullSafe() default true;

    Class<?> value();
}
