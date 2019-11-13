package mx.edu.tesoem.isc.tlgr.t1tlgr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MenuActivity extends AppCompatActivity {

    EditText opcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        opcion=(EditText)findViewById(R.id.txtopcion);
    }

    public void seleccion(View view)
    {
        switch (opcion.getText().toString())
        {
            case "1":
                Intent opsuma=new Intent(this, SumaActivity.class);
                startActivity(opsuma);

                break;
            case "2":
                Intent opresta=new Intent(this, Resta.class);
                startActivity(opresta);

                break;
            case "3":
                Intent opdivision=new Intent(this, Division.class);
                startActivity(opdivision);

                break;
            case "4":
                Intent opmulti=new Intent(this, Multiplicacion.class);
                startActivity(opmulti);

                break;
        }
    }
}
