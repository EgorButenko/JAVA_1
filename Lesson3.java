/**
Java 1 Home Work 3
@author Egor Butenko
@version 22.09.2021
*/

import java.util.Scanner;
import java.util.Arrays;

public class Lesson3{
	
	public static Scanner sc = new Scanner(System.in);
	
	
		public static void main(String[] args){
			int[] arr01 = { 0, 1, 0, 1, 1, 1, 0, 0, 0, 1};
			int[] arr = { 1, 1, 1, 1 };
		    sumArrayLR(arr);
			array01(arr01);
		}
		// 1.Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
		static int[] array01(int[] arr){
			for(int i = 0; i < arr.length; i++){
				 arr[i] = (arr[i] == 0)? 1 : 0;
			}
			for(int i = 0; i < arr.length; i++){
				 System.out.print(arr[i] + " ");
			}
			return arr;
				//arr[i] == 0 ? arr[i] = 1 : arr[i] = 0;	
		}
		// 2.Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
		public static void array100(){
			int x = 1;
			int [] arr = new int[100];
			for(int i = 0; i < arr.length; i++){
				arr[i] = x;
				x++;
			}
		}
		//3.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
		public static void arraySearchMultiply(){
			int [] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
			for(int i = 0; i < arr.length; i++){
				if(arr[i] < 6){
					arr[i] *= 2;
				}
			}
		}
		/*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
		и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). 
		Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];*/
		public static void diagArray(){
			int[][] arr = new int[5][5];
			for(int i = 0; i < arr.length; i++){
				for(int j = 0; j < arr.length; j++){
					if(i == j || i + j == arr.length - 1){
						arr[i][j] = 1;
					}else{
						arr[i][j] = 0;
					}
				}
			}
		}
		//5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
		public static void input2Params(){
			System.out.println("Input len ");
			int len = sc.nextInt();
			System.out.println("Input initialValue ");
			int initialValue = sc.nextInt();
			int [] arr = new int[len];
			for(int i = 0; i < arr.length; i++){
				arr[i] = initialValue;
			}
		}
		//6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
		public static void arrayMaxMin(){
			int [] arr = { -100, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 7 };
			int arrMin = arr[0];
			int arrMax = arr[0];
			for(int i = 0; i < arr.length; i++){
				if(arrMin > arr[i]){
					arrMin = arr[i];
				}
				if(arrMax < arr[i]){
					arrMax = arr[i];
				}
			}
		}
		//7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
		public static void sumArrayLR(int[] arr){
			int sumL = 0;
			int sum = 0;
			for(int i = 0; i < arr.length; i++){
				sum +=arr[i];
			}
			for(int i = 0; i < arr.length; i++){
				sumL += arr[i];
				if(sumL == sum - sumL){
					System.out.println("TRUE");
				}
			}
		}
}
