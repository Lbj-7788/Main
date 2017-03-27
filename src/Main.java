import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		String str = "";
		int length = maxChildLength(str);
		System.out.println(length);
	}
	
	public static int maxChildLength(String str){
		if(str.equals("")||str == null) return 0;
		int maxLength = 0;
		List<Character> list = new ArrayList<Character>();
		
		char[] strs = str.toCharArray();
		for (int i = 0; i < strs.length; i++) {
			for (int j = i; j < strs.length; j++) {
				if (!list.contains(strs[j])) {
					
					list.add(strs[j]);
					continue;
				}else {
					if (list.size() > maxLength) {
						maxLength = list.size();
					}
					list.clear();
					break;
				}
			}
		}
		
		return maxLength;
	}
}
