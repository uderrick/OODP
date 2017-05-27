package handongplay3.iterator;
import handongplay3.Storage.*;

public class PlayList implements AbstractCollection {

		private Storage[] playlist; //������ �ϳ��� �޴°�.
		private int last = 0; //������������ Ȯ��?
		
		
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
			return last; //���ذ��� ��ȯ
		}
		
		public Iterator iterator (){ //�о���� ����� �ҷ����°�! å�� ���� �о��ּ���!
			return new PlayListIterator(this);
		}
		
		
		
}
