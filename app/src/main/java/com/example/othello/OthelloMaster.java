package com.example.othello;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.List;

public class OthelloMaster {
    public boolean isBlackTurn;
    public int[][] board = new int[10][10];

    OthelloMaster() {
        this.isBlackTurn = true;
        // set 0 for the black, 1 for the white, -1 for the vacant cell.
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i == 4 && j == 4) || (i == 5 && j == 5)) {
                    this.board[i][j] = 0;
                }
                else if ((i == 4 && j == 5) || (i == 5 && j == 4)) {
                    this.board[i][j] = 1;
                }
                else {
                    this.board[i][j] = -1;
                }
            }
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    List<Coordinates> reverseDisks(Coordinates coordinates) {
        int currentColor = isBlackTurn ? 0 : 1;
        final int X = coordinates.getX();
        final int Y = coordinates.getY();
        List<Coordinates> reverseList = new ArrayList<Coordinates>();
        List<Coordinates> dummyReverseList = new ArrayList<Coordinates>();
        List<Coordinates> searchDirectionList = new ArrayList<Coordinates>();
        searchDirectionList.add(new Coordinates(-1,0));
        searchDirectionList.add(new Coordinates(-1,1));
        searchDirectionList.add(new Coordinates(0,1));
        searchDirectionList.add(new Coordinates(1,1));
        searchDirectionList.add(new Coordinates(1,0));
        searchDirectionList.add(new Coordinates(1,-1));
        searchDirectionList.add(new Coordinates(0,-1));
        searchDirectionList.add(new Coordinates(-1,-1));
        Object[] searchResult = new Object[2];
        searchResult[0] = false;
        searchResult[1] = dummyReverseList;

        // check if a disk has been already exist or not
        if (board[X][Y] != -1) {
            return reverseList;
        }
        // Find the reversible disks
        for (int i = 0; i < 8; i++) {
            searchResult = searchDirection(searchDirectionList.get(i), X, Y);

            if ((Boolean) searchResult[0]) {
                ((List<Coordinates>) searchResult[1]).forEach(c -> reverseList.add(c));
            }
        }

        reverseList.forEach(c -> board[c.getX()][c.getY()] = currentColor);
        if (reverseList.size() > 0) {
            board[X][Y] = currentColor;
            isBlackTurn = !isBlackTurn;
        }

        return reverseList;
    }

    Object [] searchDirection(Coordinates direction, int X, int Y) {
        int currentColor = isBlackTurn ? 0 : 1;
        int oppositeColor = !(isBlackTurn) ? 0 : 1;
        boolean isPinched = false;
        List<Coordinates> dummyReverseList = new ArrayList<Coordinates>();
        Object [] res = new Object[2];

        while(true) {
            X += direction.getX();
            Y += direction.getY();
            if (board[X][Y] == currentColor) {
                isPinched = true;
                break;
            }
            else if (board[X][Y] == oppositeColor) {
                dummyReverseList.add(new Coordinates(X, Y));
            }
            else {
                break;
            }
        }

        res[0] = isPinched;
        res[1] = dummyReverseList;

        return res;
    }
}
