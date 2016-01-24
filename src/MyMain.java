import java.util.ArrayList;

public class MyMain {

	Generate generator;
	Export export;
	int x = 20;
	int y = 20;
	//ArrayList<Map> maps = new ArrayList<>();
	Map map;

	public static void main(String[] args) {

		new MyMain();

	}

	public MyMain() {

		export = new Export();

		int counts = 0;
		int i = 0;

		for (int z = 10; z < 21; z = z + 2) {
			x = z;
			y = z;
			do {

				//maps.add(new Map(x, y));
				map=new Map(x,y);
				generator = new Generate(map,1);

				if (oneCount(map)) {

					//maps.get(i).draw();
					export.printMap(map);

					counts++;

				}

				

			} while (counts < 10);
			counts = 0;
			
			
			System.out.println("Gefunden " + z);
		}

		export.out.close();

	}

	boolean oneCount(Map map) {
		int count = 0;
		for (int[] a : map.getMap()) {
			for (int x : a) {
				if (x == 1) {
					count++;
				}
			}
		}
		// System.out.println((count/((x-2)*(y-2)) ));
		// 0.3 -0.2
		if (((double) count / (((double) x - 2) * ((double) y - 2))) < 0.4
				&& ((double) count / (((double) x - 2) * ((double) y - 2))) > 0.2) {
			return true;
		} else {
			return false;
		}
	}

}
