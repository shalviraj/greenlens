package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0005\u001a\u00020\u00028\u0007@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0013\u0010\t\u001a\u00020\u00068\u0007@\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0007@\u0006¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0007@\u0006¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0013\u001a\u00020\u00108\u0007@\u0006¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0015\u001a\u00020\u00028\u0007@\u0006¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00068\u0007@\u0007X\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\bR\u0016\u0010\u0019\u001a\u00020\u00108\u0007@\u0007X\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u001c"}, mo24462d2 = {"Lkotlin/Metadata;", "", "", "bv", "()[I", "bytecodeVersion", "", "xs", "()Ljava/lang/String;", "extraString", "", "d1", "()[Ljava/lang/String;", "data1", "d2", "data2", "", "k", "()I", "kind", "mv", "metadataVersion", "pn", "packageName", "xi", "extraInt", "<init>", "(I[I[ILkotlin/Array;Lkotlin/Array;Ljava/lang/String;Ljava/lang/String;I)V", "kotlin-stdlib"}, mo24463k = 1, mo24464mv = {1, 4, 1})
@Retention(RetentionPolicy.RUNTIME)
public @interface Metadata {
    /* renamed from: bv */
    int[] mo24460bv() default {};

    /* renamed from: d1 */
    String[] mo24461d1() default {};

    /* renamed from: d2 */
    String[] mo24462d2() default {};

    /* renamed from: k */
    int mo24463k() default 1;

    /* renamed from: mv */
    int[] mo24464mv() default {};

    /* renamed from: pn */
    String mo24465pn() default "";

    /* renamed from: xi */
    int mo24466xi() default 0;

    /* renamed from: xs */
    String mo24467xs() default "";
}
