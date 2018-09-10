package Leet;

public class CountAndSay {

	public String countAndSay(int n) {
		String s="1";
		for(int i=1;i<n;i++) {
			int count=1;
			char say=s.charAt(0);
			String next="";
			for(int j=1; j<=s.length();j++) {
				if(j<s.length() && say==s.charAt(j)){
					count++;
				}
				else {
					next+=(count+""+say);
					count=1;
					if(j<s.length()) {
						say=s.charAt(j);
					}
				}
			}
			System.out.println(next);
			s=next;
		}
		return s;
	}
	public static void main(String[] args) {
		CountAndSay c = new CountAndSay();
		System.out.println(c.countAndSay(5));
	}

}
