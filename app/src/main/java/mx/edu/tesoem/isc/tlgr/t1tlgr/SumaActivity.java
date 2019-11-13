package mx.edu.tesoem.isc.tlgr.t1tlgr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SumaActivity extends AppCompatActivity {

    EditText valor1, valor2;
    TextView res;
    float num1,num2,num3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        valor1=(EditText)findViewById(R.id.valor1s);
        valor2=(EditText)findViewById(R.id.valor2s);
    }

    public void suma (View view)
    {
        if((valor1.getText().toString().equals(""))&&(valor2.getText().toString().equals("")))
        {
            res=(TextView) findViewById(R.id.txtres);
            valor1.setText("0.0");
            valor2.setText("0.0");
            res.setText("Resultado: 0");
        }
        else if((valor1.getText().toString().equals(""))&&(!valor2.getText().toString().equals("")))
        {
            num2=Float.parseFloat(valor2.getText().toString());
            valor1.setText("0.0");
            res=(TextView) findViewById(R.id.txtres);
            res.setText("Resultado: "+num2);
        }
        else if((valor2.getText().toString().equals(""))&&(!valor1.getText().toString().equals("")))
        {
            num1=Float.parseFloat(valor1.getText().toString());
            valor2.setText("0.0");
            res=(TextView) findViewById(R.id.txtres);
            res.setText("Resultado: "+num1);
        }
        else
        {
            num1=Float.parseFloat(valor1.getText().toString());
            num2=Float.parseFloat(valor2.getText().toString());
            num3=num1+num2;
            res=(TextView) findViewById(R.id.txtres);
            res.setText("Resultado: "+num3);
        }
    }
}
