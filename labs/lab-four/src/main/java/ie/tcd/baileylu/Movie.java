package ie.tcd.baileylu;

class Movie implements Comparable<Movie> {
    private String title;
    private int date;
    private String director;
    private int budget;
    private double rating;

    public Movie(String title, int date, String director, int budget, double rating) {
        this.title = title;
        this.date = date;
        this.director = director;
        this.budget = budget;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", date=" + date +
                ", director='" + director + '\'' +
                ", budget=" + budget +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        if (this.rating > ((Movie) o).rating)
            return 1;
        else if (this.rating < ((Movie) o).rating)
            return -1;
        else
            return 0;
    }
}
