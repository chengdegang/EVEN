
public class study_1_object {
		   int puppyAge;
		   public study_1_object(String name){
		      // 这个构造器仅有一个参数：name
		      System.out.println("小狗的名字是 : " + name ); 
		   }
		 
		   public void setAge( int age ){
		       puppyAge = age;
		   }
		 
		   public int getAge( ){
		       System.out.println("小狗的年龄为 : " + puppyAge ); 
		       return puppyAge;
		   }
		 
		   public static void main(String []args){
		      /* 创建对象 */
		      study_1_object myPuppy = new study_1_object( "tommy" );
		      study_1_object myPuppy2=new study_1_object("123");
		      /* 通过方法来设定age */
		      myPuppy.setAge( 2 );
		      /* 调用另一个方法获取age */
		      myPuppy.getAge( );
		      /*你也可以像下面这样访问成员变量 */
		      System.out.println("变量值 : " + myPuppy.puppyAge ); 
		   }
		}

