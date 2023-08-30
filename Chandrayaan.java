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

}
public class Chandrayaan {

    public static void main(String[] args) {

        int[] startingPosition = {0, 0, 0};
        String startingDirection ="N";
        
        GetDirectionAndPosition gdp= new GetDirectionAndPosition(startingPosition[0], startingPosition[1],startingPosition[2], startingDirection);
    }
}