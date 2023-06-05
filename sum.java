class Sum {
	int a,b;
	Sum(int a, int b){
		this.a=a;
		this.b=b;
	}
	void add(){
		System.out.println(a+b);
	}

	public static void main(String args[]){
	Sum s= new Sum(10,20);
	s.add();// 2nd commit
}
}

