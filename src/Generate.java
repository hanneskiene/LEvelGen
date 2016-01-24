
public class Generate {
	
	Map map;
	Head head;
	public Generate (Map map){
		this.map = map;
		head=new Head(map);
		
		for (int i = 0; i < 5000; i++){
			head.move();
		}
	}

}
