import java.util.ArrayList;
import java.util.List;

public class Paginator {

    int liczbaZnakow = 4;

    String paginatedText = null;
    List<String> paginatedTextList = new ArrayList<>();

   List<String> paginate (String text){

       if (text.length() <= liczbaZnakow)
       {
           paginatedTextList.add(text);
       }
       else
       {
           for(int i = 1; i <= (text.length()/160 + 1); i++ ){
               paginatedTextList.add(text.substring(i * 160));
           }
       }

        return paginatedTextList;
    }

}
