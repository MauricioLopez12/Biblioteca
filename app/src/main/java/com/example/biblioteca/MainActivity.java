package com.example.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar pb;
    private Button button;

    private ImageView iv_git;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pb = (ProgressBar)findViewById(R.id.progressBar);
        button = (Button)findViewById(R.id.button);
        iv_git = (ImageView)findViewById(R.id.imageView_git);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                new Task().execute();
            }
        });

        pb.setVisibility(View.INVISIBLE);
        iv_git.setVisibility(View.INVISIBLE);
    }

    class Task extends AsyncTask<String, Void, String>{

        @Override
        protected void onPreExecute() {

            pb.setVisibility(View.VISIBLE);

        }

        @Override
        protected String doInBackground(String... strings) {
            for(int i = 1; i < 10; i++)
            {
                try {
                    Thread.sleep(1000);

                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            return null;
        }
        @Override // finalizamos la tarea
        protected void onPostExecute(String s) {

            pb.setVisibility(View.INVISIBLE);
            iv_git.setVisibility(View.VISIBLE);
        }
    }

    public void github(View view){
        Intent i = new Intent(this, github_act.class);
        startActivity(i);
        iv_git.setVisibility(View.INVISIBLE);
    }
}