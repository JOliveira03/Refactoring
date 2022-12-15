package pt.up.fe.ldts.example5;

import javafx.geometry.Pos;

public class MoveLeft extends Move {
    public MoveLeft(Position position){super(position);}
    @Override
    public Position execute() {
        if (getPosition().getDirection() == 'N') getPosition().setDirection('W');
        else if (getPosition().getDirection() == 'W') getPosition().setDirection('S');
        else if (getPosition().getDirection() == 'S') getPosition().setDirection('E');
        else if (getPosition().getDirection() == 'E') getPosition().setDirection('N');
        return getPosition();
    }
}
