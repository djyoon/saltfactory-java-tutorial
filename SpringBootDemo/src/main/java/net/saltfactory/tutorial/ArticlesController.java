package net.saltfactory.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by saltfactory<saltfactory@gmail.com> on 11/21/15.
 */
//@RestController
@Controller
public class ArticlesController {
    @Autowired
    ArticlesService articlesService;

    @RequestMapping(value = "/articles/new", method = RequestMethod.GET)
    public String newArticle(Model model){
        Article article = new Article();
        model.addAttribute("article", article);
        return "articles/new";
    }

    @RequestMapping(value = "/articles", method = RequestMethod.POST)
    @ResponseBody
    public Article submit(@ModelAttribute Article article){
        return article;
    }

    @RequestMapping(value = "/api/articles", method = RequestMethod.GET)
    @ResponseBody
    public List<Article> index() {
        return articlesService.getArticles();
    }

    @RequestMapping(value = "/api/articles/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Article show(@PathVariable(value = "id") long id) {
        return articlesService.getArticle(id);
    }

    @RequestMapping(value = "/api/articles", method = RequestMethod.POST)
    @ResponseBody
    public Article create(@RequestBody Article article) {
        return article;
    }

    @RequestMapping(value = "/api/articles/{id}", method = RequestMethod.PATCH)
    @ResponseBody
    public Article patch(@PathVariable(value = "id") long id,  @RequestBody Article article) {
        return article;
    }

    @RequestMapping(value = "/api/articles/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Article update(@PathVariable(value = "id") long id,  @RequestBody Article article) {
        return article;
    }

    @RequestMapping(value = "/api/articles/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public List<Article> destroy(@PathVariable(value = "id") long id) {
        return articlesService.deleteArticle(id);
    }


}
