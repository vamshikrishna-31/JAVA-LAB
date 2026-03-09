class Lab3p2 extends Lab3p1 {
    static int neu=5;
		public static void display(){
        System.out.println(view+neu);
        }
	@Override
	public int show(){
	super.show();
	return (view+neu);
	}
	public void pearl(){
    Lab3p1.display();
	System.out.println("Iam B child of A");
	}
}
