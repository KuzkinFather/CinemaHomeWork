package homework.collectionpart2;

//- Кинотеатр, где есть всего лишь одно единственное поле: отсортированный ассоциативный массив,
// где ключом является год издания, а значением - все фильмы, выпустившиеся в этом году.


import java.util.*;

public class Cinema {

    private Map<Integer, LinkedHashMap<Integer, Film>> filmsByYear;

    public Cinema(){

    }

    public Cinema(Map<Integer, LinkedHashMap<Integer, Film>> filmsByYear) {
        this.filmsByYear = filmsByYear;
    }

    public void addFilm(Film film){
        filmsByYear.putIfAbsent(film.getYear(), new LinkedHashMap<>());
        filmsByYear.get(film.getYear()).put(film.getYear(), film);
    }
    
    public void getFilmByYear (int year) {
        for (Map.Entry<Integer, LinkedHashMap<Integer, Film>> entry : filmsByYear.entrySet()) {
            if (entry.getKey() == year) {
                System.out.println("По году " + entry.getKey() + " есть следующее " + entry.getValue());
            }
        }
    }

    public void getFilmByYearAndMonth (int year, int month) {
        for (Map.Entry<Integer, LinkedHashMap<Integer, Film>> entry : filmsByYear.entrySet()) {
            if (entry.getKey() == year) {
                for (Film next : entry.getValue().values()) {
                    if (next.getMonth() == month) {
                        System.out.println("Получить все фильмы по переданному году и месяцу "+ next);
                    }
                }
            }
        }
    }
    
    public void getFilmByGenre (String genre) {
        for (Map.Entry<Integer, LinkedHashMap<Integer, Film>> entry : filmsByYear.entrySet()) {
            for (Film value : entry.getValue().values()) {
                if (value.getGenre() == genre) {
                    System.out.println("получить все фильмы по переданному жанру " + value);
                }
            }
        }
    }


//    public Set<Film> getListTop10(Map<Integer, TreeSet<Film>> film) {
//
//        Set<Film> result = new TreeSet<>(new CompareRaiting());
//        for (Map.Entry<Integer, TreeSet<Film>> entry : film.entrySet()) {
//            TreeSet<Film> value = entry.getValue();
//            result.addAll(value);
//        }
//
//        return result;
//    }


    public static class CompareRaiting implements Comparator<Film> {
        @Override
        public int compare(Film o1, Film o2) {
            return Double.compare(o2.getRaiting(), o1.getRaiting());
        }
    }




    @Override
    public String toString() {
        return "Cinema{" +
                "filmsByYear=" + filmsByYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cinema cinema = (Cinema) o;
        return Objects.equals(filmsByYear, cinema.filmsByYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmsByYear);
    }

    public Map<Integer, LinkedHashMap<Integer, Film>> getFilmsByYear() {
        return filmsByYear;
    }

    public void setFilmsByYear(Map<Integer, LinkedHashMap<Integer, Film>> filmsByYear) {
        this.filmsByYear = filmsByYear;
    }
}
