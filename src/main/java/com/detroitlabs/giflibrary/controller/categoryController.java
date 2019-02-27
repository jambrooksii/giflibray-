package com.detroitlabs.giflibrary.controller;

import com.detroitlabs.giflibrary.data.CategoryRepository;
import com.detroitlabs.giflibrary.data.GifRepository;
import com.detroitlabs.giflibrary.model.Category;
import com.detroitlabs.giflibrary.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class categoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/categories")
    public String displayCategory(ModelMap modelMap) {
        List<Category> categories = categoryRepository.getAllCategories();
        modelMap.put("categories", categories);
        return "categories";
    }

    @RequestMapping("/category/{id}")
    public String category(@PathVariable int id, ModelMap modelMap){

        Category category = categoryRepository.findGifById(id);
        modelMap.put("category", category);

        List<Gif> gifs = gifRepository.findCategory(id);
        modelMap.put("gifs", gifs);

        return "category";

    }
    @RequestMapping("/search")
    public String searchForGifs(@PathVariable String search, ModelMap modelMap){
        List<Gif> gifSearch =  gifRepository.searchForGif(search);
        modelMap.put("gifSearch", gifSearch);

        return search;
    }
}
