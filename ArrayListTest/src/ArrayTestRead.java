
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;

public class ArrayTestRead {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException 
	{
		final String FILENAME = "resources/groceries.txt";
		ArrayList<String> shoppingBag = new ArrayList<String>();
	
		BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
		String line = reader.readLine();
		
		while (line != null) 
		{
			shoppingBag.add(line);
			line = reader.readLine();			
		}
		
		for(int i = 0; i < shoppingBag.size(); i++ )
		{
			System.out.println(shoppingBag.get(i));
		}
	}
}

