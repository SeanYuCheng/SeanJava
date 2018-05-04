package wycthestudyofjava;

import java.util.Scanner;

import javax.sound.sampled.AudioFileFormat.Type;

import java.util.InputMismatchException;

public class ArgumentStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{   
			Scanner s = new Scanner (System.in);
			int x = s.nextInt();
		}catch(InputMismatchException e){
		System.out.println("invalid Input");	
		}
		
		

	}

}
