package com.example.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickShowDialog(View view) {
        MyAlertDialogFragment dialogFragment = new MyAlertDialogFragment ();
        dialogFragment.show(getSupportFragmentManager(), "dialog");
    }

    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }

    public void ShowTime(View view) {
        DialogTimePicker dialogFragment1 = new DialogTimePicker ();
        dialogFragment1.show(getSupportFragmentManager(), "dialog");
    }
    public void ShowDate(View view) {
        DialogDate dialogFragment2 = new DialogDate ();
        dialogFragment2.show(getSupportFragmentManager(), "dialog");
    }
    public void ShowProgress(View view) {
        DialogProgress dialogFragment3 = new DialogProgress ();
        dialogFragment3.show(getSupportFragmentManager(), "dialog");
    }
}
