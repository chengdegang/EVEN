package cdg;

public class SuanShu {
  int a;
  int b;
  SuanShu (int a,int b){
    this.a=a;
    this.b=b;
  };
  void jia() {
	  System.out.println("result:"+(a+b));
  }
  void jian() {
	  System.out.println("result:"+(a-b));
  }
  void cheng() {
	  System.out.println("result:"+(a*b));
  }
  void chu() {
	  System.out.println("result:"+a+"/"+b);
  }
  
  void yf() {
	  
  }
  
  int gy() {
		int r;
		while (b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
