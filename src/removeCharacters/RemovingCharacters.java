package removeCharacters;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

public class RemovingCharacters 
{
	
	public static String removeCharacter(String string, String remove)
	{
		HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
		Character c;
		int dst = 0, src;
		char[] s = string.toCharArray();
		
		for(int i = 0; i < remove.length(); i++)
		{
			c = remove.charAt(i);
			map.put(c, true);
		}
		
		for(src = 0; src < string.length(); src++)
		{
			if(!map.containsKey(s[src]))
			{
				s[dst++] = s[src];
			}
		}
		return new String(s,0,dst);
	}
	
	public static void main(String[] args) throws IOException 
	{
		String string, remove, output;
		BufferedReader inp = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("The input string is : ");
		string = inp.readLine();
		System.out.println("The characters to tbe removed : ");
		remove = inp.readLine();
		output = removeCharacter(string, remove);
		System.out.println("The string after removing charaters is : " + output);
	}

}
