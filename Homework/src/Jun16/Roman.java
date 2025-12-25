package Jun16;

public class Roman {
public static void main(String[] args) {
		String s1="IVXLCDM";
		Integer a=10;
		Object o=a;
		
		System.out.println(o);
		
		String s2="IV";
		
		int[] arr={1,5,10,50,100,500,1000};
		int res=0;
		

        for (int i = 0; i < s2.length(); i++) {
            int currentIndex = s1.indexOf(s2.charAt(i));
            int currentVal = arr[currentIndex];

            // Look ahead to the next character if there is one
            if (i + 1 < s2.length()) {
                int nextIndex = s1.indexOf(s2.charAt(i + 1));
                int nextVal = arr[nextIndex];

                if (currentVal < nextVal) {
                    res -= currentVal; // Subtract if smaller than the next
                } else {
                    res += currentVal;
                }
            } else {
                res += currentVal; // Last character, just add
            }
		
}

		System.out.println(res);
}}
