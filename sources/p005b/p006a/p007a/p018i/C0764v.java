package p005b.p006a.p007a.p018i;

import android.app.TimePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.TimePicker;
import java.util.Calendar;

/* renamed from: b.a.a.i.v */
public final class C0764v implements View.OnClickListener {

    /* renamed from: g */
    public final /* synthetic */ EditText f497g;

    /* renamed from: h */
    public final /* synthetic */ Context f498h;

    /* renamed from: b.a.a.i.v$a */
    public static final class C0765a implements TimePickerDialog.OnTimeSetListener {

        /* renamed from: a */
        public final /* synthetic */ C0764v f499a;

        public C0765a(C0764v vVar) {
            this.f499a = vVar;
        }

        public final void onTimeSet(TimePicker timePicker, int i, int i2) {
            EditText editText = this.f499a.f497g;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(':');
            sb.append(i2);
            editText.setText(sb.toString());
        }
    }

    public C0764v(EditText editText, Context context) {
        this.f497g = editText;
        this.f498h = context;
    }

    public final void onClick(View view) {
        Calendar instance = Calendar.getInstance();
        TimePickerDialog timePickerDialog = new TimePickerDialog(this.f498h, new C0765a(this), instance.get(11), instance.get(12), true);
        timePickerDialog.setTitle("Select Time");
        timePickerDialog.show();
    }
}
