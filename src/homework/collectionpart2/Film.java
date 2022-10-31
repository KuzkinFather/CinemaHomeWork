package homework.collectionpart2;

//- Фильм с 5-ю полями: Уникальный Целочисленный идентификатор (id), Год издания, Месяц издания, Жанр и Рейтинг;

import java.util.Objects;

public class Film {

    private int id;
    private int year;
    private int month;
    private String genre;
    private double raiting;

    public Film() {

    }

    public Film(int id, int year, int month, String genre, double raiting) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.genre = genre;
        this.raiting = raiting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return id == film.id && year == film.year && month == film.month && Double.compare(film.raiting, raiting) == 0 && Objects.equals(genre, film.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, year, month, genre, raiting);
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", year=" + year +
                ", month=" + month +
                ", genre='" + genre + '\'' +
                ", raiting=" + raiting +
                '}';
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public String getGenre() {
        return genre;
    }

    public double getRaiting() {
        return raiting;
    }
}
