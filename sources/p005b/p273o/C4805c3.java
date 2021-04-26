package p005b.p273o;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.os.Looper;
import android.service.notification.StatusBarNotification;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.ActivityChooserView;
import java.io.UnsupportedEncodingException;
import java.lang.Thread;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.p284z.C5117b;
import p005b.p280p.p285b.C5245o;
import p435n.C8044h;

/* renamed from: b.o.c3 */
public class C4805c3 {
    /* renamed from: a */
    public static String m8802a(String str, String str2) {
        try {
            String d = C8044h.m14840t((str + ":" + str2).getBytes("ISO-8859-1")).mo25955d();
            return "Basic " + d;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    public static boolean m8803b(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0;
    }

    /* renamed from: c */
    public static Type m8804c(Type type, Class<?> cls) {
        Type k = m8812k(type, cls, Collection.class);
        if (k instanceof WildcardType) {
            k = ((WildcardType) k).getUpperBounds()[0];
        }
        return k instanceof ParameterizedType ? ((ParameterizedType) k).getActualTypeArguments()[0] : Object.class;
    }

    /* renamed from: d */
    public static boolean m8805d(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? m8805d(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return m8805d(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof C5117b.C5119b ? ((C5117b.C5119b) parameterizedType).f9911i : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof C5117b.C5119b ? ((C5117b.C5119b) parameterizedType2).f9911i : parameterizedType2.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return m8805d(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m8805d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        }
    }

    /* renamed from: e */
    public static void m8806e(String str, C4920n3 n3Var, @NonNull String str2) {
        new Thread(new C4878i3(str, n3Var, str2), "OS_REST_ASYNC_GET").start();
    }

    @RequiresApi(api = 23)
    /* renamed from: f */
    public static StatusBarNotification[] m8807f(Context context) {
        try {
            return ((NotificationManager) context.getSystemService("notification")).getActiveNotifications();
        } catch (Throwable unused) {
            return new StatusBarNotification[0];
        }
    }

    /* renamed from: g */
    public static Integer m8808g(C4783a3 a3Var, String str, boolean z) {
        Cursor Z = a3Var.mo16512Z("notification", (String[]) null, C0843a.m451l(z ? "group_id IS NULL" : "group_id = ?", " AND dismissed = 0 AND opened = 0 AND is_summary = 0"), z ? null : new String[]{str}, (String) null, (String) null, "created_time DESC", "1");
        if (!Z.moveToFirst()) {
            Z.close();
            return null;
        }
        Integer valueOf = Integer.valueOf(Z.getInt(Z.getColumnIndex("android_notification_id")));
        Z.close();
        return valueOf;
    }

    /* renamed from: h */
    public static NotificationManager m8809h(Context context) {
        return (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: i */
    public static String m8810i(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder t = C0843a.m459t('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                t.append('[');
                t.append(iArr2[i2]);
                t.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                t.append('.');
                if (strArr[i2] != null) {
                    t.append(strArr[i2]);
                }
            }
        }
        return t.toString();
    }

    /* renamed from: j */
    public static Class<?> m8811j(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m8811j(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m8811j(((WildcardType) type).getUpperBounds()[0]);
        }
        String name = type == null ? "null" : type.getClass().getName();
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }

    /* renamed from: k */
    public static Type m8812k(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C5117b.m9421h(type, cls, C5117b.m9417d(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: l */
    public static void m8813l(String str, String str2, JSONObject jSONObject, C4920n3 n3Var, int i, String str3) {
        String str4 = str2;
        if (Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            throw new C4906m3(C0843a.m452m("Method: ", str2, " was called from the Main Thread!"));
        } else if (str4 == null || !C4857i2.m8930G((String) null)) {
            Thread[] threadArr = new Thread[1];
            Thread thread = new Thread(new C4884j3(threadArr, str, str2, jSONObject, n3Var, i, str3), "OS_HTTPConnection");
            thread.start();
            try {
                thread.join((long) (i + 5000));
                if (thread.getState() != Thread.State.TERMINATED) {
                    thread.interrupt();
                }
                if (threadArr[0] != null) {
                    threadArr[0].join();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: m */
    public static ParameterizedType m8814m(Type type, Type... typeArr) {
        if (typeArr.length != 0) {
            return new C5117b.C5119b((Type) null, type, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + type);
    }

    /* renamed from: n */
    public static int m8815n(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: o */
    public static boolean m8816o(String str) {
        return m8820s(str) || str.equals("OPTIONS") || str.equals("DELETE") || str.equals("PROPFIND") || str.equals("MKCOL") || str.equals("LOCK");
    }

    /* renamed from: p */
    public static void m8817p(String str, JSONObject jSONObject, C4920n3 n3Var) {
        new Thread(new C4852h3(str, jSONObject, n3Var), "OS_REST_ASYNC_POST").start();
    }

    /* renamed from: q */
    public static void m8818q(String str, JSONObject jSONObject, C4920n3 n3Var) {
        m8813l(str, "POST", jSONObject, n3Var, 120000, (String) null);
    }

    /* renamed from: r */
    public static String m8819r(C5245o oVar) {
        int indexOf = oVar.f10428i.indexOf(47, oVar.f10420a.length() + 3);
        String str = oVar.f10428i;
        String substring = oVar.f10428i.substring(indexOf, C5245o.m9721e(str, indexOf, str.length(), "?#"));
        String h = oVar.mo17167h();
        if (h == null) {
            return substring;
        }
        return substring + '?' + h;
    }

    /* renamed from: s */
    public static boolean m8820s(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }

    /* renamed from: t */
    public static int m8821t(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* renamed from: u */
    public static int m8822u(String str, int i) {
        while (i < str.length() && ((r0 = str.charAt(i)) == ' ' || r0 == 9)) {
            i++;
        }
        return i;
    }
}
