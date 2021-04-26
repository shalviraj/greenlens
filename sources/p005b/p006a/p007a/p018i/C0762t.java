package p005b.p006a.p007a.p018i;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import android.widget.EditText;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import p005b.p038f.p039a.C0849e;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.i.t */
public final class C0762t implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f494a;

    /* renamed from: b */
    public final /* synthetic */ Calendar f495b;

    public C0762t(EditText editText, Calendar calendar) {
        this.f494a = editText;
        this.f495b = calendar;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.f495b.set(1, i);
        this.f495b.set(2, i2);
        this.f495b.set(5, i3);
        DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(C0849e.m505a());
        C6888i.m12437d(dateFormat, "DateFormat.getDateFormat(appContext())");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) dateFormat).toLocalizedPattern(), Locale.getDefault());
        EditText editText = this.f494a;
        Calendar calendar = this.f495b;
        C6888i.m12437d(calendar, "myCalendar");
        editText.setText(simpleDateFormat.format(calendar.getTime()));
    }
}
