package p005b.p096l.p180d.p216x;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: b.l.d.x.i */
public class C4295i {

    /* renamed from: a */
    public static final byte f7965a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    public static final byte f7966b = Byte.parseByte("00001111", 2);

    @NonNull
    /* renamed from: a */
    public String mo15904a() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array = wrap.array();
        array[16] = array[0];
        array[0] = (byte) ((f7966b & array[0]) | f7965a);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
