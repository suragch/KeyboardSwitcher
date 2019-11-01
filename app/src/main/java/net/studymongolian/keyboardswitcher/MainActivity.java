package net.studymongolian.keyboardswitcher;

import android.content.Intent;
import android.provider.Settings;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        showKeyboardSwitcherMenu();
    }

    private void showKeyboardSwitcherMenu() {
        InputMethodManager im = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        if (im == null) return;
        im.showInputMethodPicker();
    }

    public void onSwitchKeyboardsButtonClick(View view) {
        showKeyboardSwitcherMenu();
    }

    public void onManageKeyboardsButtonClick(View view) {
        Intent inputSettings = new Intent(Settings.ACTION_INPUT_METHOD_SETTINGS);
        startActivityForResult(inputSettings, 0);
    }
}
