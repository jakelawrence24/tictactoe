// Author: Jake Lawrence
// November 3, 2016

import java.util.*;
public class TicTacToe {
	public static void main(String args[]){
	    char data[] = {'-','-','-','-','-','-','-','-','-'};
	    
	    fillData(data);
	    printTTT('#', data);
	    if(won(data)){
	    	System.out.println("#" + whoWon(data) + "WinsIn" + getMoves(data) + " #java");
	    }else{
	    	System.out.println("#ItsADraw" + " #java");
	    }
	}

	static void fillData(char data[]){
		Random rand = new Random();
		
		int x = rand.nextInt(4) + 2;
	    while(!(isFull(data))){
	    	int  n = rand.nextInt(9);
	    	if(data[n] == '-'){
	    		if(x % 2 == 0){
	    			data[n] = 'X';
	    			x++;
	    		}else{
	    			data[n] = 'O';
	    			x++;
	    		}
	    			
	    	}		
	    }
	}

	static void printTTT(char c, char data[]){
	    for(int i = 0; i < 9; i++){
	        if(i == 3 || i == 6){
	            printLine(c);
	        }
	        if(i == 0 || i == 3 || i == 6){
	        	System.out.print(" ");
	        	System.out.print(data[i]);
	        	System.out.print(" ");
        	}
        	
        	if(i == 1 || i == 4 || i == 7){
        		System.out.print(" ");
        		System.out.print(data[i]);
        		System.out.print(" ");
        	}
        	
        	if(i == 2 || i == 5 || i == 8){
        		System.out.print(" ");
        		System.out.print(data[i]);
        		System.out.print(" ");
        	}
	        
	        
	        if(i != 2 && i != 5 && i != 8){
	        	System.out.print(c);
	        }


	    }
	    System.out.println();
	}

	static void printLine(char c){
	    System.out.println();
	    for(int i = 0; i < 9; i++){
	    	System.out.print(c);
	    }
	    System.out.println();
	        
	}

	static boolean won(char data[]){
	    if(data[0] == data[1] && data[1]==data[2] && data[1] != '-')
	    	return true;
	    else if(data[3] == data[4] && data[4]==data[5] && data[3] != '-')
	    	return true;
	    else if(data[6] == data[7] && data[7]==data[8] && data[6] != '-')
	    	return true;
	    else if(data[0] == data[3] && data[3]==data[6] && data[0] != '-')
	    	return true;
	    else if(data[1] == data[4] && data[4]==data[7] && data[1] != '-')
	    	return true;
	    else if(data[2] == data[5] && data[5]==data[8] && data[2] != '-')
	    	return true;
	    else if(data[0] == data[4] && data[4]==data[8] && data[0] != '-')
	    	return true;
	    else if(data[2] == data[4] && data[4]==data[6] && data[2] != '-')
	    	return true;
	    else
	    	return false;
	}
	
	static boolean isFull(char data[]){
		if(won(data))
			return true;
		for(int i = 0; i < 9; i++){
			if(data[i] == '-')
				return false;
		}
		return true;
	}
	
	static char whoWon(char data[]){
		if(data[0] == data[1] && data[1]==data[2] && data[1] != '-')
	    	return data[0];
	    else if(data[3] == data[4] && data[4]==data[5] && data[3] != '-')
	    	return data[3];
	    else if(data[6] == data[7] && data[7]==data[8] && data[6] != '-')
	    	return data[6];
	    else if(data[0] == data[3] && data[3]==data[6] && data[0] != '-')
	    	return data[0];
	    else if(data[1] == data[4] && data[4]==data[7] && data[1] != '-')
	    	return data[1];
	    else if(data[2] == data[5] && data[5]==data[8] && data[2] != '-')
	    	return data[2];
	    else if(data[0] == data[4] && data[4]==data[8] && data[0] != '-')
	    	return data[0];
	    else
	    	return data[2];
	}
	
	static int getMoves(char data[]){
		int moves = 9;
		for(int i = 0; i < 9; i++){
			if(data[i] == '-')
				moves--;
		}
		return moves;
	}
}

