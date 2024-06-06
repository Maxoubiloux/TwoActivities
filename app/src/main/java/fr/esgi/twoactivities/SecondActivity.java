package fr.esgi.twoactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");

        TextView textView = findViewById(R.id.text_message);
        textView.setText(message);
    }

    public void returnReply(View view) {
        EditText editText = findViewById(R.id.editText_second);
        String reply = editText.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra("EXTRA_REPLY", reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

}