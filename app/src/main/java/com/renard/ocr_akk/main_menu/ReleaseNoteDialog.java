package com.renard.ocr_akk.main_menu;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import com.renard.ocr_akk.HintDialog;
import com.renard.ocr_akk.R;

public class ReleaseNoteDialog extends DialogFragment {

	public final static String TAG = ReleaseNoteDialog.class.getSimpleName();

	@NonNull
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		return HintDialog.createDialog(getActivity(), R.string.whats_new_title, R.raw.release_notes);
	}

}
