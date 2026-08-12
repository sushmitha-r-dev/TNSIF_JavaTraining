package org.tnsif.acc.c2tc.multipleinterface;
class SmartPhone implements Camera,MusicPlayer{

	@Override
	public void playmusic() {
		System.out.println("Play music");
		
	}

	@Override
	public void takephoto() {
		System.out.println("Take a photo");
		
	}
 
}
public class MultipleInterface  {
  public static void main(String[] args) {
	  SmartPhone  cam=new SmartPhone();
	  SmartPhone  music=new SmartPhone();
	  cam.takephoto();
	  music.playmusic();
}
}
