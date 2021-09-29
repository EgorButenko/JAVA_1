/**
	Java 1 Home Work 2
	@author Egor Butenko
	@version 20.09.21
*/
public class Lesson2 {
		public static void main(String[] args){
			
			System.out.println(summNumber(5, 4));
			System.out.println(summNumber(5, 5));
			System.out.println(summNumber(9, 11));
			System.out.println(summNumber(5, 16));
			
			posOrNegNum(-1);
			posOrNegNum(0);
			posOrNegNum(1);
			
			System.out.println(negNumber(-1));
			System.out.println(negNumber(0));
			System.out.println(negNumber(1));
			
			printString("TEXT", 5);
			
			System.out.println(leapYear(24));
			System.out.println(leapYear(100));
			System.out.println(leapYear(800));
			
		}
		
		// №1. Принимает на вход два целых числа и проверяет, что их сумма лежит в пределах 10 >= x <=20
		static boolean summNumber(int a, int b){
			return a + b >= 10 && a + b <= 20;
		}
		
		// №2. Метод проверяет отрицательное или положительное число ему передали
		static void posOrNegNum (int a){
			System.out.println(a >= 0? a + " - positive" : a + " - negative");	
		}
		
		// №3. Метод возвращает true, если число отрицательное.
		static boolean negNumber(int a){
			return a < 0; 
		}
		
		// №4. Метод печатает в консоль строку, указанное число раз.
		static void printString(String txtToPrint, int a){
			for(int j = 0; j < a; j++){
				System.out.println(txtToPrint);
			}
		}
		// №4. Метод определяет високосный год
		static boolean leapYear(int x){
			if(x % 100 == 0){
				if(x % 400 == 0){
					return true;
				}else{
					return false;
				}
			} else if(x % 4 == 0){
				return true;
			} else{
				return false;
			}
		}
		}
