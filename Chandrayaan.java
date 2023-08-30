/**
 * Chandrayaan
 */
class GetDirectionAndPosition{
    int x,y,z;
    String direction,lastDirection="";

    
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
        if ((direction.equals("N")) || (lastDirection.equals("N"))){
            direction = "W";
        } else if ((direction.equals("S"))|| (lastDirection.equals("S"))){
            direction = "E";
        } else if ((direction.equals("E"))|| (lastDirection.equals("E"))) {
            direction = "N";
        } else if ((direction.equals("W"))|| (lastDirection.equals("W"))){
            direction = "S";
        } 
    }

    public void right() {
        if ((direction.equals("N"))|| (lastDirection.equals("N"))) {
            direction = "E";
        } else if (direction.equals("S") || (lastDirection.equals("S"))) {
            direction = "W";
        } else if (direction.equals("E") || (lastDirection.equals("E"))) {
            direction = "S";
        } else if (direction.equals("W") || (lastDirection.equals("W"))) {
            direction = "N";
        }
    }

    public void turnUpSide() {
        if (direction.equals("N") || direction.equals("E")) {
            if(direction.equals("N")){
                lastDirection="N";
            }else{
                lastDirection="E";
            }
            direction = "Up";
        } else if (direction.equals("S") || direction.equals("W")) {
            if(direction.equals("S")){
                lastDirection="S";
            }else{
                lastDirection="W";
            }
            direction = "Down";
        }
    }

    public void turnDownSide() {
        if (direction.equals("N") || direction.equals("E") ) {
            if(direction.equals("N")){
                lastDirection="N";
            }else{
                lastDirection="E";
            }
            direction = "Down";
        } else if (direction.equals("S") || direction.equals("W") ) {
            if(direction.equals("S")){
                lastDirection="S";
            }else{
                lastDirection="W";
            }
            direction = "Up";
        }
    }
}

class Commands {
    
    int finalX,finalY,finalZ;
    String finalDirection;
    public void giveCommands(String[] commands){
        int[] startingPosition = {0, 0, 0};
        String startingDirection ="N";
        GetDirectionAndPosition gdp= new GetDirectionAndPosition(startingPosition[0], startingPosition[1],startingPosition[2], startingDirection);
        for (String command : commands) {
            switch (command) {
                case "f":
                    gdp.forward();
                    break;
                case "b":
                    gdp.backward();
                    break;
                case "l":
                    gdp.left();
                    break;
                case "r":
                    gdp.right();
                    break;
                case "u":
                    gdp.turnUpSide();
                    break;
                case "d":
                    gdp.turnDownSide();
                    break;
            }
        }

        finalX = gdp.x;
        finalY = gdp.y;
        finalZ = gdp.z;
        finalDirection = gdp.direction;

        System.out.println("Final Position: (" + finalX + ", " + finalY + ", " + finalZ + ")");
        System.out.println("Final Direction: " + finalDirection);

    }
}
public class Chandrayaan {

    public static void main(String[] args) {
        
        String[] commands = {"f", "r", "u", "b", "l"};
        
        Commands c= new Commands();
        c.giveCommands(commands);
    }
}