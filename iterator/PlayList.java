package handongplay3.iterator;
import handongplay3.Storage.*;

public class PlayList implements AbstractCollection {

		private Storage[] playlist; //열마다 하나씩 받는것.
		private int last = 0; //마지막꺼인지 확인?
		
		
		public PlayList( int num){
			this.playlist = new Storage[num];
		}
		
		public Storage getPlayAt( int index){
			return playlist[index];
		}
		
		public void appendPlay ( Storage play)
		{
			this.playlist[last] = play;
			last++;
		}
		
		public int getLength(){
			return last; //연극갯수 반환
		}
		
		public Iterator iterator (){ //읽어오는 기능을 불러오는것! 책장 나를 읽어주세요!
			return new PlayListIterator(this);
		}
		
		
		
}
