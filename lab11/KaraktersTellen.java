package lab11;

public class KaraktersTellen {
	public static void main(String[] args){
		System.out.println(telKarakters("AAAABBAA",'A',0));
		System.out.println(telKarakters("AAAABBAA",'A',5));
		System.out.println(telKarakters("AAAABBAA",'A',-5));
		System.out.println(telKarakters("AAAABBAA",'A',20));
		System.out.println(telKarakters("AAAABBAA",'B',0));
		System.out.println(telKarakters("AAAABBAA",'C',0));
		System.out.println(telKarakters("",'A',0));
		
	}
	
	public static int telKarakters(String s, char c, int index) {
		if (s.length() == 0 || index >= s.length())
			return 0;
		
		if (index < 0)
			return telKarakters(s, c, 0);
		
		if (s.charAt(index) == c)
			return 1 + telKarakters(s, c, index + 1);
		else
			return telKarakters(s, c, index + 1);
	}
}

