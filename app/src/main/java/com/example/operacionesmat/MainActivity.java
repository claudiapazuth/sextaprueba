package com.example.operacionesmat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity{

    EditText et1,et2;
   Button btnsuma, btnresta, btndivision, btnmultiplicacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.txtnum1);
        et2=(EditText)findViewById(R.id.txtnum2);
        btnsuma=(Button)findViewById(R.id.btnsuma);
        btnresta=(Button)findViewById(R.id.btnresta);
        btndivision=(Button)findViewById(R.id.btndivision);
        btnmultiplicacion=(Button)findViewById(R.id.btnmultiplicacion);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1,n2, res;
                n1 = Float.parseFloat(et1.getText().toString());
                n2 = Float.parseFloat(et2.getText().toString());
                res= n1+n2;


                Intent i= new Intent(MainActivity.this, Pantalla2.class);
                startActivity(i);

                Toast.makeText(getApplicationContext(), "El Resultado es: "+res, Toast.LENGTH_LONG).show();


            }
        });


        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float n1,n2, res;
                n1 = Float.parseFloat(et1.getText().toString());
                n2 = Float.parseFloat(et2.getText().toString());
                res= n1-n2;

                Toast.makeText(getApplicationContext(), "El Resultado es: "+res, Toast.LENGTH_LONG).show();



            }
        });

        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1,n2, res;
                n1 = Float.parseFloat(et1.getText().toString());
                n2 = Float.parseFloat(et2.getText().toString());
                res= n1/n2;
                Toast.makeText(getApplicationContext(), "El Resultado es: "+res, Toast.LENGTH_LONG).show();


            }
        });

        btnmultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float n1,n2, res;
                n1 = Float.parseFloat(et1.getText().toString());
                n2 = Float.parseFloat(et2.getText().toString());
                res= n1*n2;
                Toast.makeText(getApplicationContext(), "El Resultado es: "+res, Toast.LENGTH_LONG).show();




            }
        });
    }

}