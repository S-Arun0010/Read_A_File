package file;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class Files {

	public static void main(String[] args)throws IOException 
	{
	  PrintStream print = new PrintStream(new FileOutputStream(FileDescriptor.out));
      File filenew = new File("C:\\Users\\Arun Prabhu S\\Desktop\\story.txt");
      HashMap<String,Integer> hs = new HashMap<>();
      LinkedHashMap<String, Integer> sortedmap = new LinkedHashMap<>();
      ArrayList<Integer> list = new ArrayList<>();
      Scanner scan = new Scanner(filenew);
      String w;
      while(scan.hasNext())
      {
    	  w = scan.next();
    	  if(hs.containsKey(w))
    	  {
    		  int count = hs.get(w) + 1;
    		  hs.put(w,count);
    	  }
    	  else
    	  {
    		  hs.put(w, 1);
    	  }
      }
      scan.close();
      for (Entry<String, Integer> entry : hs.entrySet()) {
          list.add(entry.getValue());
      }
      Collections.sort(list);
      for (int num : list) {
          for (Entry<String, Integer> entry : hs.entrySet()) {
              if (entry.getValue().equals(num)) {
                  sortedmap.put(entry.getKey(), num);
              }
          }
      }
      for(HashMap.Entry<String,Integer> entry : sortedmap.entrySet() ){
    	   print.println( entry.getKey() + " = " + entry.getValue() );
    	}
	}

}
