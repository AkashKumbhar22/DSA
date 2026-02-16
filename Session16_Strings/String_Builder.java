public class String_Builder {
    public static void main(String[] args) {

    String a = "Ak";
    StringBuilder sb = new StringBuilder("Akash");
    // sb.append("Hello" + " "+ sb + " "+ "How are u?");

    sb.setCharAt(1,'d');
    System.out.print(sb);
}
}
