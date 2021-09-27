import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.net.URL;
public class leagueTables {
    public static void main(String[] args){
        URLs x= new URLs("spain","2021-2022");
        String leagueCountry = x.getLeague();
        String seasonYr = x.getSeason();
    final String  url = "https://tribuna.com/en/league/"+ leagueCountry +"/table/"+ seasonYr +"/";
    int numberTeams = 1;
        try{
            final Document doc = Jsoup.connect(url).get();
                doc.select("tournament-table__wrapper");
            for (int i = 1;i<22; i++) {
                if(i == 1){
                    System.out.println("№ Team MP W D L GF GA GD P");
                    char[] places = doc.select("tr.tournament-table__tr:nth-of-type(" + i + ")").text().toCharArray();
                    char[] placesNew = new char[places.length-29];
                    for (int j = 0; j<placesNew.length-1;j++){
                        placesNew[j] = places[30+j];
                    }
                    System.out.println(placesNew);
                }else {
                    final char[] places = doc.select("tr.tournament-table__tr:nth-of-type(" + i + ")").text().toCharArray();
                    System.out.println(places);
                }
            }
        }catch (Exception exp){
            exp.printStackTrace();
        }
    }
}
