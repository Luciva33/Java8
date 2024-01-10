package java8;

public class Hero {	  //クラス名は大文字
	
	String name;      //フィールド宣言
	int hp;
	
	public void sleep() { 
		
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
		//printf("%dは、眠って回復した！\n",this.name);
		//println(this.name + "は、眠って回復した！");
	}
	
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は" + sec + " 秒すわった！");
		System.out.println("HPが" + sec + " ポイント回復した！");
		
	}
	
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ！");
	}
	
	public void run() {
		
		System.out.println(this.name + "は逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした！");
		
	}
}

