package com.example.randomnamegenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.RandomAccess;

public class RandomName extends AppCompatActivity {
    TextView name;

    List<String> names = Arrays.asList("Gargi", "Mudit", "Jayant", "Dhruv", "Zenab");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_name);

        name = (TextView) findViewById(R.id.rand_name);
        Random rand = new Random();
        String randomName = names.get(rand.nextInt(names.size()));
        name.setText(randomName);
    }
}