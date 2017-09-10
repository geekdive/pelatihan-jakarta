package id.co.decoded.moeslim.first100917;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class papanilai1Activity extends AppCompatActivity {

    int scoreTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_papanilai);
        displayForTeamA(0);
    }

    public void displayForTeamA(int score){
        TextView scoreView = (TextView)findViewById(R.id.viewNilai);
        scoreView.setText(String.valueOf(score));
    }

    public void teamATambahTiga (View view){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void teamATambahDua (View view){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void teamATambahSatu (View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void resetNilaiTeamA (View view){
        scoreTeamA = scoreTeamA - scoreTeamA;
        displayForTeamA(scoreTeamA);
    }
}
