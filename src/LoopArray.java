
public class LoopArray {

	public static void main(String[] args) {
		/*
		 *  <li>grey</li>
		 *  <li>egoing</li>
		 *  <li>dawa</li>
		 */
		
		String[] users = new String[3];
		users[0] = "grey";
		users[1] = "egoing";
		users[2] = "dawa";
		
		for(int i=0; i<users.length; i++) {
			System.out.println(users[i]+",");
		}
		
	}

}
