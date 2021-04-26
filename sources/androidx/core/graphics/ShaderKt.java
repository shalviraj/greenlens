package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Shader;
import kotlin.Metadata;
import p298d.C6777r;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo24462d2 = {"Landroid/graphics/Shader;", "Lkotlin/Function1;", "Landroid/graphics/Matrix;", "Ld/r;", "block", "transform", "(Landroid/graphics/Shader;Ld/x/b/l;)V", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class ShaderKt {
    public static final void transform(Shader shader, C6862l<? super Matrix, C6777r> lVar) {
        C6888i.m12439f(shader, "$this$transform");
        C6888i.m12439f(lVar, "block");
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        lVar.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
