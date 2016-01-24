
public class Generate {
	
	Map map;
	Head head;
	public Generate (Map map, int seedCount){
		this.map = map;
		head=new Head(map);
		for(int i = 0; i < seedCount; i++){
			 int rx = (int) (Math.random()*(map.getMap().length - 2)) + 1;
			 int ry = (int) (Math.random()*(map.getMap()[0].length  - 2)) + 1;
			 map.setAtPos(rx, ry, 6);
		 }
		for (int i = 0; i < 5000; i++){
			head.move();
		}
	}

}
