package com.example.shorttest;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Image> images = new ArrayList<>();
    Button like, reset, next, prev;
    TextView likeNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        like = findViewById(R.id.button);
        reset = findViewById(R.id.button2);
        prev = findViewById(R.id.button3);
        next = findViewById(R.id.button4);

        images.add(new Image(R.drawable.sun));
        images.add(new Image(R.drawable.apple));
        images.add(new Image(R.drawable.skull));
        images.add(new Image(R.drawable.jazz));
    }
}