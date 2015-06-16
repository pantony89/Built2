/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c0633176
 */
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
public class Queue1 {
    
   public static void main(String[] args) {
        System.out.println("\nExample One\n===========");
        prac1();
        System.out.println("\nExample two\n===========");
        prac2();
           System.out.println("\nExample three\n===========");
        prac3();
        prac4();
        doBuildIt2();
   }
     

public static void prac1(){

 Queue<String> pName=new ArrayBlockingQueue<>(10);
    pName.add("antony");
    pName.add("ram");
    pName.add("muth");
    pName.add("nim");
    for(String s:pName){
        System.out.println(s);
    }
    
         System.out.println("Removed data ");
         pName.remove("antony");
         for(String s:pName){
        System.out.println(s);
        
    
    }
    
}

public static void prac2(){

HashSet<String> pName=new HashSet<>(120);
pName.add("antony");
pName.add("ram");
pName.add("muth");
pName.add("im");
    System.out.println("The Names which are stored in the hash table");
       boolean s=pName.contains("antony");
         boolean c=pName.contains("ajohn");
           boolean d=pName.contains("muth");
             boolean v=pName.contains("smith");
               boolean q=pName.contains("jack");
    System.out.printf("%b\t%b\t%b\t%b\t%b",s,c,d,v,q);
    pName.remove("antony");
    System.out.println("The Names which are stored in the hash table");
    s=pName.contains("antony");
    System.out.println(s);
}
public static void prac3(){

HashSet<String> pName=new HashSet<>(120);
pName.add("antony");
pName.add("ram");
pName.add("muth");
pName.add("im");
    System.out.println("The Names which are stored in the hash table");
       for(String s:pName){
           System.out.println(s);
       }
     System.out.println("The Names which are stored in the hash table");
   
}

   public static class Customer{

     private String accountId;
    List<String> toDolist=new ArrayList<>();

        public String getAccountId() {
            return accountId;
        }

        public void setAccountId(String accountId) {
            this.accountId = accountId;
        }

        public List<String> getToDolist() {
            return toDolist;
        }

        public void setToDolist(List<String> toDolist) {
            this.toDolist = toDolist;
        }
        public void addToDo(String s){
        toDolist.add(s);
        }

} 
   public static class Account{
      List<String> purchaseHistory=new ArrayList<>();

        public List<String> getPurchaseHistory() {
            return purchaseHistory;
        }

        public void setPurchaseHistory(List<String> purchaseHistory) {
            this.purchaseHistory = purchaseHistory;
        }
      public void addPurchase(String s){
      purchaseHistory.add(s);
      }
   }
   public static void prac4(){
   
   Queue<Customer> waitingRoom=new ArrayDeque<Customer>();
   Map<String,Account>accounts=new TreeMap<>();
   
   Customer anto=new Customer();
   anto.setAccountId("s117");
   anto.addToDo("leader");
   anto.addToDo("captain");
   anto.addToDo("very effective");
   anto.addToDo("soldier");
   accounts.put("s117",new Account());
   waitingRoom.add(anto);
   Customer ram=new Customer();
   
   ram.setAccountId("s108");
   ram.addToDo("caption of Titanic");
   Account ramAccount=new Account();
   ramAccount.addPurchase("soldier of world war 2");
   accounts.put("s108",ramAccount);
   waitingRoom.add(ram);
   while(!waitingRoom.isEmpty()){
   Customer customer=waitingRoom.remove();
   String customerId=customer.getAccountId();
       System.out.println("customer ID: "+customerId);
       for(String toDo:customer.getToDolist()){
       if(toDo.contains("soldier")){
       Account cAccount=accounts.get(customerId);
       cAccount.addPurchase(toDo);
           System.out.println("add account and history"+toDo);
       }
       
       }
   }
   
   
   
   }
   public static void doBuildIt2() {
        // Set up the Initial Queue
        Queue<Map> queue = new ArrayDeque<>();
        
        // Add the first Map to it
        queue.add(new TreeMap<>());
        
        // Map a String to a Set
        Set inputs = new HashSet<>();
        inputs.add(1);
        inputs.add(3);
        inputs.add(4);
        queue.element().put("inputs", inputs);
        
        // Map another String to another Set
        Set outputs = new HashSet<>();
        outputs.add(1);
        outputs.add(2);
        queue.element().put("outputs", outputs);
        
        // Iterate through the Map at the End
        while (!queue.isEmpty()) {
            Map m = queue.remove();
            for (Object k : m.keySet()) {
                System.out.println(k);
                System.out.println(m.get(k));
            }
        }
    }
 
}
   
