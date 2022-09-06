import java.util.ArrayList;
import java.util.List;

public class Contest1 {

	public static List<String> splitString(String str, char esc) {
		List<String> res = new ArrayList<String>();

		// Your Logic goes here

		String curr = "";
		for(char ch: str.toCharArray()) {
			if(ch == esc) {
				res.add(curr);
				curr = "";
				continue;
			}
			curr += ch;
		}

		if(!(curr.equals(""))) {
			res.add(curr);
		}

		return res;
	}

	public static void main(String[] args) {
		String str = "My name is 'Ashok Kumar Gowda' I have 12+ years of experience I work for 'IBM India Pvt Ltd' ";

		List<String> res = splitString(str, '\'');

		for (String a : res) {
			System.out.println(a);
		}
	}
}
