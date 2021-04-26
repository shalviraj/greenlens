package p005b.p096l.p164b.p165a.p171c;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: b.l.b.a.c.g */
public @interface C3704g {

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: b.l.b.a.c.g$a */
    public @interface C3705a {
        String key();

        Class<?> ref();
    }

    C3705a[] typeDefinitions();
}
