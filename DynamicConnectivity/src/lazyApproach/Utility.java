package lazyApproach;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Utility {
	public static void tester(IUnion UC, String fileName){
		try(BufferedReader br = new BufferedReader(new FileReader(fileName));
				Scanner scanner = new Scanner(System.in)) {
			String line;
			int index = 0;
			while((line = br.readLine()) != null){
				if(index == 0){
					UC.initialize(Integer.parseInt(line));
					index ++;
					continue;
				}
				String[] strs = line.split("-");
				int p = Integer.parseInt(strs[0]);
				int q = Integer.parseInt(strs[1]);
				UC.union(p, q);
			}
			while(true){
				System.out.println("Enter your nodes for examine or make a new connection:");
				String nodeLine = scanner.nextLine();
				String[] strs = nodeLine.split("-");
				int p = Integer.parseInt(strs[0]);
				int q = Integer.parseInt(strs[1]);

				if( UC.connected(p, q)){
					System.out.println(p+" and "+ q +" are connected now");
				}else{
					UC.union(p, q);
					System.out.println("connection "+p+" and "+ q +" was added successfully");
				}
			}
		} catch (Exception e) {
			System.out.println("Demo-->mian method"+e.getMessage());
		}
	}

}
