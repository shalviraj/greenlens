package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.Context;
import com.amplitude.api.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p005b.p096l.p097a.p113c.p131e.p140i.C2793g3;
import p005b.p096l.p097a.p113c.p131e.p140i.C3026y2;

/* renamed from: b.l.a.c.h.b.c3 */
public final class C3134c3 {

    /* renamed from: A */
    public static final C3110a3<Long> f5340A = m5877b("measurement.upload.initial_upload_delay_time", 15000L, 15000L, C3244m0.f5721a);

    /* renamed from: A0 */
    public static final C3110a3<Boolean> f5341A0;

    /* renamed from: B */
    public static final C3110a3<Long> f5342B;

    /* renamed from: B0 */
    public static final C3110a3<Boolean> f5343B0;

    /* renamed from: C */
    public static final C3110a3<Integer> f5344C = m5877b("measurement.upload.retry_count", 6, 6, C3266o0.f5793a);

    /* renamed from: C0 */
    public static final C3110a3<Boolean> f5345C0;

    /* renamed from: D */
    public static final C3110a3<Long> f5346D = m5877b("measurement.upload.max_queue_time", 2419200000L, 2419200000L, C3277p0.f5826a);

    /* renamed from: D0 */
    public static final C3110a3<Boolean> f5347D0;

    /* renamed from: E */
    public static final C3110a3<Integer> f5348E = m5877b("measurement.lifetimevalue.max_currency_tracked", 4, 4, C3288q0.f5877a);

    /* renamed from: F */
    public static final C3110a3<Integer> f5349F = m5877b("measurement.audience.filter_result_max_count", 200, 200, C3310s0.f5941a);

    /* renamed from: G */
    public static final C3110a3<Integer> f5350G = m5877b("measurement.upload.max_public_user_properties", 25, 25, (C3389z2) null);

    /* renamed from: H */
    public static final C3110a3<Integer> f5351H = m5877b("measurement.upload.max_event_name_cardinality", 500, 500, (C3389z2) null);

    /* renamed from: I */
    public static final C3110a3<Integer> f5352I = m5877b("measurement.upload.max_public_event_params", 25, 25, (C3389z2) null);

    /* renamed from: J */
    public static final C3110a3<Long> f5353J = m5877b("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, C3321t0.f5966a);

    /* renamed from: K */
    public static final C3110a3<Boolean> f5354K;

    /* renamed from: L */
    public static final C3110a3<String> f5355L = m5877b("measurement.test.string_flag", "---", "---", C3343v0.f6008a);

    /* renamed from: M */
    public static final C3110a3<Long> f5356M = m5877b("measurement.test.long_flag", -1L, -1L, C3354w0.f6050a);

    /* renamed from: N */
    public static final C3110a3<Integer> f5357N = m5877b("measurement.test.int_flag", -2, -2, C3365x0.f6078a);

    /* renamed from: O */
    public static final C3110a3<Double> f5358O;

    /* renamed from: P */
    public static final C3110a3<Integer> f5359P = m5877b("measurement.experiment.max_ids", 50, 50, C3387z0.f6138a);

    /* renamed from: Q */
    public static final C3110a3<Integer> f5360Q = m5877b("measurement.max_bundles_per_iteration", 100, 100, C3108a1.f5247a);

    /* renamed from: R */
    public static final C3110a3<Long> f5361R = m5877b("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, C3132c1.f5336a);

    /* renamed from: S */
    public static final C3110a3<Boolean> f5362S;

    /* renamed from: T */
    public static final C3110a3<Boolean> f5363T;

    /* renamed from: U */
    public static final C3110a3<Boolean> f5364U;

    /* renamed from: V */
    public static final C3110a3<Boolean> f5365V;

    /* renamed from: W */
    public static final C3110a3<Boolean> f5366W;

    /* renamed from: X */
    public static final C3110a3<Boolean> f5367X;

    /* renamed from: Y */
    public static final C3110a3<Boolean> f5368Y;

    /* renamed from: Z */
    public static final C3110a3<Boolean> f5369Z;

    /* renamed from: a */
    public static final List<C3110a3<?>> f5370a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0 */
    public static final C3110a3<Boolean> f5371a0;

    /* renamed from: b */
    public static final C3110a3<Long> f5372b = m5877b("measurement.ad_id_cache_time", 10000L, 10000L, C3331u.f5986a);

    /* renamed from: b0 */
    public static final C3110a3<Boolean> f5373b0;

    /* renamed from: c */
    public static final C3110a3<Long> f5374c = m5877b("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, C3178g0.f5532a);

    /* renamed from: c0 */
    public static final C3110a3<Boolean> f5375c0;

    /* renamed from: d */
    public static final C3110a3<Long> f5376d = m5877b("measurement.config.cache_time", 86400000L, 3600000L, C3299r0.f5916a);

    /* renamed from: d0 */
    public static final C3110a3<Boolean> f5377d0;

    /* renamed from: e */
    public static final C3110a3<String> f5378e = m5877b("measurement.config.url_scheme", "https", "https", C3144d1.f5458a);

    /* renamed from: e0 */
    public static final C3110a3<Boolean> f5379e0;

    /* renamed from: f */
    public static final C3110a3<String> f5380f = m5877b("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", C3267o1.f5794a);

    /* renamed from: f0 */
    public static final C3110a3<Boolean> f5381f0;

    /* renamed from: g */
    public static final C3110a3<Integer> f5382g = m5877b("measurement.upload.max_bundles", 100, 100, C3388z1.f6139a);

    /* renamed from: g0 */
    public static final C3110a3<Boolean> f5383g0;

    /* renamed from: h */
    public static final C3110a3<Integer> f5384h = m5877b("measurement.upload.max_batch_size", 65536, 65536, C3235l2.f5696a);

    /* renamed from: h0 */
    public static final C3110a3<Boolean> f5385h0;

    /* renamed from: i */
    public static final C3110a3<Integer> f5386i = m5877b("measurement.upload.max_bundle_size", 65536, 65536, C3356w2.f6052a);

    /* renamed from: i0 */
    public static final C3110a3<Boolean> f5387i0;

    /* renamed from: j */
    public static final C3110a3<Integer> f5388j = m5877b("measurement.upload.max_events_per_bundle", 1000, 1000, C3367x2.f6080a);

    /* renamed from: j0 */
    public static final C3110a3<Boolean> f5389j0;

    /* renamed from: k */
    public static final C3110a3<Integer> f5390k = m5877b("measurement.upload.max_events_per_day", 100000, 100000, C3378y2.f6111a);

    /* renamed from: k0 */
    public static final C3110a3<Boolean> f5391k0;

    /* renamed from: l */
    public static final C3110a3<Integer> f5392l = m5877b("measurement.upload.max_error_events_per_day", 1000, 1000, C3342v.f6007a);

    /* renamed from: l0 */
    public static final C3110a3<Boolean> f5393l0;

    /* renamed from: m */
    public static final C3110a3<Integer> f5394m = m5877b("measurement.upload.max_public_events_per_day", 50000, 50000, C3353w.f6049a);

    /* renamed from: m0 */
    public static final C3110a3<Boolean> f5395m0;

    /* renamed from: n */
    public static final C3110a3<Integer> f5396n = m5877b("measurement.upload.max_conversions_per_day", 10000, 10000, C3364x.f6077a);

    /* renamed from: n0 */
    public static final C3110a3<Boolean> f5397n0;

    /* renamed from: o */
    public static final C3110a3<Integer> f5398o = m5877b("measurement.upload.max_realtime_events_per_day", 10, 10, C3375y.f6108a);

    /* renamed from: o0 */
    public static final C3110a3<Boolean> f5399o0;

    /* renamed from: p */
    public static final C3110a3<Integer> f5400p = m5877b("measurement.store.max_stored_events_per_app", 100000, 100000, C3386z.f6137a);

    /* renamed from: p0 */
    public static final C3110a3<Boolean> f5401p0;

    /* renamed from: q */
    public static final C3110a3<String> f5402q = m5877b("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", C3119b0.f5313a);

    /* renamed from: q0 */
    public static final C3110a3<Boolean> f5403q0;

    /* renamed from: r */
    public static final C3110a3<Long> f5404r = m5877b("measurement.upload.backoff_period", 43200000L, 43200000L, C3131c0.f5335a);

    /* renamed from: r0 */
    public static final C3110a3<Boolean> f5405r0;

    /* renamed from: s */
    public static final C3110a3<Long> f5406s = m5877b("measurement.upload.window_interval", 3600000L, 3600000L, C3143d0.f5457a);

    /* renamed from: s0 */
    public static final C3110a3<Boolean> f5407s0;

    /* renamed from: t */
    public static final C3110a3<Long> f5408t = m5877b("measurement.upload.interval", 3600000L, 3600000L, C3155e0.f5481a);

    /* renamed from: t0 */
    public static final C3110a3<Boolean> f5409t0;

    /* renamed from: u */
    public static final C3110a3<Long> f5410u = m5877b("measurement.upload.realtime_upload_interval", 10000L, 10000L, C3167f0.f5502a);

    /* renamed from: u0 */
    public static final C3110a3<Boolean> f5411u0;

    /* renamed from: v */
    public static final C3110a3<Long> f5412v = m5877b("measurement.upload.debug_upload_interval", 1000L, 1000L, C3189h0.f5572a);

    /* renamed from: v0 */
    public static final C3110a3<Boolean> f5413v0;

    /* renamed from: w */
    public static final C3110a3<Long> f5414w = m5877b("measurement.upload.minimum_delay", 500L, 500L, C3200i0.f5594a);

    /* renamed from: w0 */
    public static final C3110a3<Boolean> f5415w0;

    /* renamed from: x */
    public static final C3110a3<Long> f5416x = m5877b("measurement.alarm_manager.minimum_interval", 60000L, 60000L, C3211j0.f5630a);

    /* renamed from: x0 */
    public static final C3110a3<Integer> f5417x0 = m5877b("measurement.service.storage_consent_support_version", 203600, 203600, C3257n2.f5765a);

    /* renamed from: y */
    public static final C3110a3<Long> f5418y = m5877b("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, C3222k0.f5676a);

    /* renamed from: y0 */
    public static final C3110a3<Boolean> f5419y0;

    /* renamed from: z */
    public static final C3110a3<Long> f5420z = m5877b("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, C3233l0.f5694a);

    /* renamed from: z0 */
    public static final C3110a3<Boolean> f5421z0;

    static {
        Collections.synchronizedSet(new HashSet());
        Long valueOf = Long.valueOf(Constants.SESSION_TIMEOUT_MILLIS);
        f5342B = m5877b("measurement.upload.retry_time", valueOf, valueOf, C3255n0.f5763a);
        Boolean bool = Boolean.FALSE;
        f5354K = m5877b("measurement.test.boolean_flag", bool, bool, C3332u0.f5987a);
        Double valueOf2 = Double.valueOf(-3.0d);
        f5358O = m5877b("measurement.test.double_flag", valueOf2, valueOf2, C3376y0.f6109a);
        f5362S = m5877b("measurement.validation.internal_limits_internal_event_params", bool, bool, C3156e1.f5482a);
        Boolean bool2 = Boolean.TRUE;
        f5363T = m5877b("measurement.collection.firebase_global_collection_flag_enabled", bool2, bool2, C3168f1.f5503a);
        f5364U = m5877b("measurement.collection.redundant_engagement_removal_enabled", bool, bool, C3179g1.f5533a);
        f5365V = m5877b("measurement.collection.log_event_and_bundle_v2", bool2, bool2, C3190h1.f5573a);
        f5366W = m5877b("measurement.quality.checksum", bool, bool, (C3389z2) null);
        f5367X = m5877b("measurement.sdk.collection.validate_param_names_alphabetical", bool2, bool2, C3201i1.f5595a);
        f5368Y = m5877b("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, C3212j1.f5631a);
        f5369Z = m5877b("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, C3223k1.f5677a);
        f5371a0 = m5877b("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, C3234l1.f5695a);
        f5373b0 = m5877b("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, C3245m1.f5722a);
        f5375c0 = m5877b("measurement.sdk.collection.last_deep_link_referrer2", bool2, bool2, C3256n1.f5764a);
        f5377d0 = m5877b("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, C3278p1.f5827a);
        f5379e0 = m5877b("measurement.sdk.collection.last_gclid_from_referrer2", bool, bool, C3289q1.f5878a);
        f5381f0 = m5877b("measurement.sdk.collection.enable_extend_user_property_size", bool2, bool2, C3300r1.f5917a);
        f5383g0 = m5877b("measurement.upload.file_lock_state_check", bool2, bool2, C3311s1.f5942a);
        f5385h0 = m5877b("measurement.ga.ga_app_id", bool, bool, C3322t1.f5967a);
        f5387i0 = m5877b("measurement.lifecycle.app_in_background_parameter", bool, bool, C3333u1.f5988a);
        f5389j0 = m5877b("measurement.integration.disable_firebase_instance_id", bool, bool, C3344v1.f6009a);
        f5391k0 = m5877b("measurement.lifecycle.app_backgrounded_engagement", bool, bool, C3355w1.f6051a);
        f5393l0 = m5877b("measurement.collection.service.update_with_analytics_fix", bool, bool, C3366x1.f6079a);
        f5395m0 = m5877b("measurement.service.use_appinfo_modified", bool2, bool2, C3377y1.f6110a);
        f5397n0 = m5877b("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, C3109a2.f5248a);
        f5399o0 = m5877b("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, C3121b2.f5316a);
        f5401p0 = m5877b("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, C3145d2.f5459a);
        f5403q0 = m5877b("measurement.upload.file_truncate_fix", bool, bool, C3157e2.f5483a);
        f5405r0 = m5877b("measurement.sdk.screen.disabling_automatic_reporting", bool2, bool2, C3169f2.f5504a);
        f5407s0 = m5877b("measurement.sdk.screen.manual_screen_view_logging", bool2, bool2, C3180g2.f5534a);
        m5877b("measurement.collection.synthetic_data_mitigation", bool, bool, C3191h2.f5574a);
        f5409t0 = m5877b("measurement.androidId.delete_feature", bool2, bool2, C3202i2.f5596a);
        f5411u0 = m5877b("measurement.client.consent_state_v1", bool2, bool2, C3213j2.f5632a);
        f5413v0 = m5877b("measurement.client.3p_consent_state_v1", bool2, bool2, C3224k2.f5678a);
        f5415w0 = m5877b("measurement.service.consent_state_v1_W36", bool2, bool2, C3246m2.f5723a);
        f5419y0 = m5877b("measurement.upload.directly_maybe_log_error_events", bool2, bool2, C3268o2.f5795a);
        f5421z0 = m5877b("measurement.frontend.directly_maybe_log_error_events", bool, bool, C3279p2.f5828a);
        f5341A0 = m5877b("measurement.client.properties.non_null_origin", bool2, bool2, C3290q2.f5879a);
        m5877b("measurement.client.click_identifier_control.dev", bool, bool, C3301r2.f5918a);
        m5877b("measurement.service.click_identifier_control", bool, bool, C3312s2.f5943a);
        f5343B0 = m5877b("measurement.client.reject_blank_user_id", bool2, bool2, C3323t2.f5968a);
        f5345C0 = m5877b("measurement.config.persist_last_modified", bool, bool, C3334u2.f5989a);
        f5347D0 = m5877b("measurement.client.consent.suppress_1p_in_ga4f_install", bool2, bool2, C3345v2.f6010a);
    }

    /* renamed from: a */
    public static Map<String, String> m5876a(Context context) {
        C3026y2 a = C3026y2.m5707a(context.getContentResolver(), C2793g3.m4771a("com.google.android.gms.measurement"));
        return a == null ? Collections.emptyMap() : a.mo13989b();
    }

    /* renamed from: b */
    public static <V> C3110a3<V> m5877b(String str, V v, V v2, C3389z2<V> z2Var) {
        C3110a3<V> a3Var = new C3110a3<>(str, v, v2, z2Var);
        f5370a.add(a3Var);
        return a3Var;
    }
}
