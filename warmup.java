public class warmup {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            total += i;
        }
        System.out.println(total / 2);
    }
    //Predicted: Out 15 (forgot to divide in class) 
//Output: 7
//Why: code adds the numbers 1-5 together then divides by 2, it being an int needs a whole number so 14.5 is rounded down to 7.
}

