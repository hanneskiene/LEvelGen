import java.util.ArrayList;
import java.util.List;

public class Head {
	List<Integer> path = new ArrayList<>();
	Map map;
	int x,y;
	public Head(Map m){
		this.map=m;
		RandStart();
	}
	private void RandStart(){
		x=(int)(Math.random()*(map.getMap().length-2)+1);
		y=(int)(Math.random()*(map.getMap().length-2)+1);
		map.setAtPos(x, y, 3);
		
	}
	
	public void setVisited(int posx, int posy){
		map.setAtPos(posx, posy, 2);
	}
	public void move(){
		
		
		if (env(x,y)) {
			
		
		int newX,newY;
		boolean dirFound=false;
		do {
		int dir=randomDirection();
		switch (dir) {
		case 0:
			newX=x-1;
			newY=y;
			break;
		case 1:
			newX=x;
			newY=y+1;
			break;
		case 2:
			newX=x+1;
			newY=y;
			break;
		case 3:
			newX=x;
			newY=y-1;
			break;
		default:
			newX=x;
			newY=y-1;
			break;
		}
		dirFound=checkField(newX,newY);
		path.add(dir);
		
		} while (!dirFound);
		x = newX;
		y = newY;
		setVisited(x, y);
		}
		else{
			map.setAtPos(x, y, 4);
		}
	}
	private boolean checkField(int newX, int newY){
		int val = map.getAtPos(newX, newY);
		if( val == 1)
			return true;
		else
			return false;
	}
	boolean env(int px,int py){
		if(map.getAtPos(x-1,y)==1||map.getAtPos(x,y+1)==1||map.getAtPos(x+1,y)==1||map.getAtPos(x,y-1)==1){
			return true;
		}
		return false;
	}
	int randomDirection()
	{
		return (int)(Math.random()*4);
	}
}
