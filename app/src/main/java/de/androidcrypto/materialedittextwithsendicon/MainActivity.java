package de.androidcrypto.materialedittextwithsendicon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    com.google.android.material.textfield.TextInputLayout sendData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendData = findViewById(R.id.etMainInputWithEnterIconLayout);
        sendData.setEndIconOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                writeToUiToastLong("send icon pressed");
            }
        });

    }

    private void writeToUiToastLong(String message) {
        runOnUiThread(() -> {
            Toast.makeText(getApplicationContext(),
                    message,
                    Toast.LENGTH_LONG).show();
        });
    }
}