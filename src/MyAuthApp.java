
public class MyAuthApp {

	public static void main(String[] args) {
		
		//String[] users = {GREY,DAWA,MIJA,JOONGGI};
		String[][] users = {
				{"GREY","1111"},
				{"DAWA","2222"},
				{"MIJA","3333"},
				{"JOONGGI","4444"}
		};
		
		String inputId = args[0];
		String inputPass = args[1];

		Boolean Logined = false;
		for(int i=0;i<users.length;i++) {
			String[] current = users[i];
			if(current[0].equals(inputId) && current[1].equals(inputPass)) 
			{
				Logined = true;
				break;
			}
		}
		
		System.out.println("Hi");
		if(Logined) {
			System.out.println("Master!");
		} else {
			System.out.println("Who are you???");
		}
	}

}
