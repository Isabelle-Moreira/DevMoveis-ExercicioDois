package com.example.exerciciodois;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import com.example.exerciciodois.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private AguaDiariaViewModel aguaDiariaViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        aguaDiariaViewModel = new ViewModelProvider(this).get(AguaDiariaViewModel.class);
        binding.setViewModel(aguaDiariaViewModel);
        binding.setLifecycleOwner(this);
    }
}