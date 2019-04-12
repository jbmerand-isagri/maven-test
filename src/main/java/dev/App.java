package dev;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	    System.out.println( "Hey! Premier projet Maven :)" );
	    String asciiArt = FigletFont.convertOneLine("Jean-Baptiste");
	    System.out.println(asciiArt);
    }
}
