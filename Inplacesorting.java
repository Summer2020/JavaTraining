
public class Inplacesorting{
 public static void main(String[] args){
	 int[] myarray= {'4', '2', '6', '1'};
	 int x= 0;
	 int count= 0;
	 
	 for(int i= 0; i< myarray.length; i++ ) {
		 for(int j= 0; j< myarray.length; j++ ) {
			 if(myarray[i]> myarray[count+1+j]) {
				 x= myarray[i];
				 myarray[i]= myarray[j+1];
				 myarray[j+1]= x;
			 }
		 }
		 count++;
	 }
	 for(int i= 0; i<= myarray.length; i++) {
		 System.out.println(myarray[i]);
	 }	 
 }
}
