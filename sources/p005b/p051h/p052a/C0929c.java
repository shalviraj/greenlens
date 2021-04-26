package p005b.p051h.p052a;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActivityChooserView;
import com.bumptech.glide.GeneratedAppGlideModule;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.p054l.C0956a;
import p005b.p051h.p052a.p055m.C0981r;
import p005b.p051h.p052a.p055m.p056u.C1000k;
import p005b.p051h.p052a.p055m.p056u.C1003m;
import p005b.p051h.p052a.p055m.p058v.C1090l;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1023b;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1025d;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1026e;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1031i;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1034j;
import p005b.p051h.p052a.p055m.p058v.p060d0.C1055g;
import p005b.p051h.p052a.p055m.p058v.p060d0.C1056h;
import p005b.p051h.p052a.p055m.p058v.p060d0.C1057i;
import p005b.p051h.p052a.p055m.p058v.p060d0.C1059j;
import p005b.p051h.p052a.p055m.p058v.p061e0.C1067a;
import p005b.p051h.p052a.p055m.p062w.C1120a;
import p005b.p051h.p052a.p055m.p062w.C1124b;
import p005b.p051h.p052a.p055m.p062w.C1131c;
import p005b.p051h.p052a.p055m.p062w.C1132d;
import p005b.p051h.p052a.p055m.p062w.C1135e;
import p005b.p051h.p052a.p055m.p062w.C1140f;
import p005b.p051h.p052a.p055m.p062w.C1148g;
import p005b.p051h.p052a.p055m.p062w.C1154k;
import p005b.p051h.p052a.p055m.p062w.C1173s;
import p005b.p051h.p052a.p055m.p062w.C1178t;
import p005b.p051h.p052a.p055m.p062w.C1179u;
import p005b.p051h.p052a.p055m.p062w.C1183v;
import p005b.p051h.p052a.p055m.p062w.C1186w;
import p005b.p051h.p052a.p055m.p062w.C1191x;
import p005b.p051h.p052a.p055m.p062w.p063y.C1193a;
import p005b.p051h.p052a.p055m.p062w.p063y.C1195b;
import p005b.p051h.p052a.p055m.p062w.p063y.C1197c;
import p005b.p051h.p052a.p055m.p062w.p063y.C1199d;
import p005b.p051h.p052a.p055m.p062w.p063y.C1201e;
import p005b.p051h.p052a.p055m.p062w.p063y.C1206f;
import p005b.p051h.p052a.p055m.p064x.p065c.C1212a;
import p005b.p051h.p052a.p055m.p064x.p065c.C1213a0;
import p005b.p051h.p052a.p055m.p064x.p065c.C1215b;
import p005b.p051h.p052a.p055m.p064x.p065c.C1216b0;
import p005b.p051h.p052a.p055m.p064x.p065c.C1224c;
import p005b.p051h.p052a.p055m.p064x.p065c.C1229g;
import p005b.p051h.p052a.p055m.p064x.p065c.C1230h;
import p005b.p051h.p052a.p055m.p064x.p065c.C1233k;
import p005b.p051h.p052a.p055m.p064x.p065c.C1245m;
import p005b.p051h.p052a.p055m.p064x.p065c.C1251p;
import p005b.p051h.p052a.p055m.p064x.p065c.C1257t;
import p005b.p051h.p052a.p055m.p064x.p065c.C1259v;
import p005b.p051h.p052a.p055m.p064x.p065c.C1262x;
import p005b.p051h.p052a.p055m.p064x.p065c.C1263y;
import p005b.p051h.p052a.p055m.p064x.p066d.C1267a;
import p005b.p051h.p052a.p055m.p064x.p067e.C1274e;
import p005b.p051h.p052a.p055m.p064x.p067e.C1275f;
import p005b.p051h.p052a.p055m.p064x.p068f.C1276a;
import p005b.p051h.p052a.p055m.p064x.p069g.C1278a;
import p005b.p051h.p052a.p055m.p064x.p069g.C1282c;
import p005b.p051h.p052a.p055m.p064x.p069g.C1284d;
import p005b.p051h.p052a.p055m.p064x.p069g.C1291h;
import p005b.p051h.p052a.p055m.p064x.p069g.C1293j;
import p005b.p051h.p052a.p055m.p064x.p070h.C1294a;
import p005b.p051h.p052a.p055m.p064x.p070h.C1295b;
import p005b.p051h.p052a.p055m.p064x.p070h.C1296c;
import p005b.p051h.p052a.p055m.p064x.p070h.C1297d;
import p005b.p051h.p052a.p071n.C1306d;
import p005b.p051h.p052a.p071n.C1309f;
import p005b.p051h.p052a.p071n.C1316l;
import p005b.p051h.p052a.p072o.C1326c;
import p005b.p051h.p052a.p072o.C1328e;
import p005b.p051h.p052a.p073p.C1332b;
import p005b.p051h.p052a.p074q.C1342d;
import p005b.p051h.p052a.p074q.p075h.C1352f;
import p005b.p051h.p052a.p078s.C1377g;
import p005b.p051h.p052a.p078s.C1380j;

/* renamed from: b.h.a.c */
public class C0929c implements ComponentCallbacks2 {

    /* renamed from: o */
    public static volatile C0929c f837o;

    /* renamed from: p */
    public static volatile boolean f838p;

    /* renamed from: g */
    public final C1025d f839g;

    /* renamed from: h */
    public final C1057i f840h;

    /* renamed from: i */
    public final C0933e f841i;

    /* renamed from: j */
    public final C0935g f842j;

    /* renamed from: k */
    public final C1023b f843k;

    /* renamed from: l */
    public final C1316l f844l;

    /* renamed from: m */
    public final C1306d f845m;

    /* renamed from: n */
    public final List<C0943i> f846n = new ArrayList();

    /* renamed from: b.h.a.c$a */
    public interface C0930a {
    }

    public C0929c(@NonNull Context context, @NonNull C1090l lVar, @NonNull C1057i iVar, @NonNull C1025d dVar, @NonNull C1023b bVar, @NonNull C1316l lVar2, @NonNull C1306d dVar2, int i, @NonNull C0930a aVar, @NonNull Map<Class<?>, C0946j<?, ?>> map, @NonNull List<C1342d<Object>> list, boolean z, boolean z2) {
        C0981r rVar;
        C0981r rVar2;
        Context context2 = context;
        C1025d dVar3 = dVar;
        C1023b bVar2 = bVar;
        Class<C0956a> cls = C0956a.class;
        Class<String> cls2 = String.class;
        Class<Integer> cls3 = Integer.class;
        Class<byte[]> cls4 = byte[].class;
        this.f839g = dVar3;
        this.f843k = bVar2;
        this.f840h = iVar;
        this.f844l = lVar2;
        this.f845m = dVar2;
        Resources resources = context.getResources();
        C0935g gVar = new C0935g();
        this.f842j = gVar;
        C1233k kVar = new C1233k();
        C1332b bVar3 = gVar.f884g;
        synchronized (bVar3) {
            bVar3.f1681a.add(kVar);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            C1251p pVar = new C1251p();
            C1332b bVar4 = gVar.f884g;
            synchronized (bVar4) {
                bVar4.f1681a.add(pVar);
            }
        }
        List<ImageHeaderParser> e = gVar.mo10765e();
        C1278a aVar2 = new C1278a(context2, e, dVar3, bVar2);
        C1216b0 b0Var = new C1216b0(dVar3, new C1216b0.C1223g());
        C1245m mVar = new C1245m(gVar.mo10765e(), resources.getDisplayMetrics(), dVar3, bVar2);
        if (!z2 || i2 < 28) {
            rVar = new C1229g(mVar);
            rVar2 = new C1263y(mVar, bVar2);
        } else {
            rVar2 = new C1257t();
            rVar = new C1230h();
        }
        Class<byte[]> cls5 = cls4;
        C1274e eVar = new C1274e(context2);
        int i3 = i2;
        C1173s.C1176c cVar = new C1173s.C1176c(resources);
        C1173s.C1177d dVar4 = new C1173s.C1177d(resources);
        Class<String> cls6 = cls2;
        C1173s.C1175b bVar5 = new C1173s.C1175b(resources);
        C1173s.C1177d dVar5 = dVar4;
        C1173s.C1174a aVar3 = new C1173s.C1174a(resources);
        C1224c cVar2 = new C1224c(bVar2);
        Class<Integer> cls7 = cls3;
        C1294a aVar4 = new C1294a();
        C1297d dVar6 = new C1297d();
        ContentResolver contentResolver = context.getContentResolver();
        C1173s.C1175b bVar6 = bVar5;
        gVar.mo10761a(ByteBuffer.class, new C1131c());
        gVar.mo10761a(InputStream.class, new C1178t(bVar2));
        gVar.mo10764d("Bitmap", ByteBuffer.class, Bitmap.class, rVar);
        gVar.mo10764d("Bitmap", InputStream.class, Bitmap.class, rVar2);
        gVar.mo10764d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C1259v(mVar));
        gVar.mo10764d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, b0Var);
        gVar.mo10764d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new C1216b0(dVar3, new C1216b0.C1219c((C1216b0.C1217a) null)));
        C1183v.C1184a<?> aVar5 = C1183v.C1184a.f1443a;
        gVar.mo10763c(Bitmap.class, Bitmap.class, aVar5);
        gVar.mo10764d("Bitmap", Bitmap.class, Bitmap.class, new C1213a0());
        gVar.mo10762b(Bitmap.class, cVar2);
        gVar.mo10764d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C1212a(resources, rVar));
        gVar.mo10764d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C1212a(resources, rVar2));
        gVar.mo10764d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C1212a(resources, b0Var));
        gVar.mo10762b(BitmapDrawable.class, new C1215b(dVar3, cVar2));
        gVar.mo10764d("Gif", InputStream.class, C1282c.class, new C1293j(e, aVar2, bVar2));
        gVar.mo10764d("Gif", ByteBuffer.class, C1282c.class, aVar2);
        gVar.mo10762b(C1282c.class, new C1284d());
        Class<C0956a> cls8 = cls;
        gVar.mo10763c(cls8, cls8, aVar5);
        gVar.mo10764d("Bitmap", cls8, Bitmap.class, new C1291h(dVar3));
        C1274e eVar2 = eVar;
        gVar.mo10764d("legacy_append", Uri.class, Drawable.class, eVar2);
        gVar.mo10764d("legacy_append", Uri.class, Bitmap.class, new C1262x(eVar2, dVar3));
        gVar.mo10767g(new C1267a.C1268a());
        gVar.mo10763c(File.class, ByteBuffer.class, new C1132d.C1134b());
        gVar.mo10763c(File.class, InputStream.class, new C1140f.C1146e());
        gVar.mo10764d("legacy_append", File.class, File.class, new C1276a());
        gVar.mo10763c(File.class, ParcelFileDescriptor.class, new C1140f.C1142b());
        gVar.mo10763c(File.class, File.class, aVar5);
        gVar.mo10767g(new C1000k.C1001a(bVar2));
        gVar.mo10767g(new C1003m.C1004a());
        Class cls9 = Integer.TYPE;
        C1173s.C1176c cVar3 = cVar;
        gVar.mo10763c(cls9, InputStream.class, cVar3);
        C1173s.C1175b bVar7 = bVar6;
        gVar.mo10763c(cls9, ParcelFileDescriptor.class, bVar7);
        Class<Integer> cls10 = cls7;
        gVar.mo10763c(cls10, InputStream.class, cVar3);
        gVar.mo10763c(cls10, ParcelFileDescriptor.class, bVar7);
        C1173s.C1177d dVar7 = dVar5;
        gVar.mo10763c(cls10, Uri.class, dVar7);
        C1173s.C1174a aVar6 = aVar3;
        gVar.mo10763c(cls9, AssetFileDescriptor.class, aVar6);
        gVar.mo10763c(cls10, AssetFileDescriptor.class, aVar6);
        gVar.mo10763c(cls9, Uri.class, dVar7);
        Class<String> cls11 = cls6;
        gVar.mo10763c(cls11, InputStream.class, new C1135e.C1138c());
        gVar.mo10763c(Uri.class, InputStream.class, new C1135e.C1138c());
        gVar.mo10763c(cls11, InputStream.class, new C1179u.C1182c());
        gVar.mo10763c(cls11, ParcelFileDescriptor.class, new C1179u.C1181b());
        gVar.mo10763c(cls11, AssetFileDescriptor.class, new C1179u.C1180a());
        gVar.mo10763c(Uri.class, InputStream.class, new C1195b.C1196a());
        gVar.mo10763c(Uri.class, InputStream.class, new C1120a.C1123c(context.getAssets()));
        gVar.mo10763c(Uri.class, ParcelFileDescriptor.class, new C1120a.C1122b(context.getAssets()));
        Context context3 = context;
        gVar.mo10763c(Uri.class, InputStream.class, new C1197c.C1198a(context3));
        gVar.mo10763c(Uri.class, InputStream.class, new C1199d.C1200a(context3));
        if (i3 >= 29) {
            gVar.mo10763c(Uri.class, InputStream.class, new C1201e.C1204c(context3));
            gVar.mo10763c(Uri.class, ParcelFileDescriptor.class, new C1201e.C1203b(context3));
        }
        ContentResolver contentResolver2 = contentResolver;
        gVar.mo10763c(Uri.class, InputStream.class, new C1186w.C1190d(contentResolver2));
        gVar.mo10763c(Uri.class, ParcelFileDescriptor.class, new C1186w.C1188b(contentResolver2));
        gVar.mo10763c(Uri.class, AssetFileDescriptor.class, new C1186w.C1187a(contentResolver2));
        gVar.mo10763c(Uri.class, InputStream.class, new C1191x.C1192a());
        gVar.mo10763c(URL.class, InputStream.class, new C1206f.C1207a());
        gVar.mo10763c(Uri.class, File.class, new C1154k.C1155a(context3));
        gVar.mo10763c(C1148g.class, InputStream.class, new C1193a.C1194a());
        Class<byte[]> cls12 = cls5;
        gVar.mo10763c(cls12, ByteBuffer.class, new C1124b.C1125a());
        gVar.mo10763c(cls12, InputStream.class, new C1124b.C1129d());
        gVar.mo10763c(Uri.class, Uri.class, aVar5);
        gVar.mo10763c(Drawable.class, Drawable.class, aVar5);
        gVar.mo10764d("legacy_append", Drawable.class, Drawable.class, new C1275f());
        gVar.mo10768h(Bitmap.class, BitmapDrawable.class, new C1295b(resources));
        C1294a aVar7 = aVar4;
        gVar.mo10768h(Bitmap.class, cls12, aVar7);
        C1297d dVar8 = dVar6;
        gVar.mo10768h(Drawable.class, cls12, new C1296c(dVar3, aVar7, dVar8));
        gVar.mo10768h(C1282c.class, cls12, dVar8);
        C1216b0 b0Var2 = new C1216b0(dVar3, new C1216b0.C1220d());
        gVar.mo10764d("legacy_append", ByteBuffer.class, Bitmap.class, b0Var2);
        gVar.mo10764d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C1212a(resources, b0Var2));
        this.f841i = new C0933e(context, bVar, gVar, new C1352f(), aVar, map, list, lVar, z, i);
    }

    @GuardedBy("Glide.class")
    /* renamed from: a */
    public static void m651a(@NonNull Context context, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        List<C1326c> list;
        GeneratedAppGlideModule generatedAppGlideModule2 = generatedAppGlideModule;
        if (!f838p) {
            f838p = true;
            C0931d dVar = new C0931d();
            Context applicationContext = context.getApplicationContext();
            List emptyList = Collections.emptyList();
            if (generatedAppGlideModule2 == null || generatedAppGlideModule.mo11168c()) {
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Loading Glide modules");
                }
                ArrayList arrayList = new ArrayList();
                try {
                    ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                    if (applicationInfo.metaData != null) {
                        if (Log.isLoggable("ManifestParser", 2)) {
                            Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                        }
                        for (String str : applicationInfo.metaData.keySet()) {
                            if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                                arrayList.add(C1328e.m1354a(str));
                                if (Log.isLoggable("ManifestParser", 3)) {
                                    Log.d("ManifestParser", "Loaded Glide module: " + str);
                                }
                            }
                        }
                        if (Log.isLoggable("ManifestParser", 3)) {
                            Log.d("ManifestParser", "Finished loading Glide modules");
                        }
                    } else if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Got null app info metadata");
                    }
                    list = arrayList;
                } catch (PackageManager.NameNotFoundException e) {
                    throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
                }
            } else {
                list = emptyList;
            }
            if (generatedAppGlideModule2 != null && !generatedAppGlideModule.mo18705d().isEmpty()) {
                Set<Class<?>> d = generatedAppGlideModule.mo18705d();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C1326c cVar = (C1326c) it.next();
                    if (d.contains(cVar.getClass())) {
                        if (Log.isLoggable("Glide", 3)) {
                            Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + cVar);
                        }
                        it.remove();
                    }
                }
            }
            if (Log.isLoggable("Glide", 3)) {
                for (C1326c cVar2 : list) {
                    StringBuilder u = C0843a.m460u("Discovered GlideModule from manifest: ");
                    u.append(cVar2.getClass());
                    Log.d("Glide", u.toString());
                }
            }
            dVar.f859m = generatedAppGlideModule2 != null ? generatedAppGlideModule.mo18706e() : null;
            for (C1326c a : list) {
                a.mo11167a(applicationContext, dVar);
            }
            if (generatedAppGlideModule2 != null) {
                generatedAppGlideModule2.mo11167a(applicationContext, dVar);
            }
            if (dVar.f852f == null) {
                int a2 = C1067a.m908a();
                if (!TextUtils.isEmpty("source")) {
                    dVar.f852f = new C1067a(new ThreadPoolExecutor(a2, a2, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C1067a.C1068a("source", C1067a.C1070b.f1174b, false)));
                } else {
                    throw new IllegalArgumentException(C0843a.m451l("Name must be non-null and non-empty, but given: ", "source"));
                }
            }
            if (dVar.f853g == null) {
                int i = C1067a.f1167i;
                if (!TextUtils.isEmpty("disk-cache")) {
                    dVar.f853g = new C1067a(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C1067a.C1068a("disk-cache", C1067a.C1070b.f1174b, true)));
                } else {
                    throw new IllegalArgumentException(C0843a.m451l("Name must be non-null and non-empty, but given: ", "disk-cache"));
                }
            }
            if (dVar.f860n == null) {
                int i2 = C1067a.m908a() >= 4 ? 2 : 1;
                if (!TextUtils.isEmpty("animation")) {
                    dVar.f860n = new C1067a(new ThreadPoolExecutor(i2, i2, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C1067a.C1068a("animation", C1067a.C1070b.f1174b, true)));
                } else {
                    throw new IllegalArgumentException(C0843a.m451l("Name must be non-null and non-empty, but given: ", "animation"));
                }
            }
            if (dVar.f855i == null) {
                dVar.f855i = new C1059j(new C1059j.C1060a(applicationContext));
            }
            if (dVar.f856j == null) {
                dVar.f856j = new C1309f();
            }
            if (dVar.f849c == null) {
                int i3 = dVar.f855i.f1150a;
                if (i3 > 0) {
                    dVar.f849c = new C1034j((long) i3);
                } else {
                    dVar.f849c = new C1026e();
                }
            }
            if (dVar.f850d == null) {
                dVar.f850d = new C1031i(dVar.f855i.f1153d);
            }
            if (dVar.f851e == null) {
                dVar.f851e = new C1056h((long) dVar.f855i.f1151b);
            }
            if (dVar.f854h == null) {
                dVar.f854h = new C1055g(applicationContext);
            }
            if (dVar.f848b == null) {
                dVar.f848b = new C1090l(dVar.f851e, dVar.f854h, dVar.f853g, dVar.f852f, new C1067a(new ThreadPoolExecutor(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, C1067a.f1166h, TimeUnit.MILLISECONDS, new SynchronousQueue(), new C1067a.C1068a("source-unlimited", C1067a.C1070b.f1174b, false))), dVar.f860n, false);
            }
            List<C1342d<Object>> list2 = dVar.f861o;
            dVar.f861o = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
            C1316l lVar = new C1316l(dVar.f859m);
            C1090l lVar2 = dVar.f848b;
            C1057i iVar = dVar.f851e;
            C1025d dVar2 = dVar.f849c;
            C1023b bVar = dVar.f850d;
            C1306d dVar3 = dVar.f856j;
            int i4 = dVar.f857k;
            C0930a aVar = dVar.f858l;
            Map<Class<?>, C0946j<?, ?>> map = dVar.f847a;
            List<C1342d<Object>> list3 = dVar.f861o;
            Context context2 = applicationContext;
            C0929c cVar3 = new C0929c(applicationContext, lVar2, iVar, dVar2, bVar, lVar, dVar3, i4, aVar, map, list3, false, false);
            for (C1326c cVar4 : list) {
                try {
                    cVar4.mo11169b(context2, cVar3, cVar3.f842j);
                } catch (AbstractMethodError e2) {
                    StringBuilder u2 = C0843a.m460u("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                    u2.append(cVar4.getClass().getName());
                    throw new IllegalStateException(u2.toString(), e2);
                }
            }
            if (generatedAppGlideModule2 != null) {
                generatedAppGlideModule2.mo11169b(context2, cVar3, cVar3.f842j);
            }
            context2.registerComponentCallbacks(cVar3);
            f837o = cVar3;
            f838p = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    @NonNull
    /* renamed from: b */
    public static C0929c m652b(@NonNull Context context) {
        if (f837o == null) {
            Context applicationContext = context.getApplicationContext();
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{applicationContext.getApplicationContext()});
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (InstantiationException e) {
                m653c(e);
                throw null;
            } catch (IllegalAccessException e2) {
                m653c(e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                m653c(e3);
                throw null;
            } catch (InvocationTargetException e4) {
                m653c(e4);
                throw null;
            }
            synchronized (C0929c.class) {
                if (f837o == null) {
                    m651a(context, generatedAppGlideModule);
                }
            }
        }
        return f837o;
    }

    /* renamed from: c */
    public static void m653c(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    @NonNull
    /* renamed from: d */
    public static C0943i m654d(@NonNull Context context) {
        Objects.requireNonNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m652b(context).f844l.mo11157b(context);
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        C1380j.m1468a();
        ((C1377g) this.f840h).mo11254e(0);
        this.f839g.mo10893b();
        this.f843k.mo10885b();
    }

    public void onTrimMemory(int i) {
        long j;
        C1380j.m1468a();
        for (C0943i requireNonNull : this.f846n) {
            Objects.requireNonNull(requireNonNull);
        }
        C1056h hVar = (C1056h) this.f840h;
        Objects.requireNonNull(hVar);
        if (i >= 40) {
            hVar.mo11254e(0);
        } else if (i >= 20 || i == 15) {
            synchronized (hVar) {
                j = hVar.f1795b;
            }
            hVar.mo11254e(j / 2);
        }
        this.f839g.mo10892a(i);
        this.f843k.mo10884a(i);
    }
}
