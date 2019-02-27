package com.detroitlabs.giflibrary.data;

import com.detroitlabs.giflibrary.model.Category;
import com.detroitlabs.giflibrary.model.Gif;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;


import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@Component
public class CategoryRepository {
    GifRepository gifRepository;
    Category category;
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category("Funny Gifs", 1),
            new Category("Serious Gifs", 2),
            new Category("Fail Gifs", 3)
    );

    public List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }



    public Category findGifById(@PathVariable int categoryId) {
        for (Category category1 : ALL_CATEGORIES) {
            if (category1.getId() == categoryId) {
                return category1;
            }

        }
        return null;
    }

}




