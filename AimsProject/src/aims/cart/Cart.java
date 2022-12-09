package aims.cart;

import java.util.ArrayList;

import aims.media.DigitalVideoDisc;
import aims.media.Media;

public class Cart{
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    
    public void addMedia(Media media) {
    	if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
            System.out.println("Cant add");
            System.exit(0);
        }
        itemsOrdered.add(media);
    }
    
    public void removeMedia(Media media) {
    	if (!itemsOrdered.contains(media)) {
            System.out.println("Cant remove");
            System.exit(0);
        }
        itemsOrdered.remove(media);
    }
    
    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }
    
    public void displayCart() {
        System.out.println("Cart: ");
        for (int i = 0; i < itemsOrdered.size(); i++)
            System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());
        System.out.format("Total cost: %.2f$\n", totalCost());
    }

    public Media searchCart(int id) {
        return itemsOrdered.stream().filter(media -> media.getId() == id).findFirst().orElse(null);
    }

    public Media searchCart(String title) {
        return itemsOrdered.stream().filter(media -> media.getTitle().equalsIgnoreCase(title)).findFirst().orElse(null);
    }
    

//    public void displayCart(){
//        if(qtyOrdered != 0){
//            System.out.println("***********************CART**************************");
//            for (int i=0; i<qtyOrdered; i++){
//                itemsOrdered[i].print_Details();
//            }
//        }else{
//            System.out.println("Cart is empty!");
//        }
//    }
//    public float totalCost(){
//        float sum = 0f;
////        DigitalVideoDisc i = new DigitalVideoDisc();
//        for(int i=0; i<qtyOrdered; i++){
//            sum += itemsOrdered[i].getCost();
//        }
//        return sum;
//    }
//    
//    public void search_by_title(String title) {
//		int check = 0;
//		for(int i = 0; i < qtyOrdered; i++) {
//			if(itemsOrdered[i].isMatch(title)) {
//				check = 1;
//				System.out.println(itemsOrdered[i].printDetail());
//			}
//		}
//		if(check == 0) {
//			System.out.println("dvd not found!");
//		}
//	}
//    
//    public void search_by_id(String id) {
//		int check = 0;
//		for(int i = 0; i < qtyOrdered; i++) {
//			if(itemsOrdered[i].isMatch(id)) {
//				check = 1;
//				System.out.println(itemsOrdered[i].printDetail());
//				break;
//			}
//		}
//		if(check == 0) {
//			System.out.println("dvd not found!");
//		}
//		
//	}
}