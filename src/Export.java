import java.io.IOException;
import java.io.PrintWriter;

public class Export {
	
	PrintWriter out;
	
	int levelNum = 28;
	
	public Export(){
		try{
		out = new PrintWriter("Level.txt");
		out.println("Lalalala");
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	public void printMap(Map map){
		StringBuilder outLine = new StringBuilder();
		outLine.append("map=[");
		for(int[] a: map.getMap()){
			outLine.append("[");
			 for (int x: a){
				 if(x==2)
					 outLine.append(Integer.toString(1)+",");
				 else if(x==1)
					 outLine.append(Integer.toString(0)+",");
				 else
					 outLine.append(Integer.toString(x)+","); 
			 }
			 outLine.deleteCharAt(outLine.length()-1);
			 outLine.append("],");
		 }
		outLine.deleteCharAt(outLine.length()-1);
		outLine.append("];");
		//System.out.println(outLine.toString());
		
		out.println("case " + Integer.toString(levelNum) + ":");
		out.println(outLine.toString());
		out.println("dimensionx=" + Integer.toString(map.getMap().length));
		out.println("dimensiony=" + Integer.toString(map.getMap()[0].length));
		out.println("break;");
		
		levelNum++;
	}
}
