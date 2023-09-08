import java.util.*;


public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice = 0;
        while(true){
            System.out.println("-----------------------------------------");
            System.out.println("1 - Add Element \n2 - Remove element\n3 - Print element\n4 - Exit");
            System.out.print("Choose : ");
            choice = sc.nextInt();
            System.out.println();
            if(choice == 1){
                System.out.print("Enter the element you want to add : ");
                int el = sc.nextInt();
                System.out.println();
                list.add(el);
                System.out.println("Element Added");
                System.out.println();
            }else if(choice == 2){
                System.out.print("Enter the element you want to remove : ");
                int el = sc.nextInt();
                if(!list.contains(el)){
                    System.out.println("Element not found at the array , please enter a valid value");
                    continue;
                }
                System.out.println();
                list.remove((Integer) el);
                System.out.println("Element Removed");
                System.out.println();
            }else if(choice == 3){
                System.out.print("Array is -> ");
                System.out.println(list);
                System.out.println();
            }else if(choice == 4) {
                System.out.println("Exit success");
                break;
            }else{
                System.out.println("Not valid choice please try again");
            }
        }

    }
}
