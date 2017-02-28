package mvc.models;

public class Model {
    
    private int x;
    
    public Model(){
        x = 0;
    }
    
    public Model(int x){
        this.x = x;
    }
    
    public void incX(){		//A simple count function, takes an int (which starts at 0) and adds 1 to it each time you push the button
        x++;
    }
    
    public int getX(){
        return x;
    }
}