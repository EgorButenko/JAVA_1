class Plate{
    int food;
    
    Plate(int food){
        this.food = food;
    }
    
    int getFood(){
        return food;
    }
    
    void setFood(int food){
        this.food = food;
    }
    
    int decreaseFood(int food) {
        return this.food - food >= 0 ? this.food -= food : this.food;
    }
    
    public void addFood(int food){
        this.food += food;
    }
    
    @Override
    public String toString() {
        return "Plate: " + food;
    }
}
