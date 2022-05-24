
// 8.3. Program to remove an object from the Stack when the position is passed as parameter

import java.util.*;

public class Ex8c_Stack
{

public static void main(String args[]){

Stack<String> stack = new Stack<String>();
stack.push("Aaliya");
stack.push("Ambili");
stack.push("Anju");
stack.push("krishna");
stack.push("Fathima");
System.out.println("Stack="+stack);
System.out.println("After removing index position 4 =");
stack.removeElementAt(4);
Iterator<String> itr=stack.iterator();
while(itr.hasNext()){

System.out.println(itr.next());

}
}
}


/*

OUTPUT
-------

ksb@ksb-Lenovo-Product:~/ambili/java/exe8$ java Ex8c_Stack

Stack=[Aaliya, Ambili, Anju, krishna, Fathima]
After removing index position 4 =
Aaliya
Ambili
Anju
krishna



*/
