package java8;

public class Main {

	public static void main(String[] args) {
		
		//1.勇者を生成 
		
		Hero h = new Hero();  //インスタンスの生成  
		//Hero h2 = new Hero(); 
              //クラス名　変数名　= new クラス名()
		      //Heroの()は9章で意味が出てくる
		      //インスタンス化はnew をつかう
		
		//２．フィールドに初期値をセット
		
		h.name = "ミナト";
		h.hp = 100;
		//h2.name = "おっさん";
		//h2.hp = 150;
		
		System.out.println("勇者" + h.name + "を生み出しました！");
		
		//勇者のメソッドを呼び出し
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
				
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
				
		
		h.slip();
		m1.run();
		m2.run();
		h.run();
	
	}

}
