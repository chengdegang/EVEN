package program_base;

import java.util.Scanner;

/*
 * 需求:实现ATM（初始化一个用户，提供取钱修改密码展示账户详情功能）
 */
public class ATM {
		private double balance;//余额
	    private double money;//取钱
	    private int cardsNum;//卡号
	    private int passWord;//密码
	    private String name;//客户姓名
	    private int inputNum;//输入账户
	    private int inputWord;//输入密码
		
		public double getBalance() {	
			return balance ;
		}
		public void setBalance(double balance){
			this.balance = balance;
		}
		public double getMoney() {
	        return money;
	    }
	    public void setMoney(double money) {
	        this.money = money;
	    }
	    public int getCardsNum() {
	        return cardsNum;
	    }
	    public void setCardsNum(int cardsNum) {
	        this.cardsNum = cardsNum;
	    }
	    public int getPassWord() {
	        return passWord;
	    }
	    public void setPassWord(int passWord) {
	        this.passWord = passWord;
	    }
	    public int getInputNum() {
	        return inputNum;
	    }
	    public void setInputNum(int inputNum) {
	        this.inputNum = inputNum;
	    }
	    public int getInputWord() {
	        return inputWord;
	    }
	    public void setInputWord(int inputWord) {
	        this.inputWord = inputWord;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public static void main(String[] args) {
	    	ATM atm = new ATM();
	        atm.setBalance(100);
	        atm.setCardsNum(666666);
	        atm.setPassWord(111);
	        atm.setName("cdg");
	        Input input = new Input();
	        input.output_first();
	        boolean result = input.check(atm.getCardsNum(), atm.getPassWord());
	        Opration operation = new Opration();
	        if (result) {
	            operation.choose(atm);}
	    }
}
	
	class Input{
		public void output_first() {
			System.out.println("Welcome! Please input ur information");
			System.out.println("------------------");
		}
		
		public void output(){
			System.out.println("Welcome to use ATM");
			System.out.println("------------------");
			System.out.println("1.Draw\n2.QueryInformation\n3.PasswordReset\n4.Sign out");
			System.out.println("------------------");
		}
		
		public boolean check(int cardsNum, int PassWord) {
			Scanner input = new Scanner(System.in);
			for (int i = 0; i < 3; i++) {
				System.out.println("please input card and passwd:" + "["+(3 - i) +"]"+ "chance u have");
				int checkcard = input.nextInt();
				int checkpass = input.nextInt();
				if (checkcard==cardsNum && checkpass==PassWord) {
					return true;
				} else if (i == 2) {
					System.out.println("third wrong in input,out!");
					input.close();
				} else {
					System.out.println("wrong,please input again");
				}
			}
			return false;
		}
	}
	
	class Opration{
		Input input = new Input();
		public Scanner in;
		
		public void choose(ATM atm){
			input.output();
			System.out.println("Please choose:1-4");
			Scanner sc1 = new Scanner(System.in); 
	        int num = sc1.nextInt();
	        
	        switch(num){
	        case 1:
	        	getMoney(atm);
	        	break;
	        case 2:
	        	query(atm);
	            break;
	        case 3:
	            setPasswrod(atm);
	            break;
	        case 4:
	            exit();
	            break;
	        default:
	            error();
	            break;
	        }
		}
		
		public boolean getMoney(ATM atm){
	        System.out.println("Please input the number u want：");
	        for(int i= 1;i<=3;i++){
	            Scanner sc = new Scanner(System.in);
	            atm.setMoney(sc.nextInt()); 
	            if(atm.getMoney() > atm.getBalance()){
	                System.out.println("Outnumber,please reenter the amount you want to collect："+ "["+(3 - i) +"]"+ "chance u have");
	            }else{
	                atm.setBalance(atm.getBalance()-atm.getMoney());
	                System.out.println("Success,take ur money");
	                System.out.println("Ur balance have "+atm.getBalance()+"(RMB) now");
	                return true;
	            }
	        }
	        return false;
	    }
		
//		public int getMoney(ATM atm) {
//		System.out.println("please choice price");
//		System.out.println("1.100RMB 2.500RMB 3.1000rmb 4.5000RMB 5.other");
//		int choice = in.nextInt();
//		switch (choice) {
//		case 1:
//			return 100;
//		case 2:
//			return 500;
//		case 3:
//			return 1000;
//		case 4:
//			return 5000;
//		case 5:
//			System.out.println(
//					"It must be multiple of 100 RMB,minimum 100 RMB, maximum no more than 10000 RMB.");
//			System.out.println("please input price what u want");
//			int choiceother = in.nextInt();
//			if(choiceother%100==0&&choiceother>0&&choiceother<atm.getBalance()) {
//				return choiceother;
//			}else {
//				System.out.println("wrong,try again input 5");
//				choiceother = in.nextInt();
//			}
//		}
//		return 0;
//	}

		public void query(ATM atm){
			System.out.println("Cardsnum："+atm.getCardsNum());
			System.out.println("Name："+atm.getName());
			System.out.println("Balance："+atm.getBalance());
		}
		
        public void setPasswrod(ATM atm){
        	System.out.println("Reset ur password：");
            Scanner sc1 = new Scanner(System.in); 
            int num = sc1.nextInt();
            atm.setPassWord(num);
            System.out.println("Ur password is："+"\n"+atm.getPassWord());
            sc1.close();
		}
        
        public void exit(){
        	System.out.println("Thanks,bye");
        	System.exit(0);
        }
        
        public void error(){
        	System.out.println("Something wrong!");
        }
	}
		





