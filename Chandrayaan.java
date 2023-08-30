/**
 * Chandrayaan
 */
class GetDirectionAndPosition{
    int x,y,z;
    String direction;

    
    public GetDirectionAndPosition(int x,int y,int z,String direction){

        this.x=x;
        this.y=y;
        this.z=z;
        this.direction=direction;

    }

    public void forward() {
        if (direction.equals("N")) {
            y++;
        } else if (direction.equals("S")) {
            y--;
        } else if (direction.equals("E")) {
            x++;
        } else if (direction.equals("W")) {
            x--;
        } else if (direction.equals("Up")) {
            z++;
        } else if (direction.equals("Down")) {
            z--;
        }
    }

    public void backward() {
        if (direction.equals("N")) {
            y--;
        } else if (direction.equals("S")) {
            y++;
        } else if (direction.equals("E")) {
            x--;
        } else if (direction.equals("W")) {
            x++;
        } else if (direction.equals("Up")) {
            z--;
        } else if (direction.equals("Down")) {
            z++;
        }
    }

    public void left() {
        if (direction.equals("N")) {
            direction = "W";
        } else if (direction.equals("S")) {
            direction = "E";
        } else if (direction.equals("E")) {
            direction = "N";
        } else if (direction.equals("W")) {
            direction = "S";
        }
    }

    public void right() {
        if (direction.equals("N")) {
            direction = "E";
        } else if (direction.equals("S")) {
            direction = "W";
        } else if (direction.equals("E")) {
            direction = "S";
        } else if (direction.equals("W")) {
            direction = "N";
        }
    }

    public void turnUpSide() {
        if (direction.equals("N") || direction.equals("E")) {
            direction = "Up";
        } else if (direction.equals("S") || direction.equals("W")) {
            direction = "Down";
        }
    }

}
public class Chandrayaan {

    public static void main(String[] args) {

        int[] startingPosition = {0, 0, 0};
        String startingDirection ="N";
        
        GetDirectionAndPosition gdp= new GetDirectionAndPosition(startingPosition[0], startingPosition[1],startingPosition[2], startingDirection);
    }
}