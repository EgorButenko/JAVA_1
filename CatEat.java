/**
Java 1 Home Work 7
@author Egor Butenko
@version 03.10.2021
*/
class CatEat{
    public static void main(String[] args){
        Cat [] cat = new Cat[5];
        cat[0] = new Cat(5, false);
        cat[1] = new Cat(1, false);
        cat[2] = new Cat(2, false);
        cat[3] = new Cat(3, false);
        cat[4] = new Cat(1, false);
        
        Plate  plate = new Plate(10);
        
        System.out.println(plate);
        eatCat(cat, plate);
        System.out.println(plate);
        outCatHunger(cat);
        plate.addFood(15);
        System.out.println(plate);
        eatCat2(cat, plate);
        System.out.println(plate);
        outCatHunger(cat);
    }
    
    static void eatCat(Cat [] cat, Plate plate){
        for(int i = 0; i < cat.length; i++){
            if(cat[i].getHunger() == false && plate.getFood() >= cat[i].getAppetite()){
                cat[i].eat(plate);
                cat[i].setHunger(true);
            }else{
                cat[i].setHunger(false);
            }
        }
    }
    
    static void eatCat2(Cat [] cat, Plate plate){
        for(int i = 0; i < cat.length; i++){
            cat[i].setHunger(false);
            if(cat[i].getHunger() == false && plate.getFood() >= cat[i].getAppetite()){
                cat[i].eat(plate);
                cat[i].setHunger(true);
            }else{
                cat[i].setHunger(false);
            }
        }
    }
    
    static void outCatHunger(Cat [] cat){
        for(int i = 0; i < cat.length; i++){
            System.out.println("cat " + (i + 1) + " is full - " + cat[i]);
        }
    }
} 
