class questions{
public static void main(String args []) {
    String[] questions ={"1)When Pakistan got independence____ "
		,"2) 2+2 = /n"
		,"3) 8*8+2 = /n"
		,"4) 10/10 = "
		,"5) 30/10+5*2-10 = ?"};
		
		String options [] = {
            "a)1946  b)1940  c) 1950  d)1947", "a)8  b)23  c) 4  d)10","a)80 b)66  c)88  d)90",
            "a)2  b)10  c)1  d)12","a)10  b)3  c) 14  d)10"
        };
        char answer []  = {'D' , 'C' , 'B', 'C', 'B'};
        for (int i=0; i<5; i++) {
            System.out.println(questions[i]);
            System.out.println(options[i]);
        }
}
}
