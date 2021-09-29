/**
	Java 1 Home Work 1
	@author Egor Butenko
	@version 20.09.21
*/
public class Lesson1 {
	public static void main(String[] args){
		printThreeWords();
		checkSumSign();
		printColor();
		compareNumbers();
	}
	public static void printThreeWords(){
		System.out.println("Orange");
		System.out.println("Banana");
		System.out.println("Apple");
	}
	public static void checkSumSign(){
		int a, b;
		a = 5;
		b = - 9;
		if (a + b >= 0){
			System.out.println("Сумма положительная");
		} else{
			System.out.println("Сумма отрицательная");
		}
	}
		public static void printColor(){
			int value = 99;
			if (value <= 0){
				System.out.println("Красный");
			}
			if (value > 0 && value <= 100){
				System.out.println("Желтый");
			}
			if (value > 100){
				System.out.println("Зеленый");
			}
		}
		public static void compareNumbers(){
			int a, b;
			a = 4;
			b = 3;
			if (a >= b){
				System.out.println("a >= b");
			} else{
				System.out.println("a < b");
			}
		}
	}
