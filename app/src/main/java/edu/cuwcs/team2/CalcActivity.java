package edu.cuwcs.team2;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.DecimalFormat;

public class CalcActivity extends AppCompatActivity
{

    EditText presentValET, intRateET, numYearsET, futureValET;
    private CalcActivity myself;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        this.myself = this;

        this.presentValET = (EditText)this.findViewById(R.id.presentValET);
        this.intRateET = (EditText)this.findViewById(R.id.intRateET);
        this.numYearsET = (EditText)this.findViewById(R.id.numYearsET);
        this.futureValET = (EditText)this.findViewById(R.id.futureValET);

    }

    public void onCalculateButtonPressed(View v)
    {
        //double intRate = Integer.parseInt(this.intRateET.getText().toString());
        try
        {
            double intRate = Double.parseDouble(intRateET.getText().toString());
            double numYears = Double.parseDouble(numYearsET.getText().toString());
            double presentVal = Double.parseDouble(presentValET.getText().toString());

            double inParenthesis = (1 + (0.01 * intRate));
            double np = numYears;
            double powerParenthesis = Math.pow(inParenthesis, np);
            double fv = (presentVal * powerParenthesis);

            //CalcValues finalVal= fv.getText().toString();



            DecimalFormat df = new DecimalFormat("$" + "#.00");
            futureValET.setText("" + df.format(fv));
            System.out.println("***" + futureValET);

        }
        catch(Exception e)
        {
            AlertDialog.Builder dialog = new AlertDialog.Builder(this);
            dialog.setMessage("Input numericial values in textboxes.");
            dialog.setTitle("Error: ");
            dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i)
                {
                    myself.finish();

                }
            });

            dialog.show();

            System.out.println("*** I BROKE IT");
        }
    }


}
