
public class Map {
	
private int[][] map;
	
 public Map(int dimensionX, int dimensionY){
	
	map=new int[dimensionX][dimensionY];
	
	initialize();
	
	generateOutline(); 
 }
 
 private void initialize(){
	 for(int i = 0; i < map.length; i++){
		 for(int z = 0; z < map[0].length; z++){
			 map[i][z] = 1;
		 }
	 }
	 
	 
 }
 
 public void generateOutline(){
	 for(int i = 0; i < map.length; i++){
		 for(int z = 0; z < map[0].length; z++){
			 if(i==0){
				 map[i][z]=0;
			 }else if(i==map.length-1){
				 map[i][z]=0;
			 }
			 else if(z==0){
				 map[i][z]=0;
			 }
			 else if(z==map[0].length-1){
				 map[i][z]=0;
			 }
		 }
	 } 
 }
 public int[][] getMap(){
	 return map;
 }
 
 public int getAtPos(int x, int y){
	 
	 if(x > map.length - 1 || x<0){
		 return -1;
	 }
	 if (y > map[0].length - 1|| y<0 ){
		 return -1;
	 }
	 
	 return map[x][y];
 }
 public boolean setAtPos(int x, int y, int value){
	 
	 if(x > map.length-1 || x<1||y > map[0].length-1 || y<1){
		 return false;
	 }
	 else{
		 map[x][y]=value;
	 }
	 
	return true;
 }
 
 
 
 public void draw(){
	 for(int[] a: map){
		 for (int x: a){
			 System.out.print(Integer.toString(x) + " "); 
		 }
		 System.out.println();
	 }
	 
 }
 
}
