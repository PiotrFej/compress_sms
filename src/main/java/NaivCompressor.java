
public class NaivCompressor implements Compress {


    @Override
    public String compress(String text) {
        String[] words = text.split(" ");
        String outS = "";

        for (String word : words){
            String first = word.substring(0,1);
            first = first.toUpperCase();
            outS += first + word.substring(1);
        }

        return outS;
    }

    @Override
    public String decompress(String text) {
        String[] decompressedText = null;

            decompressedText = text.split("\\[.*?(?:= [0-9]+ =|$)");

            return decompressedText.toString();

    }
}
