public class warmup2 {
    public static void bump(int n) {
        n = n + 1;
    }


    public static void bump(int[] arr) {
    arr[0] = arr[0] + 1;
    }

        public static void main(String[] args) {
       
        String s1 = "cs2050";
        String s2 = new String ("cs2050");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1);
//Predicted: false, true, cs2050
//Output: false, true, cs2050
//Why: s1 is a direct assignment and s2 is a new object, but im actually not sure why it's not printing       

            int x = 5;
        bump(x);
        System.out.println(x);
//Predicted:6
//Output:5,6
//Why: Method coded to proccess int n whenver the fucntion bump is called, but the value 
// of x is not changed but a new object n is created with the value of x after it runs through bump getting 6.
//Both 5 and 6 are printed because x the object is 5 and x from bump is called which is 6.
        int [] y = {5};
        bump(y);
        System.out.println(y[0]);
//Predicted: 6
//Output: 6
//Why: A method bump is created to add a space length to when a specific array is called and a new string variable 
//that is 3 characters long but this prints out nothing becasue nothing has been entered into the array yet.

        String [] names = new String[3];
        System.out.println(names[0].length());
//Predicted: 3
//Output: An error 
//Why: The array doesn't have any assigned values, therefore it has no space in the array to actually print.
        
    }

}
