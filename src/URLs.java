public class URLs {
    public String country;
    public String season;

    public URLs(String country, String season){
        this.country = country;
        this.season = season;
    }
    public void detLeague() {
        if (this.country.equals("spain")) {
            this.country =  "la-liga";
        } else if (this.country.equals("england")) {
            this.country = "epl";
        } else if (this.country.equals("italy")) {
            this.country = "serie-a";
        } else if (this.country.equals("germany")) {
            this.country = "bundesliga";
        } else if (this.country.equals("france")) {
            this.country = "ligue-1";
        }
    }
    public String getLeague(){
        detLeague();
        return this.country;
    }
    public String getSeason(){
        return this.season;
    }
}

