/*Write a menu driven program that would choose either in-built
method or call a user defined method to sort an array of strings*/
import java.util.*;
class StrSort{   //define class StrSort
  void SortAndDisp(String arr[]){   
      String temp;
      int len =arr.length;
	for(int i=0;i<len-1;i++){
	for(int j=i+1;j<len;j++){
	if(arr[i].compareTo(arr[j])>0)	//compare all elements inthe array each other
        {
	  temp=arr[i];
          arr[i]=arr[j];
	  arr[j]=temp;
        }
						
   }
			
}
	for(int i=0;i<len;i++)
        {  //loop for display sorted array
	  System.out.print(arr[i]+"\t");
	}
	System.out.println();
			
		
	
	}
	String[] insert(String arr[],int len){  //methord for read elements to array
		
		for(int i=0;i<len;i++)
		{
		
		  arr[i]=System.console().readLine();
		}
		return arr;
	
	}
	

	public static void main(String ar[]){ //main methord
	
		StrSort st =new StrSort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of strings you want: ");
		int num = sc.nextInt();
		String str[] = new String[num];		//initialize array
		System.out.println("Enter the elements in the array: ");
		str=st.insert(str,num);
		
		while(true){
				
	        System.out.println("1.Array sort by userdefind methord\n2.Array sort by inbulid  methord\n3.Exit");
			System.out.println("Enter your option : ");
			 int opt = sc.nextInt();
				
				
			  if(opt==1)
                             {
						
				System.out.println("Array sort by userdefind methord");
				st.SortAndDisp(str);
				
					
			    }
				else if(opt == 2)
                             {
				System.out.println("Array sort by inbulid methord");
				Arrays.sort(str);
				for(int i=0;i<num;i++)
				{
				  System.out.print(str[i]+"\t");
			        }
				  System.out.println();
			    }
				else
                                {
					System.out.println("Exit");
					System.exit(0);
				}
		
		}
		
		
	
	}


}

/*


output
------

Enter number of strings you want: 
4
Enter the elements in the array: 
fathima
ambili
reema
aneetha

1.Array sort by userdefind methord
2.Array sort by inbulid  methord
3.Exit
Enter your option : 
1

Array sort by userdefind methord
ambili	aneetha	fathima	reema	

1.Array sort by userdefind methord
2.Array sort by inbulid  methord
3.Exit
Enter your option : 
2
Array sort by inbulid methord
ambili	aneetha	fathima	reema	
1.Array sort by userdefind methord
2.Array sort by inbulid  methord
3.Exit

Enter your option : 
3
Exit

*/
