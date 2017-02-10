package com.abdymalikmulky.abdroidmvp.app.news;

import com.abdymalikmulky.abdroidmvp.app.BasePresenter;
import com.abdymalikmulky.abdroidmvp.app.BaseView;
import com.abdymalikmulky.abdroidmvp.app.data.news.pojo.Berita;

import java.util.List;

/**
 * Created by abdymalikmulky on 1/17/17.
 */

public class NewsContract {
    interface View extends BaseView<Presenter>{

        void showLoading(boolean show);

        void showNews(List<Berita> news);

        void showNoNews();

        void showLoadMoreNews(List<Berita> news);

        void showNoLoadMoreNews();

        void showNewsDetail(String newsId);

    }

    interface Presenter extends BasePresenter{

        void loadNews(int page);

        void loadMore(int page);

        void openNewsDetail(String newsId);

    }

    interface Listener {
        void onNewsClick(Berita news);
    }
}
