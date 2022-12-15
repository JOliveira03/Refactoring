package pt.up.fe.ldts.example5;

import javafx.geometry.Pos;

public abstract class Move {
    Position position;
    public Move(Position position){this.position=position;}
    public Position getPosition(){return position;}
    public void setPosition(Position position){this.position=position;}
    public abstract Position execute();
}
