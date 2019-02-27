package com.detroitlabs.giflibrary.data;

import com.detroitlabs.giflibrary.model.Category;
import com.detroitlabs.giflibrary.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {

    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("toobad", LocalDate.of(2019, 2, 23), "Erika Languirand", false, 1),
            new Gif("exhausting", LocalDate.of(2019, 2, 23), "Jen Bloomer", false, 2),
            new Gif("headtilt", LocalDate.of(2019, 2, 23), "Dan Newport", false, 2),
            new Gif("corgibeg", LocalDate.of(2019, 2, 23), "Matt of Lansing", false, 2),
            new Gif("hugemistake", LocalDate.of(2019, 2, 23), "Erika Languirand", true, 1),
            new Gif("whatisaid", LocalDate.of(2019, 2, 23), "Dan Newport", true, 2),
            new Gif("terminator", LocalDate.of(2019, 2, 23), "Jamie Brooks", true, 2),
            new Gif("mvp", LocalDate.of(2019, 2, 23), "Jamie Brooks", true, 1),
            new Gif("fails", LocalDate.of(2019, 2, 23), "Jamie Brooks", true, 3),
            new Gif("dwite", LocalDate.of(2019, 2, 23), "Jamie Brooks", true, 3),
            new Gif("scott", LocalDate.of(2019, 2, 23), "Jamie Brooks", true, 1),
            new Gif("michaelscott", LocalDate.of(2019, 2, 23), "Jamie Brooks", true, 1)
    );

    public List<Gif> getAllFavorites() {
        List<Gif> getAllFavorites = new ArrayList<>();
        for (Gif gif : ALL_GIFS) {
            if (gif.isFavorite()) {
                getAllFavorites.add(gif);

            }
        }
        return getAllFavorites;
    }

    public Gif findByName(@PathVariable String name) {
        for (Gif gif : ALL_GIFS) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

    public Gif findByUserName(@PathVariable String userName) {
        for (Gif gif : ALL_GIFS) {
            if (gif.getUserName().equals(userName)) {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    public List<Gif> findCategory(int id) {
        List<Gif> categoryFind = new ArrayList<>();
        for (Gif gif : ALL_GIFS) {
            if (gif.getCategoryId() == id) {
                categoryFind.add(gif);

            }

        }
        return categoryFind;

    }

    public List<Gif>searchForGif(String search){
        List<Gif>serchGif = new ArrayList<>();
        for(Gif gif : ALL_GIFS){
            if(search.equalsIgnoreCase(gif.getName())){
                serchGif.add(gif);
            }
        }
        return serchGif;
    }
}
