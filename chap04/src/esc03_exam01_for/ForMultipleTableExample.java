package esc03_exam01_for;

public class ForMultipleTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		
		for(int i=0; i<=9; i++) {
		  for(int j=2; j<=9; j++) {
			  if( i == 0){ //i=j
				 System.out.print(j + "단\t" ); 
				 continue;
			 }
			  System.out.print(j+"*"+i+"="+(j*i)+"\t"  );  
			
		
		  }	
		System.out.println();
		
		}
	}

}
