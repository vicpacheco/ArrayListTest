import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArraySplit {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException 
		{
			final String FILENAME = "resources/groceries.txt";
			ArrayList<String> shoppingBag = new ArrayList<String>();
		
			BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
			String line = reader.readLine();
			
			//Just the prices
			while (line != null) 
			{
				int i = 0;
				i++;
				String[] space = line.split("\\s+");
				shoppingBag.add(space[i]);
				line = reader.readLine();
				
			}
			
			for(int i = 0; i < shoppingBag.size(); i++ )
			{
				System.out.println(shoppingBag.get(i));
			}

	}

}
