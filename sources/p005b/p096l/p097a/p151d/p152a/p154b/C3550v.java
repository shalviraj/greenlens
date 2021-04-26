package p005b.p096l.p097a.p151d.p152a.p154b;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p005b.p096l.p097a.p151d.p152a.p159e.C3612t;

/* renamed from: b.l.a.d.a.b.v */
public final class C3550v extends C3612t {

    /* renamed from: g */
    public final File f6578g;

    /* renamed from: h */
    public final File f6579h;

    /* renamed from: i */
    public final NavigableMap<Long, File> f6580i = new TreeMap();

    public C3550v(File file, File file2) {
        this.f6578g = file;
        this.f6579h = file2;
        ArrayList arrayList = (ArrayList) C3549u1.m6761a(file, file2);
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            long j = 0;
            while (it.hasNext()) {
                File file3 = (File) it.next();
                this.f6580i.put(Long.valueOf(j), file3);
                j += file3.length();
            }
            return;
        }
        throw new C3495g0(String.format("Virtualized slice archive empty for %s, %s", new Object[]{file, file2}));
    }

    public final void close() {
    }

    /* renamed from: d */
    public final long mo14839d() {
        Map.Entry<Long, File> lastEntry = this.f6580i.lastEntry();
        return lastEntry.getValue().length() + lastEntry.getKey().longValue();
    }

    /* renamed from: e */
    public final InputStream mo14840e(long j, long j2) {
        if (j < 0 || j2 < 0) {
            throw new C3495g0(String.format("Invalid input parameters %s, %s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j3 = j + j2;
        if (j3 <= mo14839d()) {
            Long floorKey = this.f6580i.floorKey(Long.valueOf(j));
            Long floorKey2 = this.f6580i.floorKey(Long.valueOf(j3));
            if (floorKey.equals(floorKey2)) {
                return new C3547u(mo14841q(j, floorKey), j2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(mo14841q(j, floorKey));
            Collection values = this.f6580i.subMap(floorKey, false, floorKey2, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new C3488e1(Collections.enumeration(values)));
            }
            arrayList.add(new C3547u(new FileInputStream((File) this.f6580i.get(floorKey2)), j2 - (floorKey2.longValue() - j)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new C3495g0(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", new Object[]{Long.valueOf(mo14839d()), Long.valueOf(j3)}));
    }

    /* renamed from: q */
    public final InputStream mo14841q(long j, Long l) {
        FileInputStream fileInputStream = new FileInputStream((File) this.f6580i.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new C3495g0(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", new Object[]{l}));
    }
}
