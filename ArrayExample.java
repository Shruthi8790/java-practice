
public class ArrayExample {

	public static void main(String[] args) {
	//Creating an array of 10 integers and store following number 45,78,93,82,95,16,74,83,121,173 respectively
	//-----------------------------------------------------------------------
	//-----declaration of array------------
		int[] numbers;
		//---------------
		numbers=new int[10];
		//-----------------------------------
        /*---------initializing first element with 45-----*/
		numbers[0]=45;
       /*-----------initializing second element with 78--------*/
	  numbers[1]=78;
	  /*-----------initializing third element with 93 --------*/
	  numbers[2]=93;
	  /*-----------initializing fourth element with 82 --------*/
	  numbers[3]=82;
	  /*-----------initializing fifth element with 95--------*/
	  numbers[4]=95;
	  /*-----------initializing six element with 16--------*/
	  numbers[5]=16;
	  /*-----------initializing seventh element with 74--------*/
	  numbers[6]=74;
	  /*-----------initializing eighth element with 83--------*/
	  numbers[7]=83;
	  /*-----------initializing ninth element with 121--------*/
	  numbers[8]=121;
	  /*-----------initializing tenth element with 173--------*/
	  numbers[9]=173;
	  /*---------Display array--------*/
	  System.out.println("Numbers are:");
	  for(int index=0;index<numbers.length;index++)
	  {
		  System.out.print(numbers[index]+",");
	  }
	}

}
