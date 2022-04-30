/*
Write a program has classes Publisher, Book, Literature and Fiction. Read the information and print the details of books from either the category, usingm inheritance Class Publisher- Attribute PublisherName, Method display()
Class Book subclass of Publisher- Attribute- Title, Author, Method display() Class Literature subclass of Book-Attribute-type, Method display() Class Fiction subclass of Book-Attribute-genre, Method display()
*/



import java.util.*;

class Publisher{
	String publishname;

	Publisher(String pubnam){
		publishname=pubnam;

	}
	void display(){
		System.out.println("publisher name: "+publishname);
		}
	}



class book extends Publisher{
	String title;
	String author;

	book(String pubnam, String tit, String auth){
	super(pubnam);
	title=tit;
	author=auth;

	}
	void display(){
		super.display();
		System.out.println("book title: "+title+"\nauthor: "+author);
		}
	}



class literature extends book{
	String type;

	literature(String pubnam, String tit, String auth, String typ){
	super(pubnam,tit,auth);
	type=typ;
	}
	
	void display(){
		super.display();
		System.out.println("type: "+type);
		System.out.println("------------------------------");
			}
	}


class fiction extends book{
	String genre;


	fiction(String pubnam, String tit, String auth, String gen){
	super(pubnam,tit,auth);
	genre=gen;	
		}
	void display(){
		super.display();
		System.out.println("genre: "+genre);
		System.out.println("------------------------------");
			}
	
}



class Exe3{      //creating main class 
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		System.out.print("enter no. of literature books: ");
		int n=obj.nextInt();

		literature[] arr=new literature[n];

		for(int i=0;i<n;i++){
			System.out.println("enter the details of literature book "+(i+1));
			System.out.print("publisher name: ");
			String pub=obj.next();

			System.out.print("title: ");
            		String tit=obj.next();

          		System.out.print("author: ");
            		String aut=obj.next();

			System.out.print("type: ");
            		String typ=obj.next();

			arr[i]=new literature(tit,aut,pub,typ);
			System.out.println("---------------------\n");
				}



			System.out.print("enter no. of fiction books: ");
			int m=obj.nextInt();
			fiction[] ar=new fiction[m];
			for(int a=0;a<m;a++){
			System.out.println("enter the details of fiction book "+(a+1));
			System.out.print("publisher name: ");
			String pub=obj.next();

			System.out.print("title: ");
            		String tit=obj.next();

          	        System.out.print("author: ");
            		String aut=obj.next();

			System.out.print("genre: ");
            		String gen=obj.next();
			ar[a]=new fiction(tit,aut,pub,gen);
			System.out.println("---------------------\n");
				}



		do{
		System.out.println("1.literature\n2.fiction\n3.exit");
		System.out.print("enter your option: ");
		int opt=obj.nextInt();
		
		switch(opt){
			case 1:System.out.println("\n---Literature books---");
			       for(int x=0;x<n;x++){
			       System.out.println("details of literatue book "+(x+1));
            	 	       arr[x].display();
            	   	       }
            	  	       break;

            		case 2:System.out.println("\n---Fiction books---");
                               	for(int y=0;y<m;y++){
                               	System.out.println("details of fiction book "+(y+1));
            	               	ar[y].display();
            	   	       	}
            	               break;

                        case 3:System.out.println("exiting.");
            	               System.exit(0);

            	}
 
		
		}while(true);
	}

}



/*

Output

enter no. of literature books: 2
enter the details of literature book 1
publisher name: Anu
title: sky 
author: Sanu
type: literature
---------------------

enter the details of literature book 2
publisher name: Abhi
title: Earth
author: subhi
type: literature
---------------------

enter no. of fiction books: 2
enter the details of fiction book 1
publisher name: ravi
title: world
author: sham  
genre: function
---------------------

enter the details of fiction book 2
publisher name: manu
title: tree
author: vinu
genre: function
---------------------

1.literature
2.fiction
3.exit
enter your option: 1

-Literature books-
details of literatue book 1
publisher name: sky
book title: Sanu
author: Anu
type: literature
------------------------------
details of literatue book 2
publisher name: Earth
book title: subhi
author: Abhi
type: literature
------------------------------
1.literature
2.fiction
3.exit
enter your option: 2

-Fiction books-
details of fiction book 1
publisher name: world
book title: sham
author: ravi
genre: function
------------------------------
details of fiction book 2
publisher name: tree
book title: vinu
author: manu
genre: function
------------------------------
1.literature
2.fiction
3.exit
enter your option: 3
exiting.
*/


