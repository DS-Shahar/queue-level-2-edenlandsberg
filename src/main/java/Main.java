


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
