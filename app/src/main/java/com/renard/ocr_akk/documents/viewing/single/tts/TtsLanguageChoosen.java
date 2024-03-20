package com.renard.ocr_akk.documents.viewing.single.tts;

import java.util.Locale;

public class TtsLanguageChoosen {
    private final Locale mLocale;

    TtsLanguageChoosen(Locale locale) {
        mLocale = locale;
    }

    public Locale getLocale() {
        return mLocale;
    }
}
