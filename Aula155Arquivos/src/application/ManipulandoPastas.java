package application;

import java.util.Scanner;
import java.io.File;


public class ManipulandoPastas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for(File folder : folders){
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean sucess = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created sucessfully " +sucess);
		sc.close();
	}

}




