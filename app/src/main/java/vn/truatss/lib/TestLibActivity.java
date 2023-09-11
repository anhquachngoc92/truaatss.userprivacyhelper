package vn.truatss.lib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import vn.truatss.userprivacyhelper.R;
import vn.truatss.userprivacyhelper.lib.UserPrivacyHelper;

public class TestLibActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_lib);
        UserPrivacyHelper.showConfirmAge(this, R.style.CustomBottomSheetDialogTheme, ageType -> Log.d("__age", ageType.name()));
    }
}