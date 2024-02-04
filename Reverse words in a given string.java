class Solution 
{
    // Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // Split the string into an array of words using dots as separators.
        String d[] = S.split("\\.");

        // Initialize a StringBuilder to efficiently concatenate strings.
        StringBuilder reversedString = new StringBuilder();

        // Iterate through the array of words in reverse order.
        for (int i = d.length - 1; i > 0; i--) {
            // Append the reversed word followed by a dot to the StringBuilder.
            reversedString.append(d[i]).append('.');
        }

        // Append the last word without a trailing dot.
        reversedString.append(d[0]);

        // Convert the StringBuilder to a String and return the result.
        return reversedString.toString();
    }
}
