package com.example.franciscoandrade.calculatormvp.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.franciscoandrade.calculatormvp.Interfaces.MainPresenter;
import com.example.franciscoandrade.calculatormvp.Interfaces.MainView;
import com.example.franciscoandrade.calculatormvp.Presenters.MainPresenterImpl;
import com.example.franciscoandrade.calculatormvp.R;

public class MainActivity extends AppCompatActivity implements MainView{

    EditText numOneET, numTwoET;
    Button btn;
    //llamar presenter
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numOneET=(EditText)findViewById(R.id.numOneET);
        numTwoET=(EditText)findViewById(R.id.numTwoET);
        btn=(Button) findViewById(R.id.btn);
        //
        presenter= new MainPresenterImpl(this);
    }

    @Override
    public void setResult(String result) {
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    public void suma(View view){
        //Llamar methodo de presentador
        presenter.operacion(numOneET.getText().toString(), numTwoET.getText().toString());
    }

}
