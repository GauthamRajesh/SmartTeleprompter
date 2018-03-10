package com.example.android.prompttalker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.userSpeech)
    EditText userSpeech;
    @BindView(R.id.submitSpeech)
    Button submitSpeech;
    @BindView(R.id.speech)
    TextView DisplaySpeech;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        submitSpeech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String speech = userSpeech.getText().toString();
                DisplaySpeech.setText(speech);
            }
        });
    }
}