package homework.collectionpart2;

import java.util.*;

public class CinemaDemo {

    public static void main(String[] args) {

        Map<Integer, LinkedHashMap<Integer, Film>> findfilm = new LinkedHashMap<>();

        Cinema cinema = new Cinema(findfilm);
        cinema.addFilm(new Film(38, 1990, 10, "Horror", 8.1));
        cinema.addFilm(new Film(3, 1991, 10, "Romantic", 3.9));
        cinema.addFilm(new Film(49, 1991, 10, "Comedy", 2.5));
        cinema.addFilm(new Film(512, 1993, 10, "Western", 9.9));

        for (Map.Entry<Integer, LinkedHashMap<Integer, Film>> integerLinkedHashMapEntry : findfilm.entrySet()) {
            System.out.println("Вывод всех фильмов по порядку добавления(по годам): " + integerLinkedHashMapEntry);
        }

        cinema.getFilmByYear(1991);
        cinema.getFilmByYearAndMonth(1990, 10);
        cinema.getFilmByGenre("Horror");



//        List<Object> objects = new ArrayList<>();
//        Film horrorFilm = new Film(38, 1990, 10, "Horror", 8.1);
//        Film romanticFilm = new Film(3, 1991, 10, "Romantic", 3.9);
//        Film comedyFilm = new Film(49, 1991, 10, "Comedy", 2.5);
//        Film westernFilm = new Film(512, 1993, 10, "Western", 9.9);
//        objects.add(horrorFilm);
//        objects.add(comedyFilm);
//        objects.add(romanticFilm);
//        objects.add(westernFilm);
//
//
//        Map<Integer, Film> ofCinema = new LinkedHashMap<>();
//        ofCinema.put(horrorFilm.getYear(), horrorFilm);
//        ofCinema.put(comedyFilm.getYear(), comedyFilm);
//        ofCinema.put(romanticFilm.getYear(), romanticFilm);
//        ofCinema.put(westernFilm.getYear(), westernFilm);
//
//        System.out.println(ofCinema.values());


//        int i = 1;
//        int result = i++ - --i * (i * 2);
//        System.out.println(i);
//        cinema.add(comedyFilm.getId(), comedyFilm);
//        cinema.add(romanticFilm.getId(), romanticFilm);
//        cinema.add(westernFilm.getId(), westernFilm);
//        cinema.add(horrorFilm.getId(), horrorFilm);


    }

}
