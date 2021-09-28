/**
Java 1 Home Work 4
@author Egor Butenko
@version 23.09.2021
*/

import java.util.Random;
import java.util.Scanner;

class TicTacToe{
	
	final char SIGN_X = 'x'; // human
	final char SIGN_O = 'o'; // AI
	final char SIGN_EMPY = '.';
	
	Random random;
	Scanner scanner;
	char[][] table;
	
	public static void main(String[] args){
		new HomeWorkApp().game();
	}
	
	HomeWorkApp(){
		random = new Random();
		scanner = new Scanner(System.in);
		table = new char[3][3];
		System.out.println("Game init.");
	}
	
	void game(){
		// инициализация таблицы
		initTable();
		while (true){
			// ход человека
			//проверка: победа или ничья?
			//ход компьютера
			//проверка: победа или ничья?
			printTable();
			turnHuman();
			if(checkWin(SIGN_X)){
				System.out.println("YOU WIN!");
				break;
			}
			if(isTableFull()){
				System.out.println("Draw");
				break;
			}
			turnAI();
			if(checkWin(SIGN_O)){
				System.out.println("AI WIN!");
				break;
			}
			if(isTableFull()){
				System.out.println("DRAW");
				break;
			}
		}
		printTable();
	}
	
	//допметоды
	 
	void initTable() {
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				table[i][j] = SIGN_EMPY;
			}
		}
	}
	void printTable() {
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	boolean isTableFull() {
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(table[i][j] == SIGN_EMPY){
					return false;
				}
			}
		}
		return true;
	}
	
	void turnHuman(){
		int x, y;
		do{
			System.out.print("Enter X Y (1..3): ");
			x = scanner.nextInt() - 1;
			y = scanner.nextInt() - 1;
		}while(!isCellValid(x,y));
		table[y][x] = SIGN_X;
	}
	
	boolean isCellValid(int x,int y){
		if(x < 0 || y < 0 || x >= 3 || y >= 3){
			return false;
		}
		return table[y][x] == SIGN_EMPY;
	}
	
	void turnAI(){
		int x, y;
		do{
			x = random.nextInt(3);
			y = random.nextInt(3);
		}while(!isCellValid(x, y));
		table[y][x] = SIGN_O;
	}
	
	boolean checkWin(char ch){
		if (table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) return true;
		if (table[0][2] == ch && table[1][1] == ch && table[2][0] == ch) return true;
		for(int i = 0; i < 3; i++){
			if(table[0][i] == ch && table[1][i] == ch && table[2][i] == ch ||
			   table[i][0] == ch && table[i][1] == ch && table[i][2] == ch){
				return true;
			}
		}
		return false;
	}
	
	
}
