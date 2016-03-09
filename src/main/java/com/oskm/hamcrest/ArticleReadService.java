package com.oskm.hamcrest;

import javax.xml.ws.ServiceMode;

/**
 * Created by oskmkr on 2016-03-09.
 */
@ServiceMode
public class ArticleReadService {


    public Article readArticle(String articleId) {

        return new Article();

    }

}
