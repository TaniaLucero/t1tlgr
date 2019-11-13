package mx.edu.tesoem.isc.tlgr.t1tlgr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Division extends AppCompatActivity {

    EditText valor1,valor2;
    TextView res;
    float num1,num2,num3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);

        valor1=(EditText) findViewById(R.id.val1d);
        valor2=(EditText) findViewById(R.id.val2d);

    }

    public void division(View v)
    {
        if((valor1.getText().toString().equals(""))&&(valor2.getText().toString().equals("")))
        {
            res=(TextView) findViewById(R.id.txtres);
            valor1.setText("0.0");
            valor2.setText("0.0");
            res.setText("No se puede resolver");
        }
        else if((valor1.getText().toString().equals(""))&&(!valor2.getText().toString().equals("")))
        {
            res=(TextView) findViewById(R.id.txtres);
            res.setText("Resultado: 0");
        }
        else if((valor2.getText().toString().equals(""))&&(!valor1.getText().toString().equals("")))
        {
            res=(TextView) findViewById(R.id.txtres);
            res.setText("(Indefinido)");
        }
        else
        {
            num1=Float.parseFloat(valor1.getText().toString());
            num2=Float.parseFloat(valor2.getText().toString());
            num3=num1/num2;
            res=(TextView) findViewById(R.id.txtres);
            res.setText("Resultado: "+num3);
        }
    }
}
