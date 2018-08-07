package NumberGenerationUsingStreams;
//program to write data into an external file
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile
{
 private String path;
 private boolean append_to_file = false;// to overwrite each time rather than add to the contents of the file
 
 
public WriteFile(String path, boolean append_to_file) {
	super();
	this.path = path;
	this.append_to_file = append_to_file;
}

public void writeToFile(String textLine) throws IOException
{
	FileWriter write = new FileWriter(path, append_to_file); //in-built to write into a file
	PrintWriter print_line = new PrintWriter(write);
	
	print_line.printf("%s" + "%n", textLine);
	print_line.close();
}
 
 
}

