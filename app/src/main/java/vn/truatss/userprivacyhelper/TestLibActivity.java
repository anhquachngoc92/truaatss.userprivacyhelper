package vn.truatss.userprivacyhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class TestLibActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_lib);
        UserPrivacyHelper.showConfirmAge(this, R.style.CustomBottomSheetDialogTheme, ageType -> Log.d("__age", ageType.name()));
    }
}