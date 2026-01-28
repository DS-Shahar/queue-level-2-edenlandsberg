


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
 
  public static int max_q( Queue <Integer> q){ 
 Queue <Integer> h=ex1(q);
 int max_num=0;
 int current=0;
 while(!h.isEmpty()){
    current=h.remove();
        if (current> max_num)
        max_num=current;
    }
    return max_num;}



 /////////////////////////////
 
 public static int log( int x){ 

 
 int num = (int)Math.log10(x) + 1;
 
 return num;} 

 ///////////////////////////
 

 public static int location( int num, int x){ 

 for (int i=0;i<x;i++){
     num=num/10;
 }
 
 
 return num%10;} 

 ///////////////////////////
 
  public static Queue <Integer> sort(Queue<Integer> q) {
      
      Queue <Integer> h=ex1(q);
      Queue<Integer>[] a= new Queue [10];
      for (int i=0;i<10;i++){
          a[i]=new Queue<Integer>();
      }
      
      int max=max_q(q);
      int x=log(max_q(q));
      
       for (int i=0;i<x;i++){
      
         while (!h.isEmpty()) {
          int current=h.remove();
          a[location(current,i)].insert(current);
         }
         
         for (int j=0;j<10;j++){
             while (!a[j].isEmpty()){
                 h.insert(a[j].remove());
             }
         }
 
    }
    
  return h;}  

/////////////////////////////////


//עצים.........................................
///////////////////////////////////
public static void printEven(BinNode<Integer> t) {

if (t==null)
return; 


if(t.getValue()%2==0)
if (!t.hasLeft()||t.getLeft().getValue%2==0){
if (!t.hasRight()||t.getRight().getValue%2==0){
    System.out.println(t.getValue());
} 

printEven(t.getLeft());
printEven(t.getRight());
    
}
}




//////////////////////////////////

public static int printEvenb(BinNode<Integer> t) {

    if (t == null)
        return 0; 

    int count = 0;

    if (t.getValue() % 2 == 0)
        if (!t.hasLeft() || t.getLeft().getValue() % 2 == 0)
            if (!t.hasRight() || t.getRight().getValue() % 2 == 0) {
                System.out.println(t.getValue());
                count = 1;
            }

    return count + printEvenb(t.getLeft()) + printEvenb(t.getRight());
}


/////////////////////////////
public static boolean hasEvenC(BinNode<Integer> t) {

    if (t == null)
        return false;

    if (t.getValue() % 2 == 0)
        if (!t.hasLeft() || t.getLeft().getValue() % 2 == 0)
            if (!t.hasRight() || t.getRight().getValue() % 2 == 0)
                return true;

    return hasEvenC(t.getLeft()) || hasEvenC(t.getRight());
}

///////////////////////////////

public static boolean allEvenD(BinNode<Integer> t) {

    if (t == null)
   return true;  
    if (t.getValue() % 2 != 0)
    return false;
    if (t.hasLeft() && t.getLeft().getValue() % 2 != 0)
   return false;
    if (t.hasRight() && t.getRight().getValue() % 2 != 0)
        return false;
return allEvenD(t.getLeft()) && allEvenD(t.getRight());
}









////////////////////////////



/////////////////////////////
public static int ex12(BinNode<Integer> t) {
int count=0;
if (t==null)
return 0; 


if(t.getValue()>=10&&t.getValue()<100)
count=1;

return count+ex12(t.getLeft())+ ex12(t.getRight());

    
}

//////////////////////////////////
public static <T> int ex14(BinNode<T> t) {
int count=0;
if (t==null)
return 0; 


if(t.getLeft()==null&&t.getRight()==null)
count=1;

return count+ex14(t.getLeft())+ ex14(t.getRight());

    
}
///////////////////////////////
public static int ex16(BinNode<Integer> t) {
if (t==null)
return 0; 


if(t.getLeft()!=null&&t.getRight()!=null)
return t.getValue()+ex16(t.getLeft())+ ex16(t.getRight());

return ex16(t.getLeft())+ ex16(t.getRight());

    
}

/////////////////////////////
public static int ex17(BinNode<Integer> t) {
int count=0;
if (t==null)
return 0; 


if((t.getLeft()!=null&&t.getRight()!=null)&&(t.getLeft().getLeft()!=null&&t.getLeft().getRight()!=null&&t.getRight().getRight()!=null&&t.getRight().getLeft()!=null))
count=1;

return count+ex17(t.getLeft())+ ex17(t.getRight());



    
}

////////////////////////////
	public static void main(String[] args) {
	    
       // יוצרים עץ לבדיקה
        BinNode<Integer> n1 = new BinNode<>(2);
        BinNode<Integer> n2 = new BinNode<>(4);
        BinNode<Integer> n3 = new BinNode<>(6);
        BinNode<Integer> n4 = new BinNode<>(3);  // צומת בעייתי

        BinNode<Integer> leftSub = new BinNode<>(n1, 8, n2); // 8 עם ילדים 2 ו-4
        BinNode<Integer> rightSub = new BinNode<>(n3, 10, n4); // 10 עם 6 ו-3

        BinNode<Integer> t = new BinNode<>(leftSub, 12, rightSub); // 12 עם שני תתי עצים

      
		//System.out.println(t);

		//printOdd(t);
		
		
		//printLeft(t15);
		
		//System.out.println(printEvenb(t));
		
		System.out.println(ex12(t));
		System.out.println(ex14(t));
		System.out.println(ex16(t));
		System.out.println(ex17(t));
	}
	
}
	    








