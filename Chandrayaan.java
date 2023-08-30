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

}
public class Chandrayaan {

    public static void main(String[] args) {

        int[] startingPosition = {0, 0, 0};
        String startingDirection ="N";
        
        GetDirectionAndPosition gdp= new GetDirectionAndPosition(startingPosition[0], startingPosition[1],startingPosition[2], startingDirection);
    }
}