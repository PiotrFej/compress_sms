import java.util.ArrayList;
import java.util.List;

public class Paginator {

    int liczbaZnakow = 5;

    String paginatedText = null;
    List<String> paginatedTextList = new ArrayList<>();

   List<String> paginate (String text){

       int iloscSMS = text.length() / liczbaZnakow;

       for (int i = 0; i < iloscSMS + 1; i++) {

           if (paginatedTextList.size() < iloscSMS )
           {
               paginatedTextList.add(text.substring(i * liczbaZnakow, (i + 1) * liczbaZnakow));
           }
           else
           {
               paginatedTextList.add(text.substring( liczbaZnakow * i));
           }
           }

       for (String string:paginatedTextList) {
           System.out.println(string);
       }
       return paginatedTextList;

       }
    }

