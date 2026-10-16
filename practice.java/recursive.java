public class recursive{
public static void main(String[] args){
   sum(1);
}

 public static void sum(int i){
       System.out.println(i);
    if(i==5){
        return;
    }
    sum(i+1);
    }
}