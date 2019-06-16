
public class NaivCompressor implements Compress {


    @Override
    public String compress(String text) {
        String[] words = text.split(" ");
        String outS = "";

        for (String word : words){
            String first = word.substring(0,1);
            first = first.toUpperCase();
            outS += first + word.substring(1) + " ";
        }
        outS = outS.replace(" ", "");
        return outS;
    }

    @Override
    public String decompress(String text) {
        return null;
    }
}
