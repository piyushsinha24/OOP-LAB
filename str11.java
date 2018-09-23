class str11
{ 
    // Concatenates to String 
    public static void concat1(String s1) 
    { 
        s1 = s1 + "Assemble"; 
    } 
    // Concatenates to StringBuffer 
    public static void concat2(StringBuffer s2) 
    { 
        s2.append("Assemble"); 
    } 
  
    public static void main(String[] args) 
    { 
        String s1 = "Avengers"; 
        concat1(s1);  // s1 is not changed hence immutable
        System.out.println("String: " + s1); 
        StringBuffer s2 = new StringBuffer("Avengers"); 
        concat2(s2); // s2 is changed hence mutable
        System.out.println("StringBuffer: " + s2); 
    } 
}
