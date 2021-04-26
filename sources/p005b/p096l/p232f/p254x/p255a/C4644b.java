package p005b.p096l.p232f.p254x.p255a;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;
import p005b.p265m.p266a.p267t.C4743e;
import p005b.p265m.p266a.p267t.C4745f;

/* renamed from: b.l.f.x.a.b */
public final class C4644b implements SensorEventListener {

    /* renamed from: a */
    public C4743e f8754a;

    /* renamed from: b */
    public C4745f f8755b;

    /* renamed from: c */
    public Context f8756c;

    /* renamed from: d */
    public Handler f8757d = new Handler();

    public C4644b(Context context, C4743e eVar, C4745f fVar) {
        this.f8756c = context;
        this.f8754a = eVar;
        this.f8755b = fVar;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        float f = sensorEvent.values[0];
        if (this.f8754a == null) {
            return;
        }
        if (f <= 45.0f) {
            this.f8757d.post(new C4643a(this, true));
        } else if (f >= 450.0f) {
            this.f8757d.post(new C4643a(this, false));
        }
    }
}
