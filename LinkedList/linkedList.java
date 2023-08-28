public class linkedList {
    public static void main(String args[]){
        LL link = new LL();
        link.insertFirst(10);
        link.insertFirst(20);
        link.insertFirst(30);
        link.insertFirst(40);
        link.insertFirst(50);
        link.insertFirst(60);
        link.insertFirst(70);
        link.insertFirst(80);
        System.out.println("Size: "+link.size);  
        link.display();
        link.insertAtPos(2, 500);
        link.display();
        System.out.println("Delete first: "+link.deleteFirst());
        link.display();
        System.out.println("Delete last: "+link.deleteLast()); 
        link.display();          
        System.out.println("Delete first: "+link.deleteFirst());
        link.display();
        System.out.println("Size: "+link.size); 
        System.out.println("Delete last: "+link.deleteLast()); 
        link.display();       
        System.out.println("Size: "+link.size);    
        System.out.println("Delete Position: "+link.deleteAtPos(3));    
        link.display();
    }
}
