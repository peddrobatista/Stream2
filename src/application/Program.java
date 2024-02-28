package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o caminho do arquivo: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Product> list = new ArrayList<>();
			
			String line = br.readLine();
			
			while (line != null) {
				
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
				
			}
			
			
			
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
}
