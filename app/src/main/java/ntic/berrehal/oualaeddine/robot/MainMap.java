package ntic.berrehal.oualaeddine.robot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TableLayout;
import android.widget.TableRow;

import ntic.berrehal.oualaeddine.robot.das.Robot;
import ntic.berrehal.oualaeddine.robot.das.RobotAutonome;
import ntic.berrehal.oualaeddine.robot.das.RobotProgramme;

public class MainMap extends AppCompatActivity {

    Button move;
    RadioGroup direction;
    SeekBar speed;
    TableLayout map ;
    TableRow  row;
    ImageView cell;
    int robotImg,noRobotImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_map);

        final RobotProgramme robot = new RobotProgramme();

        robotImg = R.drawable.cell_shape_with_robot;
        noRobotImg = R.drawable.cell_shape;
        row = (TableRow) map.getChildAt(robot.getPosition().getX());
        cell = (ImageView) row.getChildAt(robot.getPosition().getY());
        cell.setImageResource(robotImg);

        direction = (RadioGroup)findViewById(R.id.direction);

        map = (TableLayout)findViewById(R.id.map);

        speed = (SeekBar) findViewById(R.id.seekBar2);
        speed.setVisibility(View.GONE);

        move = (Button) findViewById(R.id.buttonDeplacer);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (direction.getCheckedRadioButtonId()){
                    case R.id.Eradio:{
                        row = (TableRow) map.getChildAt(robot.getPosition().getX());
                        cell = (ImageView) row.getChildAt(robot.getPosition().getY());
                        cell.setImageResource(noRobotImg);
                        robot.deplacerEst();
                        row = (TableRow) map.getChildAt(robot.getPosition().getX());
                        cell = (ImageView) row.getChildAt(robot.getPosition().getY());
                        cell.setImageResource(robotImg);
                        break;
                    }
                    case R.id.Oradio:{
                        row = (TableRow) map.getChildAt(robot.getPosition().getX());
                        cell = (ImageView) row.getChildAt(robot.getPosition().getY());
                        cell.setImageResource(noRobotImg);
                        robot.deplacerOuest();
                        row = (TableRow) map.getChildAt(robot.getPosition().getX());
                        cell = (ImageView) row.getChildAt(robot.getPosition().getY());
                        cell.setImageResource(robotImg);
                        break;
                    }
                    case R.id.Nradio:{
                        row = (TableRow) map.getChildAt(robot.getPosition().getX());
                        cell = (ImageView) row.getChildAt(robot.getPosition().getY());
                        cell.setImageResource(noRobotImg);
                        robot.deplacerNord();
                        row = (TableRow) map.getChildAt(robot.getPosition().getX());
                        cell = (ImageView) row.getChildAt(robot.getPosition().getY());
                        cell.setImageResource(robotImg);
                        break;
                    }
                    case R.id.Sradio:{
                        row = (TableRow) map.getChildAt(robot.getPosition().getX());
                        cell = (ImageView) row.getChildAt(robot.getPosition().getY());
                        cell.setImageResource(noRobotImg);
                        robot.deplacerSud();
                        row = (TableRow) map.getChildAt(robot.getPosition().getX());
                        cell = (ImageView) row.getChildAt(robot.getPosition().getY());
                        cell.setImageResource(robotImg);
                        break;
                    }
                    default:{
                        break;
                    }

                }
            }
        });
    }

}
