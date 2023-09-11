package vn.truatss.userprivacyhelper;

import android.app.Activity;
import android.view.View;
import android.widget.RadioGroup;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class UserPrivacyHelper {

    public static void showConfirmAge(Activity activity,int theme,  OnAgeConfirmListener listener) {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(activity, theme);
        View bottomSheetView = activity.getLayoutInflater().inflate(R.layout.dialog_age_confirm, null);
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.setCancelable(false);
        bottomSheetDialog.show();

        View btnConfirm = bottomSheetView.findViewById(R.id.btnConfirm);
        RadioGroup ageRadGroup = bottomSheetView.findViewById(R.id.radGroupAge);

        ageRadGroup.setOnCheckedChangeListener((group, checkedId) -> btnConfirm.setVisibility(View.VISIBLE));
        btnConfirm.setOnClickListener(v -> {
            int selected = ageRadGroup.getCheckedRadioButtonId();
            if (selected == R.id.radUnder13) {
                listener.onAgeConfirm(OnAgeConfirmListener.AgeType.UNDER_13);
            } else if (selected == R.id.rad13to15) {
                listener.onAgeConfirm(OnAgeConfirmListener.AgeType.THIRTEEN_TO_FIFTEEN);
            } else if (selected == R.id.rad16OrOlder) {
                listener.onAgeConfirm(OnAgeConfirmListener.AgeType.SIXTEN_OR_OLDER);
            }
            bottomSheetDialog.dismiss();
        });
    }
}
