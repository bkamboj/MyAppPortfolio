package com.example.bkambo.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mPopularMovies;
    private Button mStockHawk;
    private Button mBuildItBetter;
    private Button mMakeAppMaterial;
    private Button mGoUbiquitous;
    private Button mCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPopularMovies = (Button)findViewById(R.id.buttonPopularMovies);
        mPopularMovies.setOnClickListener(this);

        mStockHawk = (Button)findViewById(R.id.buttonStockHawk);
        mStockHawk.setOnClickListener(this);

        mBuildItBetter = (Button) findViewById(R.id.buttonBuildItBetter);
        mBuildItBetter.setOnClickListener(this);

        mMakeAppMaterial = (Button) findViewById(R.id.buttonMakeAppMaterial);
        mMakeAppMaterial.setOnClickListener(this);

        mGoUbiquitous = (Button) findViewById(R.id.buttonGoUbiquitous);
        mGoUbiquitous.setOnClickListener(this);

        mCapstone = (Button) findViewById(R.id.buttonCapstone);
        mCapstone.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonPopularMovies:
                Toast.makeText(this,"This button will launch popular movies project",Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonStockHawk:
                Toast.makeText(this,"This button will launch stock hawk project",Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonBuildItBetter:
                Toast.makeText(this,"This button will launch build it better project",Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonMakeAppMaterial:
                Toast.makeText(this,"This button will launch make app material project",Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonGoUbiquitous:
                Toast.makeText(this,"This button will launch go ubiquitous project",Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonCapstone:
                Toast.makeText(this,"This button will launch my capstone project",Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this,"Invalid selection",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
