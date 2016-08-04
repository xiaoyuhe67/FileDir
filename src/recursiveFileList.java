
import java.io.*;

public class recursiveFileList {
	
	public static void main(String[] args)
	{
		walkin(new File("/home/oracle/workspace/HDZJobs2"));
		
		System.out.println("<End of Listing>");
	}
	
	public static void walkin(File dir)
	{
		File[] listFile=dir.listFiles();
		
		if(listFile!=null)
		{
			for(int i=0;i<listFile.length;i++)
			{
				if(listFile[i].isDirectory())
				{
					System.out.println("Directory: "+listFile[i].getPath());
					walkin(listFile[i]);
				}
				else
				{
					System.out.println("           "+listFile[i].getPath());
				}
			}
		}
	}

}
