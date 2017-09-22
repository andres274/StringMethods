public class StringMethods {
    public static void main(String [] args){
        System.out.println("Levitate".substring(4));
        String newWord = new String("Interrogate");
        System.out.println("New Word: " + newWord);
        System.out.println("Levitate".substring(0,4));
        System.out.println("Levitate".charAt(5));
        System.out.println(newWord.compareTo("Levitate"));
        System.out.println(newWord.concat(", dont torture"));
        System.out.println("Levitate".equals("fly"));
        System.out.println("Levitate".equalsIgnoreCase("levitate"));
        System.out.println("Levitate".indexOf("tate"));
        System.out.println("Levitate".lastIndexOf("a"));
        System.out.println(newWord.toLowerCase());
        System.out.println("run, java! run!".toUpperCase());
        System.out.println("mirror".replace("r","d"));
        System.out.println(String.valueOf(newWord));
        System.out.println("   I need some space   ".trim( ));

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.insert(0,"Electricity");
        System.out.println("String Capacity: " + stringBuffer.capacity());
        System.out.println("String Length: " + stringBuffer.length());
        System.out.println("String: " + stringBuffer);
        stringBuffer.replace(2,7,"ABCDE");
        System.out.println("String: " + stringBuffer);
        //String newBuffer = new String ("Electricity");
        stringBuffer.append(" is shocking!");
        stringBuffer.replace(2,7,"ectri");
        System.out.println(stringBuffer);

    }

}
