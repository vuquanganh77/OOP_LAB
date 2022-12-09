package aims.store;

import java.util.ArrayList;
import java.util.Iterator;

import aims.media.DigitalVideoDisc;
import aims.media.Media;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();

	public Store() {
		super();
	}
	
	public boolean addMedia(Media media) {
        if (itemsInStore.contains(media))
            return false;
        itemsInStore.add(media);
        return true;
    }

    public boolean removeMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            System.out.println("The media is not in the store. Can't remove!");
            return false;
        }
        itemsInStore.remove(media);
        return true;
    }
    
    public void printDetail() {
        System.out.println("Store items:");
        for (Media media : itemsInStore) {
            media.printDetail();
        }
    }
	
//	public void addDVD(DigitalVideoDisc dvd) {
//		itemsInStore.add(dvd);
//	}
//	
//	public void removeDVD(DigitalVideoDisc dvd) {
//		
//		// create an Iterator Object
//		Iterator<DigitalVideoDisc> itr = itemsInStore.iterator();
//		
//		// hold true till there is single element remaining in object
//		while(itr.hasNext()) {
//			DigitalVideoDisc tmp = itr.next();
//			
//			// If equal by id, then remove
//			if(tmp.getId() == dvd.getId()) {
//				itr.remove();
//			}
//		}
//	}
	
}