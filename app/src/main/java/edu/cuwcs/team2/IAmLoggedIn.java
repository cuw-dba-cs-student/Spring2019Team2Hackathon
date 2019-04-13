package edu.cuwcs.team2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IAmLoggedIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iam_logged_in);





    }

    public void toFutureMoneyCalculatorButtonPressed(View v)
    {
        Intent i = new Intent(this, CalcActivity.class);
        this.startActivity(i);
    }

    public void toUpdateProfileButtonPressed(View v)
    {
        Intent i = new Intent(this, updateActivity.class);
        this.startActivity(i);
    }

}
