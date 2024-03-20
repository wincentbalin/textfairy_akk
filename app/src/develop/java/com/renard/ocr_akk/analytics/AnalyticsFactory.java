package com.renard.ocr_akk.analytics;

import android.content.Context;

public class AnalyticsFactory {

    public static Analytics createAnalytics(Context context) {
        return new LoggingAnalytics();
    }
}
