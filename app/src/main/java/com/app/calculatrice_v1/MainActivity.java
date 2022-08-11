package com.app.calculatrice_v1;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bc,bce,begal,bplus,bmoins,bmultiplication,bdivision, b1x,bcarre,bracine,bpourcent,bvirgule,bplusmoins;
    private ImageButton beffacer;
    private EditText etResult;
    private TextView tvOperation;
    private boolean newNumber;
    private ArrayList<String> arrValues;
    private char operation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etResult = findViewById(R.id.et_Result);
        tvOperation = findViewById(R.id.tv_Operation);
        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        bc = findViewById(R.id.bC);
        bce = findViewById(R.id.bCe);
        begal = findViewById(R.id.bEgal);
        bplus = findViewById(R.id.bPlus);
        bmoins = findViewById(R.id.bMoins);
        bmultiplication = findViewById(R.id.bMultiplication);
        bdivision = findViewById(R.id.bDivision);
        beffacer = findViewById(R.id.bEffacer);
        b1x = findViewById(R.id.b1x);
        bcarre = findViewById(R.id.bCarre);
        bracine = findViewById(R.id.bRacine);
        bpourcent = findViewById(R.id.bPourcent);
        bvirgule =findViewById(R.id.bVirgule);
        bplusmoins = findViewById(R.id.bPlusMoins);

        //Set the number parser
        NumberFormat nf = NumberFormat.getNumberInstance();
        //Variable to Define if its a new number to avoid Concatenation
        newNumber = false;
        //Create/Initialize the value's array
        arrValues = new ArrayList<String>();
        int position = 0; //Position where to add the new value

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOperation.setText("");
                etResult.setText("0");
                arrValues.clear();
            }
        });

        bce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText("0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(newNumber == false)
                    {
                        etResult.setText(String.valueOf(nf.parse(etResult.getText().toString() + "1")));
                    }else{
                        etResult.setText("1");
                        newNumber = false;
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(newNumber == false)
                    {
                        etResult.setText(String.valueOf(nf.parse(etResult.getText().toString() + "2")));
                    }else{
                        etResult.setText("2");
                        newNumber = false;
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(newNumber == false)
                    {
                        etResult.setText(String.valueOf(nf.parse(etResult.getText().toString() + "3")));
                    }else{
                        etResult.setText("3");
                        newNumber = false;
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(newNumber == false)
                    {
                        etResult.setText(String.valueOf(nf.parse(etResult.getText().toString() + "4")));
                    }else{
                        etResult.setText("4");
                        newNumber = false;
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(newNumber == false)
                    {
                        etResult.setText(String.valueOf(nf.parse(etResult.getText().toString() + "5")));
                    }else{
                        etResult.setText("5");
                        newNumber = false;
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(newNumber == false)
                    {
                        etResult.setText(String.valueOf(nf.parse(etResult.getText().toString() + "6")));
                    }else{
                        etResult.setText("6");
                        newNumber = false;
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(newNumber == false)
                    {
                        etResult.setText(String.valueOf(nf.parse(etResult.getText().toString() + "7")));
                    }else{
                        etResult.setText("7");
                        newNumber = false;
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(newNumber == false)
                    {
                        etResult.setText(String.valueOf(nf.parse(etResult.getText().toString() + "8")));
                    }else{
                        etResult.setText("8");
                        newNumber = false;
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(newNumber == false)
                    {
                        etResult.setText(String.valueOf(nf.parse(etResult.getText().toString() + "9")));
                    }else{
                        etResult.setText("9");
                        newNumber = false;
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(newNumber == false)
                    {
                        etResult.setText(String.valueOf(nf.parse(etResult.getText().toString() + "0")));
                    }else{
                        etResult.setText("0");
                        newNumber = false;
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });



        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(newNumber == false){
                    //Store typed value into the array if it's a newly typed value
                    arrValues.add(etResult.getText().toString());
                    if(arrValues.size() == 2)
                    {
                        try {
                            switch (operation)
                            {
                                case '+' : etResult.setText(String.valueOf(nf.parse(String.valueOf(Double.valueOf(arrValues.get(0)) + Double.valueOf(arrValues.get(1))))));break;
                                case '-' : etResult.setText(String.valueOf(nf.parse(String.valueOf(Double.valueOf(arrValues.get(0)) - Double.valueOf(arrValues.get(1))))));break;
                                case '*' : etResult.setText(String.valueOf(nf.parse(String.valueOf(Double.valueOf(arrValues.get(0)) * Double.valueOf(arrValues.get(1))))));break;
                                case '/' : etResult.setText(String.valueOf(nf.parse(String.valueOf(Double.valueOf(arrValues.get(0)) / Double.valueOf(arrValues.get(1))))));break;
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        arrValues.clear();
                        arrValues.add(etResult.getText().toString());
                    }}
                operation = '+';
                tvOperation.setText(etResult.getText() + " + ");
                newNumber = true;
            }
        });

        bmoins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(newNumber == false){
                    //Store typed value into the array if it's a newly typed value
                    arrValues.add(etResult.getText().toString());
                    if(arrValues.size() == 2)
                    {
                        try {
                            switch (operation)
                            {
                                case '+' : etResult.setText(String.valueOf(nf.parse(String.valueOf(Double.valueOf(arrValues.get(0)) + Double.valueOf(arrValues.get(1))))));break;
                                case '-' : etResult.setText(String.valueOf(nf.parse(String.valueOf(Double.valueOf(arrValues.get(0)) - Double.valueOf(arrValues.get(1))))));break;
                                case '*' : etResult.setText(String.valueOf(nf.parse(String.valueOf(Double.valueOf(arrValues.get(0)) * Double.valueOf(arrValues.get(1))))));break;
                                case '/' : etResult.setText(String.valueOf(nf.parse(String.valueOf(Double.valueOf(arrValues.get(0)) / Double.valueOf(arrValues.get(1))))));break;
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        arrValues.clear();
                        arrValues.add(etResult.getText().toString());
                    }
                }
                operation = '-';
                tvOperation.setText(etResult.getText() + " - ");
                newNumber = true;
            }
        });

        bmultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(newNumber == false){
                    //Store typed value into the array if it's a newly typed value
                    arrValues.add(etResult.getText().toString());
                    if(arrValues.size() == 2)
                    {
                        try {
                            switch (operation)
                            {
                                case '+' : etResult.setText(String.valueOf(nf.parse(String.valueOf(Double.valueOf(arrValues.get(0)) + Double.valueOf(arrValues.get(1))))));break;
                                case '-' : etResult.setText(String.valueOf(nf.parse(String.valueOf(Double.valueOf(arrValues.get(0)) - Double.valueOf(arrValues.get(1))))));break;
                                case '*' : etResult.setText(String.valueOf(nf.parse(String.valueOf(Double.valueOf(arrValues.get(0)) * Double.valueOf(arrValues.get(1))))));break;
                                case '/' : etResult.setText(String.valueOf(nf.parse(String.valueOf(Double.valueOf(arrValues.get(0)) / Double.valueOf(arrValues.get(1))))));break;
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        arrValues.clear();
                        arrValues.add(etResult.getText().toString());
                    }}
                operation = '*';
                tvOperation.setText(etResult.getText() + " * ");
                newNumber = true;
            }
        });

        bdivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(newNumber == false){
                    //Store typed value into the array if it's a newly typed value
                    arrValues.add(etResult.getText().toString());
                    if(arrValues.size() == 2)
                    {
                        try {
                            switch (operation)
                            {
                                case '+' : etResult.setText(String.valueOf(nf.parse(String.valueOf(Double.valueOf(arrValues.get(0)) + Double.valueOf(arrValues.get(1))))));break;
                                case '-' : etResult.setText(String.valueOf(nf.parse(String.valueOf(Double.valueOf(arrValues.get(0)) - Double.valueOf(arrValues.get(1))))));break;
                                case '*' : etResult.setText(String.valueOf(nf.parse(String.valueOf(Double.valueOf(arrValues.get(0)) * Double.valueOf(arrValues.get(1))))));break;
                                case '/' : etResult.setText(String.valueOf(nf.parse(String.valueOf(Double.valueOf(arrValues.get(0)) / Double.valueOf(arrValues.get(1))))));break;
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        arrValues.clear();
                        arrValues.add(etResult.getText().toString());
                    }}
                operation = '/';
                tvOperation.setText(etResult.getText() + " / ");
                newNumber = true;
            }
        });

        begal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(newNumber == false){
                    //Store typed value into the array if it's a newly typed value
                    arrValues.add(etResult.getText().toString());
                    if(arrValues.size() >= 2)
                    {
                        try {
                            switch (operation)
                            {
                                case '+' : etResult.setText(String.valueOf(nf.parse(String.valueOf(Double.valueOf(arrValues.get(0)) + Double.valueOf(arrValues.get(1))))));break;
                                case '-' : etResult.setText(String.valueOf(nf.parse(String.valueOf(Double.valueOf(arrValues.get(0)) - Double.valueOf(arrValues.get(1))))));break;
                                case '*' : etResult.setText(String.valueOf(nf.parse(String.valueOf(Double.valueOf(arrValues.get(0)) * Double.valueOf(arrValues.get(1))))));break;
                                case '/' : etResult.setText(String.valueOf(nf.parse(String.valueOf(Double.valueOf(arrValues.get(0)) / Double.valueOf(arrValues.get(1))))));break;
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        tvOperation.setText(arrValues.get(0).toString() + " " + operation + " " + arrValues.get(1).toString() + " = ");
                        arrValues.clear();
                        arrValues.add(etResult.getText().toString());
                    }else{
                        tvOperation.setText(etResult.getText() + " = ");
                    }
                }else{
                    tvOperation.setText(etResult.getText() + " = ");
                }
                newNumber = true;
            }
        });


        beffacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText().toString().substring(0,etResult.getText().toString().length()-1));
            }
        });

        b1x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOperation.setText("1/("+ etResult.getText().toString() + ")");
                try {
                    etResult.setText(String.valueOf(nf.parse(String.valueOf((1 / Double.valueOf(etResult.getText().toString()))))));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });


        bcarre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOperation.setText("sqrt("+ etResult.getText().toString() + ")");
                try {
                    etResult.setText(String.valueOf(nf.parse(String.valueOf((Double.valueOf(etResult.getText().toString()) * Double.valueOf(etResult.getText().toString()))))));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });


        bracine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOperation.setText("√("+ etResult.getText().toString() + ")");
                try {
                    etResult.setText(String.valueOf(nf.parse(String.valueOf(Math.sqrt(Double.valueOf(etResult.getText().toString()))))));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });


        bpourcent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOperation.setText(etResult.getText().toString() + "%");
                try {
                    etResult.setText(String.valueOf(nf.parse(String.valueOf(Double.valueOf(etResult.getText().toString())/100))));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        bvirgule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!etResult.getText().toString().contains("."))
                {
                    etResult.setText(etResult.getText() + ".");
                }
            }
        });


        bplusmoins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!etResult.getText().toString().equals("0"))
                {
                    try {
                        etResult.setText(String.valueOf(nf.parse(String.valueOf(Double.valueOf(etResult.getText().toString()) * (-1)))));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }

            }
        });
    }
}