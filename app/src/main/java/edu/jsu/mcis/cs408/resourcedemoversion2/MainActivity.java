package edu.jsu.mcis.cs408.resourcedemoversion2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import edu.jsu.mcis.cs408.resourcedemoversion2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;

    private Die die1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.button.setOnClickListener(this);

        die1 = new Die();

    }

    @Override
    public void onClick(View v) {

        die1.next();
        binding.button.getDrawable().setLevel(die1.getValue().getLevel());

    }

}
