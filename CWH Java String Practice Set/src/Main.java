public class Main {
    public static void main(String[] args) {
        String name="Jimmy Bloom";
        System.out.println(name);
        System.out.println("String in Lower Case: "+name.toLowerCase());
        System.out.println("Replacing Space to UnderScore: "+name.replace(" ", "_"));
// Replace // letter = “Dear <|name|>, Thanks a lot” , <|name|> to some name
        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>","Sachin");
        System.out.println(letter);
// Java program to detect double and triple spaces in a string.F
        String myString = "Thisstring contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf(" "));

        // Write a program to format the following letter using escape sequence characters.
        //Letter = “Dear Harry, This Java Course is nice. Thanks”
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);

    }
}