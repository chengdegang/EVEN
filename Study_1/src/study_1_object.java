
public class study_1_object {
		   int puppyAge;
		   public study_1_object(String name){
		      // �������������һ��������name
		      System.out.println("С���������� : " + name ); 
		   }
		 
		   public void setAge( int age ){
		       puppyAge = age;
		   }
		 
		   public int getAge( ){
		       System.out.println("С��������Ϊ : " + puppyAge ); 
		       return puppyAge;
		   }
		 
		   public static void main(String []args){
		      /* �������� */
		      study_1_object myPuppy = new study_1_object( "tommy" );
		      study_1_object myPuppy2=new study_1_object("123");
		      /* ͨ���������趨age */
		      myPuppy.setAge( 2 );
		      /* ������һ��������ȡage */
		      myPuppy.getAge( );
		      /*��Ҳ�����������������ʳ�Ա���� */
		      System.out.println("����ֵ : " + myPuppy.puppyAge ); 
		   }
		}

