package handongplay3.iterator;

import handongplay3.Storage.*;


public class PlayListIterator implements Iterator{

	private PlayList playList;
	private int index;
	
	public boolean hasNext(){
		if( index < playList.getLength())
		{
			return true;
		}
		 	return false;
	}
	
	public Object next(){
	handongplay3.Storage.Storage play = playList.getPlayAt(index);
		index++;
		return play;   //���� ���� ���� ��ȯ
	}
	
	public PlayListIterator( PlayList playList)
	{
		this.playList = playList;
		this.index = 0;
	}
	
}
