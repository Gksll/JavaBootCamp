
public class Main {

	public static void main(String[] args) {
		DictionaryManager manager = new DictionaryManager();
		Dictionary d1= new Dictionary();
		Dictionary d2= new Dictionary();
		Dictionary d3= new Dictionary();
		Dictionary d4= new Dictionary();
		d1.key=1;
		d1.value="Goksel";
		d2.key=2;
		d2.value="Beyza";
		d4.key=4;
		d4.value="Gorkem";
		manager.add(d1);
		manager.add(d2);
		manager.add(d4);
		
		for (Dictionary item : manager.getAll()) {
			System.out.println(item.value);
		}
	}

}
