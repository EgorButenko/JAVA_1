class Cat{
    private int appetite;
    private boolean hunger = false;
    
    Cat(int appetite, boolean hunger){
        this.appetite = appetite;
        this.hunger = hunger;
        
    }
    
    int getAppetite(){
        return appetite;
    }
    
    boolean getHunger(){
        return hunger;
    }
    void setHunger(boolean status){
        hunger = status;
    }
    
    void eat(Plate plate){
        plate.decreaseFood(appetite);
    }
    
    @Override 
    public String toString(){
        return hunger == true ? "TRUE" : "FALSE";
    }
}
