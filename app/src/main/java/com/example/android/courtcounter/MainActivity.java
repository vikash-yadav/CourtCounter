package com.example.android.courtcounter;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreLakers = 0;
    int scoreCeltics = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForLakers(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Lakers_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneForLakers(View View) {
        scoreLakers = scoreLakers + 1;
        displayForLakers(scoreLakers);

    }

    public void addTwoForLakers(View View) {
        scoreLakers = scoreLakers + 2;
        displayForLakers(scoreLakers);
    }


    public void addThreeForLakers(View View) {
        scoreLakers = scoreLakers + 3;
        displayForLakers(scoreLakers);

    }
    public void foulLakers(View View) {
        scoreLakers = scoreLakers - 1 ;
        displayForLakers(scoreLakers);
    }




    /**
     * Displays the given score for Team B.
     */
    public void displayForCeltics(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Celtics_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneForCeltics(View View) {
        scoreCeltics = scoreCeltics + 1;
        displayForCeltics(scoreCeltics);

    }

    public void addTwoForCeltics(View View) {
        scoreCeltics = scoreCeltics + 2;
        displayForCeltics(scoreCeltics);
    }

    public void foulCeltics(View View) {
        scoreCeltics = scoreCeltics - 1;
        displayForCeltics(scoreCeltics);
    }

    public void addthreeForCeltics(View View) {
        scoreCeltics = scoreCeltics + 3;
        displayForCeltics(scoreCeltics);
    }


    // Resets the score
    public void resetScore(View View) {
        scoreLakers = 0;
        scoreCeltics = 0;
        displayForLakers(scoreLakers);
        displayForCeltics(scoreCeltics);
    }

}
