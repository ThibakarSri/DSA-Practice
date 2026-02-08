public class Main {
    public static void main(String[] args) {

        String input = "is1 Thi0s T3est 2a"; //input

        int wordCount = 1;
        for (int i = 0; i < input.length(); i++) //used for get the word count in string
        {
            if (input.charAt(i) == ' ')
            {
                wordCount++;
            }
        }


        String[] result = new String[wordCount]; // number of words
        String temp = "";

        for (int i = 0; i <= input.length(); i++) {

            if (i == input.length() || input.charAt(i) == ' ') //only allowed space and aafter end the string
            {
                String letters = ""; //Stored the letters
                int index = 0; //store the index value

                for (char ch : temp.toCharArray()) { //['i','s',1'] //loop used for saparate the number and characters
                    if (Character.isDigit(ch)) {
                        index = ch - '0'; //index=1 //'1' ASCII value =>49 and '0' ASCII value = 48 //converted the index from character digit
                    } else {
                        letters += ch; //letters=is //store the character
                    }
                }

                result[index] = letters; //result[1]="is"; //stored the values in array based on index
                temp = ""; //reset the temp variable

            } else {
                temp += input.charAt(i); //added the non space character =>ex:temp=is1
            }
        }

// Print output
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " "); //This is a Test
        }
    }
}
