package com.example.othello;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public OthelloMaster gameMaster = new OthelloMaster() ;
    public View[][] boardCell = new View[8][8];
    public Coordinates clickedPosition = new Coordinates(0, 0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boardViewUpdate();
    }
    private void boardViewUpdate() {
        boardCell[0][0] = (View) findViewById(R.id.View1);
        boardCell[0][1] = (View) findViewById(R.id.View2);
        boardCell[0][2] = (View) findViewById(R.id.View3);
        boardCell[0][3] = (View) findViewById(R.id.View4);
        boardCell[0][4] = (View) findViewById(R.id.View5);
        boardCell[0][5] = (View) findViewById(R.id.View6);
        boardCell[0][6] = (View) findViewById(R.id.View7);
        boardCell[0][7] = (View) findViewById(R.id.View8);
        boardCell[1][0] = (View) findViewById(R.id.View9);
        boardCell[1][1] = (View) findViewById(R.id.View10);
        boardCell[1][2] = (View) findViewById(R.id.View11);
        boardCell[1][3] = (View) findViewById(R.id.View12);
        boardCell[1][4] = (View) findViewById(R.id.View13);
        boardCell[1][5] = (View) findViewById(R.id.View14);
        boardCell[1][6] = (View) findViewById(R.id.View15);
        boardCell[1][7] = (View) findViewById(R.id.View16);
        boardCell[2][0] = (View) findViewById(R.id.View17);
        boardCell[2][1] = (View) findViewById(R.id.View18);
        boardCell[2][2] = (View) findViewById(R.id.View19);
        boardCell[2][3] = (View) findViewById(R.id.View20);
        boardCell[2][4] = (View) findViewById(R.id.View21);
        boardCell[2][5] = (View) findViewById(R.id.View22);
        boardCell[2][6] = (View) findViewById(R.id.View23);
        boardCell[2][7] = (View) findViewById(R.id.View24);
        boardCell[3][0] = (View) findViewById(R.id.View25);
        boardCell[3][1] = (View) findViewById(R.id.View26);
        boardCell[3][2] = (View) findViewById(R.id.View27);
        boardCell[3][3] = (View) findViewById(R.id.View28);
        boardCell[3][4] = (View) findViewById(R.id.View29);
        boardCell[3][5] = (View) findViewById(R.id.View30);
        boardCell[3][6] = (View) findViewById(R.id.View31);
        boardCell[3][7] = (View) findViewById(R.id.View32);
        boardCell[4][0] = (View) findViewById(R.id.View33);
        boardCell[4][1] = (View) findViewById(R.id.View34);
        boardCell[4][2] = (View) findViewById(R.id.View35);
        boardCell[4][3] = (View) findViewById(R.id.View36);
        boardCell[4][4] = (View) findViewById(R.id.View37);
        boardCell[4][5] = (View) findViewById(R.id.View38);
        boardCell[4][6] = (View) findViewById(R.id.View39);
        boardCell[4][7] = (View) findViewById(R.id.View40);
        boardCell[5][0] = (View) findViewById(R.id.View41);
        boardCell[5][1] = (View) findViewById(R.id.View42);
        boardCell[5][2] = (View) findViewById(R.id.View43);
        boardCell[5][3] = (View) findViewById(R.id.View44);
        boardCell[5][4] = (View) findViewById(R.id.View45);
        boardCell[5][5] = (View) findViewById(R.id.View46);
        boardCell[5][6] = (View) findViewById(R.id.View47);
        boardCell[5][7] = (View) findViewById(R.id.View48);
        boardCell[6][0] = (View) findViewById(R.id.View49);
        boardCell[6][1] = (View) findViewById(R.id.View50);
        boardCell[6][2] = (View) findViewById(R.id.View51);
        boardCell[6][3] = (View) findViewById(R.id.View52);
        boardCell[6][4] = (View) findViewById(R.id.View53);
        boardCell[6][5] = (View) findViewById(R.id.View54);
        boardCell[6][6] = (View) findViewById(R.id.View55);
        boardCell[6][7] = (View) findViewById(R.id.View56);
        boardCell[7][0] = (View) findViewById(R.id.View57);
        boardCell[7][1] = (View) findViewById(R.id.View58);
        boardCell[7][2] = (View) findViewById(R.id.View59);
        boardCell[7][3] = (View) findViewById(R.id.View60);
        boardCell[7][4] = (View) findViewById(R.id.View61);
        boardCell[7][5] = (View) findViewById(R.id.View62);
        boardCell[7][6] = (View) findViewById(R.id.View63);
        boardCell[7][7] = (View) findViewById(R.id.View64);


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (gameMaster.board[i+1][j+1] == 0) {
                    boardCell[i][j].setBackgroundResource(R.drawable.black);
                }
                else if (gameMaster.board[i+1][j+1] == 1) {
                    boardCell[i][j].setBackgroundResource(R.drawable.white);
                }
                else {
                    boardCell[i][j].setBackgroundResource(R.drawable.othello_cell);
                }
            }
        }
    }
    // implements View.OnClickListener -> override the interface
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.View1:
                clickedPosition.setCoordinate(1, 1);
                break;
            case R.id.View2:
                clickedPosition.setCoordinate(1, 2);
                break;
            case R.id.View3:
                clickedPosition.setCoordinate(1, 3);
                break;
            case R.id.View4:
                clickedPosition.setCoordinate(1, 4);
                break;
            case R.id.View5:
                clickedPosition.setCoordinate(1, 5);
                break;
            case R.id.View6:
                clickedPosition.setCoordinate(1, 6);
                break;
            case R.id.View7:
                clickedPosition.setCoordinate(1, 7);
                break;
            case R.id.View8:
                clickedPosition.setCoordinate(1, 8);
                break;
            case R.id.View9:
                clickedPosition.setCoordinate(2, 1);
                break;
            case R.id.View10:
                clickedPosition.setCoordinate(2, 2);
                break;
            case R.id.View11:
                clickedPosition.setCoordinate(2, 3);
                break;
            case R.id.View12:
                clickedPosition.setCoordinate(2, 4);
                break;
            case R.id.View13:
                clickedPosition.setCoordinate(2, 5);
                break;
            case R.id.View14:
                clickedPosition.setCoordinate(2, 6);
                break;
            case R.id.View15:
                clickedPosition.setCoordinate(2, 7);
                break;
            case R.id.View16:
                clickedPosition.setCoordinate(2, 8);
                break;
            case R.id.View17:
                clickedPosition.setCoordinate(3, 1);
                break;
            case R.id.View18:
                clickedPosition.setCoordinate(3, 2);
                break;
            case R.id.View19:
                clickedPosition.setCoordinate(3, 3);
                break;
            case R.id.View20:
                clickedPosition.setCoordinate(3, 4);
                break;
            case R.id.View21:
                clickedPosition.setCoordinate(3, 5);
                break;
            case R.id.View22:
                clickedPosition.setCoordinate(3, 6);
                break;
            case R.id.View23:
                clickedPosition.setCoordinate(3, 7);
                break;
            case R.id.View24:
                clickedPosition.setCoordinate(3, 8);
                break;
            case R.id.View25:
                clickedPosition.setCoordinate(4, 1);
                break;
            case R.id.View26:
                clickedPosition.setCoordinate(4, 2);
                break;
            case R.id.View27:
                clickedPosition.setCoordinate(4, 3);
                break;
            case R.id.View28:
                clickedPosition.setCoordinate(4, 4);
                break;
            case R.id.View29:
                clickedPosition.setCoordinate(4, 5);
                break;
            case R.id.View30:
                clickedPosition.setCoordinate(4, 6);
                break;
            case R.id.View31:
                clickedPosition.setCoordinate(4, 7);
                break;
            case R.id.View32:
                clickedPosition.setCoordinate(4, 8);
                break;
            case R.id.View33:
                clickedPosition.setCoordinate(5, 1);
                break;
            case R.id.View34:
                clickedPosition.setCoordinate(5, 2);
                break;
            case R.id.View35:
                clickedPosition.setCoordinate(5, 3);
                break;
            case R.id.View36:
                clickedPosition.setCoordinate(5, 4);
                break;
            case R.id.View37:
                clickedPosition.setCoordinate(5, 5);
                break;
            case R.id.View38:
                clickedPosition.setCoordinate(5, 6);
                break;
            case R.id.View39:
                clickedPosition.setCoordinate(5, 7);
                break;
            case R.id.View40:
                clickedPosition.setCoordinate(5, 8);
                break;
            case R.id.View41:
                clickedPosition.setCoordinate(6, 1);
                break;
            case R.id.View42:
                clickedPosition.setCoordinate(6, 2);
                break;
            case R.id.View43:
                clickedPosition.setCoordinate(6, 3);
                break;
            case R.id.View44:
                clickedPosition.setCoordinate(6, 4);
                break;
            case R.id.View45:
                clickedPosition.setCoordinate(6, 5);
                break;
            case R.id.View46:
                clickedPosition.setCoordinate(6, 6);
                break;
            case R.id.View47:
                clickedPosition.setCoordinate(6, 7);
                break;
            case R.id.View48:
                clickedPosition.setCoordinate(6, 8);
                break;
            case R.id.View49:
                clickedPosition.setCoordinate(7, 1);
                break;
            case R.id.View50:
                clickedPosition.setCoordinate(7, 2);
                break;
            case R.id.View51:
                clickedPosition.setCoordinate(7, 3);
                break;
            case R.id.View52:
                clickedPosition.setCoordinate(7, 4);
                break;
            case R.id.View53:
                clickedPosition.setCoordinate(7, 5);
                break;
            case R.id.View54:
                clickedPosition.setCoordinate(7, 6);
                break;
            case R.id.View55:
                clickedPosition.setCoordinate(7, 7);
                break;
            case R.id.View56:
                clickedPosition.setCoordinate(7, 8);
                break;
            case R.id.View57:
                clickedPosition.setCoordinate(8, 1);
                break;
            case R.id.View58:
                clickedPosition.setCoordinate(8, 2);
                break;
            case R.id.View59:
                clickedPosition.setCoordinate(8, 3);
                break;
            case R.id.View60:
                clickedPosition.setCoordinate(8, 4);
                break;
            case R.id.View61:
                clickedPosition.setCoordinate(8, 5);
                break;
            case R.id.View62:
                clickedPosition.setCoordinate(8, 6);
                break;
            case R.id.View63:
                clickedPosition.setCoordinate(8, 7);
                break;
            case R.id.View64:
                clickedPosition.setCoordinate(8, 8);
                break;
        }

        if (gameMaster.reverseDisks(clickedPosition).size() != 0) {
            boardViewUpdate();
        }
        else {
            return;
        }
    }
}