public class Queue<T>
{
  private Node<T> first;
  private Node<T> last;

  public Queue()
  {
    this.first = null;
    this.last = null;
  }

  public void insert(T x)
  {
    Node<T> temp = new Node<T>(x);
    if (first == null)
      first = temp;
    else
      last.setNext(temp);
    last = temp;
  }

  public T remove()
  {
    T x = first.getValue();
    first = first.getNext();
    if (first == null)
      last = null;
    return x;
  }

  public T head()
  {
    return first.getValue();
  }

  public boolean isEmpty()
  {
    return first == null;
  }

  public String toString()
  {
    if (isEmpty())
      return "[]";
    String s = "[";
    insert(null);
    T temp = remove();
    while (temp != null) {
      s += temp;
      insert(temp);
      temp = remove();
      if (temp != null)
        s += ", ";
    }
    return s + "]";
  }
}




/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{


static Scanner reader=new Scanner(System.in);

public static boolean ex0( Queue <Integer> q,int x){
    while(!q.isEmpty()){
        if(q.remove()==x)
        return true;
      
        
    }
    return false;
}


/////////////////////////////////////
public static Queue<String> copy_string(Queue<String> q) { // סיבוכיות O(n)
    Queue<String> h = new Queue<>();
    Queue<String> p = new Queue<>();

    while (!q.isEmpty()) {
        p.insert(q.head());
        h.insert(q.remove());
    }

    while (!p.isEmpty()) {   // מחזירים את האיברים ל־q
        q.insert(p.remove());
    }

    return h;
}










/////////////////////////////////////
public static Queue <Integer> ex1( Queue <Integer> q){ //סיבוכיות O(n)
    Queue <Integer> h=new Queue<>(); 
    Queue <Integer> p=new Queue<>(); 
    while(!q.isEmpty())
    {
   
    p.insert(q.head());
    h.insert(q.remove());
    
    }
     while(!q.isEmpty()){
         q.insert(p.remove());
     }
    return h;
   
}


 /////////////////////////////////////
 
public static double ex2( Queue <Integer> q){ //סיבוכיות O(n)
    Queue <Integer> h=ex1(q);    
    int i=0;
    int sum=0;
   
 while(!h.isEmpty())
    {
        sum=sum+h.remove();
        i=i+1;
    }
    
    return (double)sum/i;
   
   
}
 

 ////////////////////////////////////
 public static int ex3( Queue <Integer> q,int x){ //סיבוכיות O(n)
  Queue <Integer> h=ex1(q);
 int count=0;
 while(!h.isEmpty())
    {
       if(h.remove()%x==0)
       count++;
    }
    
    return count;
   
   
}
 
 
 //////////////////////////////////
public static boolean ex4(Queue<Integer> a, Queue<Integer> b) { //סיבוכיות O(n
    Queue<Integer> A = new Queue<>();
    Queue<Integer> B = new Queue<>();
    boolean end = true;

    while (!a.isEmpty()) {
      int c = a.remove();
       A.insert(c); 

    boolean divides = false;

        while (!b.isEmpty()) {
              int d = b.remove();
           B.insert(d); 

            if (d % c == 0) {
                divides = true;}
        }

       
        while (!B.isEmpty()) {
            b.insert(B.remove());}

      if (!divides) {
            end = false;}
    }


while (!A.isEmpty()) {
        a.insert(A.remove());
    }

    return end;
}

 
 
 ////////////////////////////////
 public static boolean ex5( Queue <Integer> q,int x){ //סיבוכיות O(n
 Queue <Integer> h=ex1(q);
 int count=0;
 while(!h.isEmpty()){
    if (h.remove()==x){
        count++;
    }

 }
 if (count>=2)
 return true;
 
 else
 return false;
 }
 
 ////////////////////////////////
 
 
 //תור רמה 2
 
 public static Queue<Integer> ex1_( Queue <Integer> q){ //יבוכיות O(n
 //גודל הקלט הוא כגודל התור פחות הווים שחוזרים על עצמם ברצף של יותר מ-1
 Queue<Integer> A = new Queue<Integer>();
 Queue <Integer> h=ex1(q);
 
 if (h.isEmpty())
        return A;
 
 
 int count=1;
 int x=h.remove();
 while(!h.isEmpty()){
    if (h.head()==x){
        count++;
        h.remove();
    }
    else{
    A.insert(count);
    count=1;
        x=h.remove();
    }
    
   

 }
 A.insert(count);

 return A;
 

 }
 
//////////////////////////////////// 
  public static boolean isIn(Queue<String> q, String s) {
      Queue <String> h=copy_string(q);
        boolean found = false;


        while (!h.isEmpty()){
           
            if ( h.remove().equals(s)) 
                found = true;
            
           
           
        }

        return found;
    }



///////////////////////////////////
 public static boolean ex2_(Queue<String> q2) {
        Queue<String> A = copy_string(q2);
        Queue<String> h = copy_string(q2);
        boolean bool = false;

        while (!h.isEmpty()) {
            A = copy_string(q2);
            String x = h.remove();
            if (isIn(A, x)) {
                bool = true;
                
            }
           
        }

        return bool;
    }

    
   

 
  
 
 
 
 
 
 
 
 
 ///////////////////////////////
	public static void main(String[] args) {
	    Queue <Integer> q=new Queue<>();
	    q.insert(1);
	    q.insert(2);
	    q.insert(3);
	    q.insert(3);
	    q.insert(4);
	    
	    Queue <Integer> q1=new Queue<>();
	    q1.insert(4);
	    q1.insert(2);
	    q1.insert(6);
	    q1.insert(8);
	    
	    //System.out.println(ex0(q,3));
	    //System.out.println(ex1(q));
	    //System.out.println(ex2(q));
	    //System.out.println(ex3(q,3));
	    //System.out.println(ex4(q,q1));
	    //System.out.println(ex5(q,3));
	    
	    
	    Queue <String> q2=new Queue<>();
	    q2.insert("eden");
	    q2.insert("gal");
	    q2.insert("noa");
	    q2.insert("n");
	    
	    //רמה 2
	    //System.out.println(ex1_(q));
	    //System.out.println(ex2_(q2));
	}
}
