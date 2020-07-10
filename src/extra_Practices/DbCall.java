package extra_Practices;

public class DbCall {

	public static void main(String[] args) {
		
		

		Db db = new Db();
		db.insertData("aaa", 123);
		
		System.out.println(db.getData());
		System.out.println(db.getYint());
		
		db.setData("bbb");
		db.setYint(200);
		System.out.println(db.getData());
		System.out.println(db.getYint());

	}

}
