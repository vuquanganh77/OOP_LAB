package aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	

	public String getArtist() {
		return artist;
	}
	
	public void addTrack(Track trackName) {
		if(tracks.contains(trackName)) {
			System.out.println("Track already existed");
			System.exit(0);
		}
		
		
		tracks.add(trackName);
	}
	
	public void removeTrack(Track trackName) {
		if(!tracks.contains(trackName)) {
			System.out.println("Track is not existed");
			System.exit(0);
		}

		tracks.remove(trackName);
	}
	
	//@Override
	public int getLength() {
		int result=0;
		for(int i=0; i<tracks.size(); i++) {
			result += tracks.get(i).getLength();
		}
		return result;
	}


	public CompactDisc() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public void play() {
		for(Track track: tracks) {
			track.play();
		}
	}

}
