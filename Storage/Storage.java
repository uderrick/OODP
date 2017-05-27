package handongplay3.Storage;

public class Storage {
		
		String title;
		String player;
		String date;
		String content;
		String payment;
		
		public Storage(){
			this.title = "";
			this.player = "";
			this.date = "";
			this.content ="";
			this.payment="";
		}
		
		public String return_title()
		{
			return this.title;
		}
		public String return_player()
		{
			return this.player;
		}
		public String return_date()
		{
			return this.date;
		}
		public String return_content()
		{
			return this.content;
		}
		public String return_payment()
		{
			return this.payment;
		}
		
		
		
		public void get_title(String str)
		{
			this.title = str;
		}
		public void get_player(String str)
		{
			this.player = str;
		}
		
		public void get_date(String str)
		{
			this.date = str;
		}
		public void get_content(String str)
		{
			this.content = str;
		}
		public void get_payment(String str)
		{
			this.payment = str;
		}
		
		
}
