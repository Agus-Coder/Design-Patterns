class Singleton {
	static private Singleton instance;
	
	private Singleton(){

	}

	public static Singleton getInstance(){
		if (instance == null){
			instance = new Singleton();
		}
		return instance;
	}

	public static void main(String[] arguments){
		Singleton example = Singleton.getInstance();
		Singleton example2 = Singleton.getInstance();
	}
}
