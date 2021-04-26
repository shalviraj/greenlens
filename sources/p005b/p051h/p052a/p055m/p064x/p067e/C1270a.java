package p005b.p051h.p052a.p055m.p064x.p067e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* renamed from: b.h.a.m.x.e.a */
public final class C1270a {

    /* renamed from: a */
    public static volatile boolean f1579a = true;

    /* renamed from: a */
    public static Drawable m1271a(Context context, Context context2, @DrawableRes int i, @Nullable Resources.Theme theme) {
        try {
            if (f1579a) {
                return AppCompatResources.getDrawable(theme != null ? new ContextThemeWrapper(context2, theme) : context2, i);
            }
        } catch (NoClassDefFoundError unused) {
            f1579a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return ContextCompat.getDrawable(context2, i);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return ResourcesCompat.getDrawable(context2.getResources(), i, theme);
    }
}
