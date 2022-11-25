package aims.cart;

import aims.disc.DigitalVideoDisc;

public class Cart{
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered=0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered < MAX_NUMBERS_ORDERED){
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered += 1;
            System.out.println("The disc has been added!");
        }else{
            System.out.println("The cart is almost full!");
        }
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
    	if(qtyOrdered + dvdList.length < MAX_NUMBERS_ORDERED) {
    		for(int i=0; i< dvdList.length; i++) {
    			itemsOrdered[qtyOrdered] = dvdList[i];
    			qtyOrdered++;
    		}
    		System.out.println("The disc has been added!");
    	}else{
            System.out.println("The cart is almost full!");
        }
    }
    
//    public void addDigitalVideoDisc(DigitalVideoDisc ... digitalVideoDiscs disc) {
//    	
//    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
    	if(qtyOrdered + 2 < MAX_NUMBERS_ORDERED) {
    		itemsOrdered[qtyOrdered] = dvd1;
    		qtyOrdered++;
    		itemsOrdered[qtyOrdered] = dvd2;
    		qtyOrdered++;
    		System.out.println("The disc has been added!");
    	}else{
            System.out.println("The cart is almost full!");
        }
    }


    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for (int i=0; i<qtyOrdered; i++){
            if(itemsOrdered[i] == disc){
                for (int j=i; j<qtyOrdered-1; j++){
                    itemsOrdered[j] = itemsOrdered[j+1];
                }

                itemsOrdered[qtyOrdered-1] = null;
                qtyOrdered -= 1;
                return;
            }
        }

        System.out.println("Can not find this DVD in cart!");
    }

    public void displayCart(){
        if(qtyOrdered != 0){
            System.out.println("***********************CART**************************");
            for (int i=0; i<qtyOrdered; i++){
                itemsOrdered[i].print_Details();
            }
        }else{
            System.out.println("Cart is empty!");
        }
    }
    public float totalCost(){
        float sum = 0f;
//        DigitalVideoDisc i = new DigitalVideoDisc();
        for(int i=0; i<qtyOrdered; i++){
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }
    
    public void search_by_title(String title) {
		int check = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i].isMatch(title)) {
				check = 1;
				System.out.println(itemsOrdered[i].printDetail());
			}
		}
		if(check == 0) {
			System.out.println("dvd not found!");
		}
	}
    
    public void search_by_id(String id) {
		int check = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i].isMatch(id)) {
				check = 1;
				System.out.println(itemsOrdered[i].printDetail());
				break;
			}
		}
		if(check == 0) {
			System.out.println("dvd not found!");
		}
		
	}
}