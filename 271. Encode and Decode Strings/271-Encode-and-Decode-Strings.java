public class Codec {
  // Encode a list of strings to a single string.
  public String encode(List<String> strs) {
    // Take care of edge cases first
    if(strs.size() == 0) {
      return Character.toString((char) 258);
    }

    // If that's not the case, we take a random character as a separator
    String separate = Character.toString((char) 257);
    // To build the encoded string
    StringBuilder sb = new StringBuilder();

    // Iterate over the list of strings
    for(String s: strs) {
      // Append each string in that list
      sb.append(s);
      // After that, append the separator character
      sb.append(separate);
    }
    
    // Delete the last character which is a separator as it is additional
    sb.deleteCharAt(sb.length() - 1);

    return sb.toString();
  }

  // Decodes a single string to a list of strings
  public List<String> decode(String s) {
    // If we received the character that represents the ASCII code of 258, then the size is 0, we return an empty ArrayList
    if(s.equals(Character.toString((char) 258))) {
      return new ArrayList();
    }

    // If that's not the case then we have a separated string (encoded string), we use the separator character to decode
    String separate = Character.toString((char) 257);

    // Then return the list of strings
    return Arrays.asList(s.split(separate, -1));
  }
}
