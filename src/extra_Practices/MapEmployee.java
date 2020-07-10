package extra_Practices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MapEmployee {

	public static void main(String[] args) throws IOException {
		
		List<String> EmpList = Files.readAllLines(Paths.get("src/extra_Practices/Employee.txt"));
		
		System.out.println(EmpList.get(1).trim());
		System.out.println(EmpList.size());
		System.out.println(EmpList.get(2).length());
		String arr="Here,is,what,you,want";
		String[] arr1=arr.split(",");
		System.out.println(arr1.length);
		System.out.println(arr1[2].length());
		
		Map<Integer,String> IdAndName= new HashMap<>();
		
		for(String eachLine:EmpList) {
			
			int id =Integer.parseInt(eachLine.split(",")[0].trim());
			String name=eachLine.split(",")[1];
			IdAndName.put(id, name);
		}
		System.out.println(IdAndName);

	}

}
