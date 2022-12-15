package pt.up.fe.ldts.example5;

public class Turtle {
    Position position;

    public Turtle(int row, int column, char direction) {this.position=new Position(row, column, direction);}

    public int getRow() {
        return position.getRow();
    }

    public int getColumn() {
        return position.getColumn();
    }

    public char getDirection() {
        return position.getDirection();
    }
    public void setRow(int row){position.setRow(row);}
    public void setColumn(int column){position.setColumn(column);}
    public void setDirection(char direction){position.setDirection(direction);}
    public void setPosition(Position position){this.position=position;}

    public void execute(char mov) {
        if(mov=='L'){
            setPosition(new MoveLeft(position).execute());
        } else if (mov =='R') {
            setPosition(new MoveRight(position).execute());
        } else if (mov=='F'){
            setPosition(new MoveForward(position).execute());
        }
    }
}
