public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating ="PG";
    }
    public void getPg(String title, String rating){
        if(rating=="PG") {
            System.out.println(title);
        }
    }

    public static void main(String[] args) {
        Movie film=new Movie("Casino Royale","Eon Productions","PG-13");
        Movie film1=new Movie("RRR","DVV","PG");
        film.getPg(film.title,film.rating);
        film1.getPg(film1.title,film1.rating);
    }
}
