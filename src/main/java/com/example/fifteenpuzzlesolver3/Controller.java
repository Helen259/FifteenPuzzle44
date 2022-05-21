package com.example.fifteenpuzzlesolver3;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import static com.example.fifteenpuzzlesolver3.Game.*;

public class Controller {
    public ImageView cell16;
    @FXML
    GridPane gridPane;


    public void winMessage() {
        for (Node n : gridPane.getChildren()) {
            ImageView img = (ImageView) n;
            img.setImage(images.get(17));
        }
    }

    public void start() {
        startState();
        updateUserInterface();
    }

    public void startState() {
        for (int j = 0; j < 1000; j++) {
            int a = (int) (Math.random() * 4);
            int b = (int) (Math.random() * 4);
            move(a, b);
        }
    }

    public void cell00() {
    }

    public void cell1() {
        move(0, 0);
        updateUserInterface();
        if (checkWin(tiles))
            winMessage();
    }

    public void cell2() {
        move(0, 1);
        updateUserInterface();
        if (checkWin(tiles))
            winMessage();
    }

    public void cell3() {
        move(0, 2);
        updateUserInterface();
        if (checkWin(tiles))
            winMessage();
    }

    public void cell4() {
        move(0, 3);
        updateUserInterface();
        if (checkWin(tiles))
            winMessage();
    }

    public void cell5() {
        move(1, 0);
        updateUserInterface();
        if (checkWin(tiles))
            winMessage();
    }

    public void cell6() {
        move(1, 1);
        updateUserInterface();
        if (checkWin(tiles))
            winMessage();
    }

    public void cell7() {
        move(1, 2);
        updateUserInterface();
        if (checkWin(tiles))
            winMessage();
    }

    public void cell8() {
        move(1, 3);
        updateUserInterface();
        if (checkWin(tiles))
            winMessage();
    }

    public void cell9() {
        move(2, 0);
        updateUserInterface();
        if (checkWin(tiles))
            winMessage();
    }

    public void cell10() {
        move(2, 1);
        updateUserInterface();
        if (checkWin(tiles))
            winMessage();
    }

    public void cell11() {
        move(2, 2);
        updateUserInterface();
        if (checkWin(tiles))
            winMessage();
    }

    public void cell12() {
        move(2, 3);
        updateUserInterface();
        if (checkWin(tiles))
            winMessage();
    }

    public void cell13() {
        move(3, 0);
        updateUserInterface();
        if (checkWin(tiles))
            winMessage();
    }

    public void cell14() {
        move(3, 1);
        updateUserInterface();
        if (checkWin(tiles))
            winMessage();
    }

    public void cell15() {
        move(3, 2);
        updateUserInterface();
        if (checkWin(tiles))
            winMessage();
    }

    public void cell0() {
        move(3, 3);
        updateUserInterface();
        if (checkWin(tiles))
            winMessage();
    }

    public void help() {
        System.out.println(helper());
        updateUserInterface();
        if (checkWin(tiles))
            winMessage();
    }

    private String helper() {
        return new Solver().helper();
    }

    public boolean checkWin(int[][] array) {
        int[][] test = new int[4][4];
        int m = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                test[i][j] = m;
                m++;
            }
        }
        test[3][3] = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (test[i][j] != array[i][j]) return false;
            }
        }
        return true;
    }

    public void updateUserInterface() {
        for (Node n : gridPane.getChildren()) {
            ImageView img = (ImageView) n;
            img.setImage(images.get(tiles[GridPane.getRowIndex(n)][GridPane.getColumnIndex(n)]));
        }
    }

    public Controller() throws FileNotFoundException {
        images.put(0, new Image(new FileInputStream("src/main/resources/com/example/fifteenpuzzlesolver3/images/0.png")));
        images.put(1, new Image(new FileInputStream("src/main/resources/com/example/fifteenpuzzlesolver3/images/1.png")));
        images.put(2, new Image(new FileInputStream("src/main/resources/com/example/fifteenpuzzlesolver3/images/2.png")));
        images.put(3, new Image(new FileInputStream("src/main/resources/com/example/fifteenpuzzlesolver3/images/3.png")));
        images.put(4, new Image(new FileInputStream("src/main/resources/com/example/fifteenpuzzlesolver3/images/4.png")));
        images.put(5, new Image(new FileInputStream("src/main/resources/com/example/fifteenpuzzlesolver3/images/5.png")));
        images.put(6, new Image(new FileInputStream("src/main/resources/com/example/fifteenpuzzlesolver3/images/6.png")));
        images.put(7, new Image(new FileInputStream("src/main/resources/com/example/fifteenpuzzlesolver3/images/7.png")));
        images.put(8, new Image(new FileInputStream("src/main/resources/com/example/fifteenpuzzlesolver3/images/8.png")));
        images.put(9, new Image(new FileInputStream("src/main/resources/com/example/fifteenpuzzlesolver3/images/9.png")));
        images.put(10, new Image(new FileInputStream("src/main/resources/com/example/fifteenpuzzlesolver3/images/10.png")));
        images.put(11, new Image(new FileInputStream("src/main/resources/com/example/fifteenpuzzlesolver3/images/11.png")));
        images.put(12, new Image(new FileInputStream("src/main/resources/com/example/fifteenpuzzlesolver3/images/12.png")));
        images.put(13, new Image(new FileInputStream("src/main/resources/com/example/fifteenpuzzlesolver3/images/13.png")));
        images.put(14, new Image(new FileInputStream("src/main/resources/com/example/fifteenpuzzlesolver3/images/14.png")));
        images.put(15, new Image(new FileInputStream("src/main/resources/com/example/fifteenpuzzlesolver3/images/15.png")));
        images.put(17, new Image(new FileInputStream("src/main/resources/com/example/fifteenpuzzlesolver3/images/17.jpg")));
    }

    Map<Integer, Image> images = new HashMap<>();
}